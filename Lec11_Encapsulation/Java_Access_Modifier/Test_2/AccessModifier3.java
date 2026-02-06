package Encapsulation.Java_Access_Modifier.Test_2;

import Encapsulation.Java_Access_Modifier.Test_1.AccessModifier1;

public class AccessModifier3 {

    public void display() {
        AccessModifier1 object = new AccessModifier1();
        System.out.println(object.pvt);
        System.out.println(object.d);
        System.out.println(object.pro);
        System.out.println(object.pbl);
    }
}
