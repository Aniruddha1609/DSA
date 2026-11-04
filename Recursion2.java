class Functions {
    void printNSumParameterized(int sum, int range) {
        if (range < 1) {
            System.out.println(sum);
            return;
        }

        printNSumParameterized(sum + range, range - 1);
    }

    int printNSumFunctional(int range) {
        if (range < 1) {
            return range;
        }

        return range + printNSumFunctional(range - 1);
    }

    void revereArray(int left, int array[]) {

        if (left >= array.length - 1 - left) {
            for (int index = 0; index < array.length; index++) {
                System.out.println(array[index]);
            }
            return;
        }

        int temp = array[left];
        array[left] = array[array.length - left - 1];
        array[array.length - left - 1] = temp;

        revereArray(left + 1, array);
    }

    boolean stringPalindromeCheck(int left, String str) {

        if (left >= str.length() - 1 - left) {
            return true;
        }

        if (str.charAt(left) != str.charAt(str.length() - 1 - left))
            return false;

        return stringPalindromeCheck(left + 1, str);
    }

    int fibonacci(int current) {
        if (current <= 1)
            return current;
        return fibonacci(current - 1) + fibonacci(current - 2);
    }
}

public class Recursion2 {
    public static void main(String[] args) {
        Functions fn = new Functions();
        // fn.printNSumParameterized(0, 5);
        // int sum = fn.printNSumFunctional(5);
        // System.out.println(sum);
        // String str = "madona";
        // System.out.println(fn.stringPalindromeCheck(0, str));
        System.out.println(fn.fibonacci(5));
    }
}
