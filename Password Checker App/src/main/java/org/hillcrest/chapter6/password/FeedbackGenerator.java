package org.hillcrest.chapter6.password;

public class FeedbackGenerator {
    //utility class for generating feedback based on password

    public static String generateFeedback(String password) {
        boolean passwordLength = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        String feedback = "";


        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String special = "!@#$%^&*()-+=";
        if (password.length() >= 8) {
            passwordLength = true;
        }

        for (int i = 0; i < password.length(); i++) {

            String ch = password.substring(i, i + 1);

            if (upperCase.contains(ch)) {
                hasUpper = true;
            } else if (lowerCase.contains(ch)) {
                hasLower = true;
            } else if (special.contains(ch)) {
                hasSpecial = true;
            } else if (number.contains(ch)) {
                hasNumber = true;
            }
        }


        if (hasUpper == false) {
            feedback += "Add at least one uppercase letter\n";
        } else if (hasLower == false){
            feedback += "Add at least one lowercase letter\n";
        } else if (hasNumber == false){
            feedback += "Add at least one number\n";
        } else if (hasSpecial == false){
            feedback += "Add at least one special character\n";
        } else if (passwordLength == false){
            feedback += "Create a password with at least 8 letters\n";
        }

        return feedback;
    }
}
