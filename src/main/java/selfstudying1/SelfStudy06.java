package selfstudying1;


import java.util.Arrays;

public class SelfStudy06 {


    public static void main(String[] args) {

        //Tamsayılardan oluşan bir arrayde ortadaki elemanı bulunuz.
        //Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
        //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 10

        int[] num = new int[]{12, 5, 8, 13};
        Arrays.sort(num);
        if (num.length % 2 != 0) {
            int numyarisi = num.length / 2;
            System.out.println((num[numyarisi]));
        } else {
            int numyarisi1=num.length/2;
            int numyarisi2=numyarisi1-1;
            System.out.println((num[numyarisi1]+num[numyarisi2])/2);


        }
    }
}


