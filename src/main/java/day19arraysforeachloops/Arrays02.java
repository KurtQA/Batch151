package day19arraysforeachloops;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s="Java is easy.Learn Java earn money";
        String words[]=s.split(" ");
        System.out.println(words.length);

        //sonuc [Java, is, easy.Learn, Java, earn, money]

        //ornek 2: Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
        //yukaridaki Strin s 'i alip ona gore bulalim
        //once tum nokta ve space lerden kurtulalim
        //o zaman harf disinda ne varsa silecegiz. Kalanlar ile kac harf oldugunu bulacagiz
        String letters []=s.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
        //length ekleyemedim. ornek yukarida sout icine letters.length yazmaliydim
        //yukarida da words.length yazmaliydim olmadi.

    }
}
