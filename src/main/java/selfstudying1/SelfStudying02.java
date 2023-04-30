package selfstudying1;

public class SelfStudying02 {

    public static void main(String[] args) {


        /*

        int rows = 4;  // toplam satır sayısı
        for(Integer i=1; i<=rows; i++){  // her bir satırı yazdırmak için döngü
        String s = "";  // her bir satırın içeriği için boş bir dize oluşturun
        for(Integer k=1; k<=i; k++){  // A harflerini birleştirmek için döngü
        s = s + "A ";  // A harflerini birleştirin ve boşluk bırakın
         }
        System.out.println(s);  // satırı yazdırın
        }
         */

        int rows = 4;
        int i = 1;
        while (i <= rows) {
            String s = "";
            for (int k = 1; k <= i; k++) {
                s = s + "A ";
            }
            System.out.println(s);
            i++;
    }
        //Aşağıdaki çarpım tablosunu oluşturmak için kod yazınız.
        //3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
        int num = 3;
        int im=1;
        do{
            System.out.println(num + "x" + im + "=" + num*im);
            im++;
        }while(im<11);

        //20'den 3'e kadar olan tek tamsayıları aynı satırda ardışık olacak şekilde aralarında boşluk
        //bırakarak yazdırmak için gereken kodu yazınız.
        String ss="";
        for(int y=20;y>2;y--){
            if (y%2!=0){
                ss=ss+y + " ";
            }

        }
        System.out.println(ss);//19 17 15 13 11 9 7 5 3



    }
}
