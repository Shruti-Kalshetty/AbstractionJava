// Abstract class
abstract class Animal {
    public abstract void sound(); //abstract method

    public void sleep() {
        System.out.println("This animal is sleeping.");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("The cat meows.");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  
        myCat.sound();  
        myDog.sleep();  
        myCat.sleep(); 
}
}

