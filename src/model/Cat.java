package model;

public class Cat extends Pet{
    public void meow() {
        System.out.println("Meow meow");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        System.out.println(cat1);
    }
}
