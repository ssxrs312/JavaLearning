package chapter1.node8.interfaceE12;

public class Fish extends Animal implements Pet{


    private String name;

    public Fish(){
        super(0);

    }

    @Override
    public void walk() {
        System.out.println("fish no legs and not walk");
    }

    @Override
    public void eat() {
        System.out.println("fish eat");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("fish play");
    }

}
