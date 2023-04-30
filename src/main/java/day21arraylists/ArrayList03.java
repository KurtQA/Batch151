package day21arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

    public static void main(String[] args) {


        /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */

        List<String> myList= new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");

        Scanner input =new Scanner(System.in);
        System.out.println("Please enter a letter");
        String letter =input.next().substring(0,1);

        if(myList.contains(letter)) {
            myList.set(myList.indexOf(letter), "Buldum!");
        }else{
            myList.add(letter);
        }
        System.out.println(myList);//H harfi girdik sonuc: [A, Buldum!, J]
        //Z girince Z'yi de listeye ekledi [A,H,J,Z] cunku yoksa ekle dedigimiz bir kod hazirlamistik
        //a girince listeye ekledi. Biz String letter=input.next().toUpperCase().substring(0,1);
        //yazsaydik a harfini kucuk girseydik dahi sonuc buldum seklinde olurdu ayrica eklemezdi
        //nicin sonucta harf yerine buldum yazdi, cunku set methodu ile harfi buldum ile degistirdik
        //set methodu myList.indexOf() bu kisma girdigi indexteki letter'i buluyor. letteri yukarida
        //substring ile 0. indexi bul diye duzenlemistik. myList.indexOf(letter) aslinda 0. index olmus oldu
        //Scanner sonrasi yazdigimiz tum kodu do while {} icine tasidik ve son kisimda while(true); ekledik.
        //Yani sart dogru oldukca calissin istedik
        //do olusturunca do uzerine bir int counter=0; yazdik, sonra int can=3; yazdik
        //3 hakkimiz olsun diye. 3 ile sinirladik sonsuz dongu olmasin diye. Istedigimiz zaman loop kirilsin
        //diye buna yonelik ekleme yapilmis oldu.
        // ve sonra do icinde en basa gelip
        //if (counter == can) { yazdik. ve altina break; ekledik.

        }
    }
