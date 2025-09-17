import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxTwoDigitFinder 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int input;
        do {
            System.out.print("Enter number (0 to stop): ");
            input = scanner.nextInt();
            if (input != 0) numbers.add(input);
        } while (input != 0);

        ArrayList<Integer> twoDigitNumbers = new ArrayList<>();
        for (int n : numbers) {
            if (n >= 10 && n <= 99) twoDigitNumbers.add(n);
        }

        if (twoDigitNumbers.isEmpty()) {
            System.out.println("No two-digit numbers entered.");
        } else {
            int max = Collections.max(twoDigitNumbers);
            System.out.println("Max two-digit number: " + max);
        }

        scanner.close();
    }
}
