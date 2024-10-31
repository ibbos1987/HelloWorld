package inlamningsuppgift;



public class CountLogik {
    private String input;


    public CountLogik(String input){
        this.input=input;

    }

    //beräkna antal rader
    public int lineCount(){

        if (input.isEmpty()){
            return 0;
        }
        //delar variablen input vid varje "\n" tex("hej", "jag heter")
        //som en array och och returnerar sedan lenght/antal "\n"
        return input.split("\n").length;
    }

    //beräkna antal tecken
    public int charCount(){
        if(input.isEmpty()){
            return 0;
        }
        //om input innehåller något så returneras längden på input
        return input.length();
    }


}
