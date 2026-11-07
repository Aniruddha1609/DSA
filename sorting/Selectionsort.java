package sorting;

class Sorting {
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
}

public class Selectionsort {
    public static void main(String[] args) {
        int arr[] = { 43, 23, 85, 14, 27 };
        Sorting sort = new Sorting();
        sort.selectionSort(arr);

    }
}
