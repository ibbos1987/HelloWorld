public class MyInteger {
    //psvm
    public static void main(String[] args) {
        int number = 5;
        int nextNumber = 6;

        System.out.println(number);
        System.out.println(nextNumber);

        nextNumber = number + 1;
        number = 5 + 3;

        System.out.println();
        System.out.println("uppdaterade siffror:");
        System.out.println(number);
        System.out.println(nextNumber);



        System.out.println();
        System.out.println("uppdateringar: ");
        //number=number+3; number=5+3
        number +=3;
        System.out.println(number);
        nextNumber -= 2;
        System.out.println(nextNumber);
        System.out.println();

        System.out.println("uppdateringar: ");
        //number+=1; number=number+1
        number++;
        System.out.println(number);
        nextNumber--;
        System.out.println(nextNumber);




    }
}
