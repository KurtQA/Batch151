package day11nestedifternaryswitch;

public class C03_Ascii {

    public static void main(String[] args) {

    // CEM isminin icerisinde bulunan harfleri kullanmadan yazdırınız.
        //C'nin ascii table degerindeki karsiligi 66
        //E'nin 69
        //M'in 77
        /*
        C,E,M'yi kullanmamak icin ascii tableda bu harflerden bir onceki harfi bulup +1 yazmaliyiz
         */
        /* ASCİİ


          B ==> 66    (B'yi 1 arttirirsak C'yi elde ederiz)      C ==> 67
          D ==> 68    (D'yi 1 arttirirsak E'yi elde ederiz)      E ==> 69
          L ==> 76     (L'yi 1 arttirirsak M'yi elde ederiz)     M ==> 77

        */

        char ilkKarakter = 'B'+1;   //C
        char ikinciKarakter = 'D'+1; //E
        char ucuncuKarakter = 'L'+1; //M

        System.out.println(""+ilkKarakter+ikinciKarakter+ucuncuKarakter);//CEM
        //Parantez icine Java'nin String sayacagi ""hiclik isaretini koyduk, boylece
        //harfleri yanyana yazdirdi,toplama olamadi

    }
}
