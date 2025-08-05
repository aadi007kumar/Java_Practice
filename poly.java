class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
// Child Classes
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks: Woof!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows: Meow!");
    }
}
// The Dispatch in Action
public class poly{
    public static void main(String[] args) {
        Animal myPet; // Animal reference
        myPet = new Dog();
        myPet.makeSound(); // JVM sees a Dog object -> "Dog barks: Woof!"
        myPet = new Cat();
        myPet.makeSound(); // JVM sees a Cat object -> "Cat meows: Meow!"
    }
}