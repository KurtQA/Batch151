package day24inheritancepolymonphism;

public class Car {

    public void move(){
        System.out.println("Cars move...");
    }

    public void getBreak(){
        System.out.println("Cars break...");
    }

    public void engine(){
        System.out.println("Cars have engine...");

        /*
        Car, Toyota, Honda ve Volvo'nun parenti olup, onun da parent'i olabilir. En tepedeki parent, Object Class'tir.
        Java'da parent'i olmayan tek class Object Class'tir.
         */

    }
    public String model="Car";
    public int price=0;//Classlarda variablelar olabilir

    public Car(){
        System.out.println("Car constructor 1");
    }//Bu bir constructor. Class'larda constructor olur

    public Car(int i){
        System.out.println("Car constructor 2");
    }
    /*
    CarRunner Class'tan constructor'a giderken CarRunner icindeki object parantezi icinde parametre koyduysak, ilgili
    Class'a gider ve icinde parametresi olani bulup calistirir.

    Toyota Class'i icinde iki constructor var. Parametresi String olani kullanacagiz. Parametresi String olan
    constructor {} icinde ilk satirda super(5)'i ekledik. Bu durumda CarRunner'dan Car Class'ina gidilir
    ve oradaki constructorlardan parametresi tam sayi olana gidecek ve onu calistiracak.
    Car Classi icinde constructorlardan birinin parametresi int i idi. 5 sayisina en uygun buydu, bunu calistirdi.
    Ekrana Car constructor 2 yazildi.

    Daha sonra super(5)'i alt constructor'dan ust constructor'a koyduk. Toyota Class icindeki ust constructor parametresiz
    Java bu durumda hangisini sececek? Java bu nedenle once parametresiz olana gidecek. Bunun icinde super(5) var. 5'in bulundugu
    yere bakinca integer oldugu anlasiliyor. Java Car class'i icinde once parametresi int olana gider onu calistirir.
    Ekranda once Car constructor 2'yi goruruz, daha sonra parametresiz constructor'a gider ve onu calistirir. Ekranda daha sonra
    Toyota constructor 1'i goruruz.


     */

    /*
    Toyota Class'inda 2 constructor var. Once child'dan iki constructor, daha sonra clasdaki iki constructor'i kullanmak isteyebiliriz.
    CarRunner icinde Object icindeki Toyota(); olan constructor'a gidiyoruz, oradan Toyota'daki parametresiz olan constructor'a geliyoruz.
    Bir Class'tan diger Class'taki constructor'a gitmek istersek this() yazariz. Bunu kullaninca parent'a gitmez, ayni class icindeki
    constructor'a gider. super() ile parent'a gideriz, this() ile ayni class'ta dolasiriz. Parametresiz constructor'in ilk satirina
    this("Prius"); yazarsak ilk constructordan alttaki constructor'a gideriz yani parametresi String olana gideriz ayni class icinde
    super(7); yazdik Toyota icinde bu defa Car Class'ina parent'a gitti ve sondaki parametresi int olan constructor'a gitti.
    this("Prius"); yerine parantez icine baska birsey yazabilirdik, yeterki String olan bir sey yazalim. Boylece parametresi String olana
    gitmesini saglariz.

    Sondaki constructor'a this(); yazinca ayni class icinde ustteki parametresiz constructor'a gitti.
     */

    /*
    Car Class'i icinde variable yazdigimiz kisma geldik, daha sonra Honda Class'ina geldik. Icinde public String model="Civic";
    public int price=20000;
    Animal
    Mammal
    Cat
    Van Cat

   Parentt'dan child'a HAS-A iliskisi vardir. Child'dan Parent'a IS-A iliskisi vardir.
   Eger data types arasinda IS-A ve HAS-A iliskisi varsa bu data types'a COVARIANT denir.
   Bunu overriding de gorecegiz.

   Polymorphise==>Coklu sekil. Iki parcadan olusur, 1)Overloading(+) 2)Overriding(-)
   OOP(Inheritance, Polymorphise(Overloading,Overriding))
   Cat ve Dog classlarindan parent Animal'da bulunan eat methodunu kullanabilirler
   ve o methodu kendi durumlarina gore ozellestirirler. Bu
   overriding'dir.

   Overriding, parent classtaki methodu child class'in ihtiyaclarina gore ozellestirip kullanmaktir.
   Overriding yapilirken methodun sadece body'
   si degistirilir. Ornek method () sonrasi{ arasinda degisiklik yaparsak} overriding oluyor. Orada sout vardi. Icine farkli yazdik.
   Overriding de method signature'a dokunulmaz. Dokunursak Java uyari verir.
   Method signature da eger methodda parametre yoksa override ypilirken
   parametre koyarsak uyari verir.

     */

}
