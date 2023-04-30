package day03_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        /* Match
        allMatch() ==> tum elemanlar sarti saglarsa true dondurur
        anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
        noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
         */
        //Universite class'inda variable, constructorlar, get ve set methodlari ile toString olusturduktan sonra bu class icine
        //gelerek asagidaki objectleri olusturduk ve parametreleri farkli olarak koyduk.
        Universite u1 = new Universite("hacettepe","fizik",1000,85);
        Universite u2 = new Universite("odtu","matematik",2000,80);
        Universite u3 = new Universite("bogazici","java",3000,85);
        Universite u4 = new Universite("marmara","sql",4000,90);
        Universite u5 = new Universite("itu","resim",5000,90);
        Universite u6 = new Universite("erciyes","api",6000,95);
        Universite u7 = new Universite("karaelmas","muzik",7000,80);
        Universite u8 = new Universite("bilkent","bilgisayar muh",8000,100);
        List<Universite> list = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5, u6,u7,u8));
        //Yukarida olusturdugumuz objectlerin isimlerini yeni listimizin icine parametre olarak koyduk. Boylece tum universite ve bilgilerini
        //bir yerde topladik. Tum datalari kiyaslayabilmek icin bu datalari bir list icinde topladik. Kiyasi Match class'indaki methodlardan
        //faydalanarak yapacagiz.
        System.out.println(notOrt75tenBuyuk(list));
        System.out.println();
        System.out.println(matematikBolumuVarmi(list));
        System.out.println();
        System.out.println(ogrenciSayilarinaGoreBuyuktenKucugeListYazdir(list));

    }//main

    // Task 01 : Butun universitelerin(allMatch methoduna gore) not ortalamasinin 75'ten buyuk oldugunu gosteren bir program olusturunuz.

    public static boolean notOrt75tenBuyuk( List<Universite> list){
        System.out.print("1) ")  ;
        return list.
                stream().
                allMatch(t->t.getNotOrtalamasi()>75);//Tum universiteler kiyaslanacak bu sarta gore. Universite class'inda bu methodu getter ile olusturmustuk.
    }



    // Task 02 : Universitelerden herhangi birinde(anyMatch methodu buna gore) matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.
    public static boolean matematikBolumuVarmi( List<Universite> list){
        System.out.print("2) ")  ;
        return list.
                stream().
                anyMatch(t->t.getBolumAdi().equalsIgnoreCase("matematik"));
        //getBolumAdi. yazinca hangi methodlar oldugunu gorduk ve o methodlardan equalsIgnoreCase'i sectik. Cunku contains'e gore
        //tek seferde isi bitirecek, uzatmayacak.

    }




    // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayip liste halinde veren bir program olusturunuz.


    public static List<Universite> ogrenciSayilarinaGoreBuyuktenKucugeListYazdir( List<Universite> list){
        System.out.print("3) ")  ;
        return  list.
                stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).//kucukten buyuge degil buyukten kucuge dendigi icin
                //reversed() methodunu kullandik.
                //Universite classinda public int getOgrenciSayisi() {return ogrenciSayisi;} methodu olusturmustuk. Bu methodumuzu kullandik.
                collect(Collectors.toList());//liste halinde dedigi icin bir listede toplamamiz gerekti.

        //return type'i void, String olabilecegi gibi Universite class'imizin ismini de secebiliriz. List<Universite> yazinca
        // olmadi ancak return list. yazinca problem olmadi.

    }






















}