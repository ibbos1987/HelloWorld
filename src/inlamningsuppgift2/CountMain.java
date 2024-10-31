package inlamningsuppgift2;

public class CountMain {
    public static void main(String[] args) {

        // klass
        CountLogik count = new CountLogik();

        count.inMatning();//hämtar input från CounterLogik


        //skriver ut dessa rader och hämtar infon från CountLogik
        System.out.println("Antal rader: " + count.getAntalRader());
        System.out.println("Antal tecken: " + count.getAntalTecken());
        System.out.println("Antal ord: " + count.getAntalOrd());
        System.out.println("Längsta ordet är: " + count.getLangstaOrd());

    }
}
