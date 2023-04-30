package day09practice;

public class C04_Method {

    public static void main(String[] args) {

     /*


    10 sorumuz var
    ogrencilerin cevapları:

    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    cevaplar bir multidimensional char array'ine
    assign edilmis
    her ogrencinin 10 tane cevabi var


    cevap anahtarı:

    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'}; //1. ogrencinin yukaridaki cevaplarini
    bu cevap anahtari ile karsilastiracagiz ve dogru cevap sayisini bulacagiz, ta ki son ogrencinin dogru cevap
    sayisina kadar gidip kontrol edecegiz.

    Her ogrencinin dogru cevap sayısını method olusturarak yazdıranız

    output:
    1nolu ogrencinin dogru cevap sayısı: 7
    2nolu ogrencinin dogru cevap sayısı: 6
    3nolu ogrencinin dogru cevap sayısı: 5
    4nolu ogrencinin dogru cevap sayısı: 4
    5nolu ogrencinin dogru cevap sayısı: 8
    6nolu ogrencinin dogru cevap sayısı: 7
    7nolu ogrencinin dogru cevap sayısı: 7
    8nolu ogrencinin dogru cevap sayısı: 7

*/
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },//answers'in i.nci indexindeki ogrencinin length'i
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }};


        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

        dogrucevapsayisi(answers, keys);//kirmizi uyari olunca uzerine geldik ve method create kismini tikladik
        //asagida main method disinda bir method olusturdu.


    }

    //her ogrencinin dogru cevap sayisini method icinde bulacagiz. For loop olusturacagiz, answer'in length'ine kadar
    //donguye alacagiz. 0 dan ogrenci sayisina kadar bir dongu olusacak
    public static void dogrucevapsayisi(char[][] answers, char[] keys) {

        for (int i = 0; i < answers.length; i++) {//distaki yani ilk for 0'dan ogrenci sayisina kadar donguye alir
            int sayac = 0;//sayaci burada olusturmamizin sebebi bir sonraki ogrenciye gecerken
            // dogru cevap sayisini sifirlamasi icin
            for (int j = 0; j < answers[i].length; j++) {//icteki for 0'dan ogrencinin cevap sayisina kadar donguye alir
                if (answers[i][j] == keys[j]) {//ogrencinin cevabi, cevap anahtarindaki ile esit mi kontrol ettik, esitse sayaci
                    //bir arttirdik.
                    sayac++;
                }
            }
            System.out.println(+i + 1 + "nolu ogrencinin dogru cevap sayisi: " + sayac);//Ilk ogrenci 0.inci indexte
            // 0.inci ogrenci dememek icin
            //i+1 yazdirdik sout icine

        }
        //1nolu ogrencinin dogru cevap sayisi: 7
        //2nolu ogrencinin dogru cevap sayisi: 13
        //3nolu ogrencinin dogru cevap sayisi: 18
        //4nolu ogrencinin dogru cevap sayisi: 22
        //5nolu ogrencinin dogru cevap sayisi: 30
        //6nolu ogrencinin dogru cevap sayisi: 37
        //7nolu ogrencinin dogru cevap sayisi: 44
        //8nolu ogrencinin dogru cevap sayisi: 51
    }
}