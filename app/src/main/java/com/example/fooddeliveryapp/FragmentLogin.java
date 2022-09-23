package com.example.fooddeliveryapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class FragmentLogin extends Fragment implements View.OnClickListener {

    private TextInputLayout inputEmail;
    private TextInputLayout inputPassword;

    private TextInputEditText inputEditEmail;
    private TextInputEditText inputEditPassword;

    private Button loginButton;
    private TextView signUpLink;

    private UserDBHelper dbHelper;
    private InputValidation inputValidation;

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

        dbHelper = new UserDBHelper(getActivity());
//        inputValidation = new InputValidation(getActivity());

        return view;
    }


    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.buttonLogin:
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
}