package InheritanceAndPolymorphism.MethodOverriding.Example;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows meows");
    }
}
