package com.demo.credit.creditSimulator.consumer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimulatorTest {


    @Test
    public void test(){
        //prepare
        int amount = 300000; //$100.000
        int quota = 6;
        int income = 450000; //$450.000

        //act
        boolean answer = simulator(amount, quota, income);

        //asserts
        assertTrue(answer);

    }

    @Test
    public void test1(){
        //prepare
        int amount = 300000; //$100.000
        int quota = 2;
        int income = 450000; //$450.000

        //act
        boolean answer = simulator(amount, quota, income);

        //asserts
        assertFalse(answer);

    }

    private boolean simulator(int amount, int quota, int income) {
        return true;
    }
}
