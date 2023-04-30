package day25varargsinheritance;

//Bir method parantezinde birden fazla varags kullanilamaz
//

public class Varargs {

    public static void main(String[] args) {
        //Toplama islemi yapan bir method olusturun
        System.out.println((add(5, 2, 7)));

        getInitials("Ali Can", "Kemal Han");

    }

    //    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
    /*
    Java farkli sayidaki parametrelerin hepsini kabul eden bir yapi olusturdu ve bu yapiya Varargs denir.
    Varargs arka planda Array yapisini kullanir.

     */

    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }

        return sum;
    }
    //return:14
    /*
    Once asagida add methodu olusturduk, parametre olarak bir Varargs yazdik. Baslangicta methoda static eklemedik. Calsitiracagimiz
    zaman static ekledik. Main method icine sout yazdik ve orada birden fazla int degeri yazdik, 5,7,7. Java main methoddan
    asagiya indi ve add olan bir method var mi ona bakti ve buldu. Methodumuzun {} icinde islemi for  each kullanarak yaptik. Her zamanki
    gibi toplama yapilacagindan baslangic degeri 0 olan bir variable olusturduk. loop dongusunde sayilar once w'nin icinde toplandi.
    w'ye girenleri sum sepetine sum=sum+w; yaparak ekledik. Her eklemede sum sepetinde toplama yapildi. Toplananlari gormek icin
    for each {} disina return sum; yazdik. return sum; yazmayinca kirmizi renkle uyari verdi. void degil int data type oldugu icin bir return
    yazmamiz gerkiyordu. Toplananlar 14 oldugunda return sum olarak sonuclandi ve bu sonuc yukarida main methoda gitti.Burada return type void olsaydi
    return yazilmaz ve sout icine yazilmadan dogrudan yazdiririrdi.
     */

//        public static void add(int... a) {
//        int sum = 0;
//        for (int w : a) {
//            sum = sum + w;
//        }
//        System.out.println("Toplam: " + sum);
//    }
    //int yerine void yazsaydik nasil yazardik'a ornektir. Ayrica return yazilmiyor. Main method icini de farkli yazardik.
    //main methodunda aşağıdaki gibi add methodunu çağırarak sayıları parametre olarak vererek toplama işlemi yapabilirsiniz:
    //public static void main(String[] args) {
    //    int sum = add(5, 2, 7); // 5, 2, ve 7 sayılarını parametre olarak veriyoruz
    //    System.out.println("Toplam: " + sum); // Sonucu ekrana yazdırıyoruz
    //}

    //Example: Verilen isimlerin ilk harflerini console'a yazdiran methodu olusturunuz.
    //Ali Can==>AC  Kemal Han==>KH

    //Varargs larda bir array yapisi var, array kullanir gibi calisir bu nedenle for each loop kullaniyoruz.
    public static void getInitials(String... s) {
        String initials = "";
        for (String w : s) {
            initials = initials + w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);//AC  KH
            initials = "";//Burada Ali Can ismi initials icinde kalmasin diye initials isimli variable'imizi ""; ile
            //bosalttik. Bosalinca Kemal Han ismi KH olarak sonucta initials icine girdi.
        }


    }
    //String... s olan varargs sayesinde birden fazla String olan isimleri kullanabildik. O isimler bir array elemanlari
    //gibi siralandi. Array gibi calisinca for each kullandik.
    //for each body'si icinde String harflerine tek tek bakilirken String initials icine alinmasi ve isimlerin ilk harflerini
    //tutabilmesi icin initials=initials+w.charAt ile devam ettik/ Data type void oldugu icin sout method icinde yazildi
    //main method icinde method cagirildi, orada sadece parametreleri girdik, method o parametrelere gore calismis oldu
}
