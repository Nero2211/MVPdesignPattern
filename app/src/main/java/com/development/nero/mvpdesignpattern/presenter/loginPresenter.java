package com.development.nero.mvpdesignpattern.presenter;

import com.development.nero.mvpdesignpattern.model.user;
import com.development.nero.mvpdesignpattern.view.iLoginView;

public class loginPresenter implements iLoginPresenter {

    iLoginView loginView;

    public loginPresenter(iLoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {
        user myUser = new user(email, password);
        boolean isLoginSuccess = myUser.isDataValid();

        if(isLoginSuccess)
            loginView.onLoginResult("Success");
        else
            loginView.onLoginResult("Failed");
    }
}
