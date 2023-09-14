package practice06;

public class C01Encapsulation {

    private String name;
    private String surName;
    private int age;


 /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */


    //1- Parametre li constructor koydum
    public C01Encapsulation(String name, String surName, int age) {
        if (name.charAt(0)>='A'&& name.charAt(0)<='Z'){
            this.name = name;
        }else System.out.println("Name cant start with lower case");

        if (surName.charAt(0)>='A'&& surName.charAt(0)<='Z'){
            this.surName = surName;
        }else System.out.println("Surname cant start with lower case");

        if (age>0){
            this.age = age;
        }else System.out.println("Age cannot be negative");

        //Okunaklı olsun diye  böyle yaptık aslında alttaki gibi de yaapabilirdik
        //setter method çağırarak aldığımız constructor parametresini çağırıyoruz
        //setName(name);
        //setSurName(surName);
        //setAge(age);
    }

    //2- Parametresiz constructor koydum
    public C01Encapsulation() {
    }

    //3- SETTER oluşturuldu
    public void setName(String name) {
        if (name.charAt(0)>='A' && name.charAt(0)<='Z'){
            this.name = name;
        }else System.out.println("Name cant start with lower case");
    }

    public void setSurName(String surName) {
        if (surName.charAt(0)>='A' && surName.charAt(0)<='Z'){
            this.surName = surName;
        }else System.out.println("Surname cant start with lower case");

    }

    public void setAge(int age) {
        if (age >0){
            this.age = age;
        }else System.out.println("Age cannot be negative");

    }

    //4- GETTER oluşturuldu
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    //toString() oluşturuldu
    @Override
    public String toString() {
        return "C02Encapsulation{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
