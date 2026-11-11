package array;

public class Leftshift {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int firstNumber = arr[0];
        for (int index = 1; index < arr.length; index++) {
            arr[index - 1] = arr[index];
        }
        arr[arr.length - 1] = firstNumber;
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
