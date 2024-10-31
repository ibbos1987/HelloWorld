package OOP;

import java.util.Scanner;

public class RectangelMaine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("skriv bredd: ");
        double width = scanner.nextDouble();
        System.out.println("Skriv höjd: ");
        double hight = scanner.nextDouble();

        Rectangel rec = new Rectangel(width, hight);

        //Rectangel rec = new Rectangel(10, 2);

        System.out.println("Arean: " + rec.calculateArea());
        System.out.println("Omkretsen: " + rec.calculatePerimeter());

    }
}
