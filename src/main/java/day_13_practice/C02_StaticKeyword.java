package day_13_practice;

/*
main method icinde parametreli object olusturduk. Bu yeni object'in constructor'i parametreli olunca, bizim
gormedigimiz bir sekilde default constructor silindi. Daha sonra ikinci bir object olusturunca ve onu parametresiz
yapinca parametre kismi kizardi. Cunku bir ustte parametreli constructor nedenli parametresi olmayan default
constructor silinmisti.

Bu objeler class ismi ile olusturuldu ve class'a baglanmis oldular.

Onemli olan constructor icerisinde variable'a deger atamasi var mi. Atama olmazsa degisiklik olmaz.


 */


public class C02_StaticKeyword {
    // Bu class calıstıgında output ne olur. Calısma mantıgı nedir
    static int y;
    int x;
    public C02_StaticKeyword(int i) {
        x+=i;
        y+=i;
    }
    public static void main(String[] args) {
        C02_StaticKeyword obj1 = new C02_StaticKeyword(2);
        C02_StaticKeyword obj2 = new C02_StaticKeyword(3);
        System.out.println(obj1.x + ", " + obj2.x + ", " + y);
    }
}
