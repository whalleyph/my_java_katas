package org.paul.katas.vowelcount;

import java.util.Set;

public class MainVowelCount {
    static int countVowels(String inputString) {
        char[] chars = inputString.toCharArray();
        int count = 0;
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for (char letter: chars) {
            if (vowels.contains(letter)) {
                count++;
            }
        }
        return count;
    }
}
