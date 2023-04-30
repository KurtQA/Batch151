package day13incrementdecrementloops;

public class ForLoop02 {


    public static void main(String[] args) {

        //Example 1: Verilen bir String de ilk 'a' harfinden onceki tum karakterleri yazdiriniz
        // "I love Java"
        String y="I love Java";
        for(int i=0; i<y.length();i++){
            if(y.charAt(i)=='a')
                break;
            System.out.print(y.charAt(i));
        }
        //I love J return etti
        //iki alt kisimda charAt(i) yazdik bunu sadelestirmek icin
        //for body sonrasi altta cahr ch=y.charAt(i);' ye cevirdik ve alt kisimda if parantez icinde sadece ch='a'
        //sout icinde de sadece ch yazdik

        System.out.println();
       // Example 2: Verilen bir String de son 'a' dan sonraki tum karakterleri ters sirada yazdirin
        //"Germany" ==>yn
        //sondan baslayacagimiz icin i=t.length()-1 diyecegiz
        //i>=0 ya da i>-1
        String t= "Germany";
        for( int i=t.length()-1;i>=0 ; i-- ){
            char cy=t.charAt(i);
            if(cy=='a'){
                break;
            }

            System.out.print(cy);
        }
      //yn sonucunu verdi
        /*
        String t= "Germany";
        for(int i=t.length()-1; i>=0; i--){
        if(t.charAt(i)=='a'){
        break;
        }
        System.out.print(t.charAt(i));
        }
        t.charAt(i) bize tek tek bir indexi verdi, her tekrarda bir sonraki indexi verdi. Yani t.charAt(i) ilk seferde
        ilk indexin yerine gecti. Ornegin y yerine gecti, sonraki dongude n yerine gecti. Orada n oldugunu
        dusunduk.
        bu yolla yaptik once, daha sonra sadelestirmek icin body icine bir char conteyneri koyduk ve
        if ile sout icine sadece char cy'yi koymamiz yetti. iki kez t.charAt(i) yazmamiza gerek kalmadi.
        burada sadece bir harfin oncesi veya sonrasi diye soru gelince charAT ve break kullanmali
        daha once bir ornekte atlaya atlaya bazi harfleri yazdirmamiz istendiginden daha fazla karakter aramamiz
        gerekecekti bu nedenle substring kullanildi, charAt kullanilmadi.
        sout println yerine print yazdirdik yan yana ciksin diye
        uppercase kullanacaksak char degil string sepetine koy ve substring calistir
         */


        }
    }


