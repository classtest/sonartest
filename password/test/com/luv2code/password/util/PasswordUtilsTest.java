package com.luv2code.password.util;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Chad Darby, darby@luv2code.com
 */
public class PasswordUtilsTest {
    
    public PasswordUtilsTest() {
    }
    
    
    @Test
    public void validatePassword_Null() {
       // setup
        String password = null;
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertFalse(actual);
    }

    @Test
    public void validatePassword_EmptyString() {
       // setup
        String password = "";
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertFalse(actual);
    }
    
    @Test
    public void validatePassword_Missing_OneNumber() {
       // setup
        String password = "Abcdefg#";
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertFalse(actual);
    }

    @Test
    public void validatePassword_Missing_OneUpperCaseLetter() {
       // setup
        String password = "abcdefg5#";
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertFalse(actual);
    }

    @Test
    public void validatePassword_Missing_OneLowerCaseLetter() {
       // setup
        String password = "ABCDEFG5#";
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertFalse(actual);
    }

    @Test
    public void validatePassword_Missing_OneSymbol() {
       // setup
        String password = "Abcdefg5";
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertFalse(actual);
    }

    @Test
    public void validatePassword_AllRulesMet() {
       // setup
        String password = "Abcdefg5#";
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertTrue(actual);
    }
    
    @Test
    public void validatePassword_LengthTooLong() {
       // setup
        String password = "Abcdefg5#abcdefgabcd";
        
        // execute
        boolean actual = PasswordUtils.validatePassword(password);
        
        // assert
        assertFalse(actual);
    }
    
}
