package array;

public class second_largest {
    public static void main(String[] args) {
        int[] arr = { 36, 46, 12, 437, 68, 49, 29, 93 };
        int largest = arr[0];
        int second_largest = Integer.MIN_VALUE;
        for (int elment : arr) {
            if (elment > largest) {
                second_largest = largest;
                largest = elment;
            }
            if (elment < largest && elment > second_largest)
                second_largest = elment;
        }
        System.out.println(second_largest);
    }
}
