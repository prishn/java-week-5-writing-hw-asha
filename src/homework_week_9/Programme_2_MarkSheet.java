package homework_week_9;

import java.util.Scanner;

public class Programme_2_MarkSheet {
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter student Name \t \t:\t"); //input wizard
        String name = scanner.next();
        System.out.println("Enter Student ROll Number \t\t:\t");//input wizard
        int rollNum = scanner.nextInt();
        System.out.println("Enter Marks of Subject Maths \t:\t");
        int mathsMarks = scanner.nextInt();
        while (mathsMarks < 0 || mathsMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks of Maths \t\t:\t");
            mathsMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject Science \t:\t");
        int scienceMarks = scanner.nextInt();
        while (scienceMarks < 0 || scienceMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks for Science \t\t:\t");
            scienceMarks = scanner.nextInt();
        }
        System.out.println("Enter Marks of Subject English \t:\t");
        int englishMarks = scanner.nextInt();
        while (englishMarks < 0 || englishMarks > 100) {
            System.out.println("\nInvalid Input, Mark should between 0 to 100");
            System.out.println("\nPlease enter correct marks for English \t\t:\t");
        }
        int total = sum(mathsMarks, scienceMarks, englishMarks);
        int percentage = (total * 100) / 300;
        String result = calculateResult(mathsMarks, scienceMarks, englishMarks);
        String grade = calculateGrade(percentage, result);
        printTheMarkSheet(name, rollNum, mathsMarks, scienceMarks, englishMarks, total, percentage, result, grade);
        //closing the scanner object
        scanner.close();
    }

    //calculating the sum
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    //calculation the results on subjects marks
    public static String calculateResult(int mathsMarks, int scienceMarks, int englishMarks) {
        if (mathsMarks < 35 || scienceMarks < 35 || englishMarks < 35) {
            return "FAIL";
        } else {
            return "PASS";
        }
    }

    //calculating the grade on percentage and result
    public static String calculateGrade(int percentage, String result) {
        String grade = null;
        if (result.equalsIgnoreCase("pass")) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else if (percentage >= 35) {
            grade = "C";
        } else {
            grade = "-";
        }
        return grade;
    }

    //printing the mark sheet
    public static void printTheMarkSheet(String name, int rollNum, int mathsMarks, int scienceMarks, int englishMarks,
                                         double total, double percentage, String result, String grade) {
        System.out.println("|----------------------------------------|");
        System.out.println("|             MARK SHEET                 |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Name          : " + name + "           |");
        System.out.println("| Roll No       : " + rollNum + "        |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Subjects      :   Marks                |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Math          : " + mathsMarks + "     |");
        System.out.println("| Science       : " + scienceMarks + "   |");
        System.out.println("| English       : " + englishMarks + "   |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Total         : " + total + "          |");
        System.out.println("|----------------------------------------|");
        System.out.println("| Percentage    : " + percentage + "     |");
        System.out.println("| Result    : " + result + "             |");
        System.out.println("| Grade    : " + grade + "               |");
        System.out.println("|----------------------------------------|");
    }
}
