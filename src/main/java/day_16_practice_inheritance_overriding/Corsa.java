package day_16_practice_inheritance_overriding;

public class Corsa extends Opel{

    protected String hiz="Corsa 200 km hiz yapar";
    protected String yakit="Corsa benzinli veya elektiriklidir";
    protected String model="Corsa";

    protected void motor(){
        System.out.println("CORSA ARABALAR CEVRECI MOTOR KULLANIR");
    }

    protected void yakitTuketimi(){
        System.out.println("CORSA 5.6 LT YAKIT TUKETIR");

    }

    protected void vitesSayisi(){
        System.out.println("CORSA 5 VITESLIDIR");
    }

    public static void main(String[] args) {
        /*
        instance variable;
        Olusturdugumuz object'in data type'i hangi classa ait ise oradan baslayarak bakar. Yoksa parent'a gider ve ilk buldugu yerden alir.
         inheritance method:
         Olusturdugumuz object'in data type'i hangi classa ait ise oradan baslayarak bakar. Buldugu yerden hemen almaz, override edilmis mi
         diye control eder. (Olsuturdugumuz object'in Constructor class'ina(child class) kadar ayni isimde method var mi diye kontrol eder)
         Override edileni alir.

      */


        Corsa arb1 = new Corsa();

        //VARIABLELAR ILE ILGILI ISLEMLER:
        //Bu object'i icinde bulundugumuz class'in ismi ile olusturduk.
        System.out.println(arb1.hareket);//Arabalar teker ile hareket eder(Araba classinda bulup yazdirdi)
       //Kendi class'inda olan variable'i ayni class icinde bulup yazdirir. Variablelarda bu boyledir.
        System.out.println(arb1.hiz);//Corsa classindan getirdi
        System.out.println(arb1.yakit);//Corsa classindan bu variable'i bulup yazdirdi
        System.out.println(arb1.marka);//Corsa classinda marka instance variable'i yok. Opel parentindan aldi.
        System.out.println(arb1.sirketMerkezi);//Araba classinda buldu.
        System.out.println(arb1.model);//Corsa

        //method cagirdik. Bu method Corsa class'i icindeydi
        arb1.motor();//CORSA ARABALAR CEVRECI MOTOR KULLANIR

        Opel arb2=new Corsa();//Object Opel classindan olusturuldu, bu classtan degil
        System.out.println(arb2.hareket);//Objemizin data type'i Opel oldugundan icinde bulundugumuz Corsa class
        //ina bakmaz, baslangic noktasi Opel Class'i olur. Burada bulursa buradan hareket variable'ini alir.
        //bulamazsa Opel'in de parent'i olan Araba Class'ina gidip oraya bakar.
        System.out.println(arb2.hiz);
        System.out.println(arb2.yakit); //yakit variable'ini once Opel class'indan bulamayinca Araba class'indan
        //arayip buldu.
        System.out.println(arb2.marka);//marka variable'ini yine bulmak icin Opel class'indan basladi ve orada
        //bulunca ayrica Araba class'ina gitmedi. Zaten child class olan Corsa'dan arama yapamazdi. Cunku
        //objecti Opel ismi ile olusturduk.
        //arb2.model. olmayan variable'i aramasini istedigimizde bu variable'i ne Opel de ne Araba classinda
        //bulamayinca Compile Time Error verdi. Bu variable Corsa classinda vardi, ancak olusturdugumuz object
        //type'i nedeniyle geri vites yapamaz, Corsa'da arayamaz.


        //METHODLAR ILE ILGILI ISLEMLER

        //objectimiz ile method cagiralim
        arb2.motor();
      /*
      Object data type'i Opel classindan, Constructor ise Corsa(child) classindan olusturuldu.
      Objectimiz Opel classindan olustugu icin basta Opel classina gelip motor methodu var mi diye bakar.
      Opel classinda bu method olsa da hemen almaz onu. Once bu method child tarafindan override edilmis mi
      diye bakar. Orada override edildigini gorunce parent Opeldekini degil Corsa classindaki motor
      methodunu alip onu yazdirir. Eger Corsa class'inda motor methodu olmasaydi, o zaman Opel classindaki
      motor methodunu alir ve yazdirirdi.
      Corsa classinda motor methodu override edildigi icin bize Corsa classindaki degeri yazdiracak.
      "CORSA ARABALAR CEVRECI MOTOR KULLANIR"
       */


        arb2.garanti();//Opel classinda garanti methodu var ve Corsa classinda bu method override edilmedigi icin
        //Opel classindan bu methodu alir ve Opel classinda bu method icinde ne yazildiysa onu yazdirir.

       arb2.yakitTuketimi();//Bu method Opel'de olmayinca Araba'ya gitti. Orada bu methodu buldu ve child'a bakti. Override
        //edildigini gorunce child Corsa'daki yakitTuketimi methodunu aldi ve oradaki sout yazildi.
        //arb2.vitesSayisi(); olmayan bir method oldugu, java Opel'de ardindan Araba classinda bu methodu bulamayinca
        //gidecek yeri yok ve Compile Time Error verir.

        //Bir object daha olusturduk. Object'i Araba class'i ismi ile olusturduk. Constructor'i Corsa class'indan
        Araba arb3=new Corsa();
        System.out.println(arb3.hareket);//variable'i cagiriyoruz. Variablelarda override edilmis mi diye bakilmiyor.
        //Java bu variable'i bulmak icin dogrudan Araba class'indan baslar.

        System.out.println(arb3.hiz);//Araba classinda bu variable'i buldu ve alip yazdirdi.
        System.out.println(arb3.yakit);//Araba classinda bu variable'i buldu, yazdirdi.
        System.out.println(arb3.marka);//Araba classindan bulundugu yerden alinip yazildi.
        //arb3.sirketMerkezi yazdik ancak CTE hatasi verdi. Araba class'inda bulamadi, gidecek baska bir yeri olmadigi icin
        //error verdi.
        //arb3.model yazdik. Ayni sekilde Araba class'inda bunu bulamadik. Araba class'inin baska parent'i olmadigi gidecek
        //yeri olmadigi icin error verdi.

       //Simdi de 3. objemizi olusturduktan sonra method cagiralim

        arb3.yakitTuketimi();//Arama baslangic noktasi Araba class'inin ici. Burada aradigi methodu buldu ancak hemen almadi. Override
        //edilme var mi diye once bir altindaki class olan Opel class'ina gider. Orada override edilmedigi icin Corsa classina
        //gider. Orada bu methodun override edildigini gordugu icin onu alir ve yazdirir. Eger Opel classinda override edilmis olsaydi onu
        //yine hemen almazdi, oradan Corsa classina gidip override edilmis mi diye bakardi ve en son override nerede yapildiysa onu alirdi.

        arb3.motor();//Araba classinda once aradi ve orada bulunca override edilme durumuna bakar, Opel'de override edildigini gordu.
        //Corsa class'ina gitti ve orada da override edildigini gordu. Bu sebeple en son override edileni yani Corsa class'indaki
        //motor methodunu alip, yazdirdi.

        //arb3.garanti();//Araba classinda bu method yok ve gidecek yeri olmadigindan CTE verir.
        //arb3.vitesSayisi()//Araba class'inda bu method yok ve yine Compile Time Error verir




        //
    }




}
