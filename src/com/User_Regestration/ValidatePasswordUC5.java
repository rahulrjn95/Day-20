package com.User_Regestration;

import java.util.regex.Pattern;

public class ValidatePasswordUC5 {
    public static boolean isPassword(String password) {
        return Pattern.matches("[a-z]{8,}", password);

    }
}
