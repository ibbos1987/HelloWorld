package OOP;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {

    @Test
    @DisplayName("Test av Cirkelns area när radien är 10")
    void testOfCircleAreaRadius10() {
        //skapar mitt lokala objekt cicle
        //klassen /lokalt objekt /anrop av konstruktor
        Circle circle = new Circle(10);
        System.out.println(circle.getRadie());

        //Verifiering av att arean av en
        //cikle med radie 10=314

        assertEquals(314, circle.calculateArea());
    }

    @Test
    @DisplayName("Test av Cirkelns area när radien är 5")
    void testOfCircleAreaRadius5() {
        Circle circle = new Circle(5);
        assertEquals(78.5, circle.calculateArea());
    }

    @Test
    @DisplayName("Test av Cirkelns area när radien är 7,5")
    void testOfCircleAreaRadius7dot5() {
        Circle circle = new Circle(7.5);
        assertEquals(176.625, circle.calculateArea());
    }
}
