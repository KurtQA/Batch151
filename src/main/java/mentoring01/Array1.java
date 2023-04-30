package mentoring01;

import java.util.ArrayList;
import java.util.List;

public class Array1 {


    public static void main(String[] args) {
        /*
          İki Array'de ortak bulunan elemanlari bir list'e ekleyiniz ve list'i yazdırınız.



         String[] arr = {"John","Brad","Angel","Sofia","Emily"};

          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]
          Bu soruyu çözmek için öncelikle iki adet String tipinde array'e ihtiyacımız var.
          İlk array "arr" ve ikinci array "brr" olarak adlandırılmış.
          Amacımız bu iki array arasındaki ortak elemanları bulmak ve yeni bir listeye eklemektir.

          Adım 1:
          Yeni bir ArrayList oluştur.


          Adım 2:
          İlk döngüde, "arr" array'i üzerinde gezineceğiz ve
          her elemanı "brr" array'indeki tüm elemanlarla karşılaştıracağız.
          Iki donguyu for each kullanarak saglayacagiz. Ilk for each ile arr'deki elamanlari kontrol edecegiz.
          Bu kontrolu yaparken yeni bir String'e tek tek elemanlari assign edecegiz
          ve ikinci for each'i ilk for each'in body'si icine yazacagiz.
          Ikinci for each brr array'i icin yapilacak. brr elemanlari baska bir String'e konulacak.
          Daha sonra ortak elemanlari bulmasi ve yazdirabilmesi icin bir if statement duzenleyecegiz.
          Ortak elemanlari olusturdugumuz yeni array'e eklemesi icin add methodu kullanacagiz. methodun icine
          if statement da kullandigimiz bir String'in ismini yazacagiz. Ortak elemanlari yeni array'e ekleyince
          islemi birakmasini isteyecegiz. Sout dis for each body'sinin en disina yazilacak ve yeni array
          ismi ile calistirilac


*/
        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};

        String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};

        List<String> newArr = new ArrayList<>();

        for (String w:arr) {
            for (String k:brr) {
             if (w.equalsIgnoreCase(k)){
               newArr.add(w);

             }
        }
            }
        System.out.println("Ortak elemanlar: " +newArr);

        }


    }
