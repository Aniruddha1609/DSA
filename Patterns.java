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

    void eigthPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column < row; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= (2 * (size - row)) + 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void ninthPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size - row; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= 2 * (row - 1) + 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column < row; column++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= (2 * (size - row)) + 1; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void tenthPattern(int size) {
        for (int row = 1; row <= 2 * size - 1; row++) {
            int stars = row;
            if (row > size)
                stars = 2 * size - row;
            for (int column = 1; column <= stars; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void eleventhPattern(int size) {
        int evenVal = 0;
        int oddVal = 1;
        for (int row = 1; row <= size; row++) {
            int startPoint;
            startPoint = row % 2 == 0 ? evenVal : oddVal;
            for (int column = 1; column <= row; column++) {
                System.out.print(startPoint);
                startPoint = startPoint ^ 1;
            }
            System.out.println();
        }
    }
}

class Patterns {
    public static void main(String[] args) {
        Printpattern pattern1 = new Printpattern();
        pattern1.eleventhPattern(5);
    }
}