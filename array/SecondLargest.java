package array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = { 36, 46, 12, 437, 68, 49, 29, 93 };
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int elment : arr) {
            if (elment > largest) {
                secondLargest = largest;
                largest = elment;
            }
            if (elment < largest && elment > secondLargest)
                secondLargest = elment;
        }
        System.out.println(secondLargest);
    }
}
