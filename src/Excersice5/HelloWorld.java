package Excersice5;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int siffra = Integer.parseInt(scan.nextLine());

        HelloWorldPrinter hwp = new HelloWorldPrinter();

        hwp.print();
        hwp.printmanytimes(siffra);


    }
}
