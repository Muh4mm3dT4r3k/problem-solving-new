package org.example.hackerrank;

import java.util.Arrays;
import java.util.HashMap;

public class JavaAnagrams {

    public static void main(String[] args) {
        System.out.println(solution("anagramm", "marganaa"));
        System.out.println(solution("anagram", "margana"));
        System.out.println(solution("Hello", "hello"));
        System.out.println("-------------------------------");
        System.out.println(solution2("anagramm", "marganaa"));
        System.out.println(solution2("anagram", "margana"));
        System.out.println(solution2("Hello", "hello"));

    }


    public static String solution(String string1, String string2) {
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        HashMap<Character, Integer> charCount1 = new HashMap<>();
        HashMap<Character, Integer> charCount2 = new HashMap<>();
        for (char c : string1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        for (char c : string2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }

//        for (char c : string1.toCharArray()) {
//            if (!charCount2.containsKey(c) || !charCount1.get(c).equals(charCount2.get(c))) {
//                return "Not Anagrams";
//            }
//        }

        return (charCount1.equals(charCount2)) ? "Anagrams" : "Not Anagrams";
    }

    public static String solution2(String string1, String string2){
        char[] chars1 = string1
                .toLowerCase()
                .toCharArray();

        char[] chars2 = string2
                .toLowerCase()
                .toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2) ? "Anagrams" : "Not Anagrams";
    }
}


