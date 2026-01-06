package org.hillcrest.chapter6.password;

import java.util.Scanner;

public class PasswordApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a valid password: ");
        String password = in.nextLine();
        int count = CriteriaChecker.evaluateCriteria(password);
        System.out.println(CriteriaChecker.determineStrength(count));
        System.out.println(FeedbackGenerator.generateFeedback(password));
    }
}
