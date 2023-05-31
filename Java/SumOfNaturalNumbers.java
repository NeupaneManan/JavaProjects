import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int limit = scanner.nextInt();

        int sum = 0;

        // Calculate the sum of natural numbers
        for (int i = 1; i <= limit; i++) {
            sum += i;
        }

        System.out.println("The sum of natural numbers up to " + limit + " is: " + sum);
    }
}
