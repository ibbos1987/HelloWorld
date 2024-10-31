package MVT24OREBRO;

public class uppgift48 {
    public static void main(String[] args) {
        //skapa ett program som skriver ut n! (fakulteten)

        int n;
        n=3;
        //fakulteten av tre är 1*2*3

        int produkt=1;
        for (int i=1;i<=3;i++){
            produkt=produkt*i;
            if (i !=n) System.out.print(i+" * ");
            else System.out.println(i);

        }
        System.out.println(" = "+produkt);
    }
}
