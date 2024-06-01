package org.example.hackerrank.algorithms.string.easy;

public class MarsExploration {

    public static int marsExploration(String s) {
        int countWrongLetters = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i % 3 == 0 &&  s.charAt(i) != 'S') {
                countWrongLetters++;
            }else if(i % 3 == 1 &&  s.charAt(i) != 'O') {
                countWrongLetters++;
            }else if(i % 3 == 2 &&  s.charAt(i) != 'S') {
                countWrongLetters++;
            }
        }
        return countWrongLetters;
    }

}
