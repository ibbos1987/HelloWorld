package inlamningsuppgift2;

public class CountMain {
    public static void main(String[] args) {

        // klass /variabel /operator /konstruktor
        CountLogik count = new CountLogik();

        count.inMatning();//hämtar input från metoden inMatning i CountLogik


        //skriver ut dessa rader och hämtar infon från metoderna i CountLogik
        System.out.println("Antal rader: " + count.getAntalRader());
        System.out.println("Antal tecken: " + count.getAntalTecken());
        System.out.println("Antal ord: " + count.getAntalOrd());
        System.out.println("Längsta ordet är: " + count.getLangstaOrd());

    }
}
