package practice06;

public class C02Encapsulation {

    public static void main(String[] args) {

        //Ali, Can, 25 ozelliklerine sahip bir obje olusturunuzz ve yazdırınız
        C01Encapsulation obj1=new C01Encapsulation("Ali","Can",25);
        System.out.println(obj1.getAge()+obj1.getSurName()+obj1.getAge());
        System.out.println(obj1.toString());

        //objenin yasını 30 olarak guncelleyin
        obj1.setAge(30);
        System.out.println(obj1.getAge());

        //parametresiz cons kullanarak 2. bir obje olusturun
        C01Encapsulation obj2 = new C01Encapsulation();

        //Ayse, Yilmaz, 40 degerlerini atayın
        obj2.setName("Ayşe");
        obj2.setSurName("Yılmaz");
        obj2.setAge(40);
        System.out.println(obj2.toString());

        //yas ı -5 olarak guncelleyin
        obj2.setAge(-5);
        System.out.println(obj2.getAge());

        //yas negatif deger alamayacak sekilde set methodunu guncelleyin


        //isim kucuk harfle baslamayacak sekilde set methodunu guncelleyin
        obj2.setName("ayşe");
        System.out.println(obj2.getName());


        //isim kucuk harfle baslamayacak sekilde parametreli constructoru guncelleyin
        obj2.setSurName("yıldız");
        System.out.println(obj2.getSurName());

    }

}
