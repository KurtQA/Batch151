package selfstudying1;

public class SelfStudy14 {

    /*
    Aşağıdakilerden hangisi method overloading yapmak için doğru bir yol değildir?
    A) Parametrelerin sayısını değiştirmek
    B) Parametrelerin data type'ini değiştirmek
    C) Parametrelerin data type'lari farklı ise yerlerini değiştirmek
    D) Method body'i değiştirmek.

    D) Method body'sinin değiştirilmesi, method overloading için doğru bir yol değildir.
    Method overloading, aynı isimde birden fazla methodun farklı parametrelerle tanımlanmasını ifade eder.
    Bu nedenle, method overloading yapmak için parametrelerin sayısını veya data type'ını
    değiştirmek veya parametrelerin data type'ları farklıysa yerlerini değiştirmek mümkündür.
     */

    /*
    Parametreli veya parametresiz herhangi bir static method main method içinde çağrılabilir.
    Ancak main method içinde static olmayan(non-static) bir method çağırmak istenirse,
    öncelikle bir nesne(object) oluşturulmalıdır.

   Static methodlar, nesne örneği oluşturulmadan doğrudan sınıf adıyla çağrılabilirler.
   Bu nedenle, static methodlar diğer methodlarla karşılaştırıldığında daha hızlıdırlar.

   Static methodlara doğrudan erişim sağlamak için sınıf adı ve method adı kullanılır.
   Örneğin, "ClassName.staticMethodName(parameters)" şeklinde çağrılabilirler.



   Aşağıdaki örnekte, bir "Calculator" sınıfı oluşturulmuştur ve "add" adlı bir static method tanımlanmıştır.
   Bu method, iki tamsayıyı toplayıp sonucu ekrana yazdırır. Bu static method "Calculator.add(5, 3)" şeklinde doğrudan sınıf adı ile çağrılabilir.

    public class Calculator {
    public static void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
       }
      }

      public class Main {
      public static void main(String[] args) {
      Calculator.add(5, 3); // Static method çağırmak için sınıf adı kullanılır.
     }
    }
     Örnek 2: Non-Static Method Çağırmak

     Aşağıdaki örnekte, bir "Rectangle" sınıfı oluşturulmuştur ve "calculateArea" adlı
     bir non-static method tanımlanmıştır.
     Bu method, dikdörtgenin kenar uzunluklarına göre alanını hesaplar ve sonucu ekrana yazdırır.
     Bu non-static method "Rectangle rectangle = new Rectangle();" satırı ile bir nesne oluşturularak çağrılabilir.

    public class Rectangle {
    int length;
    int width;

    public void calculateArea() {
        int area = length * width;
        System.out.println("The area of the rectangle is " + area);
     }
   }

     public class Main {
      public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(); // Object oluşturulması
        rectangle.length = 5;
        rectangle.width = 3;
        rectangle.calculateArea(); // Non-static method çağırmak için object adı kullanılır.
    }
}
 Bu örnekte, non-static method "calculateArea" çağırmak için bir object oluşturulmalıdır.
 Object oluşturulduktan sonra, method "rectangle.calculateArea()" şeklinde nesne adı ile çağrılabilir.
 Bu şekilde, object ile doğrudan etkileşim kurarak methodun çalışmasını sağlayabilirsiniz.








     */
}
