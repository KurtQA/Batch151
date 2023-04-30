package day34collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {

        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);//[Egg, Milk, Meat, Orange, Tomatoes]

        /*Queue bir interface dir, bu yuzden constructor i yoktur, dolayisiyla object olustururken new keywordunden sonra kullanilamaz
        Datatype "Queue" olan bir object olusturmak icin new keywordden sonra
            a)Linkedlist veye b) PriorityQueue classlari kullanilabilir

         Queue olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi belirleyeceğiniz kurala gore siralama hakkiniz olur.
        */

        // Deque ==> Double ended queue ==> iki uclu kuyruk
        // Deque'daki add(), get(), peek, poll(), remove() methodlari first-last seklinde iki uclu olarak bulunur
        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);//[Milk, Meat, Egg, Orange, Tomatoes]



    }
}