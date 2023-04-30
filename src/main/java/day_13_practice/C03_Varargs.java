package day_13_practice;
/*
Farkli bir package'den farkli bir class'tan protected olan methodu calistirirmak icin, sonraki class'imizi
extends keywordu ile methodun olustugu class'a child yapiyoruz ve methodu class ismi yazmadan dogrudan
sout icine yaziyoruz. Method parantezi icinde sonraki class'imizda olusturdugumuz variable isimlerini yaziyoruz.

Farkli bir package'deki farkli bir class'tan methodu cagirmak istersek, sonraki class'imizi child yapmadigimiz
zaman methodu icinde bulundugu class ismini yazip noktadan sonra methodumuzun ismini yazarak cagiriyoruz.
Classlar arasi parent=child iliskisi yoksa, methodu class'in ismi ile cagiririz.


 */

public class C03_Varargs {
    public static void main(String[] args) {
// kac tane kelime verilirse verilsin
// iclerinden en uzun olanı yazdıran bir method olusturun (Varargs)
// bu methodun access modifiers'ını default yapıp aynı packagagedeki faklı bir classdan calıstırınız
// bu methodun access modifiers'ını protected yapıp farklı bir packadeki farklı bir classdan calıstırınız
// bu methodun access modifiers'ını public yapıp farklı bir packadeki farklı bir classdan calıstırınız
        String str1="Ali";
        String str2="Veli";
        String str3="Ahmet";
        String str4="Abdullah";
        String str5="Abdurrezzak";
        String sonuc = enUzunKelime(str1, str2, str3, str4, str5);
        System.out.println(sonuc);
    } // main
    public static String enUzunKelime(String... str) {
        String enUzunKelime="";
        for (String each:str) {
            if(each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        return enUzunKelime;
    }
}
