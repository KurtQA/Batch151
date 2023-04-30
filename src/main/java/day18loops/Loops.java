package day18loops;

public class Loops {

    public static void main(String[] args) {
        
        
        //Verilen bir String'de kucuk harfleri console/a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        
        String s= "Pwd12?Ab";
        for (int i = 0; i <s.length() ; i++) {
            char ch=s.charAt(i);
            if(ch>='a' && ch<='z'){
                continue;
            }else{
                System.out.println(ch);
            }

        }
        //sonuc: P12?A Bize kucuk harfleri ayiklayarak sonucu verdi
        //break ile continue arasindaki fark nedir? Belli elemanlari ignore etmek icin continue kullandik
        //continue dongude gorur gormez iteration'a gidiyor.
        //break switch'in disina cikmak icin loopu kirmak icin kullanilir.
        //continue ise loop calisirken bazi elemanlari isleme sokmamak icin kullanilir.

        //Bir interview sorusu
        //Bir String'i ters ceviren kodu yaziniz.
        //"Java" ==> "avaJ"


        //1.Yol
        String t="Java";
        String ters= "";//bunu alacagimiz datalari icine koymak icin hazirladik
        //iki konteyner yapmis olduk. Birincisinde Java var, digeri bos icinde birsey yok ""
        //Once gelip Java;nin sonundaki a 'yi alacagiz ve bos kaba koyacagiz ve devam edince sonuc avaJ verecek
        for(int i=t.length()-1; i>=0; i--){
           ters=ters+ t.substring(i,i+1);
        }
        System.out.println(t);
        System.out.println(ters);

      //hem Java hem avaj sonucunu verdi
        //int=t.length()-1 yazdik. Cunku Java 3 index'e sahip . -1 ile dogrudan sondan baslayip, i'ye 3'u verdik
        //sondan 3'u kapasayacak kadar gitmis olacagiz. i>=0 dedik cunku index 0'dan baslar
        //t.subsitring(i,i+1) bize hep bir sonra geldigimiz index'i verir bir sonrakini dahil etmez
        //her aldigimiz index'i ters sepetine koyuyoruz. Basta a, sonraki iteration da av, sonra ava
        //daha sonra avaJ oldu ters sepeti icinde. Basta ters sepetimiz bostu.String de yeni sepetimiz="" yapiliyor
        //int toplama da int sum =0, carpma int multiple=1
        //calistirirken sout icine ters ismini yazdik, cunku aldigimiz datalari onun icine koymustuk.

        //2.Yol
        String u="Java";
        String ters2= "";
        for(int i=u.length()-1; i>=0; i--){
            ters2=ters2+ u.charAt(i);
        }
        System.out.println(u);
        System.out.println(ters2);
        //2. yolda substring yerine charAt() methodu kullandik. burada char veriyor ve char ile String
        //concatination oluyor. Substring ise String veriyor bize.

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz.
        //578==> 5+7+8=20
        //578%10==>8
        //578/10==>57.8
        //57%10==>7
        //57/10==>5.7
        //5%10==>5
        //5/10==>0.5 ancak Java bunu 0 olarak alacak

        int num=578;

        int sum=0;

        for(int i=0;i>0; i=i/10){
            sum=sum+i%10;
        }
        System.out.println(sum);
      //eger sum'in her iteration da degistigini gormek istersek, sout'u yukaridaki parantez icine cekip
        //calistiririz. Calistirinca 8 15 20 verdi
        //-578 yazsaydik num icin, sonucta 0 verirdi. for loop da i>0 demistik bu nedenle loop hic calismayacak
        //loop'u dinamic yapmak icin, Math.abs() bu methodu kullaniriz. -578 olsaydi +578'e donerdi.
        //ve loop calisir. num=Math.abs(num) yaptigimizda calisir. Num'i bu haliyle +'ya cevirdi sayiyi


            }
        }



