package mentoring01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {


        /*
        Hackerlar bazı harfleri sayılara cevirerek yazısabiliyorlar. Genellikle cevirdikleri harfler su sekilde:

        s -> 5
        a -> 4
        e -> 3
        i -> 1
        o -> 0

        ornegin:
         java ile hersey guzel
         j4v4 1l3 h3r53y guz3l

        Kullanıcıdan bir cumle alınız, 'hacker'ların konusma diline cevireniz.
        Java programlama dilinde, kullanıcıdan bir cümle alarak
        bu cümleyi hackerların konuşma diline çevirmek için aşağıdaki adımlar izlenebilir:

       Kullanıcıdan bir cümle alınacak ve bir String'e assign edecegiz.
       Cümledeki her bir harfi yeni bir array olusturarak o array'e ekleyecegiz. Yeni array olacagi icin uzunlugunu
       bastan belirtmeliyiz. Uzunluk verilen cumlenin length'i kadar olacak.

        Yeni array'e tek tek harfleri eklemek icin for loop kullanacagiz ve tek tek karakterleri gormek icin
       substring kullanacagiz. Substring ile buldugumuz karakterleri yeni array'imizin ismi yazilarak ona assign
       edecegiz.

       Bos bir sout body disina yazacagiz, ekranda bosluk olsun diye. Daha sonra ikinci for loop
       olusturacagiz. ikinci for loopta dongu yeni arrayimizin lengthi kadar olacak
       Eğer harf 's', 'a', 'e', 'i' veya 'o' ise, karşılık gelen sayıya çevrilir.Bunu ikinci for loop icinde
       bir if statement ile yapacagiz ve daha sonra sout ile yeni array ismimizi yazarak sonucu gorecegiz.




        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
         String cumle= scan.nextLine();

        String arr[] = new String[cumle.length()];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = cumle.substring(i, i + 1);
        }









    }
}
