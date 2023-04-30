package day_14_practice;

/*
Static variablelarimizi class seviyesinde olustururuz. Protected static String variablelar olusturduk. Extends
ile baska bir class'in child olma durumu olunca access modifier'in protected olmasi tercih edilir.
methodumuzu protected olarak olusturduk. Cunku bir child-parent iliskisi olacak. Birden fazla protected static
method olusturduk. method1 ve method2.
Soruda bizden yas adinda instance variable olusturmamiz istendiginden onu da olusturduk ve sonra instance bir
method olarak method3 ve method4'u olusturduk. Bunlari parent class icinde olusturduk. Olusturdugumuz variable
ve methodlari bir child class olusturarak oradan kullanacagiz. Child ve parent classlar ayni package icinde.

Child isimli class'imizi Parent class'ina extends keywordu ile onun child'i yaptik. Child class'ina giderek main method
olusturduktan sonra oradan parent icindeki static olan variablelardan isim olan variable'i cagirdik.
Bunun icin static variable'i class ismi ile yazip cagirabilecegimiz gibi(Parent.isim), bu iki class arasinda
parent-child iliskisi varsa class ismi yazmadan da sadece isim yazip bunu sout icine alabiliriz.

isim variable'ini alt satirda isim="Veli"; yazarak degistirebiliriz.
Ayni sekilde soyisim olarak adlandirdigimiz variable'i degistirebiliriz. Ornek: soyisim="Tan";

Methodlari nasil cagiririz? Methodu ismini ve parantezini yazarak kullanabiliriz. Sadece method1(); yazinca
parent class'i icinde method1 body'si icinde yazdigimiz sout'u calistirinca, methodu kullanmis oluruz.

Instance variable'ini ise child class'da ancak yeni bir object olusturunca o object ismi ile cagirabiliyoruz.

Biz obj1 uzerinden yas variable'ini cagirinca java once icinde bulundugu child class'a bakar istenen variable
var mi diye. Bulursa onu yazdirir, ancak bulamazsa parent class'ina gidip oradan arastirir.



 */


public class Parent {
    // Parent class'da isim, soyisim adında static variable olusturalım,
    // method1 ve method2 adında static methodlar olusturalım
    // yas adında instance variable olusturalım
    // method3 ve method4 adında instance methodlar olusturalım
    // olusturdugumuz variable ve methodları Child class'dan extends(inharitance) ederek cagıralım
    protected static String isim = "Ali";
    protected static  String soyisim = "Can";
    protected static void method1(){
        System.out.println("parent static method1");
    }
    protected static void method2(){
        System.out.println("parent static method2");
    }
    protected int yas = 30;
    protected void method3(){
        System.out.println("parent instance method3");
    }
    protected void method4(){
        System.out.println("parent instance method4");
    }
}

