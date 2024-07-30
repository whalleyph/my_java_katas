package org.paul.katas.sumOfPositives;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainSumOfPositivesTest {

    @Test
    void sumOfPositivesWithNegative() {
        int actual = MainSumOfPositives.sumOfPositives(new int[]{-1, 1, 2, 3});
        assertEquals(6, actual);
    }

    @Test
    void emptyArray() {
        int actual = MainSumOfPositives.sumOfPositives(new int[]{});
        assertEquals(0, actual);
    }
}