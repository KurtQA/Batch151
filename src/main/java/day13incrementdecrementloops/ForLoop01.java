package day13incrementdecrementloops;

public class ForLoop01 {


    public static void main(String[] args) {

      //Example 1: 21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari ekrana yazdiran kodu yaziniz

      for( int i=21; i<181  ; ++i){
          if(i%4==0 && i%6==0){
              System.out.print(i+" ");

          }
      }
      //24 36 48 60 72 84 96 108 120 132 144 156 168 180 sonucu verdi. if icinde && kullandik
        //cunku hem 4'e hem 6 ya bolunabilmeli


        //Example 2: Size vrilen kucuk harfle yazilmis String'in index'i cift sayi olan karakterlerini
        //buyuk harfe donusturun.
        //  ankara==>AKR
        // Ankara'nin indexlerine bakalim 0. indexte a, 1. de n, 2. de k var
        //burada cift sayida olan indexleri buyuk harfle yazdiracagiz bu da bize AKR vermeli
        //index ile gideceksek 0 dan baslayacagiz
        //i<6 dedik cunku Ankara toplamda 0 dan itibaren 5 index ten olusuyor. Maximum 6 yi alacagiz
        //String de length() methodu bize Stringdeki karakter sayisini verir.
        //Ankara icin length() methodu 6 verir cunku karakter sayisina bakiyor ve baslangici index gibi 0
        //degil 1 dir.
        //Ali'nin length'i 3 tur, son index e bakarsak son i 2.index oluyor. Son index'i her zaman length -1 ile
        //bulunur SON INDEX -1 ILE
        //Bir String'de son index her zaman length()-1
        //Kodunuz sadece belli bir senaryo icin calisiyorsa bu tarz koda HARD CODE denir. Duzeltilmelidir.
        //kodu nasil dynamic yapariz. Asagida codition kismina .length()ekledik bunun icin
        //length()-1 yerine s String'ini i<s.length() yapmamiz onerilir.
        //substring indexlerle calisir. Baslangic 0 ile basliyor, ankara icin 0 a'dir
        System.out.println();
        String s="ankara";
        for(int i=0; i<s.length();i++ ){
          String ch= s.substring(i,i+1);
          if(i%2==0){
              System.out.print(ch.toUpperCase());
          }

        }
        //AKR return etti.


    }
}


