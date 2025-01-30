package automation.Inlamningsuppgift;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MorsecodeTest {


    @Test
    public void testConvertTextToMorse() {
        MorsecodeLogic morsecodeLogic=new MorsecodeLogic();

        // Testa giltiga ord/bokstäver
        assertEquals(".... . .---", morsecodeLogic.convertTextToMorse("Hej"));
        assertEquals(".... . .-.. .-.. --- .-- --- .-. .-.. -..", morsecodeLogic.convertTextToMorse("HelloWorld"));
        assertEquals("--.. . -... .-. .-", morsecodeLogic.convertTextToMorse("Zebra"));
        assertEquals(".-", morsecodeLogic.convertTextToMorse("a"));

        // Testa ogiltiga tecken
        assertEquals("Fel: Ogiltigt tecken '1' hittades.", morsecodeLogic.convertTextToMorse("1"));
        assertEquals("Fel: Ogiltigt tecken '!' hittades.", morsecodeLogic.convertTextToMorse("!"));
        assertEquals("Fel: Ogiltigt tecken '#' hittades.", morsecodeLogic.convertTextToMorse("#"));
        assertEquals("Fel: Ogiltigt tecken '1' hittades.", morsecodeLogic.convertTextToMorse("1#"));
    }

    @Test
    public void testConvertMorseToText() {
        MorsecodeLogic morsecodeLogic=new MorsecodeLogic();

        // Testa giltiga morsekoder
        assertEquals("HEJ", morsecodeLogic.convertMorseToText(".... . .---"));
        assertEquals("HELLOWORLD", morsecodeLogic.convertMorseToText(".... . .-.. .-.. --- .-- --- .-. .-.. -.."));
        assertEquals("ZEBRA", morsecodeLogic.convertMorseToText("--.. . -... .-. .-"));

        // Testa ogiltiga morsekoder
        assertEquals("Fel: Ogiltig morsekod '.-.-.-' hittades.", morsecodeLogic.convertMorseToText(".-.-.- / .---- / -....-"));
        assertEquals("Fel: Ogiltig morsekod '1' hittades.", morsecodeLogic.convertMorseToText("1"));
        assertEquals("Fel: Ogiltig morsekod '!' hittades.", morsecodeLogic.convertMorseToText("!"));
        assertEquals("Fel: Ogiltig morsekod '#1' hittades.", morsecodeLogic.convertMorseToText("#1"));
    }


}


/*❖ A = .-
        ❖ B = -...
        ❖ C = -.-.
        ❖ D = -..
        ❖ E = .
        ❖ F = ..-.
        ❖ G = --.
        ❖ H = ....
        ❖ I = ..
        ❖ J = .---
        ❖ K = -.-
        ❖ L = .-..
        ❖ M = --
        ❖ N = -.
        ❖ O = ---
        ❖ P = .--.
        ❖ Q = --.-
        ❖ R = .-.
        ❖ S = ...
        ❖ T = -
        ❖ U = ..-
        ❖ V = ...-
        ❖ W = .--
        ❖ X = -..-
        ❖ Y = -.--
        ❖ Z = --..*/