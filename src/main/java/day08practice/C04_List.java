package day08practice;

import java.util.ArrayList;
import java.util.List;

public class C04_List {

    public static void main(String[] args) {

/*
          İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)


          String[] arr = {"John","Brad","Angel","Sofia","Emily"};

          String[] brr = {"sofia","brad","grace","emily","hazel"};

          Output : [Brad,Sofia,Emily]

         */
  //1.Yol chatGPT den

//        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};
//        String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};
//
//        List<String> commonElements = new ArrayList<>();
//
//        // Ortak elemanları bulur ve list'e ekler
//        for (String s1 : arr) {
//            for (String s2 : brr) {
//                if (s1.equalsIgnoreCase(s2)) {
//                    commonElements.add(s1);
//                    break;
//                }
//            }
//        }
//
//        // Ortak elemanları yazdırır
//        System.out.println(commonElements);

        //2.Yol


        String[] arr = {"John", "Brad", "Angel", "Sofia", "Emily"};
        String[] brr = {"sofia", "brad", "grace", "emily", "hazel"};
        List<String> list=new ArrayList<>();

        for (String each1:arr) {
            for (String each2:brr) {
                if (each1.equalsIgnoreCase(each2)){
                    list.add(each1);
                }
            }
        }
        System.out.println("ortak elamanlar: "+list);//ortak elamanlar: [Brad, Sofia, Emily]
    }
}









