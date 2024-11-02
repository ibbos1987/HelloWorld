package inlamningsuppgift2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountTest {

    @Test
    void testAntalTecken() {
        CountLogik count = new CountLogik();

        count.counter("hej");
        count.counter("jag heter staffan");

        assertEquals(20, count.getAntalTecken());
    }

    @Test
    void testAntalRader() {
        CountLogik count = new CountLogik();

        count.counter("hej");
        count.counter("jag heter staffan");

        assertEquals(2, count.getAntalRader());

    }

    @Test
    void testAntalOrd() {
        CountLogik count = new CountLogik();

        count.counter("hej");
        count.counter("jag heter staffan");

        assertEquals(4, count.getAntalOrd());

    }

    @Test
    void testLangstaOrd() {
        CountLogik count = new CountLogik();

        count.counter("hej");
        count.counter("jag heter staffan");

        assertEquals("staffan", count.getLangstaOrd());
    }
}
