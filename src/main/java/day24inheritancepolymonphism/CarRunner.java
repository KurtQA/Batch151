package day24inheritancepolymonphism;

public class CarRunner {

    public static void main(String[] args) {

        //Toyota t1=new Toyota();//Toyota objesi olusturduk.
        //t1.model="Prius";
        //t1. yazinca diger class'ta yazdigimiz methodlara, variablelara ulasabildik
        //System.out.println(t1.model);//Car constructor 1
        Honda h1 = new Honda();//Bu Honda Class'ina gelecek bu class'daki model'i yani Civic'i alacak
        //ilk sout icinde Civic var onu alacak,yani once onu calistiracak,
        // alttaki sout icinde super.model var, oradan parent'a gidecek, onu sonra calistirmis olacak yani Car
        //class'indaki model variable'ini bulup calistiracak

        Volvo v1=new Volvo();//Bir object olusturduk.
        v1.move();//Parent methodunu kullanmak ayni sekilde kullanmak istiyorsak override yapmamaliyiz, ama
        //parent'daki methodu child class icin ozellestireceksek override yapmaliyiz
    }
    /*
    Java diyor ki once parent'i sonra child'i olustur. Burada once Car sonra Toyota'yi olusturduk.
    Java once Car'i calistirir. Yani once onu yazdirir, sonra asagidaki constructorlari calistirir.
    Biz Java'ya Toyota(); constructor'ini calistir, icinde parametre olmayani calistir dedik.
    Bu constructor Toyota uretecek, ama once parent'i olan Car'in uretilmesi gerekir.
    Her constructor'in ilk satirinda gorunmez kodu vardir. O da super() seklindedir.
    Super parent demektir. O yuzden once parent'e gidilir.
    Car'in da parent'i varsa oradaki constructor da super parantez nedeniyle kendi parent'ina gider.
    En tepeden Object Class'tan calismaya basladi asagilara kadar geldi.
    Bizi yukariya tasiyan kod su super keyword'udur. Bu sizi parent'daki constructor'a tasir.
     */

    /*
    Toyotanin icinde Car'in ruhu, Car'in genleri var. Siir gibi :)
    Constructorlar inheritance da yukaridan asagiya calisir.
    Parent Class da diyebiliriz, Super Class da diyebiliriz Car Class'i icin.
    Sub Class da Child Class da diyebiliriz Toyota Class'i icin.
    Interview sorusu: Super parantez nedir, ne ise yarar. Bizi tepedeki parent'a tasir.
    super() 'i istersek ilk satirda gorunur sekilde yazabiliriz. Public Car(){
    super()}




     */

}
