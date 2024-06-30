package org.example.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String[] arr = s.split(" ");
        ArrayList<String> arrayList = new ArrayList<>(List.of(arr));
        int negativeSum = 0;
        int sum;
        List<String> list;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (i == j) {
                    continue;
                }
                list = arrayList.subList(i, j);

                sum = list
                        .stream()
                        .mapToInt(Integer::parseInt).sum();

                if (sum < 0){
                    negativeSum++;
                }
            }
        }
        System.out.println(negativeSum);

    }

    // another solution from discussions
    public static int countNegativeSubArraysWithoutIntStream(String[] arr){
        int count =0, sum = 0 ;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum += Integer.parseInt(arr[j]);
                if(sum<0)
                    count++;
            }
            sum = 0;
        }
        return count;
    }

}


