package day32maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMap02 {


    public static void main(String[] args) {

//Example 1: Verilen cumledeki kelimelerin gorunum sayisini veren kodu yaziniz.
        //"I like you, like like!" => I=1, like=3, you=1
        /*
        Javaya gore bu cumlede like 2 kez yazildi, cunku sondaki like farkli olarak unlem isareti
        ile yazilmis. Javaya like kelimesinin uc kez yazildigini soylemek istersek, unlemi silmeliyiz ya da
        kelime yanina konulan tum noktalama isaretleri silinmeli ki kelime java icin ayni gorunsun.
        Noktalama isaretlerinin tamamini silersek sonuca emin bir sekilde ulasabiliriz.

//
  replaceAll() methodu ile noktalama isaretlerini silecegiz. Method icine "\\p{Punct}" , "" yazacagiz.
  kelimeleri birer birer almaliyiz. Bunun icin split(" ") methodu icine space anlamina gelecek sekilde " " yazdik
  split arraylerde kullaniliyor, bu nedenle String bir Array olusturduk, o array'e split(" ") methodu ile ulasacagimiz
  sonucu array icine koyduk. Array'imiz soyle String words []=s.split(" "); Bu yontem ile bosluklardan bolunen
  kelimeleri aldik.

  HashMap olusturduk cunku en hizli olan Map, HashMap. Soruda siralama yapilmasi istenmedi,
  bu nedenle hizli olani sectik.
  HashMap olustururken <> icine once String sonra Integer yazdik.
  Ici bos bir HashMap cunku bir eleman eklemedik
  Javaya "words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye bakmasini soylecegiz.
  "words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlerstirilecek.
  "words" arrayindeki kelimeler Map'de varsa Map'e varolan value 1 artirilarak yerlestirilecek.
  ilk elemani al, Map'e git bak, yoksa onu 1 degeri ile yaz diyecegiz
  ve sonra ikinci eleman icin ikinci kelimeyi
  al, Map'e bak o kelime varsa onun degerini(value) 1 olarak yaz.
  Java'ya kelime varsa o kelime degerini bir artir diyecegiz.
  Her kelimenin kac kez gorundugunu loop kullanarak kontrol edecegiz.

  for each loop kullanacagiz. for(String w: words)
  Map'imizin ismi occ olup, occ.get(w); Integer numOfOccurrence'a assign edildi.
  get methodu olmayan sey icin null verir.
  Boylelikle numOfOccurence null'a esit mi seklinde bir if statement olusturduk.
  Eger olmayan bir kelime ise value'su bir olarak yerlestirilecek.
  put() methodu ile olmayan kelimenin degerini 1 olarak yazdirabiliriz. Su sekilde yazdik: occ.put(w,1);
  Varolan kelime mesela like var, onun value'sunu bir artiriyoruz. Bunu replace methodu ile saglayabiliriz. replace
  methodu icine words(arrayimiz)'u assign ettigimiz w, null'a esit oldugu kabul edilen numOfOccurrence(Integer
  numOfOccurence) arti 1 yazdigimizda, varolan eleman bir kez artirildi. Loop dongusu icinde varolan kelimelerin
  kac tane oldugunu ogrenmis olacagiz.


         */

        String s = "I like you you, like like!";
        System.out.println(s);// I like you, like like!

        //like ile like! i ayni yapabilmek icin tum noktalama isaretlerini silelim
        s = s.replaceAll("\\p{Punct}", "");
        System.out.println(s);// I like you like like

        //Ben kelimelerle calismaliyim bu yuzden split(" ") kullanacagim
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));// [I, like, you, like, like]

        HashMap<String,Integer> occ = new HashMap<>();
        //"words" arrayindeki kelimeler birer birer Map'de var mi yok mu diye kontrol edilecek.
        //"words" arrayindeki kelimeler Map'de yoksa Map'e value'su 1 olarak yerlestirilecek.
        //"words" arrayindeki kelimeler Map'de varsa Map'e varolan value'u 1 artirilarak yerlestirilecek.

        for(String w : words){
            Integer numOfOccurrence = occ.get(w);

            if(numOfOccurrence==null){
                occ.put(w,1);
            }else{
                occ.replace(w, numOfOccurrence+1);
            }
        }
        System.out.println(occ);// {like=3, I=1, you=2}
    }
}



