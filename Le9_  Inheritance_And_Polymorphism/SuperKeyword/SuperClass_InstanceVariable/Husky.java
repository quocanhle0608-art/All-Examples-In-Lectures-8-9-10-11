package InheritanceAndPolymorphism.SuperKeyword.Superclass_Instance_Variable;

class Husky extends Dog {

    int price = 1500;

    void displayPrice() {
        System.out.println("Dog's price: " + super.price);//tham chiếu đến biến của lớp cha
        System.out.println("Husky's price: " + price);//tham chiếu đến biến của lớp con
    }
}
