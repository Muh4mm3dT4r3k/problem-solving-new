package org.example.hackerrank;

public class JavaStringReverse  {

    public static void main(String[] args) {
        System.out.println(solution1("madam"));
    }

    public static String solution1(String string) {
        string = string.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        String reversedString = String.valueOf(stringBuilder);

        return string.equals(reversedString) ? "Yes" : "No";
    }
}
