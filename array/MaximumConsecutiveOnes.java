package array;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 4, 3, 1, 1, 1, 2, 1, 1 };
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element == 1) {
                count++;
                max = Math.max(max, count);
            }

            else
                count = 0;
        }
        System.out.println("Max Consecutive one is " + max);
    }

}
