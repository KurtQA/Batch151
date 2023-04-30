package day16arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};

        String el = "R";

        //1.Way:
        int counter = 0;

        for (String w : names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }
        if (counter > 0) {
            System.out.println("Array has " + el);
        } else {
            System.out.println("Array does not have " + el);
        }

        //2.Way: binarySearch() method hizli arama yapar
        Arrays.sort(names);

        //1)binarySearch() methodunu sort() kullanmadan kullanmayiniz cunku binarySearch() mantigi sirali elemanlar icin gecerlidir
        //2)binarySearch() methodu var olan elemanlar icin size o elemanin index'ini verir.
        //3)binarySearch() methodundan aldiginiz index 0 veya 0'dan buyukse bu o eleman array'de var demektir.
        //4)binarySearch() methodu olmayan elemanlar icin negatif tamsayi degeri verir.
        //  "-" isaretinin anlami o eleman yok demektir.
        //  "sayi" ise o eleman olsaydi kacinci eleman olurdu demektir.
        int result = Arrays.binarySearch(names, el);
        System.out.println(result);

        if (result < 0) {
            System.out.println("Array does not have " + el);
        } else {
            System.out.println("Array has " + el);
        }
    }
}