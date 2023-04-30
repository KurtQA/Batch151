package day27interface;



    /*

    Interface icinde concrete method konulamaz. Interface method'un body'si olamaz.
    Metodun body'sini sildikten sonra Java uyari vermedi. Method'a abstract eklememis olsak da sorun olmadi.
    Cunku Java bu methodun abstract oldugunu bilir, bu nedenle abstract kelimesi eklenmese de olur.
    public abstract void start(); eklersek de olur.
    Interface'de:Methodun access modifier'i silinirse o method default method olmaz. Cunku tum access modifierlar public'tir.
    Private ya da protected method yazamayiz. Access modifier yazmasak da olur. Cunku otomatik olarak public
    sayilir.
    Bir interface'i bir class'in child'i yapmak icin extends keyword'u yerine implement keywordu kullanilir.
    Concrete Child Classlr parent interfacedeki abstract methodlari  override etmek zoundadirlar
    interfaceler bir applicationda Concrete Chidl Classlarin yapmak zorunda olduklari fonksiyonlari barindirirlar
    Bu yuzden interfacelere to do list denir.
    Eger parent interface ise ayni isimli method kullanilabilir. Ancak ayni isimli iseler return typelari ayni olmak zorundarir.
    Biri int ise digeri de int, biri void ise digeri de void olmak zorundadir.
    Abstract methodlarin body'si olmadigindan child classlar ayni isimli methodlardan herhangi birisini override ederek kullanablirler.
    Birden fazla parent interface icinde ayni isimli abstract methodlar olustrudugunuzda bu methodlarin return typelari ayni olmak zorunda
    Methodlara default keyword'u interfaceler icine yazilirsa body eklemek mumkundur. Artik bunu access modifier olarak dusunemeyiz. Interfacelerde
    access modifier default olamaz. Burada default bir keyworddur. Concrete method yani body'si olan methodu eklemek icin bu keyword kullanilir.
    ornek default void eco() {}
    Ya da static keywordunu ekleyerek body'si olan method mumkundur.
    default veya static keywordunu kulanarak olusturdugunuz concrete methodlarin concrete child classlar tarafindan kullanilma zorunlulugu
    yoktur.
    Default keywordunu kullanarak olusturdugunuz concrete methodlara object olusturarak ulasilablir
    static keyword kullanilmissa o methoda ulasmak icin sadece interface ismi yeterli olup,
    ayrica object olusturmaya gerek yoktur.
    interfacelerden object olusturulmaz. Interfacelerin constructor'i yoktur.
    */

public interface Engine {

    public void start();

    void payment();

    default void eco(){
        System.out.println("Uses gas less...");
    }

    static void stop(){
        System.out.println("Stops securely...");
    }
}

