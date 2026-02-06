package InheritanceAndPolymorphism.RuntimePolymorphism.Data_Member;

public class PolymorphismExample {

    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); //gọi phương thức ghi đè
        System.out.println("Source: " + animal.source); //gọi biến của lớp cha
    }
}
