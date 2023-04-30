package javaders.day07stringmanipulations;

public class C01_StringManipulations {


    public static void main(String[] args) {

        String s = "Learn Java earn money";


        //***************** endswith *******************\\
        /*
        endsWith bize boolean dondurur ve cumlenin neyle bittigini
        gosterir

         */


        boolean end = s.endsWith("money");
        System.out.println(s.endsWith("money"));

        //********************** replace()***************\\
        /*

        replace() Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir
        String bi data dondurur
         */

        // Ex : s Stringindeki "money" kelimesini "dolar" kelimesi ile yer degistiriniz
            String s1= s.replace("money", "dolar");
        System.out.println("s1 :"+s1);

        //Ex : s Stringindeki earn kelimesini win kelimesine cevirin
        String s2= s.replace("earn","win");
        System.out.println(s.replace("earn","win"));

        //********************** replace()***************\\
        /*

        replace() Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir
        String bi data dondurur
         */
        //Ex: s Stringindeki a harflerini yildiz"*" ile degistirin
          String s3=s.replace("a","*");
        System.out.println(s.replace("a","*"));
        System.out.println("s2= "+s2);
        System.out.println("s3= "+s3);

        /*

        replace() Metnin icerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir
        String data dondurur
        tekli karakterler ve coklu karakterlerle calisir
        Ancak her iki tarafta da " " kullanilir
         */

        // Ex: s Stringindeki "n" harflerini "***" degistiriniz
        String s4= s.replace("n","***");
        System.out.println(s.replace("n","***"));


         //String s = "Learn Java earn money";
        //Ex: s Stringindeki tum "e" harflerini silsiniz
        String s5= s.replace("e","");
        System.out.println("s5 =" + s5);
        /*

        char data type'inin icerisine mutlaka bir karakter yerlestirilmelidir. Space bir karakterdir. Char konteyneri icine
        yerlestirilebilir. Ancak hiclik Javada
        char icin kullanilamaz. Bu nedenle delete yaparken mutlaka String kullanmaliyiz.
         */
        String t= "Yucel 25 ya$indadir sandik ama 30'mus!.";
        //Ex: t Stringindeki tum rakamlari *'a ceviriniz

        //**************************** replaceAll() ************************\\
        //Bir grup datayi degistirmek icin kullanilir
        //bir grup datayi ifade edebilmek icin (regex) kullanilir
        /*
        1) Tum Rakamlar==>[0-9]
        2) Tum Kucuk Harfler==>[a-z]
        3)Tum Harfler==>[A-Z]
        4) Tum Harfler ==>[a-zA-Z]
        5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
        6)Tum noktalama isaretleri==> \\p{Punct}
        7) Tum Sesli Harfler ==> [aeiouAEIOU]

        ^  ==>den farkli, haricinde

         1) Tum Rakamlar Haric==>[^0-9]
        2) Tum Kucuk Harfler Haric ==>[^a-z]
        3)Tum Harfler Haric ==>[^A-Z]
        4) Tum Harfler Haric==>[^a-zA-Z]
        5)Tum harfler ve rakamlar Haric==>[^a-zA-Z0-9]
        6)Tum noktalama isaretleri Haric==> \\p{Punct}
        7) Tum Sesli Harfler Haric==> [^aeiouAEIOU]
        8) Noktalama İşaretleri Hariç ==> ^\\p{Punct}

         */

        //Ex: t Stringindeki tum harfleri ve tum rakamlari unleme ceviriniz
        String t2=t.replaceAll("[a-zA-Z0-9]","!");
        System.out.println("t2= "+t2);//t2= !!!!! !! !!$!!!!!!! !!!!!! !!! !!'!!!!. verdi


        String t1=t.replaceAll("[0-9]","*");
        System.out.println(t.replaceAll("[0-9]","*"));
        //replaceAll()
        System.out.println("t1 = "+t1);

        // Ex: t Stringindeki tum space'ler disindaki karakterleri + ya donusturun

        String t3 =t.replaceAll("[^ ]", "+");
        System.out.println("t3 ="+t3);//t3 =+++++ ++ ++++++++++ ++++++ +++ ++++++++ verdi

        //Ex: t Stringindeki tum kucuk harfler disindaki karakterleri ?'ne donusturun
        String t4=t.replaceAll("[^a-z]", "?");
        System.out.println("t4 ="+t4);//t4 =?ucel????ya?indadir?sandik?ama????mus?? verdi


      //Ex: t Stringindeki tum sesli harfler disindaki karakterleri & e donisturun
        String t5=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println("t5 ="+t5);//t5 =&u&e&&&&&&a&i&&a&i&&&a&&i&&a&a&&&&&u&&& verdi





    }
}
