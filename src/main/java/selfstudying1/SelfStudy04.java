package selfstudying1;

import java.time.LocalDate;
import java.util.Scanner;

public class SelfStudy04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please to stop adding press q");

        System.out.println("To stop calculation press q");
        do {
            System.out.println("Please enter the operation among +, -, *, /, % ");
            char opr = scan.next().toLowerCase().charAt(0);
            if (opr == 'q') {
                System.out.println("See you again");
                break;
            }
            boolean r = opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%';
            if (!r) {
                System.out.println("Undefined operation");
                break;
            }
            System.out.println("Enter the first number");
            int n1 = scan.nextInt();
            System.out.println("Enter the second number");
            int n2 = scan.nextInt();
            switch (opr) {
                case '+':
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case '-':
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case '*':
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case '/':
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    break;
                case '%':
                    System.out.println(n1 + " % " + n2 + " = " + ((n1 * n2) / 100));
                    break;
            }
        } while (true);



    }
}


