package day25varargsinheritance;

public class Vehicle {

    /*
    Object Class tum classlarin ortak parent'idir. Object class haric tum parent'larin class'i vardir.
    Parent--->child, HAS A relationship
    Child--->parent, IS A relationship
    Parent Object Class'ta default constructor var.
    Bu yeni actigimiz Vehicle Class'inda constructor olmasa da Object Class'ta var.
    Child class'tan bir object olusturdugumuzda Constructor'lar en ustteki parent class'tan baslatilarak alta dogru calistirilir.
    Child class'taki constructor'dan parent class'taki constructor'a gidebilmek icin super() kullanilir. Bu bizi
    parametresiz olana goturur. Her constructor'imizda gorunmese de super() oldugundan onunla parent'a gideriz ve
    ekrana parent'daki constructor icindeki sout calistirilir ve o sout icinde ne yaziyorsa ekranda onu goruruz.
    Parent class'da birden fazla constructor varsa istenilen constructor super() icine yazilan parametreler
    yardimi ile istenen constructor'a gidilir.
    Ayni class icindeki constructor'a gitmek icin this() kullanilir. Bunun () icine parametre girersek parametreli
    olani secer. Bizim Honda, Car ve sonra Vehicle classlarimiz var. Honda'dan Car'a super() ile gidince yine Car
    icinden super() ile Vehicle class'indaki constructor'a gider. super() yazmasak dahi gorumeyen super() bizi parent'a
    goturecek. Car class'ina super() ile gelince Vehicle parent'ina gitmek yerine Car icindeki bir constructor'a gidelim
    dersek this() kullanip, oradaki String make parametreli constructor'a gidebilmek icin this.(make) yazdik ve o
    constructor'a gittik. Oradan Vehicle'dakine gitmek icin bu defa super() ile gittik. Bunlari ekrana yazdiran
    VehicleRunner class'indaki Honda myHonda=new Honda(); objesidir.
     */
    //Bir constructor olusturalim.
    public Vehicle(){
        System.out.println("Vehicle 1");
    }

}
