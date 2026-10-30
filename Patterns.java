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
}

class Patterns {
    public static void main(String[] args) {
        Printpattern pattern1 = new Printpattern();
        pattern1.thirdPattern(5);
    }
}