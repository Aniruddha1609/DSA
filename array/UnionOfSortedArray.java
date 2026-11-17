package array;

public class UnionOfSortedArray {
    public static void main(String[] args) {
        int[] firstArr = { 1, 2, 2, 3, 4, 5, 5, 5 };
        int[] secondArr = { 2, 3, 4, 4, 6, 7, 7, 8 };
        int[] unionOfSortedArray = new int[firstArr.length + secondArr.length];

        int unionPointer = 1;
        int firstPointer = 1;
        int secondPointer = 0;
        int pos = 0;
        int[] arrRef = firstArr;

        unionOfSortedArray[0] = firstArr[0];

        while (firstPointer < firstArr.length && secondPointer < secondArr.length) {
            if (firstArr[firstPointer] <= secondArr[secondPointer]
                    && firstArr[firstPointer] != unionOfSortedArray[unionPointer - 1]) {
                unionOfSortedArray[unionPointer++] = firstArr[firstPointer];
                firstPointer++;
            } else if (firstArr[firstPointer] > secondArr[secondPointer]
                    && secondArr[secondPointer] != unionOfSortedArray[unionPointer - 1]) {
                unionOfSortedArray[unionPointer++] = secondArr[secondPointer];
                secondPointer++;
            } else if (firstArr[firstPointer] <= secondArr[secondPointer]
                    && firstArr[firstPointer] == unionOfSortedArray[unionPointer - 1]) {
                firstPointer++;
            } else
                secondPointer++;
        }

        if (firstPointer == firstArr.length) {
            pos = secondPointer;
            arrRef = secondArr;
        }

        else if (secondPointer == secondArr.length) {
            pos = firstPointer;
            arrRef = firstArr;
        }

        for (int index = pos + 1; index < arrRef.length; index++) {
            if (arrRef[index] != arrRef[index - 1])
                unionOfSortedArray[unionPointer++] = arrRef[index - 1];

        }

        unionOfSortedArray[unionPointer] = arrRef[arrRef.length - 1];

        for (int index = 0; index <= unionPointer; index++) {
            System.out.print(unionOfSortedArray[index] + " ");
        }
    }
}
