package com.padmaja.flowcontrol;

import org.junit.Test;

import static org.junit.Assert.*;


public class ForLoopExampleTest {
    ForLoopExample forLoopExample = new ForLoopExample();
    @Test
    public void ForLoopExample1() {
        int result = forLoopExample.tablesExample();
        System.out.println(result);
        int expectedresult = 3;
        assertEquals(expectedresult,result);
    }







}



