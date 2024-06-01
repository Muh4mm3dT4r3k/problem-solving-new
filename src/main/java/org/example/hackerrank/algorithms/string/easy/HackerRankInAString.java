package org.example.hackerrank.algorithms.string.easy;

import java.util.HashMap;

public class HackerRankInAString {
    public static String hackerRankInAString(String str) {
        str = str.toLowerCase();
        char[] chars = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int index = 0;
        boolean[] bools = new boolean[chars.length];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == chars[index]) {
                bools[index] = true;
                index++;
                if (index > chars.length - 1)
                    break;
            }
        }

        for(boolean bool : bools){
            if(!bool)
                return "NO";
        }

        return "YES";
    }


    // Gemini Solution
    public static String hackerrankInAString(String str) {
        HashMap<Character, Integer> charCounts = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> requiredCharCounts = new HashMap<>();
        requiredCharCounts.put('h', 1);
        requiredCharCounts.put('a', 2);
        requiredCharCounts.put('c', 1);
        requiredCharCounts.put('k', 2);
        requiredCharCounts.put('e', 1);
        requiredCharCounts.put('r', 2);
        requiredCharCounts.put('n', 1);

        for (char c : requiredCharCounts.keySet()) {
            if (charCounts.containsKey(c) && charCounts.get(c) < requiredCharCounts.get(c)) {
                return "NO";
            }
        }

        return "Yes";
    }
}
