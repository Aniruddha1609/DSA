package array;

// import java.util.ArrayList;
// import java.util.Arrays;

public class Leftshiftbyk {

    public static void reverse(int[] arr, int low, int high) {
        int index = low;
        while (index < (low + high) / 2) {
            int temp = arr[index];
            arr[index] = arr[(high + low) - 1 - index];
            arr[(high + low) - 1 - index] = temp;
            index++;
        }
    }

    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50,
        // 60, 70, 80));
        // ArrayList<Integer> tempArr = new ArrayList<>();
        // int kPos = 3;
        // kPos = kPos % arr.size();
        // tempArr.addAll(arr.subList(0, kPos));
        // for (int index = kPos; index < arr.size(); index++) {
        // arr.set((index - kPos), arr.get(index));
        // }
        // for (int index = 0; index < tempArr.size(); index++) {
        // arr.set((arr.size() - kPos + index), tempArr.get(index));
        // }

        // for (int element : arr) {
        // System.out.println(element);
        // }

        // * Second optimal way */

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int kPos = 4;
        kPos %= arr.length;
        reverse(arr, 0, kPos);
        reverse(arr, kPos, arr.length);
        reverse(arr, 0, arr.length);

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}
