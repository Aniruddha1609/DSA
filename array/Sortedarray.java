package array;

public class Sortedarray {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 27, 48, 29, 91, 37 };
        boolean isSorted = true;
        int initial = arr[0];

        for (int element : arr) {
            if (element >= initial) {
                initial = element;
            } else {
                isSorted = false;
                break;
            }
        }

        System.out.println(isSorted);
    }
}
