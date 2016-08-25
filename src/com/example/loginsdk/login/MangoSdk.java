package com.example.loginsdk.login;

import android.app.Activity;
import android.content.Intent;

/**
 * Created by mitnick.cheng on 2016/8/15.
 */

public class MangoSdk {

    public static void login(Activity activity, LoginCallback loginCallback) {

        AccountManager.setLoginCallback(loginCallback);
        AccountManager.openYYHLoginActivity(activity);

//        LoginDialog loginDialog = new LoginDialog(activity,loginCallback);
//        loginDialog.show();
    }
}