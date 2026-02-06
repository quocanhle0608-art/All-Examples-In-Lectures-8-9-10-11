package Encapsulation.Encapsulation;

public class Person {

    public String name;
    private double weight;

    public void setWeight(double weight) {
        if (this.weight < 0) {
            System.out.println("Weight can not negative");
        } else {
            this.weight = weight;
        }
    }
}

class EncapsulationExist {

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "Trang";
        a.setWeight(-10);
    }
}
