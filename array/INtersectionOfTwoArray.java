package array;

public class INtersectionOfTwoArray {
    public static void main(String[] args) {
        int firstArray[] = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int secondArray[] = { 2, 3, 3, 5, 6, 7, 8 };
        int intersectedArray[] = new int[firstArray.length + secondArray.length];
        int firstPointer = 0;
        int secondPointer = 0;
        int intersectionPointer = 0;

        while (firstPointer < firstArray.length && secondPointer < secondArray.length) {
            if (firstArray[firstPointer] == secondArray[secondPointer]) {
                intersectedArray[intersectionPointer] = firstArray[firstPointer];
                secondPointer++;
                intersectionPointer++;
            }
            firstPointer++;
        }

        for (int index = 0; index < intersectionPointer; index++) {
            System.out.print(intersectedArray[index] + " ");
        }
    }
}
