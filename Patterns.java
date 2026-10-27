class Printpattern {
    void firstPattern(int size) {
        for (int row = 1; row <= size; row++) {
            for (int column = 1; column <= size; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

class Patterns {
    public static void main(String[] args) {
        Printpattern pattern1 = new Printpattern();
        pattern1.firstPattern(5);
    }
}