package com.User_Regestration;

import java.util.regex.Pattern;

public class ValidateFirstNameUC1 {
    public static boolean isFirstNameInitialCapital(String firstName) {
        return Pattern.matches("[A-Z][a-z]{2,}", firstName);

    }
}
