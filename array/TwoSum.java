package array;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 7, 4, 3, 5 };
        int target = 12;
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        Arrays.sort(arr);

        while (leftPointer < rightPointer) {
            if (arr[leftPointer] + arr[rightPointer] == target) {
                System.out.println(arr[leftPointer] + " " + arr[rightPointer]);
                break;
            }
            if (arr[leftPointer] + arr[rightPointer] > target)
                rightPointer--;
            else
                leftPointer++;
        }

    }
}
