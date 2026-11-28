package array;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int index = 0;
        int maxSum = 0;
        int sum = 0;
        int start = 0;
        int end = 0;

        while (index < arr.length) {
            sum += arr[index];

            if (sum > maxSum){
                maxSum = sum;
                end = index;
            }
            
            if (sum < 0) {
                sum = 0;
                start = index + 1;

            }
            index++;

        }

        System.out.println(maxSum + " " + start + " " + end);

    }
}
