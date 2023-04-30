package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {

   /*

   Javada farkli data type'lari arasinda islem yapiliyorsa
   sonuc buyuk olan data type'inin turunde olur
   Karsilastirma operatorlerinde sonuc hep boolean doner
   == esittir
   ! is not equal
   <==kucuk esittir
   >==buyuk esittir
   && and
   II or

   */
   public static void main(String[] args) {

       System.out.println(4*(5+2)/3);
       //sonucu 9 verdi cunku once parantez ici toplama islemini sonra carpma, sonra bolme yapti
       //sonuc kusuratli idi ancak Java integer bir sayida fazlaligi silince 9 verdi

       System.out.println(6*16/8);
       //hepsi oncelikli ise yani hem carpma hem bolme ayni zamanda olabilirse
       //bu durumda soldan saga calisacak
       //6*16=96/8=12

       System.out.println(4*(2+5)/3);
       double sonuc = 4*(2+5)/3;
       System.out.println("sonuc "+sonuc);
       //sonucu 9.0 olarak verdi cunku double kullandik

       double sonuc2=4.0*(2+5)/3;
       System.out.println("sonuc2 "+sonuc2);
       //bu defa sayilardan birini double yaptik 4.0, sonucu 9.3333333333 gibi bir sayi verdi
       //double bir sayi integer bir sayi ile carptik. Eger farkli ve buyuk olan bir sayi ile
       //farkli kucuk olan sayiyi carparsak yani double sayi ile int sayiyi carparsak
       //Java buyuk sayilan double'a gore islemi yapar
       //bu nedenle sonuc kusuratli bir sayi cikti

       System.out.println(4*(1+5)/3);

       int sayi1 = 5;
       int sayi2 = 2;
       double sayi3 = 2; //java tam sayi 2'yi 2.0 olarak gorur
       System.out.println(sayi1/sayi2);
       //normalde 2,5 ancak int/int olacagi icin tamsayi kismi alinir virgulden sonrasi atilir
       //bu nedenle sonucu 2 verir

       System.out.println(sayi1+sayi3/sayi2); //once bolme islemi yapti ve double sayi verdi 6.0
       boolean first =2<4;
       boolean second =2+6 !=8;
       boolean third = 2+3*5<20;
       System.out.println("first = " +first);//t
       System.out.println("second = " +second);//f
       System.out.println("third = " +third);//true cikar
       System.out.println(first && second);// false cikar
       System.out.println(first || second || third);//true



   }







}
