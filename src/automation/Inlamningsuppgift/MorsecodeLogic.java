package automation.Inlamningsuppgift;

import java.util.HashMap;


public class MorsecodeLogic {

    private HashMap<Character, String> morsecodeMap = new HashMap<>();
    private HashMap<String, Character> reverseMorseMap = new HashMap<>();

    public MorsecodeLogic() {
        // Fyll HashMap med tecken och deras motsvarande morsekod
        morsecodeMap.put('A', ".-");
        morsecodeMap.put('B', "-...");
        morsecodeMap.put('C', "-.-.");
        morsecodeMap.put('D', "-..");
        morsecodeMap.put('E', ".");
        morsecodeMap.put('F', "..-.");
        morsecodeMap.put('G', "--.");
        morsecodeMap.put('H', "....");
        morsecodeMap.put('I', "..");
        morsecodeMap.put('J', ".---");
        morsecodeMap.put('K', "-.-");
        morsecodeMap.put('L', ".-..");
        morsecodeMap.put('M', "--");
        morsecodeMap.put('N', "-.");
        morsecodeMap.put('O', "---");
        morsecodeMap.put('P', ".--.");
        morsecodeMap.put('Q', "--.-");
        morsecodeMap.put('R', ".-.");
        morsecodeMap.put('S', "...");
        morsecodeMap.put('T', "-");
        morsecodeMap.put('U', "..-");
        morsecodeMap.put('V', "...-");
        morsecodeMap.put('W', ".--");
        morsecodeMap.put('X', "-..-");
        morsecodeMap.put('Y', "-.--");
        morsecodeMap.put('Z', "--..");
        morsecodeMap.put(' ', "/");

        // Fyll omvänd HashMap för morsekod till bokstäver
        for (Character key : morsecodeMap.keySet()) {
            //hämta vädet för key och sätt det som ny key i reversMorseMap
            reverseMorseMap.put(morsecodeMap.get(key), key);
        }
    }

    public String printMorseCodeMap() {
        // Skapar en StringBuilder för att bygga upp resultatet och börjar med en rubrik
        StringBuilder result = new StringBuilder("Morse Code Map:\n");
        // Loopar igenom alla nycklar (tecken) i morsecodeMap
        for (Character key : morsecodeMap.keySet()) {
            //lägg till key   //lägg till ": " //lägg till värdet för key  //lägg till ny rad
            result.append(key).append(": ").append(morsecodeMap.get(key)).append("\n");
        }
        // Omvandlar StringBuilder-innehållet till en vanlig sträng och returnerar den
        return result.toString();
    }

    public String convertTextToMorse(String text) {
        // Skapar en StringBuilder för att bygga upp resultatet i morsekod
        StringBuilder morseResult = new StringBuilder();

        // Konverterar hela texten från MAIN till stora bokstäver för att matcha nycklarna i morsecodeMap
        text = text.toUpperCase();

        // Itererar över varje tecken i texten
        for (char character : text.toCharArray()) {
            // Kontrollerar om tecknet finns i morsecodeMap
            if (morsecodeMap.containsKey(character)) {
                // Om tecknet finns, läggs dess motsvarande morsekod till resultatet med ett mellanslag
                morseResult.append(morsecodeMap.get(character)).append(" ");
            } else {
                // Om tecknet inte finns i morsecodeMap, returneras ett felmeddelande
                return "Fel: Ogiltigt tecken '" + character + "' hittades.";
            }
        }
        // Returnerar den färdigbyggda morsekoden som en sträng
        return morseResult.toString().trim();
    }

    public String convertMorseToText(String morseInput) {
        // Skapar en StringBuilder för att bygga upp resultatet i text
        StringBuilder textResult = new StringBuilder();
        // Delar upp morsekoden i ord som hamnar i en array och använder "/"som mellanslag.
        //Hämtar info för morseInput från MAIN
        String[] morseWords = morseInput.split("/");

        // Loopar igenom varje ord i den uppdelade morsekoden
        for (String word : morseWords) {
            // Delar upp varje ord i enskilda bokstäver baserat på mellanslag " ", dem hamnar i arrayen morseLetters
            String[] morseLetters = word.split(" ");

            // Loopar igenom varje bokstav i morsekoden
            for (String letter : morseLetters) {
                // Kontrollerar om morsekoden finns i den omvända HashMap:en (reverseMorseMap)
                if (reverseMorseMap.containsKey(letter)) {
                    // Om morsekoden finns, läggs motsvarande bokstav till i textresultatet
                    textResult.append(reverseMorseMap.get(letter));
                } else {
                    // Om morsekoden inte finns, returneras ett felmeddelande
                    return "Fel: Ogiltig morsekod '" + letter + "' hittades.";
                }
            }
            // Lägger till ett mellanslag efter varje ord för att separera dem
            textResult.append(" ");
        }
        // Returnerar den färdigbyggda texten som en sträng, efter att ha tagit bort onödiga mellanslag
        return textResult.toString().trim();
    }
}