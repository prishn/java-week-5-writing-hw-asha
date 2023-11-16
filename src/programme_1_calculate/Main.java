package programme_1_calculate;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declaring scanner object
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
            System.out.println("Please enter first number: ");// in[ut wizard
            int a = scanner.nextInt();
            System.out.println("Please enter second number: ");// input wizard
            int b = scanner.nextInt();
            System.out.println("Please enter one of the symbol =, -, /, * : ");
            char symbol = scanner.next().charAt(0);
            Calculator calculator = new Calculator();
            calculator.calculateResult(a, b, symbol);
            System.out.println("Would you like to do more calculation please enter 'Y' or 'N'");//input wizard
            answer = scanner.next().toLowerCase(Locale.ROOT);
        } while (answer.startsWith("y"));
        //closing a scanner object
        scanner.close();
    }
}
