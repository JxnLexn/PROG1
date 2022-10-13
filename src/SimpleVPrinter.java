public class SimpleVPrinter {
    public static void main(String[] args) {
        printV(4);
        printV(3);
    }


    public static void printV(int size) {
        int row = 0;
        while (row < size) {
            int i  = 0;
            while (i < row) {
                System.out.print(" ");
                i++;
            }
            // print first x
            System.out.print("x");

            if (row < size - 1) {
                // print blanks
                i = 0;
                int numOfBlanks = 2 * size - 2 * row - 3;
                while (i < numOfBlanks) {
                    System.out.print(" ");
                    i++;
                }
                // print final x
                System.out.print("x");
            }
            row++;
            System.out.println();
        }
    }
}
