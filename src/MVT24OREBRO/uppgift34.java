package MVT24OREBRO;

public class uppgift34 {
    public static void main(String[] args) {

        String text = "Ni är bästa klassen vi har så roligt* eller hur?";

        System.out.println();
        System.out.println("textens längd är:" + text.length());

        /*
        for (int i = 0; i < text.length(); i++){
            char tecken=text.charAt(i);
            if (tecken=='*') break;
            System.out.print(tecken);
        }
        */

        System.out.println();
        int j = 0;
        while (text.charAt(j) != '*') {
            System.out.print(text.charAt(j));
            j++;

        }
        System.out.println();

        /* exempel med boolean
        int j = 0;
        boolean fortsatt = text.charAt(j) != '*';
        while (fortsatt) {
            System.out.print(text.charAt(j));
            j++;
         */




        /*
    Skapa ett program som läser in och skriver ut ett tecken i taget tills en * skrivs in.
     */

    }


}
