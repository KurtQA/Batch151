package day_17_practice;

/*
dosya.txt olusturduk ayni package icinde new kismindan file'a geldik ve file kismini secerek olusturduk.
Intellij icinde sirali haldeki package'ler altinda
bizim dosya.txt'i olusturdugumuz package kismina gelip, dosya.txt uzerine gelip tiklayinca basta cikan
ekrandan Copy path reference kismini seciyoruz ve oradan Path from Content Root kismini secince oradaki
src/main/java...seklindeki yaziyi kopyalamis oluruz ve onu alip C02 classimiza getiririz onu paste
yapinca kizardigini gorunce onu String bir variable olusturarak ona assign ettik. Biz Path form Content Root
vasitasiyla aldigimiz yaziyi bilerek degistirirsek, java bu dosyayi bulamaz. Bulamayacagini bildigimizden
try icinde kodu calistiramayacagini ve catch kismina gelecegini bilecegimizden catch
kismina e.printStackTrace(); yazarak bize exception'in ne oldugunu gostermesini ve kodu durdurmamasini
isteyebiliriz. Bu durumda ekranda exception ve devamindaki satirlar birer uyari gibi gorunseler de son kisimda
exit 0 geciyorsa bu exception firlatma sayilmaz. cunku kodu durdurmamis oluyor.
dosya.txt dosyasinin path root ile bulunmasi icin FileInputStream classindan bir object olusturduk.
FileInputStream fis=new FileInputStream(dosyaYolu) parametre olarak String variable
ismini koyduk. Cunku bu variable icinde text'imize ait bir yazi var. O text ile islem yapilacak.
Bu islemlere ragmen Java bu dosyayi bulamazsa diye object'imizin constructor kismi kizardi.

Boyle olunce biz dilersek mai metod yanina throws keywordu ile birlikte Exception'i ekleyebiliriz.
Biz bu yolu degil main metod'un altina try catch blogu icinde throw keywordu ile exception'i yazmak istedik.
Boylece Javaya bir exception firlatma durumu olursa bunu atabilecegini soylemis olduk.

Object'imizi try blogu icine aldiktan sonra bir while loop olusturduk. Oncesinde int k=0; olusturduk.
while icine dosyami oku -1'e esit degilse k'ya assign et diye bir sart yazdik. -1'e esit ise o dosya icinde
bir sey yazmadigi anlamina gelir. while loop icinde olusturdugumuz sout icine k'yi yerlestirirken oncesinde
bir parantez icine char yazdik. Cunku dosya icindeki harfler tek tek okunacak. char ile harfler tek tek okuna
bilecek.
Ancak burada read yazan kisimda java dosyayi okuyamazsam
endisesiyle kizarma yapti. Kizaran kisma geldik ve ikinci bir catch blogu olusturduk

catch (FileNotFoundException e){//child exception
throw new RuntimeException(e);// bu kisim yerine e.printStackTrace(); yazarsak exception varsa yaz ama yoluna
devam et demis oluruz.
} catch (IOException e) {//parent exception
throw new RuntimeException(e);//bu kisim yerine e.printStackTrace(); yazinca kodu durdurmuyor exception olsa da
}
read kismi kizarmasaydi bir catch ile yolumuza devam edecektik. Ilk catch javanin dosyayi bulamamasi riskine
karsi olusturuldu. Ikinci catch blogu ise dosyayi okuyamama riskine karsi olusturuldu.

catch blogu icine e.printStackTrace(); yazarak problem olunca exception yazarsa yazdirsin exception'i ancak
kodu durdurmasin yoluna devam etsin demis oluruz.

iki catchden sadece birini parent exception ile kullanarak da sorunu handle edebilirdik. Parent olan
IOException yazarak halledebilirdik. Daha detayli bir sekilde inceleme yapar.

 */

public class C02 {
    // Bir tane txt dosyası olusturunuz.
// txt dosyasının icerisine cumleler yazınız
// Olusturdugunuz txt dosyasına ulasınız.
// icerisindeki cumleleri yazdırınız



    public static void main(String[] args) {
        String dosyaYolu="src/main/java/day_17_practice/dosya.txt";
    }
}
