import java.applet.Applet;
import java.awt.*;

public class Servlet {
public void makeSound() {
        System.out.println("I am an animal!");
    }
}

class Dog extends Servlet {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
