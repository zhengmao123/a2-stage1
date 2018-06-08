package com.example.maozheng.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;


public class ExampleUnitTest {

    @Test
    public void testValidateStage1() {
        assertEquals(PasswordValidator.validateStage1("PASSWOrD"), 1);
        assertEquals(PasswordValidator.validateStage1("MZSD"), 1);
        assertEquals(PasswordValidator.validateStage1("MAOZHENG"), 2);
        assertEquals(PasswordValidator.validateStage1("MAOZHENGMO"), 2);
    }


}

