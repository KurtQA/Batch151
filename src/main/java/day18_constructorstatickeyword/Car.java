package day18_constructorstatickeyword;
    /*
     1)Constructor nasil olusturulur?
     Access modifier + Class Ismi + () + {}

     2) Method ile Constructor arasindaki farklar nelerdir? (Interview Sorusu)
     i)Methodlarda "return type" olur. Constructorlarda olmaz.
     ii)Methodlar yaptiklari ise gore isimlendirilirler. Ornek toplama islemi yapilacaksa, toplama methodu olarak
     isimlendirilirler.
     Constructorlar ise her zaman class isimleri ile isimlendirilirler.
     iii)Methodlar bir aksiyon yapmak icin olusturulur, mesela toplama aksiyonu yapmak icin olusturulur. Constructor
     size object yapar, bunun icin olusturulur.
     iV)Method isimleri kucuk harfle baslar. Constructor isimleri class ismi ile ayni oldugu icin buyuk harfle baslar

     3)Farkli Constructor'lar olusturarark ayni class'dan farkli ozelliklere sahip objeler oluturabiliriz.
      */

public class Car {


    String make="Honda";
    String model="Accord";
    int year=2021;
    int price=18000;
    //Javanin otomatik olarak verdigi console'a default constructor denir. Default Constructorlar parametre
    //kullanmazlar.Parantez icine bir sey yazmiyoruz. Default Constructorlarin body'si bostur. {}ici bos
    //Manuel olarak yani elle default constructor'i (public Car() {})yazdigimizda , Java object class icindeki
    //default constructor'i kullandirmaz.
    //Biz bu class icinde main methodu yazmadik. Baska bir class acip oraya main method yazacagiz ve ordaki main
    //method burasi icin de main method olacak


    String make1 = "Honda";
    String model1 = "Accord";
    int year1 = 2021;
    int price1 = 18000;

    //Default Constructor
    //Default Constructor'lar "parametre" kullanmazlar
    //Default Constructor'larin body'si bostur
    //Java kiskanc'dir. Siz "default constructor"i elle yazdiginizda
    //Java Object Class icindeki default constructor'i kullandirtmaz.
    public Car(){

    }

    //Custom Constructor
    //Alttaki public car dan this.price1-price1; dahil sildik. Sonra ayni yerde dururken sagi tikladik
    //generate'i tikladik ve sonra constructor'i sectik. Orada sildigimiz kismi bulduk. Shift'e basip herbirini sectik,
    //ok kismina basinca hepsi ekranda yeniden cikti. Hangisini sildik ve hangisini geri almak istiyorsak o kisimlari
    //shift'e basip ayni zamanda secmeliyiz. Eger silmeyip tekrar almaya calisirsak, intellij bize already exist uyarisi
    //verir.


    public Car( String make1, String model1, int year1, int price1) {

        this.make1 = make1;
        this.model1 = model1;
        this.year1 = year1;
        this.price1 = price1;
    }

    public Car(String make){
        this.make = make;
    }

}
