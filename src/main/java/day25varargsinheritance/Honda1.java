package day25varargsinheritance;

public class Honda1 extends Car{

    public Honda1(){
        System.out.println("Honda 1");
        System.out.println(this.model);
        System.out.println(super.km);
     //parametreleri gostermek icin ikinci sout icine this. yaptik gorunen variablelar'dan model'i sectik. this deyince bu classtaki
        //ekranda gorunecek
        //son sout'da ise super. yazinca gorunen variable'lardan parent'da olan km variable'i sectik ve ekrana Car class'indaki
        //variable degeri olan 20000 gorundu. this.km yazsaydik o zaman bu class icindeki km variable'inin degeri 10000'i yazdirirdi.
    }

    public String model="civic";
    public int km=10000;

}
