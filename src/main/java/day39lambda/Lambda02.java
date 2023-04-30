package day39lambda;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<String >iller = new ArrayList<>(Arrays.asList("Van","Gumushane","MUS","Kutahya","Ankara","MUS","Ordu","Gaziantep","Hatay","Edirne"));
        bykHrfLenghtArtanDistinct(iller);
        System.out.println();

        bykHrfSonHarfArtanDistinct(iller);
        System.out.println();

        bykHrfLenghtArtanDistinctLenghtAlfabetikSira(iller);
        System.out.println();

        System.out.println(krktrSysBesFzlOlanlariSil(iller));
        System.out.println();


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLenghtArtanDistinct(List<String >iller){
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t->System.out.print(t+" "));

    }


    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz

    public static void bykHrfSonHarfArtanDistinct(List<String >iller){
        System.out.print("2) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).//Lambda Expression
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).////Lambda Expression
                forEach(t->System.out.print(t+" "));


    }

    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfLenghtArtanDistinctLenghtAlfabetikSira(List<String >iller){
        System.out.print("3) ");
        iller.
                stream().
                distinct().
                map(String::toUpperCase ).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);// Lambda expresiion'da==>  forEach(t->System.out.print(t+" ")) seklinde yazilirken
        // Method Referance() ==> forEach(System.out::println); seklinde yazilir


    }
    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

    //VAN MUS ORDU HATAY
    public static List<String> krktrSysBesFzlOlanlariSil(List<String >iller){
        System.out.print("4) ");
        iller.removeIf(t->t.length()>5);


        return iller;//4) [Van, MUS, MUS, Ordu, Hatay]
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanOruIleBitenElSil(List<String >iller){
        System.out.print("5) ");
        iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));
        return iller;
    }


    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin




    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.


}
