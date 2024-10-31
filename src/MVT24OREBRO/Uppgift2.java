package MVT24OREBRO;

public class Uppgift2 {
    public static void main(String[] args) {

        int grund = 8000;
        double forsalningssumma = 10000;
        double provision = 0.09;


        System.out.println();
        System.out.println("lönen blir " + grund + "+" + (forsalningssumma * provision) + " totalt = " +
                (grund + forsalningssumma * provision) + "kr");


    }
}
