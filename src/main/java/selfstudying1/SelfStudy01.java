package selfstudying1;



public class SelfStudy01 {


    public static void main(String[] args) {
        //Bir String ‘ in palindrom olup olmadığını kontrol etmek için kod yazınız. Bir String, tersi ile
        //aynıysa, buna palindrom denir. Örneğin; “anna”, “123321”
        String s = "runnur";
        String r = "";
        for (Integer i = s.length() - 1; i > -1; i--) {
            String c = s.substring(i, i + 1);
            r = r + c;
        }
        if (s.equals(r)) {
            System.out.println(s + " palindromdur");
        } else {
            System.out.println(s + " palindrom degildir");
        }
        /*
        Döngünün içinde, kod substring() yöntemini kullanarak string s'den her karakteri ayıklar
        ve + operatörünü kullanarak string r'ye ekler.
        Bu, string'deki karakterlerin sırasını tersine çevirir.
        String c = s.substring(i,i+1);
        r = r + c;
        Döngü tamamlandıktan sonra, kod equals() yöntemini kullanarak orijinal string s'in,
        tersine çevrilmiş string r'e eşit olup olmadığını kontrol eder.
        Eğer eşitlerse, orijinal string bir palindromdur.
        if(s.equals(r)){
        System.out.println(s + " palindromdur");
        }else{
        System.out.println(s + " palindrom degildir");
        }

         */
        String y = "anna";
        String z = "";
        int i = y.length() - 1;
        String h = y.substring(i, i + 1);
        z = z + h;
        if (y.equals(h)) {

        }
        while (i > -1) {
            i--;
        }
        System.out.println("It is palindrom");

        /*
        String s = "runnur";
        String r = "";
        int i=s.length()-1;
        do{
        String c = s.substring(i,i+1);
        r = r + c;
        i--;
        }while(i>-1);
        if(s.equals(r)){
        System.out.println(s + " palindromdur");
        }else{
        System.out.println(s + " palindrom degildir");
        }
         */

        /*
        Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
        Örnek; 223878 ´ 37
        1. Yol:
        Integer num = 223878;
        String s = String.valueOf(num);
        String d = "";
        for(int i=0; i<s.length(); i++){
        String c = s.substring(i,i+1);
        if(s.indexOf(c)==s.lastIndexOf(c)){
        d = d + c;
        }
        }
        System.out.println(d);
         */
        int num = 223878;
        String j = String.valueOf(num);
        String d = "";
        int p = 0;
        while (p < j.length()) {
            String c = j.substring(p, p + 1);
            if (j.indexOf(c) == j.lastIndexOf(c)) {
                d = d + c;
            }
            p++;
        }
        System.out.println(d); // outputs "37"

        //Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        //A A A A A
        //A A A A A
        //A A A A A

        int rows = 3;
        int columns = 5;
        for (int e = 1; e <= rows; e++) {
            String l = "";
            for (int k = 1; k <= columns; k++) {
                l = l + "A ";

            }

            System.out.println(l);
        }

        //for () sonrasi hiclik iceren String olusturduk. soruya gore hem rows hem columns ayri ayri taranacak
        //her ikisinin de icinde barindirdiklarina bakilacak ve dongu gerekecek. Bu nedenle iki for var
        //ikinci for sonrasi bosluk string'e +1 eklenme icin l=l+ "A "; yaptik
        //parantez disinda sout yazdirdik

        int rows1 = 3;
        int columns1 = 5;

        int b1 = 1;
        while (p <= rows) {
            String s1 = "";
            for (int k = 1; k <= columns; k++) {
                s1 = s1 + "A ";
            }
            System.out.println(s1);
            p++;
        }
        //while farklari, for parantez ici ilk islem basa yaziliyor. sonra while ve icindeki sart
        //devaminda acilan parantez icine hiclik iceren String ve ikinci while degil bir for aciyoruz
        //for devamindaki {} icine hiclik iceren String'e + ekleme yapiyoruz.
        //en onemlisi eger if varsa while sonrasi, if olmasa da parantez kapandiktan sonra
        //once sout en son i++; yapip parantezi kapatiyoruz.


        int rows2 = 3;
        int columns2 = 5;
        int p1=1;
        do{
            String s2 = "";
            for(Integer k=1; k<=columns; k++){
                s2 = s2 + "A ";
            }
            System.out.println(s2);
            p1++;
        }while(p1<=rows);

        //do while, while ile benzer kismi for loop ici parantezin ilk kismi basa
        //farklari int i=0 sonrasi do parantezi aciyoruz. hiclik iceren String'i bu kisimda olusturuyoruz
        //ilk for devaminda yaziliyor. Bu for, for loop da ikinci kisma gelen for. devamindaki parantez
        //icine hiclik konteynerina ekleme kismi + ile
        //daha sonra sout ardindan iteration i++; en son while kismi ve ilk for icindeki sart kismi. Eger while
        //isleminde if olacaksa do while da once if sonra while. While ise once while sonra if
    }
}
