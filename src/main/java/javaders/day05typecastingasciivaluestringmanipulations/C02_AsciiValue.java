package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {

    public static void main(String[] args) {

        /*
        Javada char data type'i matematiksel islemlerde kullanirsaniz, ascii table'daki sayisal degerleri
        alir.

        Numeric data typelari : byte, short, int,long, float, double
        char karakteri hem sayisal deger barindirir hem de resim karakteri barindirir
        boolean ise numeric olmayan data type'dir
        String bir data ile int datayi araya + koyarsaniz string dataya cevirme yapar
        ekranda ornek 0 + gorunur, ama islem yapmasini istedigimizi parantez icine koyarsak
        sonuc verir
         */


    // 'A' karakterinin Ascii degerini hesaplatan kodu yaziniz


    int asciiA = 'A';
        System.out.println(asciiA);//65 veriyor ascii deger olarak
    int asciia = 'a';
        System.out.println("ascia = "+asciia);//97 veriyor
     int asciiUnlem='!';
        System.out.println("asciiUnlem = "+ asciiUnlem);//33 veriyor
     int asciiSpace = ' ' ;
        System.out.println("asciiSpace = "+asciiSpace);//32 veriyor
        //char konteyneri icine sadece bir bosluk birakabiliriz
        int asciiSembol='*';
        System.out.println("asciiSembol ="+asciiSembol);//42
        //bosluk ' ' bir harf, bir sayi ya da bir sembol char icine konulabiliyor
        //bir harf ya da karakterin sayi degerini almak icin char konteynerina ' ' koyariz

        //149.9999TL *2
        int deger=20;
        char smbl='$';
        System.out.println(deger+smbl);//burada 20 ile $'in degeri toplandi  56'yi verdi


        int deger2=0;
        char smbl2='+';
        System.out.println("deger2+smbl2 = "+(deger2+smbl2));
        //string ve char birlesince string oldu
        //parantez icine alinca 0'i topluyor. Parantez olunca 0 ile '+' nin ascii degerini topladi

        String name = "Sezen";
        int number = 998;
        System.out.println(name+number);//Sezen998 gorduk
        String isim= "100";
        int number5= 998;
        System.out.println(isim+number5);//100'u Stringte resim gibi aldi ve 100998 verdi. Yanyana yazdirdi
        String str1="Java";
        String str2= "Guzel";
        int sayi1=5;
        System.out.println(str1+str2+sayi1);//JavaGuzel5 verdi
        String str="Java";
        char ch3='G';
        int sayi7=5;
        System.out.println(str+ch3+sayi7);//JavaG5 verdi
        System.out.println(str+(ch3+sayi7));//parantez icine aldik, ascii degerini aldi

        int asciiG='G';
        System.out.println("asciiG " +asciiG);//G harfinin ascii degeri 71
        //String ile char arasinda + varsa String chari kendisine cevirir sonuc JavaG verdi
        //String olan Java ile char olan G'yi JavaG olarak verdi. JavaG artik bir Stringtir
        String sayiStr1="123";
        String sayiStr2="45";
        System.out.println(sayiStr1+sayiStr2);//12345 verdi bunu resim gibi alip yazdirdi

        char rakam1 ='1';
        System.out.println("rakam1 ="+rakam1);
        char rakam2 ='2';
        System.out.println("rakam2 ="+rakam2);
        char rakam3 ='3';
        System.out.println("rakam3 ="+rakam3);
        char rakam4 ='4';
        System.out.println("rakam4 ="+rakam4);
        System.out.println("rakam1+rakam2+rakam3+rakam4 ="+rakam1+rakam2+rakam3+rakam4);//1234 Ascii
        //"rakam1+rakam2+rakam3+rakam4 =" bu kisim String
        //rakam1+rakam2+rakam3+rakam4 kismi char
        //sonucu rakam1+rakam2+rakam3+rakam4 =1234 olarak verdi
        System.out.println("rakam1+rakam2+rakam3+rakam4 ="+(rakam1+rakam2+rakam3+rakam4));
        //bu defa yukaridaki rakam1+rakam2+rakam3+rakam4 kismi parantez icine koyduk
        //bu defa 1,2,3,4 rakamlarini toplamayip ascii degerlerini topladi
        //once parantez ici islem yapildi.Ascii degerleri toplana toplana gitti
        //daha once parantez icinde degildi ve sayilar String oldu, yanyana 1234 yazildi
        System.out.println(rakam1+rakam2+rakam3+rakam4);
        //1==<Ascii49 2==>50 3==>51 4==>
        //10 sonucunu vermedi niye?
        //cunku biz sayilari char conteynerina koyduk, '1', '2' bu durumda ascii table degerini topladi

       //ASCII DEGERLERINDEN FAYDALANARAK NELER YAPILABILIR?

       byte b=5;
       char ch2='h';
       //ikisini kiyaslayalim
       int asciih= 'h';//bu kismi sout sonucu nedeniyle sonradan yazdik ve calistirdik, bize 104 verdi
       System.out.println("b > ch2 ="+(b>ch2));//false verdi
       //h harfinin ascii degerine gore b'nin h den buyuk olmadigini yazdirmis oldu
       //h harfinin ascii table degeri 104, ascii 5 value ise 53

       //char konteyneri hem icindeki karakterinin ascii degerini verir hem de resim gibi alir karakteri
       //yani tek tirnak icindeki sayiyi resim gibi gorup, ascii value'sune gore kiyas yapar

       long l=542168784578L;
       System.out.println("ch2>l :"+(ch2>l));//false 5>104 ==false

       float f = 2.45648f;
       double d = 2.19658;
       System.out.println("f>d :" +(f>d));//true verdi

       System.out.println("b<f :" +(b<f)); //false
       System.out.println("l>d :" +(l>d));//true
       int sayiInt =100;
       long sayiLong=100L;
       System.out.println("sayiInt<sayiLong :"+(sayiInt<sayiLong));//false
       System.out.println("sayiInt==sayiLong :"+(sayiInt==sayiLong));//true
       int sayiInt2=200;
       System.out.println("sayiInt>=sayiLong :"+(sayiInt>=sayiLong));//true
       int sayiInt3=9;
       char sayiChar='9';
       System.out.println("sayiInt3 >=sayiChar" +(sayiInt3 >=sayiChar));//false
       //normalde ikisi de esit gibi yani 9 rakami yazmistik
       //konteynerin icinde hangi sayiyi koyduysak onlari kiyasliyor ama tek tirnak icine koyarsak
       //bunu resim gibi alir, numeric degeri yok diye ascii deki degeri alir
       String str8="9";
       //System.out.println(""+(sayiChar>=str8));//bu kiyaslamaya Java izin vermiyor.Cunku String icindeki
       //numeric degeri yok. String bir data ile char konteyneri icindeki datayi kiyaslamaya izni yok

       String str9="Alpay";
       String str11="Melih";
       //System.out.println("str9+str11 :"+(str9>str11)); kiyaslama yaptirmadi


    }
}
