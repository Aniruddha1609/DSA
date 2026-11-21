package array;

public class SortZeroOneTwo {

    public static void swap(int[] arr, int firstVal, int secondVal) {
        int temp = arr[firstVal];
        arr[firstVal] = arr[secondVal];
        arr[secondVal] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 1, 1, 2, 2, 2, 1, 0, 1, 0, 1, 2 };
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }

            else if (arr[mid] == 1)
                mid++;

            else if (arr[mid] == 2) {
                swap(arr, high, mid);
                high--;
            }

        }

        for (int element : arr) {
            System.out.print(element + " ");
        }

    }
}
