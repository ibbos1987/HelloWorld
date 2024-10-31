package OOP;

import java.util.Scanner;

public class CalculatorMaine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("ange tal1:");
        int tal1 = scan.nextInt();

        System.out.println("ange tal2: ");
        int tal2 = scan.nextInt();


        Calculator calc = new Calculator(tal1, tal2);

        System.out.println("Vad vill du göra?");
        System.out.println("1 Addera");
        System.out.println("2 subtrahera");
        System.out.println("3 Multiplicera");
        System.out.println("4 Dividera");
        System.out.println("5 Avsluta");
        int choice = scan.nextInt();


        if (choice == 1) System.out.println("summan blir " + calc.add());
        if (choice == 2) System.out.println("summan blir " + calc.sub());
        if (choice == 3) System.out.println("summan blir " + calc.mult());
        if (choice == 4) System.out.println("summan blir " + calc.div());
        if (choice == 5) {
            System.out.println("avslutar program");
        }
        if (choice != 1 || choice != 2 || choice != 3 || choice != 4 || choice != 5) {
            System.out.println("ogiltigt val, ange ett val mellan 1-5!");
        }


    }

}
