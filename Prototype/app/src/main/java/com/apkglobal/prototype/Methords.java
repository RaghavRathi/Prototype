package com.apkglobal.prototype;

import android.content.Context;
import android.content.SharedPreferences;


public class Methords {


    Context context;

    Methords(Context context) {
        this.context = context;
    }

    public void saveLoginDetails(String semail) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("Email", semail);
        editor.commit();

    }

    public String getEmail() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        return sharedPreferences.getString("Email", "");
    }

    public boolean checkLogin() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        boolean isEmailEmpty = sharedPreferences.getString("Email", "").isEmpty();
        return isEmailEmpty;
    }

    public void logout() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("LoginDetails", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();

    }
}


