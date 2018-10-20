package com.javafortesters.chap003myfirsttest.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MavenClassTest {
    @Test
    public void checkValueIsTrue(){
        int answer = 0;
        assertEquals("answer = 0",0, answer);
        
    }
}
