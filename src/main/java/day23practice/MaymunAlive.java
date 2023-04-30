package day23practice;

public class MaymunAlive {
    /* INTERWIEW SORUSU


        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

*/
    public static void main(String[] args) {

        int numberOfBananas= 165;
        int survivalDays = 1;
        boolean monkeyAlive =true;

        do {
            numberOfBananas-=4;//Toplam muz sayisindan her gun 4 muz eksilir
            System.out.println("Kalan Muz Sayisi "+numberOfBananas);
            survivalDays++;

            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("Bugun "+survivalDays+ ". gun; Yeterli muz kalmadi.Maymun Rahmetli.Rest in Peace");
            }else {
                System.out.println("Bugun " + survivalDays + ". gun; Maymun hala yasiyor");
            }//bu olmadan da Java calisir
        }while (monkeyAlive);


    }//main
}