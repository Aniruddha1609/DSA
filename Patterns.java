class Printpattern {
    void firstPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.println('*');
            }
            System.out.println();
        }
    }

    void secondPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    void thirdPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    void fourthPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(row);
            }
            System.out.println();
        }
    }

    void fifthPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = size; column >= row; column--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void sixthPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size + 1 - row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }

    void seventhPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size - row; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= 2 * (row - 1) + 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Patterns {
    public static void main(String[] args) {
        Printpattern pattern1 = new Printpattern();
        pattern1.seventhPattern(5);
    }
}