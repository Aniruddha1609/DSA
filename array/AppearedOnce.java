package array;

public class AppearedOnce {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 3, 4, 3, 2 };
        int appearedOnce = 0;

        for (int element : arr) {
            appearedOnce = appearedOnce ^ element;
        }

        System.out.println(appearedOnce);
    }
}
