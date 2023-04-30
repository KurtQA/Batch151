package selfstudying1;


import java.util.Arrays;

public class SelfStudy07 {


    public static void main(String[] args) {

        //Verilen bir String'deki sesli harf sayısını bulunuz.
        String s = "Apex is an object oriented programming language";
        String sesli[] = s.toLowerCase().split("");
        int sum = 0;
        for (String w : sesli) {
            switch (w) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    sum = sum + 1;
            }
        }
        System.out.println(sum);

        //İlk ve son karakterleri aynı olan array öğelerini bulmak için kod yazınız.
        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        String k = "";
//        for (Integer i = 0; i < arr.length; i++) {
//            String ilk = arr[i].substring(0, 1);
//            String last = arr[i].substring(arr[i].length() - 1);
//            if (ilk.equals(last)) {
//                System.out.println(arr[i]);

        for(String w: arr){

            String ilk = w.substring(0, 1);
            String last = w.substring(w.length() - 1);
            if (ilk.equals(last)) {
                System.out.println(w);
            }


        }
    }
}

