package day20methodoverloadingarraylist;

public class MethodOverLoading01 {

    public static void main(String[] args) {

        String s = "Java";
       add(3,5);
       //Asagidaki methoda static eklemeyince yukari kisimda add methodu yazinca uyari verdi. Static
        //static ekledik cunku main methoddan methodu cagiracaktik. Daha sonra add methodu sorunsuz gorundu
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
        //void yerine int yazsaydik, sout altinda return a+b yazmamiz gerekecekti

    }

   public void add(double a, double b) {
        System.out.println(a + b);

    }

    public void add(int a, double b) {
        System.out.println(a + b);
    }
    public static void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
    //yukarida main method icinde a ve b ye deger verince asagidaki methodlara Java bakar ve
    //bizim cagirdigimiz methoddaki parametrelere bakarak karar verir.
    //Eger biz add() icine 3 ve 5 yazarsak Java ikisininde int oldugunu kabul eder ve iki int olani asagi
    //kisimdan bulur ve onu secer.
    /*
    3 ile 5.5 olsaydi 4. siradaki methodu secerdi. 3.3 ve 5.5 yazsaydik Java ikinci methodu secerdi.
    3, 5.5 ve 4 olsaydi, Java son kisimdakine bakar cunku orada 3 parametre var. Ancak 5.5 double
    olsa da ikinci siradaki int'e denk gelen double 5.5 o kisma explicit narrowing olacagindan hata verir
    ve yazdirma olmaz. Eger int double'a denk gelseydi autowidening olabilirdi. Bu problem olmazdi. Java
    sondaki methoda gore calisirdi.
    Java birden fazla calistirabilecegi secenek varsa birden fazla is yapacagi kismi degil daha az is
    yapacagi kismi secer. Ornek bir secenekte iki auto widening yapmak zorunda cunku iki int verilmis secenekte
    iki double var, diger secenekte ise bir double bir int var, bir kez autowidening yapacak. Az
    is yapacagi kismi secer. Birden fazla dogru secenek varsa Java ust kisimda, add methodu icinde deger
    verdigimiz yerde kirmizi renk cikabilir. O zaman seceneklerden biri disindakini yoruma alip,
    Java'ya hangisini sececeginde yardimci oluruz.

    method icinde parametreler farkli type ise yerleri degistirilebilir. Parametre data types
    degistirilebilir. Degerleri degistirilebilir. Java methodlari isim ver parametrelerden tanir
     isim ve parametreleri ayni olan birden fazla method varsa Java hata verir
     isim ve parametreye method signature denir. Signature her iki methodda ayni ise Java hata veriyor.
     Signature ayni olan iki methodda islem kismini baska sayi eklemesine, access modifier'i degistirme
     ya da  static kisminin eklenme ve cikarilmasina ragmen Java hata verdi.
     Ancak method ismi ikisinde add iken birini add1 yaptik ve hata vermedi. Private methodlar overloading
     yapilabilir. Overloading ayni class icinde olacagindan private ya da public methodun overloading
     yapilmasi sorun olmaz. Static ve non- static methodlar overload edilebilir.


     */
}