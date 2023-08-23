package practice01;

public class C01Variables {

    public static void main(String[] args) {

        //(int) bir variable(yas)  olustur ve yazdır

        int yas=13;

        System.out.println(yas);

        //(int) bir variable(sayi)  olustur ve yazdır

        int say = 50;
        System.out.println(say);

        //konsola sayi = 50 seklinde yazdır

        int sayi = 50;
        System.out.println("sayınız : "+sayi);

        //yeni bir variable olustur(benimYasim) ve yas variable'inin degerini benimYasim variable'ına kopyala

        int benimYasim = yas;

        System.out.println(benimYasim);

        //String bir variable olusturalım (isim)

        String isim="ali cabbar";

        //isim variable ını etiketıyle yazdır

        System.out.println("isim = " + isim);

        //onunIsmi variable'ı olustur ve isim variable'ının degerini onunIsmi variable'ına kopyala

        String onunIsmi =isim;



        //onunIsmi variable'ını etiketiyle yazdır

        System.out.println("onunIsmi = " + onunIsmi);

        //isim variable'ının degerini guncelle

        isim="enes";

        //isim ve onunIsmi variable'larını yazdır

        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);


    }
}
