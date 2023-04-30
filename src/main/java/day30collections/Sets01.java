package day30collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
  /*
  1) Setler uniqueleri depolamak icin kullanilir.
  2)3 Set Class vardir

  i)HashSet Class
  Elemanlari rastgele siralar. Cok hizli calisirlar. "null" i eleman olarak kabul eder.
  Ancak sadece bir tane "null" kabul eder. Cunku elamanlar unique olmak zorundadir.

  ii)LinkedHashSet Class
  Elemanlari verilen siraya gore dizerler ve HashSetlere gore yavastirlar.
  iii)TreeSet Class
  Elemanlari natural order'a gore dizerler.
  En yavas Set TreeSet'tir.

  Collectionlar primitiveler ile calismaz

   */



    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Ajda");
        hs.add("Cuneyt");
        hs.add("Esra");
        hs.add("Zeki");
        hs.add("Ezel");
        hs.add(null);

        System.out.println(hs);//[null,Zeki, Ajda, Cuneyt, Esra, Ezel] rastgele siraladi, ancak null'i hep en basa
        //aliyor.
       //Cuneyt'i eklersek hata vermez ama tekrarli elemani bir kere ekler, ikincisi ekranda yazilmaz

        System.out.println(hs.hashCode());//2038751948 basta olusturdugumuz hs isimli HashSet icin Java bir kod
        //uretiyor. hs'nin degerini gormek istersek kullanabiliriz.
        //clear methodu tum elemanlari siliyor.

        LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
        lhs.add(234);
        lhs.add(87);
        lhs.add(-32);
        lhs.add(124);
        System.out.println(lhs);//[234, 87, -32, 124] verilen siraya gore eleman ekledi

        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(451);
        ls.add(87);
        ls.add(231);
        ls.add(124);

        System.out.println(ls);//[451, 87, 231, 124]

        lhs.retainAll(ls);
        System.out.println(lhs);//[87, 124]==> Ilk LinkHashSet'teki farkli elemanlar silindi
        System.out.println(ls);//[451, 87, 231, 124]

        TreeSet<Character> ts=new TreeSet<>();

        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        System.out.println(ts);//[A, G, R, U, Z] Alfabetik siraya koydu.
        //TreeSetlere null eklenemiyor. Alfabetik siralamaya uymaz.

        System.out.println(ts.first());// A, siralmada birinci eleman A oldugu icin
        //son elemani last() ile alabiliriz.

        System.out.println(ts.lower('R'));// G R'nin bir asagisinda, yani onceki elaman G dir
        System.out.println(ts.higher('U')); //Z
        System.out.println(ts.lower('D'));//A yi verdi. D elemani yok, bastakini verdi

        System.out.println(ts.headSet('R'));//[A,G] R'den oncekileri vermesini istedik headSet ile
        //R'yi dahil etmedi.

        System.out.println(ts.tailSet('G')); //G'yi dahil etti. [G,R,U,Z]

        System.out.println(ts.headSet('R', true));//[A, G, R] Burada R'yi dahil etti
        //yukaridaki headSet'de sout icine yazdigimiz karakteri dahil etmemisti. Farkli headSet'i kullnadik

        //iki tur tailSet var, biri karakteri dahil ediyor oteki sout icindekini dahil etmiyor

        System.out.println(ts.ceiling('R'));//R, eleman Set icinde varsa elemanin kendisini return eder
        System.out.println(ts.ceiling('K'));//R, elaman Set icinde yoksa o elemanin
        // alfabetik siralamasina gore bir sonraki elemani return eder

        System.out.println(ts.floor('G'));//G
        System.out.println(ts.floor('J'));//G, eleman Set icinde yoksa onceki elemani return eder

        System.out.println(ts.subSet('G', 'Z'));//[G, R,U] ilk parametre dahil, ikinci parametre haric

    }

}
