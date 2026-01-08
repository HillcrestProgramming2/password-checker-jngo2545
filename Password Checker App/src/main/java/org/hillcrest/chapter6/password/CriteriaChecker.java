package org.hillcrest.chapter6.password;

/**
 * class that checks the criteria for a password
 */
public class CriteriaChecker {
    private static boolean passwordLength = false;
    private static boolean hasUpper = false;
    private static boolean hasLower = false;
    private static boolean hasNumber = false;
    private static boolean hasSpecial = false;


    /**
     *This creates boolean values that will be changed if the password meets certain criteria
     * @param password The user entered password
     * @return Feedback depending on criteria met
     */
    public static int evaluateCriteria(String password) {
        passwordLength = false;
        hasUpper = false;
        hasLower = false;
        hasNumber = false;
        hasSpecial = false;


        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String special = "!@#$%^&*()-+=";

        for(int i = 0; i < password.length(); i++){

            String ch = password.substring(i, i + 1);

            if(upperCase.contains(ch)){
                hasUpper = true;
            } if (lowerCase.contains(ch)){
                hasLower = true;
            } if (number.contains(ch)) {
                hasNumber = true;
            } if (special.contains(ch)) {
                hasSpecial = true;
            } if (password.length() >= 8) {
                passwordLength = true;
            }
        }

        int count = 0;

        if(passwordLength == true) {count++;}
        if(hasUpper == true) {count++;}
        if(hasLower == true) {count++;}
        if(hasNumber == true) {count++;}
        if(hasSpecial == true) {count++;}

        return count;
    }

    public static String determineStrength(int count){

        if(count <= 2){
            return ("0-2: Weak");
        } else if (count == 3) {
            return ("3: Moderate");
        } else {
            return("4-5: Strong");
        }
    }
}
