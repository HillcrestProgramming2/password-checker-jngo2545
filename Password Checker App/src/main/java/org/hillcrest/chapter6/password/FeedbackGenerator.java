package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password
    private static boolean passwordLength = false;
    private static boolean hasUpper = false;
    private static boolean hasLower = false;
    private static boolean hasNumber = false;
    private static boolean hasSpecial = false;

    public static String generateFeedback(String password) {
        passwordLength = false;
        hasUpper = false;
        hasLower = false;
        hasNumber = false;
        hasSpecial = false;


        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String special = "!@#$%^&*()-+=";

        for (int i = 0; i < password.length(); i++) {

            String ch = password.substring(i, i + 1);

            if (upperCase.contains(ch)) {
                hasUpper = true;
            } else if (hasUpper == false) {
                return ("Add at least one uppercase letter");
            } else if (lowerCase.contains(ch)) {
                hasLower = true;
            } else if (hasLower == false){
                return ("Add at least one lowercase letter");
            } else if (number.contains(ch)) {
                hasNumber = true;
            } else if (hasNumber == false){
                return ("Add at least one number");
            } else if (special.contains(ch)) {
                hasSpecial = true;
            } else if (hasSpecial == false){
                return ("Add at least one special character");
            } else if (password.length() >= 8) {
                    passwordLength = true;
            } else if (passwordLength == false){
                return ("Create a password with at least 8 letters");
            }
        }
        return (" ");
    }
}
