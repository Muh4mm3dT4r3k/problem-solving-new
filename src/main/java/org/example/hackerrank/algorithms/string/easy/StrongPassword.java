package org.example.hackerrank.algorithms.string.easy;


import java.util.Set;

public class StrongPassword {
    public static void main(String[] args) {
        System.out.println(minimumNumber(0, ""));
    }

    public static int minimumNumber(int n, String password) {
        int minimumNumber = 0;
        if (!hasContainDigit(password)) minimumNumber++;
        if (!hasContainSpecialChars(password)) minimumNumber++;
        if (!hasContainUpperLetter(password)) minimumNumber++;
        if (!hasContainLowerLetter(password)) minimumNumber++;
        minimumNumber = Math.max(minimumNumber, 6 - n);


        return minimumNumber;
    }


    private static boolean hasContainDigit(String password) {
        return password
                .chars()
                .filter(c -> c >= '0' && c <= '9')
                .count() > 0;
    }

    private static boolean hasContainUpperLetter(String password) {
        return password
                .chars()
                .filter(Character::isLetter)
                .filter(Character::isUpperCase)
                .count() > 0;

    }

    private static boolean hasContainLowerLetter(String password) {
        return password
                .chars()
                .filter(Character::isLetter)
                .filter(Character::isLowerCase)
                .count() > 0;

    }

//    private static boolean hasContainSpecialChars(String password) {
//
//        return password
//                .chars()
//                .filter(StrongPassword::isSpecialChar)
//                .count() > 0;
//
//    }

    // Gemini improvement
    private static boolean hasContainSpecialChars(String password) {
        final Set<Character> specialChars = Set.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');
        return password
                .chars()
                .anyMatch(character -> specialChars.contains((char) character));

    }



    private static boolean isSpecialChar(int c) {
        char[] specialChars = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'};
        for (char specialChar : specialChars) {
            if ((char) c == specialChar)
                return true;
        }
        return false;
    }


}
