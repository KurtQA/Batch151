package day07practice;

import java.util.Scanner;

public class C02_DoWhile {
    public static void main(String[] args) {
     /*
    Bir top belirli yükseklikten atılmaktadır.(Scanner ile kullanıcıdan yüksekliği alınız)
    Atıldıktan sonra, atıldığı yüksekliğin 1/2 si kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi TOPLAM YOLU ve YERE VURMA SAYISINI bulan do while code blogu create ediniz.
    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen topun ulastigi yuksekligi giriniz");
           double yukseklik=scan.nextDouble();
           double toplamYol=0;//toplami istedigi icin
           int vurmaSayisi=0;//vurma sayisini da istediginden ve buna int uygun olacagindan
        //yukseklik bir metre uzerinde ise do while dongusu devam etsin, degilse do while loop kirilir.
        //buna gore sartimizi olusturalim.
        //biz topu once yukaridan birakacagiz ondan sonra kac tane seker diye kontrol edecegiz
        //bu sebeple do while loop cozumde daha uygun.

           do{
               toplamYol+=yukseklik;//topu asagi birakirken aldigi yol
               vurmaSayisi++;//top yere carpti
               toplamYol+=yukseklik*0.5;//yukseklik toplam yola assign edildi. Top yere carptiktan sonra
               //yukariya cikarkenki yukseklik yani aldigi yol. Bu onceki yuksekligin yarisi oldugu icin 0.5 ile
               //yuksekligi carptik ve toplamYol'u guncelledik

               yukseklik=yukseklik*0.5;//eski yuksekligin yarisi kadar yukseklik olacagindan, yuksekligi guncelledik

           }while (yukseklik>=1);
          toplamYol+=yukseklik;//bu kisim bir metre altinda olan yukseklik durumunda alinan yolu eklemek icin
          vurmaSayisi++;//bir metre altinda kalinca son yere vurus olur diye bir arttirma yaptik
        System.out.println("Yere vurma sayisi: "+ vurmaSayisi);
        System.out.println("Toplam alinan yol: "+ toplamYol);
    }
//Lutfen topun ulastigi yuksekligi giriniz
//4
//Yere vurma sayisi: 4
//Toplam alinan yol: 11.0

}
