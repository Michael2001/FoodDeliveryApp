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


public class FragmentSignUp extends Fragment implements View.OnClickListener {

    private TextInputLayout textInputLayoutEmailSignUp;
    private TextInputEditText textInputEditTextEmailSignUp;

    private TextInputLayout textInputLayoutPasswordSignUp;
    private TextInputEditText textInputEditTextPasswordSignUp;

    private TextInputLayout textInputLayoutConfirmPasswordSignUp;
    private TextInputEditText textInputEditTextConfirmPasswordSignUp;

    private Validation validation;
    private UserDBModel userDBModel;
    private User user;

    private Button buttonSignUp;
    private TextView linkLogIn;


    public FragmentSignUp() {
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
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);

        textInputLayoutEmailSignUp = (TextInputLayout) view.findViewById(R.id.textInputLayoutEmailSignUp);
        textInputEditTextEmailSignUp = (TextInputEditText) view.findViewById(R.id.textInputEditTextEmailSignUp);
        textInputLayoutPasswordSignUp = (TextInputLayout) view.findViewById(R.id.textInputLayoutPasswordSignUp);
        textInputEditTextPasswordSignUp = (TextInputEditText) view.findViewById(R.id.textInputEditTextPasswordSignUp);
        textInputLayoutConfirmPasswordSignUp = (TextInputLayout) view.findViewById(R.id.textInputLayoutConfirmPasswordSignUp);
        textInputEditTextConfirmPasswordSignUp = (TextInputEditText) view.findViewById(R.id.textInputEditTextConfirmPasswordSignUp);
        buttonSignUp = (Button) view.findViewById(R.id.buttonSignUp);
        linkLogIn = (TextView) view.findViewById(R.id.linkLogIn);

        buttonSignUp.setOnClickListener(this);
        linkLogIn.setOnClickListener(this);

        validation = new Validation(getContext());
        userDBModel = new UserDBModel();
        user = new User();

        userDBModel.load(getContext());

        return view;
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buttonSignUp:
                postToDB();
                break;
            case R.id.linkLogIn:
                Log.d("click", "onClick: ");
                FragmentLogin fragmentLogin = new FragmentLogin();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.addToBackStack("xyz");
                fragmentTransaction.hide(FragmentSignUp.this);
                fragmentTransaction.add(R.id.fragment_container, fragmentLogin);
                fragmentTransaction.commit();
                break;
            default:
                break;
        }
    }

    private void postToDB() {

        if(!validation.isFieldComplete(textInputEditTextEmailSignUp, textInputLayoutEmailSignUp, "Email is not in correct format or is invalid")){ return; };
        if(!validation.isFieldComplete(textInputEditTextPasswordSignUp, textInputLayoutPasswordSignUp, "Password is not in correct format or is invalid")){ return; };
        if(!validation.isFieldsMatching(textInputEditTextPasswordSignUp, textInputEditTextConfirmPasswordSignUp, textInputLayoutPasswordSignUp, "Passwords do not match")){ return; };

        if(!userDBModel.validateUser(textInputEditTextEmailSignUp.getText().toString().trim())) {
            user.setEmail(textInputEditTextEmailSignUp.getText().toString().trim());
            user.setPassword(textInputEditTextPasswordSignUp.getText().toString().trim());

            userDBModel.addUser(user);

            Toast toast =  Toast.makeText(getContext(), "User Created!", Toast.LENGTH_SHORT);
            toast.show();
            emptyFields();
        } else {
            Toast toast =  Toast.makeText(getContext(), "User Already Exists!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    private void emptyFields() {
        textInputEditTextEmailSignUp.setText(null);
        textInputEditTextPasswordSignUp.setText(null);
        textInputEditTextConfirmPasswordSignUp.setText(null);

    }
}