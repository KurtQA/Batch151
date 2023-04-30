package day_18_practice;
/*

    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız. Degue'de index yapisi yoktur ve bu nedenle bunlarda
    for loop kullanamayiz, ancak Iterator kullanabiliriz. Iterator kullanirsak collection elemanlari
    icinde gezinebiliriz.

    Soruda bizden bir Deque olusturmamiz istendiginden yeni bir Deque olusturduk. Deque bir interface'dir.
    Dolayisiyla Deque'in override edilmesi gerektiginden biz new sonrasi dogrudan Deque yazmayiz, onun
    yerine childlardan LinkedList'i sectik ve parantez icinde elemanlari eklerken list'e cevirdik.

    Deque<Integer> dq=new LinkedList<>(Arrays.asList(1,8,3,6,7));
    sout icine dq yazinca elemanlarini ekranda gorduk.

    Deque'de index yapisi olmayinca for loop yerine Iterator kullanacagiz.

  Bunun icin Iterator object'i olusturduk;
  Iterator itr=dq.iterator(); Boyle yaptigimizda Deque'imizin elemanlari basina Iterator geldi.
  ->I'i bir Iterator gibi dusunelim. I 1, 8, 3, 6, 7 elemanlarin en basina one geldi.

  daha sonra while ile sartimizi yazdik. Sayilari bir sonraki eleman oldugu surece yani true verdikce
  kontrol etme devam edecek. next() ile eleman oldugunu gordukten true verdikten sonra bir sonraki
  elamana gelecek. Biz itr.next()'i Object sayiya assign ettik. next() ile gelen her sayi Object sayiya
  assign edilmis olacak.
  Sonraki asamada if statement kullandik. If icnde (Integer)sayi>5) yazdik. Boylece 5'ten buyuk sayilari
  gorunce devaminda sout ile yazdirilmasini istedik. Kodu calistirinca ekranda 5'ten buyuk sayilari gorduk.








 */

import java.util.Arrays;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class C03_Iterator {

    public static void main(String[] args) {

    /*
    Bir Deque olusturunuz icerisine int elemanlar ekleyiniz.
    5'den buyuk elemanları iterator ile yazdırınız

     */

        Deque<Integer> dq = new LinkedList<>(Arrays.asList(1,8,3,6,7));
        System.out.println(dq);


        Iterator itr = dq.iterator();


        while (itr.hasNext()){


            Object sayi =itr.next();


            if((Integer)sayi>5){
                System.out.print(sayi + " ");
            }




        }



    }


}

