package day17multidimensionalarraypassbyvalue;

public class PassByValue01 {

    /*
    Method olusturmak icin adimlar
    1-Access modifier
    2-Return Type
    3-Method's name
    4-Method Parantez()
    5-Method Body{}

    Note: "main method'un icindeki tum methodlar static olmalidir. Bir methodu static yapmak icin access
    modifier ile return type arasina static yazmak yeterlidir. Asagida public int discount(String type,int price)
    kisminda hata verdi. Bunun uzerine public int arasina static yazdik.

    Pas by Value:
    1)Java "Pass by Value" kullanir.
    2)Yano; Java methodlarin orjinal degeri degistirmesine musaade etmez.
    3)Java method;lara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi methoda yollar
    Method kopya deger uzerinde degisiklik yapar, boylece orjinal degeri korumuz olur.
    4)Java esnek bir dildir. Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.

    Pass by Reference:
    1)Pass by Reference da methode reference yollanir. Adres yollaninca method adresi kullanarak
    orjinal degere ulasir ve orjinal degeri degistirir. Bu yuzden "C#" gibi Pass by Reference kullanan dillerde
    method varable orjinal degerini degistirir.
     */

    public static void main(String[] args) {

        int shirtPrice=200;
        System.out.println(discount("student", shirtPrice));
        System.out.println(shirtPrice);
      //asagida devam eden kodu yazdiktan sonra yukari ciktik ve int shirtPrice=200; altina geldik
        //ayri ayri sout yazdik
        shirtPrice=discount("veteran", shirtPrice);
        System.out.println(shirtPrice);
        //normalde Java 200 olan orjinal price'i koruyordu. Ancak Java esnek olup, bir ustteki kodumuzla
        //orjinal degeri korumadi ve bu defa sadece 160 verdi, 200'u student'daki gibi sonuca eklemedi.
    }
    //Discount Method'u olusturunuz.
    public static int discount(String type,int price){
        switch(type){
            case "student":
                price=price-20;
                break;
            case "veteran":
                price=price-40;
                break;
            case "senior":
                price=price-30;
                break;
            default:
                price=price;
        }
        return price;
     //sonuc olarak sadece 180'i vermedi hem 180 hem 200'u verdi. Orjinal price'i korudu. Bu passbyvalue
        //Java orjinal degerin degismesini istemez. Orginal'in kopyasini olusturur. Kopya 200'u getirdi
        //180'e ceviren kopya 200 dur. Boylelikle orjinal degeri tekrar tekrar kullanma sansimiz oluyor
        //orjinal deger uzerinden student disinda ornegin veteran icin de discount yapilir

    }
}
