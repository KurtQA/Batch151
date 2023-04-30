package day25polymorphism;

public class Student {
    //Encopsulation (Data Hiding)
    //Bir data access modifier'i private yapilarak saklanir.
    public String stdName = "Tom Hanks";
    public int age = 23;
    private String stdID = "AC2023102T";
    private double gpa = 3.87;
    private boolean successful = false;//ogrenci cok calisti ve sonuc true olmali
    //Nasil degistirebiliriz? "set method" ile degistirebiliriz. generate'den setter'a gittik ve oradan kilitli olan degistirmek
    //istedigimiz methodlari shifte basarak aldik. Asagida yer aldilar.
    public String getStdID() {
        return stdID;
    }
    /*
    Yine sagi tiklayip generate den getter'a gittik ve orada kilitli gorunen private String stdID() kismi icin ok'a
    basinca bu durumda StdID()'nin degerini bize gosterir. Hemen yukaridaki getStdID() getter icinde ok yapinca burada
    bu sekilde gorundu.

    Eger okumak istediginiz methodun return type'i String ise okuma yaptiginiz methodun return type'i da String olmali.
    Okuma yapan methodun parantezi icinde bir sey yok cunku okuyacagi methodun degerini okuyacak, onun gorulmesini
    saglayacak.

    Get methodlari hep public olur. Get methodunun return type'i okudugu variable'in return type'i ile ayni olur.
    Get method bir boolean variable icin olusturlduysa ismi is ile baslar.

    Set methodlar hep public olur.
    Set methodlarin return type'i hep void olur.
    Set methodu parametre kullanir ve parametrenin data type'i variable ile ayni olur.

    Bir methodu set methodunu kullanarak bir digerine cevirebiliriz. Bu sekilde birden fazla methoda gecip onlari set
    methodu ile degistirip, sonra arada degistirdigimiz herhangi bir methoda geri donup eski haline set methodu ile
     geri getirebiliriz.


     */

    public double getGpa() {
        return gpa;//otomatik olarak getter'dan aldik bu methodu
    }

    public boolean isSuccessful() {
     return successful;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
//Isimlendirirken hep void method ve set eklemeli olarak ayni isim yazilir. Yeni degeri vernek icin, set methodlari
    //her zaman parametreli olur. Getter'larda data type boolean ise hep is ile isim basliyor, setter'larda
    //isim hep set ile baslar.
    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
