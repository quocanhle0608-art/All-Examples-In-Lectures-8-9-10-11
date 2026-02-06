package AbstractClass_And_Interface.Interface.A_Class_Implements_Interface;

public class Circle implements IColor {

    @Override
    public void drawShape() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void fillColor() {
        System.out.println("Filling the Circle with green");
    }
}
