package org.paul.katas.vowelcount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainVowelCountTest {

    @Test
    void emptyStringTest() {
        assertEquals(0, MainVowelCount.countVowels(""));
    }

    @Test
    void allVowels() {
        assertEquals(5, MainVowelCount.countVowels("aeiou"));
    }

    @Test
    void mixedCase() {
        assertEquals(4, MainVowelCount.countVowels("ad ew ixf75f o"));
    }

    @Test
    void why() {
        assertEquals(0, MainVowelCount.countVowels("y"));
    }
}