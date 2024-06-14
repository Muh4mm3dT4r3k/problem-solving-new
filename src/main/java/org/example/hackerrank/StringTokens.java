package org.example.hackerrank;

import java.util.StringTokenizer;

public class StringTokens {
    public static void main(String[] args) {
//        solution("He is a very very good boy, isn't he?");
        solution2("He is a very very good boy, isn't he?");
    }

    public static void solution(String s) {
        String[] tokens = s
                .trim()
                .split("[ !,?._'@]+");
        int length = s.isEmpty() ? 0 : tokens.length;
        System.out.println(length);
        if (length == 0)
            return;
        for (String token : tokens) {
            System.out.println(token);
        }
    }

    public static void solution2(String s) {
        String regex = "[ !,?._'@]+";
        StringTokenizer tokenizer = new StringTokenizer(s, regex);
        System.out.println(tokenizer.countTokens());
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}
