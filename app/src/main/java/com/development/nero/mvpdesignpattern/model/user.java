package com.development.nero.mvpdesignpattern.model;

import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class user implements iUser {

    String email, password;

    public user(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isDataValid() {
        /*
        1. Email field is not empty
        2. Email matches the pattern of an email
        3. Password length is over 5 characters
         */

        return !TextUtils.isEmpty(getEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches() &&
                getPassword().length() > 5;
    }
}
