package OOP;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangelTest {

    @Test
    void testCalculateArea() {
        Rectangel rec = new Rectangel(10, 2);
        assertEquals(20, rec.calculateArea());
    }

    @Test
    void testCalculatorPerimeter() {
        Rectangel rec = new Rectangel(10, 2);
        assertEquals(24, rec.calculatePerimeter());
    }


}
