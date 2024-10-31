package MVT24OREBRO;

import java.util.Scanner;

public class uppgift44 {
    public static void main(String[] args) {
//        44.Skapa ett program som låter användaren bestämma hur många tal han vill summera. Läs in
//        detta antal tal och summera dem Skriv ut summan.

        Scanner scan = new Scanner(System.in);
        System.out.print("Hur många tal vill du läsa in? ");
        int antalTal = scan.nextInt();

        int sum = 0;
        for (int i = 0; i < antalTal; i++) {
            System.out.println("Skriv in ett tal ");
            int tal = scan.nextInt();
            sum = sum + tal;

        }
        System.out.println("Summan av alla " + antalTal + " talen är " + sum);
    }






}
