package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

    //*********toUpperCase()***********\\
        String a="Tek Rakibim Dunku Ben.";

        String aUpper = a.toUpperCase();
        System.out.println("aUpper =" + aUpper);//aUpper =TEK RAKIBIM DUNKU BEN . sonucu verdi
    //**********toLowerCase()************\\
        String aLower =a.toLowerCase();
        System.out.println("aLower :" +aLower);


        //**********charAt()**********\\
        System.out.println("ilk karakter :" + a.charAt(0));
        //Burada tek rakibim dunku kendim yazisinin ilk karakterini
        //aldi yani 'T', 
        System.out.println("onuncu karakter :" + a.charAt(10));//m
        // harfini verdi tek ile rakibim arasinda kalan boslugu da 
        //saydi

        // a String'indeki bastan ikinci ve sondan ikinci karakteri
        //aliniz ve yanyana yazdiriniz
         char firstChar = a.charAt(1);
          char lastSecondChar = a.charAt(19);
        System.out.println("firstChar+lastSecondChar :" +firstChar+lastSecondChar);
        //tek rakibim dunku ben cumlesinde ilk karakter ile sondan
        //ikinci karakteri verdi.
        //firstChar+lastSecondChar :ee olarak verdi. Cunku
        //biz tirnak icine bir sey yazarsak onu String olarak yazdirir
        System.out.println(firstChar+" "+lastSecondChar);
        //tirnak isaretini ortaya koyunca ee'yi bosluklu verdi
        // e e seklinde
        System.out.println(" " +firstChar+lastSecondChar);

        //*********** length ************\\
        //a String'inde bulunan karakter sayisini bulunuz
        System.out.println(a.length());//22


        //************** substring() **************\\
        // a Stringindeki ilk 5 karakteri aliniz
           a.substring(0,5);// 0 dahil 5 harictir
        System.out.println(a.substring(0,5));//Tek+bosluk+R'yi verdi

        String sub1 = a.substring(0,4);
        System.out.println("sub1 =" +sub1);// sub1 =Tek verdi
        //a Stringindeki 4. index dahil 7. index haric yazdirin

        System.out.println(a.substring(4,7));//Rak verdi cumlenin 4.5.6.
        //harflerini verdi

        //a Stringdeki "Rakib" kelimesini aliniz
        //a yanina nokta koyunca a.string() gorunuyor onu al
        //sonra rakib kelimesi kacinci harften basliyor ve dahil olan
        //sayiyi al
        System.out.println(a.substring(4,9));//Rakib verdi
        //a Stringinde "bim" kelimesinin olup olmadigini kontrol edin

        //************* contains ***********\\

             boolean varMi= a.contains("bim");
        System.out.println("varMI :" +varMi);//true verdi
        //cumlemizde rakibim kisminin bim kismini buldu ve true verdi

        //************ startsWith*******************\\
        // a Stringinin "T" harfi ile baslayip baslamadigini kontrol ediniz
            boolean isT= a.startsWith("T");
        System.out.println(a.startsWith("T"));//true verdi
        //cumlemiz Tek kelimesi ile yani ilk harf "T" idi ve true verdi
        System.out.println("isT :" +isT);//isT :true verdi

        System.out.println(a.startsWith("Tek",6));//false verdi
        //ilk 6 karakteri at;sonrasi "Tek" kelimesi ile basliyor mu? dedik
        //yukarida
        //a.startsWith ciktiginda prefix ve toffset'i sectik
        System.out.println(a.startsWith("Rakibim",4));//true verdi
        //prefix baslangic, offset at gitsin

        //Universite numaralari yil+BolumKOdu+GirisSirasi olarak
        //duzenlenen bir okulda ogrenci Umran'in hukuk fakultesinde
        //okuyup okumadigini gosteren kodu yazin

        /*
        Sinif ogretmenligi kodu 22, hukuk 33, bilgisayar 44, eczacilik 55
        Maliye 66, Kimya Muhendisligi 77 olsun
         */

        String str="20103301";
        System.out.println(str.startsWith("33",4));//true verdi
        //String str= yazdiktan sonra ogrenci Umran'in okula giris
        //senesi,universite giris kodu ve oraya giris sirasi yanyana
        //yazildi. Daha sonra str yazip yanina nokta koyunca cikanlardan
        //startsWith prefix olan secildi ve Sytem.out'da ilk parantez icine
        //konuldu. Ikinci paranteze 33 ve 4 yazilirken su dendi,
        //ilk 4'u at ardindakini baslangic olarak al
        String sentence= "Never give up* 7";
        System.out.println(sentence.charAt(9));
        System.out.println(sentence.length());
        System.out.println(sentence.toLowerCase());
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.contains("Never"));
        System.out.println(sentence.startsWith("N"));
        System.out.println(sentence.startsWith("give",6));
        System.out.println(sentence.substring(3,9));


    }
    
    
    
}
