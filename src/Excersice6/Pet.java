package Excersice6;

public class Pet {

    private String name; //attribut

    public Pet(String petname) { //konstruktor
        name = petname;
    }

    public void printName() {
        System.out.println("the name of the pet is " + name);
    }

    public String getName() {
        return name;
    }

}
