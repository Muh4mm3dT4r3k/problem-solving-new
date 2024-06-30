package org.example.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernameRegularExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String username;
        for (int i = 0; i < k; i++) {
            username = scanner.nextLine();
            solution(username);
        }
    }

    public static void solution(String username) {
        //TODO: I will back again when I finish regex :)

        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(username);
        if (matcher.matches()) {
            System.out.println("Valid");
        }else {
            System.out.println("Invalid");
        }
    }
}
