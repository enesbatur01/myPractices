package practice04;

public class C07Varargs {
    public static void main(String[] args) {

         /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istediginiz kadar secin.
        Sectiginiz bu derslerin saatleri toplamı 12'yi gecerse "Limiti astiniz";
        12'yi gecmezse "Islem basariyla tamamlandi" mesajini veren bir method olusturunuz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat

         */
        int Matematik = 4;
        int Geometri = 2;
        int Fizik = 3;
        int Kimya = 3;
        int Biyoloji = 3;
        int Edebiyat = 2;
        int Tarih = 2;
        int Cografya = 2;

        dersSecimi(Fizik,Kimya,Biyoloji);

    }

    private static void dersSecimi(int... lessons){

        int sum =0;
        for (int w :lessons){
            sum += w ;
        }
        if (sum > 12) {
            System.out.println("Fazla ders saati");
        } else {
            System.out.println("Geçerli dersler " + sum +" Saat");
        }

    }
}
