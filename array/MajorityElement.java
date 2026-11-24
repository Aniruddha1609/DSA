package array;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5, 1 };
        int element = arr[0];
        int count = 1;

        for (int index = 1; index < arr.length; index++) {
            if (count == 0) {
                element = arr[index];
                count = 1;
            }

            if (element == arr[index]) {
                count++;
            }

            if (element != arr[index]) {
                count--;
            }
        }
        System.out.println(element);
    }

}
