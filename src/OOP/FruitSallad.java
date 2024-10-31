package OOP;

public class FruitSallad {
    public static void main(String[] args) {
        Fruit apple = new Fruit("green");
        Fruit pear = new Fruit("green");
        //System.out.println(apple.color); because private
        System.out.println("Apple color " + apple.getColor());
        apple.setColor("red");
        System.out.println("Apple color " + apple.getColor());

        System.out.println();
        System.out.println("pear color " + pear.getColor());
        pear.setColor("brown");
        System.out.println("pear color " + pear.getColor());

    }
}
