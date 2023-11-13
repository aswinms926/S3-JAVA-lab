package aswin;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }
    public void walk() {
        if (this.legs > 0)
            System.out.println("This animal walks on " + legs + " legs");
        else
            System.out.println("This animal cannot walk");
    }
    public abstract void eat();
}

class Spider extends Animal {
    public Spider() {
        super(8);
    }
    public void eat()
    {
        System.out.println("The spider eats insects");
    }
}
interface Pet
{
    String getName();
    void setName(String name);
    void play();
}
class Cat extends Animal implements Pet
{
    private String name;

    public Cat(String name)
    {
        super(4);
        this.name = name;
    }

    Cat()
    {
        this("");
    }

    public void eat()
    {
        System.out.println("The cat eats fish");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void play()
    {
        System.out.println("The cat is playing");
    }
}

class Fish extends Animal implements Pet
{
    private String name;

    public Fish()
    {
        super(0);
    }

    public void eat()
    {
        System.out.println("The fish eats plants");
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void play()
    {
        System.out.println("The fish is playing");
    }

}

public class Interface
{
    public static void main(String[] args)
    {
        System.out.println("SPIDER");
        Spider ob = new Spider();
        ob.eat();
        ob.walk();

        System.out.println("FISH");
        Fish ov = new Fish();
        ov.setName("Neo");
        System.out.println("The fish's name is " + ov.getName());
        ov.walk();
        ov.eat();
        ov.play();


        System.out.println("CAT");
        Cat oc = new Cat();
        oc.setName("Tom");
        System.out.println("The cat's name is " + oc.getName());
        oc.walk();
        oc.eat();
        oc.play();



    }
}