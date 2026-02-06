package Encapsulation.Final_Keyword.Variable;

public class Bike {

    int speedlimit = 90;   // bỏ final

    void run() {
        speedlimit = 400;
        System.out.println(speedlimit);
    }

    public static void main(String[] args) {
        Bike obj = new Bike();
        obj.run();
    }
}
