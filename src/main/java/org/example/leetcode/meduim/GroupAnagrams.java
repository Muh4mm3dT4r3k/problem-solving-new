package org.example.leetcode.meduim;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    private static List<List<String>> solution(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);

        }

        return new ArrayList<>(anagramMap.values());
    }

}

