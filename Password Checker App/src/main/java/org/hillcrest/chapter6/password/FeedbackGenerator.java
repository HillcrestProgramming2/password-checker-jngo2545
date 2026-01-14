package org.hillcrest.chapter6.password;

/**
 * This class generates feedback based on the given strength of the given password
 */
public class FeedbackGenerator {
    //utility class for generating feedback based on password

    /**
     * This method will check which criteria are met with the inputted password and will give the associated feedback
     * @param password the user inputted password
     * @return the associated feedback
     */
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
            } if (lowerCase.contains(ch)) {
                hasLower = true;
            } if (special.contains(ch)) {
                hasSpecial = true;
            } if (number.contains(ch)) {
                hasNumber = true;
            }
        }


        if (!hasUpper) {
            feedback += "Add at least one uppercase letter\n";
        } if (!hasLower){
            feedback += "Add at least one lowercase letter\n";
        } if (!hasNumber){
            feedback += "Add at least one number\n";
        } if (!hasSpecial){
            feedback += "Add at least one special character\n";
        } if (!passwordLength){
            feedback += "Create a password with at least 8 letters\n";
        }

        return feedback;
    }
}
