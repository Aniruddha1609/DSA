/**
 * Recursion
 */

class Recursivefunctions {

    // * Printing name for 5 times

    void printName(int current) {
        if (current <= 0)
            return;
        System.out.println("Aniruddha");
        current--;
        printName(current);
    }

    // * Printing number for serially

    void printSerialNumber(int current, int range) {
        if (current > range)
            return;

        System.out.println(current);
        current++;
        printSerialNumber(current, range);
    }

    // * Printing number for serially in reverse

    void printSerialNumberReverse(int current) {
        if (current <= 0)
            return;

        System.out.println(current);
        current--;
        printSerialNumberReverse(current);
    }
}

public class Recursion {

    public static void main(String[] args) {

        Recursivefunctions recursivefunction = new Recursivefunctions();
        recursivefunction.printSerialNumberReverse(5);
    }

}