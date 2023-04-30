package day09practice;

public class C02_IncrementDecrement {

    public static void main(String[] args) {

        int a=15;//16

        int b=a++;//15

        System.out.println(b);
        System.out.println(a);

        int sayi1=10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;
        System.out.println(sayi2);//10

        System.out.println(sayi1);//11 sayi1++; yaparak degeri guncelledik, bir arttirdik.

        sayi3=++sayi1;
        System.out.println(sayi3);//12 cunku bir yukarida sayi1 en son 11 olmustu. Java en son verilen degere
        //gore islem yapar

        System.out.println(sayi1);//12 sayi1 de en son 11 vardi ve ++sayi1; yapinca 11 12 oldu.

        System.out.println(sayi3++);//12 cunku sayi 3'un en son degeri 12 idi. Biz sayi3'u once yazdiriyoruz sout ile
        //sonra arttiriyoruz. Yani sout icinde boyle bir arttirma varsa once sayi3 'un en sonki hali yazdirilir
        //sonra arttirilir.

        System.out.println(sayi3);//13 cunku yukarida yazdirmanin ardindan bir arttirma olmustu, 12 olan sayi3 13 olmustu

        System.out.println(--sayi2);//9 sayi2'nin en sonki degeri 10 idi
      //sayi1(12)
     //sayi3(13)
        //sayi2(9)

        sayi2++;//sayi2 en son 9 idi bir arttirma yaptik burada,asagida yazdirirsak artik 10 verir

        System.out.println(sayi2);//10
//sayi1(12)
        //sayi3(13)
        //sayi2(10)
        System.out.println(sayi2--);//10
        System.out.println(sayi2);//9

        //sayi1(12)
        //sayi3(13)
        //sayi2(9)

        System.out.println(sayi3++);//13
        System.out.println(sayi3);//14

        //sayi1(12)
        //sayi3(14)
        //sayi2(10)







    }


}
