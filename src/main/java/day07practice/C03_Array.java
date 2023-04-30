package day07practice;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Array {

    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e assign ediniz. Olusturdugunuz array'i yazdırınız

        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız

        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan=new Scanner(System.in);
        int arr[]=new int[4];


        for (int i = 0; i < 4; i++) {//kullanicidan 4 rakam alacagimiz icin 0'dan 4'e kadar for dongusune aldik

            System.out.println("Lutfen bir rakam giriniz");
            int rakam = scan.nextInt();
            arr[i]=rakam;//kullanicidan aldigimiz her rakami sirasi ile
            // array'in bir sonraki indexine assign ettik.
        }
        System.out.println(Arrays.toString(arr));
        //Lutfen bir rakam giriniz
        //2
        //Lutfen bir rakam giriniz
        //3
        //Lutfen bir rakam giriniz
        //4
        //[1, 2, 3, 4]

        //bundan sonra elemanlarin toplami ve ortalamasini bulmaliyiz
        double toplam=0;

        for (int each:arr) {//arraydeki herbir elamani aldik ve asagida toplam konteynirina assign ediyoruz.
            toplam=toplam+each;//toplami bu yolla buluruz
        }
        //toplam sonrasi ortalama bulunacak
        double ortalama=toplam/arr.length;//arraydeki elemanlarin toplami bolu arraydeki elemanlarin sayisi dedik
        System.out.println(ortalama);//2.5 ([1,2,3,4] array'ine gore sonuc 2.5)

        for(int each:arr){
            if (each>ortalama){
                System.out.println(each + " ");// 3 4(ortalamadan daha buyuk olan elemanlari yazdi)
            }
        }
        //Burada bir for loop bir for each loop kullanildi. Toplam ve ortalama for loop ile, ortalamadan daha
        //buyuk elemanlari bulmak icin for each loop kullanildi.
    }
}
