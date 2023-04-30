package day31collections;

/*
    1) ArrayList ler eleman silme ve eleman eklemede basarisizdirlar
       o yuzden eleman silme ve ekleme islemlir coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
    2) LinkedListler index kullanmadiklarindan dolayi eleman silme ve eklemede re-index yapilamasina gerek yoktur.
       Bu da Linkedlistlerin eleman ekleme ve silmede cok basarili hale getirir.
       Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda Linklist kullanmak tavsiye edilir
    3) ArrayListlerde "search" islemi kolay yapilir cunku indexler adres gibidir.
    4) Linkedlistlerde search islemi zor yapilir cunku LinkedListler index kullanmmaz.
       index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir
       bu da cok fazla is demektir.
*/
import java.util.LinkedList;
public class LinkedList01 {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<>();
        s.add("Merve");
        s.add("Murat");
        s.add("Vildan");
        s.add("Fatih");
        s.add("Mustafa");
        s.add("Fatih");
        s.add(1, "Caner");
        System.out.println(s);//[Merve, Murat, Vildan, Fatih, Mustafa, Fatih]
        s.addFirst("Ahmet");
        System.out.println(s);//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih]
        s.addLast("Enver");
        System.out.println(s);//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]
//        s.remove(2);
//        System.out.println(s);
//        s.remove("Ahmet");
//        System.out.println(s);
//        s.removeFirstOccurrence("Fatih");
//        System.out.println(s);
//        s.removeLastOccurrence("Fatih");
//        System.out.println(s);
//        s.remove();
//        System.out.println(s);
        /*Retrieves, but does not remove, the head (first element) of this list.
            Returns:the head of this list, or null if this list is empty
        * */
        String r1 = s.peek();//copy + paste (ilk node u silmeden bize verir)
        System.out.println(r1);//Ahmet
        System.out.println(s);
        String r2 = s.poll();
        System.out.println(r2);//Ahmet      (cut + paste ilk node u silip verir)
        System.out.println(s);//[Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]
        /*Retrieves, but does not remove, the head (first element) of this list.
         Returns: the head of this list
            Throws: NoSuchElementException – if this list is empty
        * */
        String r3 = s.element();
        System.out.println(r3);//Merve ==>ilk elemani silmeden size verir (copy paste)
        System.out.println(s);//[Merve, Caner, Murat, Vildan, Fatih, Mustafa, Fatih, Enver]
        //poll() ile pop() methodlari ilk node u siler ve size verir
        //poll() list bos oldugunda size null verir, pop() ise "hata" verir
        String r4=s.pop();
        System.out.println(r4);
        System.out.println(s);
    }
}