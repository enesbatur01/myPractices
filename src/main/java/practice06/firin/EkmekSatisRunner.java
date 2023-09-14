package practice06.firin;

public class EkmekSatisRunner {
    public static void main(String[] args) {
        CicekEkmek ekmek1 = new CicekEkmek();
        SomunEkmek ekmek2 = new SomunEkmek();
        KepekliEkmek ekmek3 = new KepekliEkmek();
        KepekliSandvicEkmegi ekmek4 = new KepekliSandvicEkmegi();

        ekmek1.sekil();
        ekmek1.su();
        ekmek1.tuz();
        ekmek1.un();
        ekmek1.maya();
        System.out.println();

        ekmek2.sekil();
        ekmek2.su();
        ekmek2.tuz();
        ekmek2.un();
        ekmek2.maya();
        System.out.println();

        ekmek3.sekil();
        ekmek3.su();
        ekmek3.tuz();
        ekmek3.un();
        ekmek3.maya();
        System.out.println();

        ekmek4.sekil();
        ekmek4.su();
        ekmek4.tuz();
        ekmek4.un();
        ekmek4.maya();
    }
}
