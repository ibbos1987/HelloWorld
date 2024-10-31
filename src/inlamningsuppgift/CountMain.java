package inlamningsuppgift;

import java.util.Scanner;

public class CountMain {
    public static void main(String[] args) {
        //skapar en inläsnings funktion
        Scanner scanner = new Scanner(System.in);
        //samlar in text för flera rader
        StringBuilder inputBuilder = new StringBuilder();
        String input;
        System.out.println("Skriv din text, avlsuta genom att trycka" + "\n"+
                "enter och skriva stop");

        // Loop som samlar text tills att "stop" skrivs på egen rad
        do {
            input = scanner.nextLine(); //läser vad användaren skriver
            if (!input.equalsIgnoreCase("stop")) {
                //samlar info från variablen input och "\n" gör en ny rad
                //det separeras från tidigare rad så att vi kan räkna rader
                //baserat på antal "\n"
                inputBuilder.append(input).append("\n");
            }
        } while (!input.equalsIgnoreCase("stop"));//gör loop tills att stop hittats på egen rad

        //gör inputbilder till en sträng
        String finalInput = inputBuilder.toString();
        //Klass   //Variabel/attribut //objekt //konstrukto //objekt som skickas till konstruktor
        CountLogik count = new CountLogik(finalInput);

        //skriver ut antal rader och tecken med funktionerna i CountloLogik
        System.out.println("Antal rader: " + count.lineCount());
        System.out.println("Antal tecken: " + count.charCount());


    }

}
//Del 1
//Redogöra för en likhet och en
// skillnad mellan programmeringsspråken Java och Python

//Redogöra för följande termer:
//objekt, Konstruktor, Attribut

//Redogöra för de grundläggande principerna för versionshantering
//vilka steg gör vi vid versions hantering

//Beskriv kort utvecklingsprocessen TDD

//Del 2
//Skriv ett program som läser in text ifrån kommandoraden rad för rad
//tills användaren skriver ordet stop

//När användaren är klar skriver programmet ut antal tecken
//och hur många rader som användaren har skrivit,
//exklusive raden med ordet stop

//Programmet skall bestå av två klasser:
//En klass som läser in text och skriver ut resultatet till användaren

//En annan klass som räknar raderna och har koll på antalet tecken
//Kontrollen för att ha koll på om användaren har skrivit ordet stop
//eller inte får utföras i vilken av klasserna man vill

//Till programet skall minst tre Junit-testfall srkivas

//Testfallen skall skilja sig märkvärt åt och testa olika delar
//av programmet

//Programmet skall versionhanteras och finnas tillgängligt på Github.
//Endast länk till ditt repo med koden behöver lämnas in för del 2

//Del 3
//Vidareutveckla ditt program i del 2 så att programmet även
//gör följande:

//SKriver ut antal ord (separerade med blanksteg)
//Skriver ut det längsta ordet

//Kontrollen om anvädaren har skrivit ordet stop
//eller inte måste ligga i den andra "logi-klassen"

