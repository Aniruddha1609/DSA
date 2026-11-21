package array;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 4, 2, 3 };
        int maxConsecutive = Integer.MIN_VALUE;
        int count = 0;
        int sum = 0;
        int totalSum = 4;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] <= totalSum - sum) {
                sum += arr[index];
                count++;
            } else if (sum == totalSum) {
                maxConsecutive = Math.max(maxConsecutive, count);
                count = 0;
                sum = 0;
            } else {
                count = 0;
                sum = 0;
            }
        }

        System.out.println(maxConsecutive);
    }
}
