package org.example.hackerrank;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String s;
        scanner.nextLine();
        for(int i = 0; i < k; i++) {
            s = scanner.nextLine();
            solution(s);
        }
    }

    public static void solution(String s) {
        try {
            Pattern pattern = Pattern.compile(s);
            System.out.println("Valid");

        }catch(PatternSyntaxException e){
            System.out.println("Invalid");
        }
    }
}
