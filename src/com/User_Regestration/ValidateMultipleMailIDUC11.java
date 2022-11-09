package com.User_Regestration;

import java.util.regex.Pattern;

public class ValidateMultipleMailIDUC11 {
    public static boolean validateForMultipleMailID(String mailID) {
        return Pattern.matches("[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.,-]+", mailID);
    }
}
