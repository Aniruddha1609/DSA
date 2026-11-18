package array;

import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = sc.nextInt();
        int[] arr = new int[limit - 1];
        int totalSum = 0;
        int actualSum = limit * (limit + 1) / 2;

        System.out.println("Enter elements");
        for (int index = 0; index < arr.length; index++) {
            int input = sc.nextInt();
            totalSum += input;
        }

        System.out.println(actualSum - totalSum);

    }
}
