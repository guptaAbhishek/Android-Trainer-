package com.example.siddarthshikhar.yomtrainerside;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Abhishek on 25-Sep-15.
 */
public class Utility {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String EMAIL_PATTERN =  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    /**
     * Validate Email with regular expression
     *
     * @param email
     * @return true for Valid Email and false for Invalid Email
     */
    public static boolean validate(String email) {
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
