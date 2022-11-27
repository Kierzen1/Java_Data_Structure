class Problem {
    public static void main(String[] args) {

        for (int outer = 1; outer <= 11; outer++) {
            for (int inner = 1; inner <= 22; inner++) {
                if (outer % 2 != 0) {
                    if (inner % 2 != 0) {
                        System.out.print('/');
                    } else {
                        System.out.print("\\");
                    }
                } else {
                    if (inner % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print("_");
                    }
                }
            }
            System.out.println();
        }
    }
}