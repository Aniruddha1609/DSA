package array;

public class AllZerosToEnd {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 3, 4, 5, 0, 0, 6, 7, 8 };
        int currentZero = -1;
        int index = 0;
        while (index < arr.length) {
            if (arr[index] != 0 && currentZero != -1 && arr[currentZero] == 0) {
                int temp = arr[index];
                arr[index] = arr[currentZero];
                arr[currentZero] = temp;
                currentZero++;
            }

            if (currentZero == -1 && arr[index] == 0)
                currentZero = index;

            index++;

        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
