package inlamningsuppgift2;

import java.util.Scanner;

public class CountLogik {
    //deklarerar variabler
    private int antalRader = 0;
    private int antalTecken = 0;
    private int antalOrd = 0;
    private String langstaOrd = "";

    //Hanterar input tills att ordet stop skrivs på separat rad
    public void inMatning() {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Skriv din text, avlsuta genom att trycka" + "\n" +
                "enter och skriva stop");

        do {

            input = scanner.nextLine();//läser vad användaren har skrivit in

            //när stop skrivs lägg då in informationen i respektive variabel
            if (!input.equalsIgnoreCase("stop")) {//om inläsning inte är stop
                counter(input);//anropar counter metoden för varje rad som inte är stop
            }
        } while (!input.equalsIgnoreCase("stop"));// gör så länge stop inte finns

    }

    public void counter(String input) {
        //tilldelar variabler
        antalRader++;// Ökar antalet rader varje gång do loopen körs
        antalTecken += input.length();// Lägger till radens längd

        //gör en array av String input uppdelat på mellanslag
        String[] ordArray = input.split(" ");
        antalOrd += ordArray.length;//laggrar antal ord från arreyen

        //For loop för att göra en itteration som hittar det längsta ordet
        for (int i = 0; i < ordArray.length; i++) {
            String ord = ordArray[i]; //lägg in orden i varibeln ord
            if (ord.length() > langstaOrd.length()) {//om ord är längre än tidigare ord
                //så blir längsta ord det ordet
                langstaOrd = ord;
            }

        }


    }

    // Metod för att hämta antalet rader
    public int getAntalRader() {
        return antalRader;//returnerar antalet rader
    }

    // Metod för att hämta det antalet tecken
    public int getAntalTecken() {
        return antalTecken;//returnerar antalet tecken
    }

    // Metod för att hämta det antalet ord
    public int getAntalOrd() {
        return antalOrd; // returnerar antal ord
    }

    // Metod för att hämta det längsta ordet
    public String getLangstaOrd() {
        return langstaOrd;
    }
}
