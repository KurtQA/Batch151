package javaders;

public class MethodCreation {

    public static void main(String[] args) {

  // static==> protocol tribunu vip class

  //Karenin alanini hesaplayan kodu yaziniz
        kareAlan(7);


    }

    private static void kareAlan(int a) {
        System.out.println("Karenin Alani :"+(a*a));

        //eger bir String aciklama yapiyorsaniz ornek "Karenin Alani :"
        //bu durumda a*a yi parantez icine aliriz
        //Dikdortgenin alanini veren kodu yazin
        dikdortgeninAlani(10,20);

        //dikdorgeninAlani yazdigimizda kirmizi uyari verdi uzerine tikladik bize method olusturdu
        //asagida int return type olarak yazacagiz, bu durumda ustteki ornekten farkli olarak
        //asagiya return kelimesini ekleriz. Yukarida return type void idi
        System.out.println( "Dikdortgenin Alani "+(dikdortgeninAlani(10,20)+2));
        /*
        return type'i int oldugu icin deger dondurur ve bu degeri kullanabiliriz.
        Ekleme cikarma carpma bolme istedigimiz gibi elde edilen datayi kullanabiliriz
        \n ==> bir alt satira gecirir
        \t ==> bir tab bosluk birakir
        \" ==> ekrana " yazdirir
        ctrl + alt + l ==> sayfayi duzenler
        cmd + alt + l ==> sayfayi duzenler
         */
    }

    private static int dikdortgeninAlani(int a, int b) {
        return a*b;

    }
}
