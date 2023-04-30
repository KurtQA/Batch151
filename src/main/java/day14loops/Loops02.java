package day14loops;

import java.util.Locale;

public class Loops02 {

    public static void main(String[] args) {

        //3'den 6'e kadar tum tamsayilari console'a yazdiran kodu yaziniz

        //1.Way:
        for(int i=3; i<7; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Way:
        int i=3;

        while(i<7){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz

        //1.Way:
        for(int k=21; k<181; k++){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }

        System.out.println();

        //2.Way:
        int k=21;

        while(k<181){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
            k++;
        }

        System.out.println();

        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
        String s = "miami";
        int m=0;

        while(m<s.length()){

            String ch = s.substring(m,m+1);

            if(m%2==0){
                System.out.print(ch.toUpperCase());
            }else{
                System.out.print(ch);
            }
            m++;//Bu kismi unutmayin yoksa "infinite loop" olusur. Yani; "sonsuz loop" olusur.
            // "sonsuz loop"lar application'in donmasina sebep olur.
        }

    }

}