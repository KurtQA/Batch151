package selfstudying1;

public class SelfStudy19 {
    /*
    public static void main(String[] args) {
 add(3.2, 4.8); //Output A
 add(5, 7.3); //Output B
 add(5, 7); //Output C
 add(5.3, 7); //Output D
}
public static void add(double n1, double n2) {
 System.out.println(n1 + n2);
}
public static void add(int n1, double n2) {
 System.out.println(n1 + n2);
}
public static void add(int n1, int n2) {
 System.out.println(n1 + n2);
}
Hangisi yanlıştır?
A) Output A = 8.0
B) Output B = 12.3
C) Output C = 12
D) Output D Compile Time Error verir.

/*




















/*

Bu kod parçasında, üç ayrı "add" metodu farklı parametre tipleriyle tanımlanmıştır:
biri double, biri int ve biri int ve double parametreler alır.
Derleyici, hangi metotun çağrılacağına karar verirken, argümanların tiplerini kullanarak
en uygun olanı seçmeye çalışır.
Ancak "add" metotları arasında, "int" ve "double" tipi parametreleri kabul eden iki ayrı metot bulunmaktadır.
Java, double türünü otomatik olarak int türüne dönüştüremez,
ancak int türünü otomatik olarak double türüne dönüştürebilir.
Bu nedenle, "add(int n1, double n2)" yöntemi, "add(5.3, 7)" çağrısında kullanılamaz,
ancak "add(double n1, double n2)" yöntemi kullanılabilir.
Bu yöntem çağrıldığında, 7 sayısı double türüne dönüştürülür ve
ardından işlem yapılır.İkinci parametre olan 7, double türünden daha özeldir ve
bu nedenle int değeri otomatik olarak double türüne dönüştürülür.
Yani, bu çağrı gerçekte "add(5.3, 7.0)" şeklinde işlenir
Sonuç olarak, "add(5.3, 7)" çağrısının sonucu "Output D = 12.3" olur ve bir derleme hatası meydana gelmez.
 */

    /*
    A) Bu metod, iki ayrı parametre tipine sahip iki farklı işlev tanımlaması içermektedir.
    İlk işlev, "float i" ve "int j" parametreleri alarak "Good" kelimesini ekrana yazdırır.
    İkinci işlev ise "double i" ve "double j" parametrelerini alarak "Bad" kelimesini ekrana yazdırır.

Main metodu, "float" ve "int" parametreleri yerine "double" ve "int" parametreleri ile çağırılmaktadır.
Bu nedenle, Java otomatik olarak veri tipi dönüşümü gerçekleştirir ve
"1.2" sayısı "float" tipi yerine "double" tipi olarak yorumlanır.
Sonuç olarak, "Bad" kelimesi ekrana yazdırılır.

B) Bu metod, A metodundaki gibi iki ayrı parametre tipine sahip iki farklı işlev tanımlaması içermektedir.
 İlk işlev, "float i" ve "int j" parametreleri alarak "Good" kelimesini ekrana yazdırır.
 İkinci işlev ise "double i" ve "double j" parametrelerini alarak "Bad" kelimesini ekrana yazdırır.

Main metodu, "float" ve "int" parametreleri doğru şekilde kullanılarak çağırılmaktadır. J
ava otomatik olarak veri tipi dönüşümü yapar ve "2" sayısı "int" tipi yerine "float" tipi olarak yorumlanır.
Bu nedenle, "Good" kelimesi ekrana yazdırılır.

C) Bu metod, A ve B metodlarındaki gibi iki ayrı parametre tipine sahip
iki farklı işlev tanımlaması içermektedir. İlk işlev, "float i" ve "int j" parametreleri alarak
"Good" kelimesini ekrana yazdırır. İkinci işlev ise "double i" ve "double j" parametrelerini alarak
"Bad" kelimesini ekrana yazdırır.

Main metodu, "float" ve "double" parametreleri doğru şekilde kullanılarak çağırılmaktadır.
Bu nedenle, Java otomatik olarak veri tipi dönüşümü yapar ve "2.1F" sayısı "float" tipi olarak yorumlanırken,
"3.2" sayısı "double" tipi olarak yorumlanır. Sonuç olarak, "Bad" kelimesi ekrana yazdırılır.








     */






}
