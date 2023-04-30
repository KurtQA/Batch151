package day_18_practice;

/*
Bir insanin yasi 0'dan kucuk, 120'den buyuk olamaz diye dusundugumuzde, kullanici bize 0'dan kucuk
120'den buyuk bir sayi verirse diye bir exception firlatilmasini istiyoruz. Exception, bu soruda
IllegalArgumentException uygundur.
if statement alt satirinda throw new yazar yazmaz ekranda sirasiyle exception isimlerini gorduk ve
IllegalArgumentException'i sectik. If statement sonrasi else blogu actik. Yukarida olusturdugumuz
olumsuz senaryo disinda istenen aralikta bir yas girilirse "Uygun Bir Yas Girdiniz" yazilacak.
Kullaniciya mesaj gondermistik. Kodumuzu calistirinca yasinizi giriniz mesajini gorduk ve yas olarak
100 girince problem cikmadi. Ancak sonraki yas girmede -8 girdik. Bu nedenle ilgili exception firlatildi.
Daha sonra kodu yine calistirinca yas olarak 121 girdik. Ilgili exception firlatildi ve alt kisimda exit
code 1 goruldu.

Tam 0 ya da 120 verdigimizde yine exception firlatildi. Cunku if statement icinde yas<=0 || yas>=120
yazmistik.

try catch tamamen bir exception'i handle etme islemi olup. Biz sorumuzun cozumunde try catch yerine if ve
else bloklari kullandik. Cunku exception firlatilmasini biz istedik. Kodun devam etmemesi icin biz exception
ekledik. Exception'i bilinen bir isimle buradaki gibi IllegalArgumentException olarak yazabilecegimiz gibi
senaryoya uygun baska bir isim de verebiliriz exception'a.

try catch exception'dan kurtulmak, onu handle etmek icin kullanilir. Biz throw new'i bile isteye exception
firlatilsin diye yaptik.






 */

import java.util.Scanner;

public class C01_IllegalArgumentException {


    /* Kullanıcıdan yasını sisteme girmesini isteyiniz.
        Kullanıcı yas olarak 0'dan kucuk esit veya
        120'den buyuk esit bir sayı girerse
        IllegalArgumentException olusacak sekilde
        bir program yazınız
         */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Yasinizi Giriniz");
        int yas = scan.nextInt();

        if(yas<=0 || yas>=120){
            throw new IllegalArgumentException();
            // Java bizim istedigimiz durumlarda exception fırlatabilir.
        }else{
            System.out.println("Uygun Bir Yas Girdiniz");
        }


    }




}
