package Encapsulation.Final_Keyword.Method;

class Bike {

    final void run() {
        System.out.println("running");
    }
}

class Honda extends Bike {

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();   // dùng method của Bike
    }
}
