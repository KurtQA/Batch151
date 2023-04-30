package day_12_practice;

public class C02 {
    String isim;
    int yas;
    String telefon;

    public C02(String isim, int yas, String telefon) {
        this.isim= isim;
        this.yas= yas;

    }

    public static void main(String[] args) {
        C02 obj1=new C02("Burak",32,"0246");
        System.out.println(obj1.isim+","+ obj1.yas+","+ obj1.telefon);
        System.out.println(obj1.isim + ", " + obj1.yas + ", " + obj1.telefon);
      //Burak,32,null
        //Burak, 32, null   Constructor icinde this.telefon=telefon; yazilmadigi icin, object () icinde telefon
        //icin bir deger versek de sonuc null olarak verildi. En basta String variable'imiza deger verilmediginden
        //null degeri vardi. Constructor icinde bir ekleme yapmayinca null degeri kaldi ve constructor'daki isi bitince
        //main methodun icine geri donup sout'u gordu.Onu calistirdi.
    }
}