package day22stringbuilder;

public class Sb02 {

    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder("Java is easy");
        System.out.println(sb1);//Java is easy
        sb1.reverse();//String'in tersine cevrilmesi loops ile de yapilabilir. Burdaki kisa yoldur.
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(6);//verilen indexteki karakteri siler
        System.out.println(sb1);//ysae s avaJ
        //reverse tekrar kullanisaydi Java is easy olurdu ve deleteCharAt ile Java s easy olurdu

        sb1.delete(4,7);//7'yi silmeyecek 4,5,6 silinecek
        System.out.println(sb1);//ysaeavaJ
        //baslangic indexinden bitis indexi haric olacak sekilde orada olan karakterleri siler

        sb1.replace(2,5, "X");
        System.out.println(sb1);//ysXvaJ baslangic indexi dahil bitis indexi haric degistirme yapti

        sb1.insert(3,"2023");
        System.out.println(sb1);//ysX2023vaJ
        //ilk uc karakteri gecti ve ara kisma 2023 ekledi.

        StringBuilder sb2=new StringBuilder("Java");
        StringBuilder sb3=new StringBuilder("Java");

        int r1=sb2.compareTo(sb3);
        //her ikisi de ayni oldugu icin sonuc 0 verdi. 0'in anlami iki String alfabetik olarak ayni
        //siradalar.
        System.out.println(r1);//0
        //Birinci Java, ikinci Kava olsaydi -1 verirdi. Yani ikinci String birinciden bir once
        //k j den bir once
        //Sonuc '-3' ise sb2, sb3 den alfabetik olarak 3 onde demektir.
        //Sonuc 3 ise sb2, sb3 den alfabetik olarak 3 sonra demektir.
        //kucuk java ile buyuk Java'yi karsilastirsaydik, bu defa Java ascii table'a gore sonuc verirdi

        //sb2.toString();//StringBuilder'i String'e ceviriyor. Cunku String Class da methodlar daha fazla ve
        //onlardan birini kullanmak gerekebilir. Ornek split methodu String de var StringBuilder da yok
        //Ya da to.UpperCase String de var onu kullanmamiz gerektiginde StringBuilder'i String'e cevirip
        //o methodu kullanabiliriz.
        //StringBuilder nasil String'e cevrilir?
        String str = sb1.toString().toUpperCase();
        System.out.println(str);// String YSX2023VAJ

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);// StringBuilder YSX2023VAJ


    }
}
