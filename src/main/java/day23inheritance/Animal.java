package day23inheritance;

public class Animal {

    /*
    Inheritance is the mechanism by which one class can inherit attributes and methods from another class,
     and can extend or modify that functionality.
     1) eat(){} methodu gibi bir cok class'in kullanmasi gereken methodlari her class'a ayri ayri yazarsak;
     i)Tekrar yapmis oluruz, tekrar ideal code'da olmamalidir.
     ii)Ayni methodu tekrar tekrar yazmak zaman kaybidir.
     iii)Tekraren yazilan methodun tamiri zaman alir.
     iv)Tekraren yazilan methodun gelistirlmesi zaman alir.
     v)Her class'in icine methodu tekraren yazmak atomik yapiya terstir.
     2)Private class memberlar child classlar tarafindan kullanilamaz.
     Public class memberlar child class memberler tarafindan kullanilabilir.
     Default class memberlar ayni package'de child classlar tarafindan kullanilabilirler
     protected class memberlar farkli package'de de olsalar child classlar tarafindan kullanilabilir.
     3)Javada bir class'in sadece 1 tane parent'i olabilir.
     Coklu Parent'a multiple

     Java'da inheritance, "extends" anahtar kelimesi kullanılarak gerçekleştirilir.
     Bir sınıf, var olan bir sınıfa dayandığında, türetilen sınıf,
     parent (üst) sınıfın tüm özelliklerini ve yöntemlerini,
     protected veya public değişkenleri veya yöntemleri de dahil olmak üzere miras alır.
     Türetilen sınıf, yani alt sınıf, ek özellikler ve yöntemler ekleyebilir veya
     gerektiğinde var olanları geçersiz kılabilir.
     */

    protected void eat() {
        System.out.println("Animals eat...");
        //ekrana sadece birsey yazdiriyorsaniz void kullanirisiniz
    }
        public void drink(){
            System.out.println("Animals drink...");
        }






    }

