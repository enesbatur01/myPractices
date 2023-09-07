package practice05.inheritance01;

// Parent class'da isim, soyisim adında static variable olusturalım,
// method1 ve method2 adında static methodlar olusturalım
// yas adında instance variable olusturalım
// method3 ve method4 adında instance methodlar olusturalım
// olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım
public class Parent {
   protected static String name="Enes Burak";
   protected static String surName="BATUR";

   int yas=23;


   public static void method1 (){
      System.out.println("Parent class static method 1");

   }
   public static void method2(){
      System.out.println("Parent class static method 2");
   }
   public void method3(){
      System.out.println("Parent class instance method 3");
   }
   public void method4(){
      System.out.println("Parent class instance method 4");
   }
}
