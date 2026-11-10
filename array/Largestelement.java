package array;

public class Largestelement {
    public static void main(String[] args) {
        int[] arr = { 36, 46, 12, 437, 68, 49, 29, 93 };
        int max = Integer.MIN_VALUE;
        for (int index = 0; index <= arr.length - 1; index++) {
            max = max < arr[index] ? arr[index] : max;
        }
        System.out.println(max);
    }
}
