public class MultiplicationTables {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Multiplication Table of : " + i);

            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }

            System.out.println();
        }
    }
}
