package sorting;

class Sort {
    // * Selection Sort :-> Selct the minimum each time and swap*/
    void selectionSort(int[] arr) {
        for (int index = 0; index < arr.length - 1; index++) {
            int min = index;
            for (int curr = index + 1; curr <= arr.length - 1; curr++) {
                if (arr[curr] < arr[min])
                    min = curr;

            }
            int temp = arr[index];
            arr[index] = arr[min];
            arr[min] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    void bubbleSort(int[] arr) {
        System.out.println("bubblesort");
        for (int index = 0; index < arr.length - 1; index++) {
            for (int curr = 0; curr < arr.length - 1 - index; curr++) {
                if (arr[curr] > arr[curr + 1]) {
                    int temp = arr[curr];
                    arr[curr] = arr[curr + 1];
                    arr[curr + 1] = temp;
                }
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

    void insertionSort(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            int curr = index;
            while (curr > 0 && arr[curr] < arr[curr - 1]) {
                int temp = arr[curr];
                arr[curr] = arr[curr - 1];
                arr[curr - 1] = temp;
                curr--;
            }
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}

public class Sorting {
    public static void main(String[] args) {
        int arr[] = { 43, 23, 85, 14, 27 };
        Sort sortAlgo = new Sort();
        sortAlgo.insertionSort(arr);

    }
}
