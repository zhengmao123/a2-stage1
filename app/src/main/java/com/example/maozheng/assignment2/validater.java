package com.example.maozheng.assignment2;

import java.util.regex.Pattern;

class PasswordValidator {

    public static int validateStage1(String password) {
        if (password == null || password.isEmpty()) {
            return 0;
        }
        int count = 0;

        if (!password.equalsIgnoreCase("PASSWORD")) {
            count++;
        }

        if (password.length() >= 8) {
            count++;
        }

        return count;
    }


    public static int validateStage2(String password) {
        int count = 0;


        count += validateStage1(password);

        if (password.indexOf('!') != -1 || password.indexOf('@') != -1
                || password.indexOf('#') != -1 || password.indexOf('&') != -1
                || password.indexOf('*') != -1) {
            count++;
        }


        if (Pattern.compile("[0-9]").matcher(password).find()) {
            System.out.println(password);
            count++;
        }


        if (Pattern.compile("[a-z]").matcher(password).find() && Pattern.compile("[A-Z]").matcher(password).find() ) {
            System.out.println(password);
            count++;
        }

        return count;
    }

}