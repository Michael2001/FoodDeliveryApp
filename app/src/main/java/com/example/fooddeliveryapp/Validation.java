package com.example.fooddeliveryapp;

import android.content.Context;
import android.util.Log;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Validation {
    private Context context;

    public Validation(Context context){
        this.context = context;
    }

    public boolean isFieldComplete(TextInputEditText textInputEditText, TextInputLayout textInputLayout, String error) {

        String val = textInputEditText.getText().toString().trim();
        if(val.isEmpty()) {
            textInputLayout.setError(error);
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);
        }
        return true;
    }

    public boolean isFieldsMatching(TextInputEditText textInputEditText1, TextInputEditText textInputEditText2, TextInputLayout textInputLayout, String error) {
        String val1 = textInputEditText1.getText().toString().trim();
        String val2 = textInputEditText2.getText().toString().trim();
        if(!val1.equals(val2)) {
            textInputLayout.setError(error);
            return false;
        } else {
            textInputLayout.setErrorEnabled(false);
        }
        return true;
    }
}
