package javaders.day9stringmanipulationsifstatement;

public class C01_StringManipulations {


    public static void main(String[] args) {

       //Ex: Bir Stringin hic karakter icerip icermedigini kontrol eden kodu yaziniz

        String str = "";//hiclik

        //1.yol
        boolean result1= str.length()==0;
        System.out.println("String bos mu= " + result1);
        //true sonucu verdi. Iki islem ile sonucu verdi. 1-length() kullandik
        //2-==0 kullandik. Bunun anlami 0'a esit ise icinde hic bir sey yok, boylece hicligi verir

        //2.yol
        //*******************************isEmpty () ***********************\\

        /*
        isEmpty() String data icinde hic bir sey yoksa true return eder. Java da space bir karakter
        sayildigindan, eger space varsa isEmpty() false return eder
         */
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu = " + result2);
        //bir konteynerin bos mu dolu mu bunu veriyor isEmpty() methodu

        //3.yoll
        //Ex: Bir String datanin space haric hic bir karakter icerip icermedigini gosteren kodu
        //yaziniz
        String t= " ";
        //1.yol
        //once replace methodu ile space'i kaldirip yerine hiclik koyalim ve iceride kalanin
        //sayisini veren length methodunu 0'a esit mi diye kullan
        boolean result3=t.replace(" ", "").length()==0;
        System.out.println("result3 t= " + result3);
        
        //2.yol
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println("result4 = " + result4);
        //burada javaya 2 islem yaptirdik
        
        //3.yol 
        //*****************************isBlank()********************
        /*
        
        isBlank() ==>space+hiclik ise True return eder
        String bir datanon bos mu dolu mu olduguna bakar. isEmpty'den farki space varsa yine true 
        return eder.
        
         */
        boolean result5= t.isBlank();
        System.out.println("result5 = " + result5);
        //javaya bir islem yaptirdik. Bu nedenle bu methodla daha hizli calisir

        //**************************indexOf()************************\\
        /*
        indexOf() methodu verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
        int deger return eder. Coklu data icin kullanildiginda ilk gordugu datanin ilk karakterinin
        indexini verir. Ornek "to" yu sorduk ve cumlede birden fazla "to" varsa ilk to'nun
        indexini verir. Ilk to hangi sirada ise onu verecek. Olmayan bir karakterin indexi sorulursa
        bize '-1' return eder. Tek karakteri soruyorsak, char ''konteynerina aliyoruz karakteri
        birden fazla karakter ise String ""konteynerina aliyoruz.
         */
        String s2="Java is easy to learn to easy to";
        int idx = s2.indexOf("to");
        System.out.println("idx = " + idx);//13 verdi. Ilk to nun sirasini verdi


        //Ex: Bir Stringde a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrana yazdir

        String s="Java is easy to learn";
        //ilk gordugu indexi, a harfinin ilk gorunum indexi 1, i harfinin 5, e harfinin 8=14 olmali
        int aIndex=s.indexOf('a');
        System.out.println("aIndex = " + aIndex);//1 return etti
        int iIndex=s.indexOf('i');
        System.out.println("iIndex = " + iIndex);//5
        int eIndex=s.indexOf('e');
        System.out.println("eIndex = " + eIndex);//8
        System.out.println(aIndex+iIndex+eIndex);//14
        System.out.println("indexler Toplami :" +(aIndex+iIndex+eIndex));//14

        //Ex: Bir Stringde Java kelimesinin ilk olarak kacinci Indexte oldugunu gosteren
        //kodu yaziniz

      String cumle = "Ah Java vah Java sen ne guzel seysin Java";
      int indexJava = cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava);//indexJava=3 
        int indexQ=cumle.indexOf("QYX");
        System.out.println("indexQ = " + indexQ);//indexQYX=-1

        //************************* lastIndexOf() ***********************\\

        /*
        lastIndexOf() verilen String bir datada istenilen degerin son gorunumundeki indexi verir.
        Olmayan bir karakter sorgulanirsa -1 dondurur.
         */
        //Ex: Bir Stringdeki a,i,e karakterlerinin son gorunumlerinin indexleri toplamini
        //veren kodu yaziniz.
        String c= "Java is easy to learn";
        int aLastIndx=c.lastIndexOf('a');
        System.out.println(aLastIndx);//18
        int iLastIndx=c.lastIndexOf('i');
        System.out.println(iLastIndx);//5
        int eLastIndx=c.lastIndexOf('e');
        System.out.println(eLastIndx);//17
        System.out.println("Toplam index = " +(aLastIndx+iLastIndx+eLastIndx));//40















    }

}
