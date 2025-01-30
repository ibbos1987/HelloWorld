package automation.Inlamningsuppgift;

import java.util.Scanner;

public class MorsecodeMain {
    public static void main(String[] args) {
        MorsecodeLogic morsecodeLogic = new MorsecodeLogic();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nVälj ett alternativ:");
            System.out.println("1. Skriv ut hela Morse-kodtabellen");
            System.out.println("2. Konvertera text till morsekod");
            System.out.println("3. Konvertera morsekod till text");
            System.out.println("4. Avsluta");

            try {
                System.out.print("Ange ditt val: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        System.out.println(morsecodeLogic.printMorseCodeMap());
                        break;

                    case 2:
                        System.out.print("Skriv text att konvertera till morsekod: ");
                        String text = scanner.nextLine();
                        System.out.println("Morsekod: " + morsecodeLogic.convertTextToMorse(text));
                        break;

                    case 3:
                        System.out.print("Skriv morsekod att konvertera till text (separera bokstäver med mellanslag och ord med /): ");
                        String morseInput = scanner.nextLine();
                        System.out.println("Text: " + morsecodeLogic.convertMorseToText(morseInput));
                        break;

                    case 4:
                        System.out.println("Avslutar programmet...");
                        running = false;
                        break;

                    default:
                        System.out.println("Felaktigt val, försök igen använd valen 1-4.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Fel: Ange ett giltigt nummer.");
            } catch (Exception e){
                System.out.println("Ett fel inträffade! Försök igen.");
                System.out.println(e);
            }
        }

        scanner.close();
    }
}