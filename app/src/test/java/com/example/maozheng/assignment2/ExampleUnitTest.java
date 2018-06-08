package com.example.maozheng.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;


public class ExampleUnitTest {

    @Test
      public void testValidatePasswordStage1() {
       assertEquals(PasswordValidator.validateStage1("PASsWORD"), 1);
       assertEquals(PasswordValidator.validateStage1("SJCB"), 1);
       assertEquals(PasswordValidator.validateStage1("SCNJCJCS"), 2);
       assertEquals(PasswordValidator.validateStage1("SCJCBDJDJ"), 2);

}

}




