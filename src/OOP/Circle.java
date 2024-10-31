package OOP;

public class Circle {
    private double radie; //klassens variabel, även kallat Attribut

    // Konstruktor med argument in, även kallat inparameter
    public Circle(double r) {
        radie = r;
    }


    public double calculateArea() {
        return (radie * radie) * 3.14;
    }

    public double getRadie() {
        return radie;
    }
}
