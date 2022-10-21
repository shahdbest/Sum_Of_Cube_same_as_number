package com.niit.numbergame;

import com.niit.numbergame.NumberGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NumberGameTest {
    NumberGame numberGame;

    @BeforeEach
    void init() {
        numberGame = new NumberGame();
    }

    // Test getSumOfCubes method by passing start value and end value of range to find cube of numbers between them
    @Test
    public void givenRangeOfNumbersThenReturnCountOfCubeOfNumbers() {
        assertEquals(4, numberGame.getSumOfCubes(1, 500));
        assertNotEquals(5, numberGame.getSumOfCubes(1, 500));
        assertEquals(3, numberGame.getSumOfCubes(300, 1000));
    }

    // Test getSumOfCubes method by passing input parameters as negative values of range
    @Test
    public void givenNegativeRangeThenReturnCountOfCubeOfNumbers() {
        assertEquals(0, numberGame.getSumOfCubes(-1, -500));
    }

    // Test getSumOfCubes method by passing input parameters as 0 of range
    @Test
    public void givenRangeAsZeroThenReturnCountOfCubeOfNumbers() {
        assertEquals(0, numberGame.getSumOfCubes(0, 0));
    }
}
