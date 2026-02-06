package InheritanceAndPolymorphism.SuperKeyword.Superclass_Constructor;

class Husky extends Dog {

    Husky() {
        super(); // tự động gọi hàm tạo của lớp cha
        System.out.println("Husky's constructor is invoked");
    }
}
