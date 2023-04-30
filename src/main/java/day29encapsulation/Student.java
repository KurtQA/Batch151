package day29encapsulation;

public class Student{
    /*
    Encapsulation Data Hiding
    Data nasil saklanir? Access modifier'i private yaparak diger classlardan gorunmez hale getirileblir.
    Encapsulation yaptigimiz datayi diger classlardan okuyabilmemiz icin "get method" olusturarak
    encapsulate edilmis datanin degerini okuyabiliriz.



     */
    private String stdID="AC2023102T";
      public int age=19;

      private double notOrt=3.53;
      private boolean successful=false;

    public boolean isSuccessful() {
        return successful;
    }

    public void setStdID(String stdID) {// generate'den setter'i bulduk ve set yapmak istedigimiz tum variablelari
        //sectik. set() methodu degistirmek istedigimiz data'yi degistirecek, bir sey uretmeyecek o yuzden return
        //type her zaman void olacak. Parantezler icinde mutlaka parametre vardir. Bu parametrelerin data type'i
        //degistirilmek istenen variable'in data type'i ile ayni olacak.
        this.stdID = stdID;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public String getStdID(){
          return stdID;}

    public double getNotOrt(){
        return notOrt;
    }

    public boolean isSuccesful(){
        return successful;
    }
    //bize private String stdID variable'indaki stdID'yi return ediyor. StudentRunner'dan
          //getStdID() methodu ile okumamiz mumkun olacak
          //successful'u get yapmak isteyince mouse ile sagi tikladik, generate'den getter'i bulduk ve successful'u
        // sectik. Otomatik olarak public boolean isSuccessful(){ return successful;} yazildi. Oysa
        // normalde private idi yukarida. Ama biz encapsulation'i StudentRunner class'inda kirmak, variable degerini
        // gorebilmek icin get methodunu kullandik.
        // Eger biz bir boolean variable icin get methodu kullanirsak variable isminin basina "is" gelir.isSuccessful
        //get methodun return type i okudugu variable in return type i ile ayni olur

        /*
        Encapsulation yaptigimiz datayi istersek diger classlardan degistirebiliriz.
        Set method olusturarak encapsulate ettigimiz datanin degerini degistirebiliriz.
        a)Set methodlari her zaman public olur
        b)return type'i void olur. Cunku bu method ile yeni bir sey yapilmasi istenmiyor.
        get method da ise hangi variable'i okumak istiyorsak onun data type'ini kullaniyoruz.
        c)set method parametre kullanir, parametrenin data type'i variable ile ayni olmak zorundadir. Ornek
        parametre icinde variable'in data type'i String ve variable ismi olur. Bu yolla set method
        body'si icinde this.stdID=stdID yazarak class icindeki variable'in stdID'sini degistiriyoruz.Degistirme
        Runner class ile yapiliyor. Runner icind eStudent object olustruduk, object ismi ile set methodu cagirdik ve
        methodumuzun parametresine baska bir stdID yerlestirdik. Calistirinca ekrana degismis hakli cikti.

        set method kullanarak var olan object uzerinde degisiklikler yaparak o objecti
        sanki yeni bir object'mis gibi kullaniriz.











         */



}
