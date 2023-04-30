package selfstudying1;

public class SelfStudy18 {

      /*

        private static void getData(){
System.out.println("Method 1");
}
public static void getData(){
System.out.println("Method 2");
}
public static void main(String[] args){
getData();
}
Hangisi doğrudur?
A) Ekrana 0 yazar
B) Ekrana 1 yazar
C) Ekrana hiçbirşey yazmaz
D) Compile Time Error verir
























Cevap: D) Compile Time Error verir



Java'da, metotlar parametrelerine göre overloading yapılabilir,
yani aynı isimli farklı parametreler alan birden fazla metot tanımlanabilir.
Ancak metotlar aynı isim ve parametrelerle tekrar tanımlanamaz.

Bu kod parçasında, "getData" adında iki kez metod tanımlanmış.
İlk tanım olan "private static void getData()" belirleyicileri kullanılarak
private ve static olarak tanımlanmış, ancak ikinci tanım olan
"public static void getData()" belirleyicileri kullanılarak public ve static olarak tanımlanmıştır.
Bu nedenle, derleyici bu hatayı verir:
*/
//      private static void getData(){
//          System.out.println("Method 1");
//      }
//    public static void getData(){
//        System.out.println("Method 2");
//    }
//
//    public static void main(String[] args) {
//        getData();
//    }


}
