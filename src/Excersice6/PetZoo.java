package Excersice6;

public class PetZoo {
    public static void main(String[] args) {

         Pet dog=new Pet("Fido");
         Pet cat=new Pet("Missan");
         Pet rabbit=new Pet("Coockie");


//         dog.printName();
//         cat.printName();
//         rabbit.printName();

        String dogName= dog.getName();
        String catName= cat.getName();
        String rabbitName= rabbit.getName();

        for (int i=0; i<3;i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);
        }

    }



}
