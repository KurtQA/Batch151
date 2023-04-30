package day31collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue02 {

    public static void main(String[] args) {

        Queue<String> line=new PriorityQueue<>();//Burada LinkedListed kullanmadik. Bankalar icin LinkedListed
        //uygundur. Cunku once gelen once sira alir.
        //PriorityQueue ise belirlenen oncelige gore sira verilirse uygundur.
        //Oncelik durumu, uzunluga, ismin son harfine gore belirlenebilir. Java kendi belirledigi kurala gore dizer.

        line.add("Milk");
        line.add("Meat");
        line.add("Milk");
        line.add("Egg");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);//[Egg, Meat, Milk, Milk, Orange, Tomatoes]

        Deque<String>  d =new LinkedList<>(); //Deque iki uclu/ kullaninca en sondaki elemani alabilirsin
        d.add("Milk");
        d.add("Meat");
        d.add("Milk");
        d.add("Egg");
        d.add("Orange");
        d.add("Tomatoes");
        //Deque'daki add(), get(), peek(), poll() remove() methodlari
        // first-last seklinde iki uclu olarak bulunur
    }
}
