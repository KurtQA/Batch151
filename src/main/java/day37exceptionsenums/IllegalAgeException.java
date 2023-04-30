package day37exceptionsenums;

/*
Biz bu exception'i runtime exception yapmak istedik. Bunun icin olusturdugumuz  class'i extends keywordu
ile RunTimeException'in child'i yaptik.

Iki exception constructor olusturduk. Birini mesajsiz, digerini mesajli yaptik. Mesaj constructor body'si icinde
ilk satirdaki super methodu icine yazildi.

Kulanicidan yas isteme durumunda, kullanicinin eksili bir sayi vermemesi icin bir if statement olustururuz.
Su sekilde : if(age<0) ve body icine throw new keywordu ile exception'imizi yazariz. Daha sonra sout icine
yazilmasini istedigimiz mesaji yazip, kodumuzu calistiririz. Istersek bu exeception'in try catch methodu ile
atilmasini saglayabiliriz. Bu durumda applicationimiz negatif senaryoda durmayacak.


////


finally block, exception olsa da olmasa da calisir. Her senaryo icin calismasini istedigimiz kodlari finally
block kullanarak saglamis oluruz.

final, finally ve finalise aciklar misiniz?


finalise:  Memory'e lazim olanlari koymaliyiz. Ucuz televizyon bulduk diye 10 televizyon alip eve koymayiz.
Java, memory'i temiz tutar. Surekli olarak memory'i tarar ve fazlalik bulursa onu siler. "Garbage Collector"
bu isi yapar. Java silinmesi gerekenleri once bir posete koyar, onu baglar ve cope atar gibi bir islem yapar.
Iste bu isleme finalise denir.

////


 */

 /*
        1)Custom Exception Class olusturmak icin Exception Class'a extend etmeliyiz.
          Exception Class'a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur.

        2)Custom Exception Class olustururken "constructor" olusturmalisiniz.
          Bu "constructor" parent'taki constructor'i cagirmalidir.
          Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

        3)Custom Exception Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz,
          IllegalGradeException da oldugu gibi.

     */
public class IllegalAgeException extends Exception{


public IllegalAgeException(String message){
        super(message);
        }

public IllegalAgeException(){
        super();
        }

        }