package selfstudying1;
/*
Java'da değişkenler iki türe ayrılır: instance (örnek) değişkenleri ve yerel (local) değişkenleri.

Instance değişkenleri, bir nesne örneği oluşturulduğunda oluşturulan değişkenlerdir ve
nesnenin özelliklerini temsil ederler. Instance değişkenleri,
sınıfın herhangi bir metodu içinde veya sınıf dışından erişilebilir.
Bu, instance değişkenlerinin diğer sınıflarda da kullanılabileceği anlamına gelir.

Örneğin, aşağıdaki kodda num1 instance değişkenidir ve MyClass sınıfından
 oluşturulan herhangi bir nesne tarafından kullanılabilir:

public class MyClass {
    int num1;
}
Asagidaki methoda static eklemeyince yukari kisimda add methodu yazinca uyari verdi.
sadece class'in ismini yazarsak ve nokta koyarsak
        //sadece static olanlari goruruz,
        //gorunur ve onu alabiliriz.
        //object ile baktigimizda static olmayanlari
        //class ile baktigimizda static olanlari goruruz.

Yerel değişkenler, bir metodun içinde tanımlanan ve
sadece o metot içinde kullanılabilen değişkenlerdir.
Yerel değişkenler, sadece tanımlandıkları metod içinde erişilebilirler ve
metot sona erdiğinde bellekten silinirler.

Örneğin, aşağıdaki kodda num2 ve letter yerel değişkenlerdir ve sadece add() metodunda kullanılabilirler:

public static void add() {
    int num2 = 6;
    char letter;
    System.out.println("Do addition");
}
Bu nedenle, yerel değişkenler sadece tanımlandıkları metod içinde erişilebilir
ve instance değişkenleri sınıfın herhangi bir metodu içinde veya sınıf dışından erişilebilir.

Instance değişkenleri, nesnenin özelliklerini temsil ederken,
yerel değişkenler sadece belirli bir metod içinde kullanılır.
Dolayısıyla, sınıfın farklı metotlarında kullanılması gereken değişkenler
instance değişkenleri olarak tanımlanmalıdır,
ancak sadece bir metot içinde kullanılacak olan değişkenler yerel değişkenler olarak tanımlanabilir.













 */




public class SelfStudy20 {



    /*
    public class MyClass{
int num1;
String name = “Ali”;
public static void main(String args){
 add();
 product(5);
}
public static void add(){
 num1++;
 int num2 = 6;
 char letter;
 System.out.println(“Do addition”);
}
public void product(int num3){
 name = “Veli”;
 num2++;
 System.out.println(num3 * num3);
}
}
Aşağıdakilerden hangileri doğrudur?
A) num1 ve name instance variable'dir.
B) num2 ve letter local variable'dir.
C) System.out.println(num1) ekrana hiçbirşey yazdırmaz
D) num2++; kodu Compile Time Error verir.
E) product(5); kodu Compile Time Error verir.


     */


























    /*
    Verilen Java kodunda, MyClass adında bir sınıf oluşturulmuştur.
    Sınıfın num1 adında bir instance variable'ı ve name adında bir String instance variable'ı vardır.
    Ayrıca, add() ve product() adında iki metod da tanımlanmıştır.

A) num1 ve name instance variable'dir.
Bu doğrudur. num1 ve name, MyClass sınıfının instance variable'larıdır ve
 sınıfın farklı metodları tarafından kullanılabilirler.

B) num2 ve letter local variable'dir.
Bu doğrudur. num2 ve letter, sadece add() metodunda tanımlanan local variable'lardır.
Bu nedenle, sadece add() metodunun kapsamı içinde erişilebilirler.

    C) System.out.println(num1) ekrana hiçbir şey yazdırmaz.
Bu yanlıştır. num1, MyClass sınıfının instance variable'ıdır ve
add() metodunun kapsamı içinde kullanılabilir. Eğer add() metodunun sonuna System.out.println(num1);
kodu eklenirse, num1'in değeri ekrana yazdırılır.
    D secenegi dogru: num2++; satırı bir derleme hatası (compile-time error) üretir,
    çünkü num2 değişkeni sadece add() metodu içinde tanımlanmıştır ve product() metodu içinde erişilemez.

Bu hata, "cannot find symbol" şeklinde bir hata mesajı olarak karşımıza çıkar,
çünkü Java derleyicisi num2 değişkenini tanımlanmamış bir sembol olarak görür.
eğer product() metodunda num2 değişkeni ilk olarak tanımlanırsa ve
değeri atandıktan sonra num2++ işlemi yapılırsa, bu durumda hata vermez.

Hata, num2 değişkeninin sadece add() metodu içinde tanımlanmış olması ve
product() metodu içinde tanımlanmamış olması nedeniyle oluşuyor.
Dolayısıyla, num2 değişkenine sadece add() metodunda erişilebilir ve
product() metodunda num2 değişkeni "undefined symbol" hatası verir.

Eğer product() metodunda num2 değişkeni de tanımlanırsa,
bu durumda hata vermez ve num2 değişkeni sadece product() metodunda erişilebilir olur.
E secenegi dogru: main() metodu static olarak tanımlandığı için, product() metodunu
 doğrudan çağırmak mümkün değildir.
Bu nedenle, product(5) satırı "Cannot make a static reference to the non-static method product(int)
from the type MyClass" gibi bir hata mesajı üretir.
Ayrıca, product() metodu içinde num2 değişkenine erişmeye çalıştığı için bir derleme hatası daha üretir.
Bu değişken add() metodunda tanımlanmış bir local variable olduğu için,
product() metodunun kapsamı içinde erişilemez.



     */
}
