package practice04;

public class C05Varargs {
    public static void main(String[] args) {

        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

        String str1="Ali";
        String str2="Abdurrahman";
        String str3="Burak";
        String str4="Büşra";
        String str5="Batur";

        mostLongWord(str1,str2,str3,str4,str5);


    }


    public static void mostLongWord (String... str){

        String mostLongWord = "";

        for (String w : str){
            if (mostLongWord.length() < w.length()) {
                mostLongWord = w;
            }
        }

        System.out.println(mostLongWord);


    }

}
