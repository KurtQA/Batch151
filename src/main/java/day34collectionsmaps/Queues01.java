package day34collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {

        Queue<String > wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Chese");
        System.out.println(wareHouse);//[Milk, Meat, Egg, Bread, Chese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]


        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]

        wareHouse.clear();

        // System.out.println(wareHouse.element());Exception
        System.out.println(wareHouse.peek());//null
    }
}