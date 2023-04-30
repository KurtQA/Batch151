package day_18_practice;

/*
Verilen bir array'den tekrar eden elemanları silip unique elemanlardan olusan bir array haline
donusturen method olusturun.
 int arr[]={1,2,2,3,4,4,5};//2 ve 4'den iki tane var. Bu array'i unique hale getirecegiz.

Bizden metod olusturmamiz istenmis. benzersizYap metodu olusturduk ve icine argument olarak verilen
array'in ismini koyduk. benzersiz(arr);
Elemanlarin unique olmasi istendiginden, unique elemanlari 'Set' depoladigindan yeni bir Set olusturduk.

Set<Integer> tekrarsizSet=new TreeSet<>();
Array'in elemanlarini Set'e aktaracagiz. add metodu kullanacagiz.Setlerde index olmadigindan
for loop kullanamayiz.For looplarda index yapisi vardir. Ancak for each loop kullanabiliriz.
Cunku for each loop index olmamasina uygundur.

for(int each:arr){
tekrarsiz.add(each); Bu sekilde arraydeki tum elamanlari Set'e ekledik. Set unique olmayanlari icermeyecek
ekrana yazdirma yapinca, tekrarli elemanlari da aktardigimiz halde tum elemanlari tekrarsiz olarak
Set icinde gorebildik. Ekranda [1,2,3,4,5] gorduk.

Ikinci bir array olusturduk ve bunu tekrarsiz elemanlari barindiran Set'in uzunlugu kadar yaptik.
Bu sekilde unique elemanlari yeni olusturdugumuz yeni array icine aktaracagiz.

 int arr2[]=new int[tekrarsizSet.size()];

yine index yapisi olmadigindan for each loop kullandik.

tekrarsizSet'deki herbir elemani Integer each'e assign ettik ve sonra bu elemanlari yeni array olan arr2[]'
ine aktardik. Bu aktarmayi yaparken bir index yapisi olusturmamiz gerekti. Bu nedenle for each loop disinda
ust tarafta int idx=0; yazdik. Ilk elamani 0 index'i ile baslatmis olduk. For each loop son kisminda
bu index'i idx'i bir artirmasini istedik.

for(Integer each:tekrarsizSet) {
arr2[idx]=each;
idx++;
}
sout icine Arrays.toString(arr2)) yazdik ve alt kismina arr'yi return etmesini istedik;
arr=arr2; yazarak arr2'yi arr'ye assign ederek arr2 icindeki tum tekrarsiz elemanlari arr icine aktarmis olduk.
return arr; ile bize arr return edildi.
Kodumuzu main metod icinde sout ile yazdirinca ekranda unique elamanlari gorduk.



 */

public class C04_Set {

}
