package practice06.superthis;

public class Child extends Parent {

    public Child() {
        System.out.println("Child class parametresiz constructor");
    }

    public Child(int a) {
        System.out.println("Child class tek parametreli constructor");
    }

    public Child(int a, int b) {
        super(2,7);
        System.out.println("Child class çift parametreli constructor");
    }

    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız

    public static void main(String[] args) {
        //Child obj1=new Child();
        //Child obj2=new Child(1);
        Child obj3=new Child(2,3);
    }

}
