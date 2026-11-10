package array;

public class Duplicateremoval {
    public static void main(String[] args) {
        int[] arr = { 12, 27, 34, 34, 45, 45, 45, 81 };
        // int parsingPointer = 0;
        int changingPos = 0;
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] != arr[changingPos]) {
                arr[changingPos + 1] = arr[index];
                changingPos++;
            }

        }

        for (int index = 0; index <= changingPos; index++) {
            System.out.println(arr[index]);
        }
    }
}
