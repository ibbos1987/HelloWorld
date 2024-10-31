package inlamningsuppgift2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountTest {

    @Test
    void testAntalTecken() {
        CountLogik countLogik = new CountLogik();

        countLogik.counter("hej");
        countLogik.counter("jag heter staffan");

        assertEquals(20, countLogik.getAntalTecken());
    }

    @Test
    void testAntalRader() {
        CountLogik countLogik = new CountLogik();

        countLogik.counter("hej");
        countLogik.counter("jag heter staffan");

        assertEquals(2, countLogik.getAntalRader());

    }

    @Test
    void testAntalOrd() {
        CountLogik countLogik = new CountLogik();

        countLogik.counter("hej");
        countLogik.counter("jag heter staffan");

        assertEquals(4, countLogik.getAntalOrd());

    }

    @Test
    void testLangstaOrd() {
        CountLogik countLogik = new CountLogik();

        countLogik.counter("hej");
        countLogik.counter("jag heter staffan");

        assertEquals("staffan", countLogik.getLangstaOrd());
    }
}
