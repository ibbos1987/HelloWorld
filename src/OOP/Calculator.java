package OOP;

public class Calculator {
    private int tal1, tal2;// klassens attribut

    //Konstruktorn som sätter två tal
    public Calculator(int tal1, int tal2) {
        this.tal1 = tal1;
        this.tal2 = tal2;
    }

    // Metod till objeten av calculator
    public int add() {
        return tal1 + tal2;
    }

    public int sub() {
        return tal1 - tal2;
    }

    public int mult() {
        return tal1 * tal2;
    }

    public double div() {
        return (double) tal1 / tal2;
    }

    public int power() {
//        int result = 1;
//        for (int i=0; i < tal2; i++) result=result*tal1 ;
//        return result;
        return (int) Math.pow(tal1,tal2);
    }
}
