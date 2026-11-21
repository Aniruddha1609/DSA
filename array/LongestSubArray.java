package array;

public class LongestSubArray {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 1, 1, 2, 1, 1, 1, 1, 3, 4, 2, 1 };
        int largest = Integer.MIN_VALUE;
        int curr = 0;
        int totalSum = 4;
        int sum = 0;
        for (int index = 0; index < arr.length; index++) {

            if (sum == totalSum) {
                largest = Math.max(largest, index - curr);
                sum -= arr[curr];
                curr++;
                sum += arr[index];

            } else if (sum < totalSum) {
                sum += arr[index];
            } else {
                sum -= arr[curr];
                curr++;
                index--;
            }
        }
        System.out.println(largest);
    }
}
