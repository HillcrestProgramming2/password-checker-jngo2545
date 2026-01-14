package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * This class tests whether the criteria checker functions properly
 */
public class CriteriaCheckerTest {
    @Test
    void testEvaluateCriteria() {
        String password = "Password123";
        int criteria = CriteriaChecker.evaluateCriteria(password);
        Assertions.assertEquals(4,criteria);
    }
    @Test
    void testDetermineStrength() {
        String password = "Password123";
        int criteria = CriteriaChecker.evaluateCriteria(password);
        String determine = CriteriaChecker.determineStrength(criteria);
        Assertions.assertEquals("4-5: Strong", determine);
    }
}
