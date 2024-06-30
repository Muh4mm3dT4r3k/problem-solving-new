package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java2DArray {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[6][6];
        AtomicInteger index = new AtomicInteger(0);

        System.out.println();
        IntStream.range(0, 6).forEach(i -> {

            try {
                Stream.of(bufferedReader.readLine().split(" ")).forEach(string -> {
                    arr[i][index.getAndIncrement()] = Integer.parseInt(string);
                });
            index.set(0);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        int max = Integer.MIN_VALUE;
        int sum = 0;
        // I did Cheat it :)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                if (sum > max)
                    max = sum;
            }
        }


        System.out.println(max);

    }


}


