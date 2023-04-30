package day31collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {


    public static void main(String[] args) {

        Queue<String> wareHouse=new LinkedList<>();//Queue yerine LinkedLIst yazdik bu kisma
        //cunku elemanlari verilen siraya gore eklemesini istedik

        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Bread");
        wareHouse.add("Egg");
        wareHouse.add("Cheese");
        System.out.println(wareHouse);//[Milk, Meat, Bread, Egg, Cheese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Bread, Egg, Cheese] Ilk eleman olan Milk silindi


        System.out.println(wareHouse.poll());//Meat
        System.out.println(wareHouse);//[Bread, Egg, Cheese]

        wareHouse.clear();
        System.out.println(wareHouse.poll());//null clear ile elamanlari silmistik null verdi
        System.out.println(wareHouse.remove());//eleman yok, remove hata verdi

        //offer() methodu capasite var mi yok mu ona gore calisiyor


    }
}
