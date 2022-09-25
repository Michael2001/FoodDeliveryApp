package com.example.fooddeliveryapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;

public class FragmentLogin extends Fragment implements View.OnClickListener {

    public static User USER;

    private TextInputLayout inputEmail;
    private TextInputLayout inputPassword;

    private TextInputEditText inputEditEmail;
    private TextInputEditText inputEditPassword;

    private Button loginButton;
    private TextView signUpLink;

    private Validation validation;
    private UserDBModel userDBModel;

    public FragmentLogin() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        inputEmail = (TextInputLayout) view.findViewById(R.id.textInputLayoutEmail);
        inputPassword = (TextInputLayout) view.findViewById(R.id.textInputLayoutPassword);
        inputEditEmail = (TextInputEditText) view.findViewById(R.id.textInputEditTextEmail);
        inputEditPassword = (TextInputEditText) view.findViewById(R.id.textInputEditTextPassword);
        loginButton = (Button) view.findViewById(R.id.buttonLogin);
        signUpLink = (TextView) view.findViewById(R.id.linkRegister);

        loginButton.setOnClickListener(this);
        signUpLink.setOnClickListener(this);

        validation = new Validation(getContext());
        userDBModel = new UserDBModel();
        USER = new User();

        userDBModel.load(getContext());

        return view;
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buttonLogin:
                validateFromDB();
                break;
            case R.id.linkRegister:
                FragmentSignUp fragmentSignUp = new FragmentSignUp();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.addToBackStack("xyz");
                fragmentTransaction.hide(FragmentLogin.this);
                fragmentTransaction.add(R.id.fragment_container, fragmentSignUp);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }
    }

    private void validateFromDB() {
        if(!validation.isFieldComplete(inputEditEmail, inputEmail, "Email is not in correct format or is invalid")) {return; };
        if(!validation.isFieldComplete(inputEditPassword, inputPassword, "Email is not in correct format or is invalid")) {return; };

        if(!userDBModel.validateUser(inputEditEmail.getText().toString().trim(), inputEditPassword.toString().trim())) {
            ArrayList<User> userList = userDBModel.getAllUsers();

            for (User user:
                    userList ) {
                if(user.getEmail().equals(inputEditEmail.getText().toString().trim())) {

                    Toast toast =  Toast.makeText(getContext(), "Valid Login!", Toast.LENGTH_SHORT);
                    toast.show();

                    MainActivity.LOGGED = true;

                    USER.setId(user.getId());
                    USER.setEmail(user.getEmail());
                    USER.setPassword(user.getPassword());
                    USER.setOrders(user.getOrders());

                    FragmentCheckout fragmentCheckout = new FragmentCheckout(USER);
                    FragmentManager fragmentManager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                    fragmentTransaction.addToBackStack("xyz");
                    fragmentTransaction.hide(FragmentLogin.this);
                    fragmentTransaction.add(R.id.fragment_container, fragmentCheckout);
                    fragmentTransaction.commit();

                    Log.d("TAG", "SUCCESS");
                }
                else {
                    Toast toast =  Toast.makeText(getContext(), "Invalid Login Details!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        }
    }
}