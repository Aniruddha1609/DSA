package sorting;

import java.util.Arrays;

public class Mergesort {
    public static int[] merge(int[] leftHalf, int[] rightHalf) {
        int leftPointer = 0;
        int rightPointer = 0;
        int mergingPointer = 0;
        int[] mergedArray = new int[leftHalf.length + rightHalf.length];
        while (leftPointer <= leftHalf.length - 1 && rightPointer <= rightHalf.length - 1) {
            if (leftHalf[leftPointer] <= rightHalf[rightPointer]) {
                mergedArray[mergingPointer++] = leftHalf[leftPointer++];
            } else {
                mergedArray[mergingPointer++] = rightHalf[rightPointer++];
            }
        }

        while (leftPointer < leftHalf.length) {
            mergedArray[mergingPointer++] = leftHalf[leftPointer++];
        }

        while (rightPointer < rightHalf.length) {
            mergedArray[mergingPointer++] = rightHalf[rightPointer++];
        }

        return mergedArray;

    }

    public int[] mergeSort(int arr[]) {
        // Todo: Divide
        if (arr.length <= 1 || arr == null)
            return arr;

        int mid = arr.length / 2;
        int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
        int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

        int[] leftSortArray = mergeSort(leftHalf);
        int[] rightSortArray = mergeSort(rightHalf);

        return merge(leftSortArray, rightSortArray);

    }

    public static void main(String[] args) {
        int arr[] = { 46, 38, 24, 95, 24, 15, 73 };
        Mergesort sort = new Mergesort();
        int[] mergedArray = sort.mergeSort(arr);
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}
