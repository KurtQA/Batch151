package day_14_practice;

/*
Methodumuzu main body'si disinda olustururuz. Carpim isimli methodumuzu olusturduk. Method parantezi icine
uc String'imizin isimlerini  ve int'in ismini parametre olarak yazdik.
carpim(sayi, str1, str2, str3);

methodumuz main method icinde yarim kalinca kizardi ve uzerine gelip create methodu secince,
main method disinda methodumuz tam olarak yazildi. Bir int variableimiz oldugu icin onu varargs yapmaya gerek yok,
ancak String birden fazla oldugu icin otamatik olarak main method disinda olusan methodumuza parametre olarak
String'i varargs olarak yerlestiriyoruz. Varargs olmayan int'imizi once, String Varargs'imizi sonra yazma
kuralina uyduk. Su sekilde: (int sayi, String... str) Argument String ise parametre String, int ise parametre
int olmak zorundadir.

str olan Stringimizdeki her bir elemani for each kullanarak kontrol ettik. Sorumuza gore en uzun kelime'yi
bulmamiz gerektiginden for each loop uzerinde String enUzunKelime=""; olusturduk. Cunku kontroller yapilirken
aldiklarimizi bu conteynera koyacagiz. For each loop icinde if statement'i ile her kelimenin uzunlugunu bulmaya
calistik. if(each.length()>enUzunKelime.length()) sartimiz ile her elemanin uzunlugu kontrol edilirken, alinan
kelimeler bos olarak olusturdugumuz String conteyner'ina konulacak. Ancak bu conteyner ilk aldigi kelimeden sonra
gelenin daha uzun olmasi halinde bir sonraki uzun olani icinde tutacak, ta ki en uzun olani alincaya kadar
loop boyle devam edecek. Son halde en uzun kelime Zeynep'i alacak, ve bu en uzun kelimeyi length'i ile birlikte
sout icine koyacagiz. Cunku soruya gore int sayi ile carpmaliyiz.



 */



public class C01_Varargs {
    public static void main(String[] args) {

        /*
        parametre olarak bir int ve istediginiz kadar String olan bir method olusturun,
        en uzun String'in harf sayisi ile int parametre degeri carpıp sonucu yazdırın
         */


        int sayi = 5;
        String str1 = "Zulal";
        String str2 = "Zeynep";
        String str3 = "Ali";

        carpim(sayi,str1,str2,str3);


    } //main

    private static void carpim(int sayi, String...str) {

        String enUzunKelime="";

        for (String each:str) {

            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }

        }

        System.out.println(enUzunKelime.length()*sayi);


    }


}



