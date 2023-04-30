package day31collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Sets01 {
    /*
    1) Set ler tekrarsiz (==>unique) eleman depolamak icin kullanilir
    2) 3 tane Set Classi vardir.
        a) HashSet Class:
            "Hash" benzersiz bir id olusturma teknigidir. Bu teknige hashing technique denir
            "HashSet" elemanlari rastgele siralar
            "HashSet" elemanlari siralamadigindan cok hizli calisir
            "HashSet" ler tekrarsiz eleman depolamak icin kullanilir
            "HashSet" ler "null" i eleman olarak kabul eder.
       b) LinkedHashSet Class:
            "LinkedHashSet" elemanlari sizin verdiginiz siraya gore (insertion order) dizdiklerinden Hashsetlere gore yavastirlar
            "LinkedHashSet" ler tekrarsiz eleman depolamak icin kullanilir
       c) TreeSet Class:
            "TreeSet" ler elemanlari natural order(kucukten buyuge, alfabetik sira)'ya gore dizerler
             "TreeSet" ler elemanlari natural order a gore dizdiklerinden cok yavastirlar
             En yavas set "TreeSet" ler dir.
             "TreeSet" ler tekrarsiz eleman depolamak icin kullanilir
       */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Merve");
        hs.add("Tuba");
        hs.add("Sema");
        hs.add("Fatih");
        hs.add("Rana");
        hs.add("Sema");//Tekrarli eleman eklediginizde hata vermez ama tekrarli olan elemani bir kere depolar
        System.out.println(hs);//[Fatih, Sema, Rana, Merve, Tuba]
        System.out.println(hs.hashCode());//149615145
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(353);
        lhs.add(7);
        lhs.add(null);
        lhs.add(null);
        System.out.println(lhs);//[313, 19, 353, 7]
        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(313);
        ls.add(195);
        ls.add(353);
        ls.add(17);
        System.out.println(ls);//[313, 195, 353, 17]
        lhs.retainAll(ls);
        System.out.println(lhs);//[313, 353]
        System.out.println(ls);//[313, 195, 353, 17]
        TreeSet<Character> ts = new TreeSet<>();
        ts.add('G');
        ts.add('A');
        ts.add('Z');
        ts.add('R');
        ts.add('U');
        //ts.add(null);
        System.out.println(ts);//[A, G, R, U, Z]
        System.out.println(ts.first());//A
        System.out.println(ts.last());//Z
        System.out.println(ts.lower('R'));//G verilen elemanin bir onceki elemani verir
        System.out.println(ts.lower('D'));//A
        System.out.println(ts.higher('R'));//U
        System.out.println(ts.higher('T'));//U
        System.out.println(ts.headSet('R'));//[A, G]
        System.out.println(ts.headSet('R',true));//[A, G, R]
        System.out.println(ts.tailSet('R'));//[R, U, Z]
        System.out.println(ts.tailSet('R',false));//[ U, Z]
        System.out.println(ts.ceiling('R'));//R
        System.out.println(ts.ceiling('T'));//U
        System.out.println(ts.floor('G'));//G
        System.out.println(ts.floor('T'));//R
        System.out.println(ts.subSet('G', 'Z'));//[G, R, U]
        System.out.println(ts.subSet('G',false, 'Z',true));//[R, U, Z]
    }
}