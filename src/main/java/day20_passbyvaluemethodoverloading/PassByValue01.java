package day20_passbyvaluemethodoverloading;

public class PassByValue01 {

    public static void main(String[] args) {

        int shirtPrice = 100;
        int studentShirtPrice= discount("student",shirtPrice);
        System.out.println("studentShirtPrice= " + studentShirtPrice);//90
        System.out.println("shirtPrice= " +shirtPrice);//100

        int veteranShirtPrice=discount("veteran", shirtPrice);
        System.out.println("veteranShirtPrice= " + veteranShirtPrice);//80
        System.out.println("shirtPrice= " +shirtPrice);//100

        int seniorShirtPrice=discount("senior", shirtPrice);
        System.out.println("seniorShirtPrice= " + seniorShirtPrice);//95
        System.out.println("shirtPrice= " +shirtPrice);//100
    }

       public static int discount(String type, int price) {
        switch (type){
            case "student":
                price=price-10;
                break;
            case "veteran":
                price=price-20;
                break;
            case "senior":
                price=price-5;
                break;
            default:
                price=price;
        }
        return price;
     /*
     Once method olusturduk, main method disinda.Method parantez icine parametre turlerini girdik.
     Ornek String type, int price Daha sonra sorumuza uygun olarak switch ile devam ettik. Switch parantezi icine
     type yazdik, cunku asagi caselerde typelari kullandik. (student, veteran, senior)
     switch de tum olasi caseler yazildiktan sonra default yazdik. Cunku o typelar icine girmeyen icin
     bir case olusturmaliydik. Bunun da bir sarti yok price da indirim yok. price=price oldu. Neden
     return price yazdik cunku her case de sonuctaki price'i gormemiz gerekir.
     methodumuz bitince onu calistirmak icin main method icine girdik. Once methodumuzu ismi ile cagirdik.
     Method ismi discount idi. Yine int ve String olan parametreleri parantez icine bu defa net olarak type ile yazdik.
     ornek veteran yazdik ve bir virgul sonrasi price'i isimlendirerek yazdik.Bu discount'u birer int variable olusturup
     onlara atadik ve iki sout ile hem indirimli hali hem orginal price lari yazdirdik.Ilk sout lar icine int'lerin isimlerini
     paranteze aldik. Methodu ilk olusturdugumuzda static yazmamistik public sonrasinda, bu defa yukariya main method icine
     method ismini yazinca hata verdi. Hata verdi cunku main method static olup icine yazilanlar da static olmak zorunda
     biz asagi kisma gelip static ekleyince duzeldi.


      */

    }
}
