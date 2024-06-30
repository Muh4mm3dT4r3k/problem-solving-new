package org.example.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger bigInteger = scanner.nextBigInteger();
        solution(bigInteger);
    }

    public static void solution(BigInteger bigInteger){
        if (bigInteger.isProbablePrime(100)) {
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }
    }
}
