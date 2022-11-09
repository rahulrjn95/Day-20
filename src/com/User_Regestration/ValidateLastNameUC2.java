package com.User_Regestration;

import java.util.regex.Pattern;

public class ValidateLastNameUC2 {
    public static boolean isLastNameInitialCapital(String lastName) {
        return Pattern.matches("[A-Z][a-z]{2,}", lastName);
    }
}
