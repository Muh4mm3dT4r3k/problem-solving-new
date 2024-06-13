package org.example.hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class JavaSubstringComparisons {

    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
        System.out.println(getSmallestAndLargest2("welcometojava", 3));

        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(stringBuilder.append("welcometojava", 0, 3));
//        System.out.println(stringBuilder.append("welcometojava".toCharArray(), 0, 3));

    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> arrayList = orderedList(k, s.length(), s.toCharArray());
        largest = arrayList.get(arrayList.size() - 1);
        smallest = arrayList.get(0);
        return smallest + "\n" + largest;
    }

    private static ArrayList<String> orderedList(int k, int length, char[] chars) {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= length - k; i++) {
            arrayList.add(String.valueOf(stringBuilder.append(chars, i, k)));
            stringBuilder = new StringBuilder();
        }
        Set<String> set = new TreeSet<>(arrayList);
        arrayList = new ArrayList<>(set);
        return arrayList;
    }


    // another solution
    public static String getSmallestAndLargest2(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String substr;

        for (int i = 0; i <= s.length() -k; i++) {
            substr = s.substring(i, i + k);
            if (substr.compareTo(smallest) < 0) {
                smallest = substr;
            }

            if (substr.compareTo(largest) > 0) {
                largest = substr;
            }
        }
        return smallest + "\n" + largest;
    }
}
