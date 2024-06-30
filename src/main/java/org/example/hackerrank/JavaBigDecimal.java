package org.example.hackerrank;

import java.math.BigDecimal;
import java.util.ArrayList;

import java.util.Scanner;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextLine());
        }

        arrayList.sort((o1, o2) -> {
            return -BigDecimal.valueOf(Double.parseDouble(o1)).compareTo(BigDecimal.valueOf(Double.parseDouble(o2)));
        });

        for (String e : arrayList)
            System.out.println(e);
    }
}
