package com.example.maozheng.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;


public class ExampleUnitTest {

    @Test
   public void testValidateStage2() {
        /*
       rule 1 :not “password” (case insensitive)
       rule 2 :at least 8 characters
       rule 3 : at least one special character  !, @, #, $, &, *
       rule 4 : at least one digit
       rule 5 : at least one upper and lower case character
        */

        assertEquals(PasswordValidator.validateStage2("Maoz"), 2);

       assertEquals(PasswordValidator.validateStage2("Maoj02"), 3);

        assertEquals(PasswordValidator.validateStage2("Maoz22hn"), 4);

        assertEquals(PasswordValidator.validateStage2("ab829jbd"), 3);

       assertEquals(PasswordValidator.validateStage2("zhe@78gbh"), 4);

     assertEquals(PasswordValidator.validateStage2("Zjbc@02ac"), 5);

    }


}




