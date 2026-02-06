package InheritanceAndPolymorphism.SuperKeyword.Superclass_Method;

class Husky extends Dog {

    void displayInformation() {
        super.displayPrice(); // gọi phương thức của lớp cha
        System.out.println("Husky's price is 1500 USD");
    }
}
