package tdd;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line;
        int antalRader=0;
        do {
            antalRader++;
            System.out.println("skriv användarnamn och lösenord: ");
            line = scanner.nextLine();
            System.out.println("Ditt användarnamn är: " + line);
            System.out.println(line.length());
            int sumAntalTecken = 0;
            sumAntalTecken = line.length();
            System.out.println(sumAntalTecken);
            //if(line.contains("stop")) System.out.println("Tack och hej");
        }while (!line.contains("stop"));
        System.out.println(antalRader);
    }
}
