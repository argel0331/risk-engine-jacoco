package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MessagesTest {

    @Test
    public void testName() {
        Messages obj = new Messages();
        Assertions.assertEquals("Hello Argel!", obj.getMessage("Argel"));
    }

    @Test
    public void testNameBlank() {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(""));
    }

    @Test
    public void testNameNull() {
        Messages obj = new Messages();
        Assertions.assertEquals("Please Provide a name!", obj.getMessage(null));
    }

}
