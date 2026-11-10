package sorting;

public class Quicksort {

    public int[] swap(int[] arr, int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        return arr;
    }

    public int correctPos(int[] arr, int low, int high) {
        int pivot = low;
        int smallVal = low, highVal = high;
        while (smallVal < highVal) {
            while (smallVal <= high && arr[smallVal] <= arr[pivot])
                smallVal++;
            while (highVal >= low && arr[highVal] > arr[pivot])
                highVal--;
            if (smallVal < highVal) {
                arr = swap(arr, smallVal, highVal);
            }
        }
        swap(arr, highVal, pivot);
        return highVal;
    }

    public void quicksort(int[] arr, int low, int high) {
        if (low >= high || arr.length == 1)
            return;

        int partitionIndex = correctPos(arr, low, high);

        quicksort(arr, low, partitionIndex - 1);
        quicksort(arr, partitionIndex + 1, high);
    }

    public static void main(String[] args) {
        int arr[] = { 46, 38, 24, 95, 24, 15, 73 };
        Quicksort sort = new Quicksort();
        sort.quicksort(arr, 0, arr.length - 1);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
