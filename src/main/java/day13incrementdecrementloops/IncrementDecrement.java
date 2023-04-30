package day13incrementdecrementloops;

public class IncrementDecrement {


    public static void main(String[] args) {

        //Increment
        int a=5;
        System.out.println(a);//5

        a=a+2;
        System.out.println(a);//5, yukaridaki a degerini 2 artirmis oldu. Artirma yollarindan biri bu

        a+=2;
        System.out.println(a);//9 verdi cunku ikinci kisimda a'yi artirmistik ve 7 yapmistik. Burada 2 daha ekledik
        //eger a+=2 de a ile + arasina bosluk koymayacagiz.
        //Example 1: Bir tane integer variable olusturun ve onu 5 artirin
        int b=10;
        System.out.println(b);//10

        b=b+4;
        System.out.println(b);//14

        b+=8;
        System.out.println(b);//22, 14'e cikan b'ye 8 daha ekledik

        //DECREMENT
        int c=8;
        System.out.println(c);//8

        c=c-3;
        System.out.println(c);//5

        c-=3;
        System.out.println(c);//2

        //INCREMENT 2

        int d=6;
        System.out.println(d);//6
        d=d*2;
        System.out.println(d);//12
        d*=2;
        System.out.println(d);//24

        //DECREMENT 2
        int e=24;
        e=e/2;
        System.out.println(e);//12
        e/=3;
        System.out.println(e);//4

        int d1=35;
        d1=d1+10;
        d1+=10;
        int z=20;
        z=z*2;
        z*=10;
        int y=50;
        y=50-10;
        y-=10;
        int m=100;
        m=100/2;
        m/=10;

        //"1" ile increment
        int f=12;
        f=f+1;
        f+=1;
        f++;

        //"1" ile decrement
        int k=24;
        k=k-1;
        k--;

        //post-increment  ve pre increment
        int i =10;
        int k1= i++;//post increment
        System.out.println(k);//10, i artirilmadan k1 sepetine konuldugu icin k1 in degeri 10 olur.
        System.out.println(i);//11, i satir sonunda artirildigi icin degeri 11 olur

        int m1=15;
        int n=++m1;// pre increment
        System.out.println(m1);//16, m1 satir sonunda artirildigi icin m1 in degeri 16 olur
        System.out.println(n);//16 m1 artirildiktan sonra n sepetine konuldugu icin n nin degeri 16 olur

        //example
        int p=17;
        int r=p--;
        System.out.println(p);
        System.out.println(r);

        int s=20;
        int t=--s;
        System.out.println(s);
        System.out.println(t);
        //s 20 idi, t sepetinde s bir azaltildi 19 oldu. Bu yukaridaki s'yi de 19'a otomatik olarak cevirdi
     /*
     Increment ve decrement 3 yolla yapilabilir

     a) int i=12;==>i=i+5;
     b) int i=12; ==>i +=5;
     c)int i=12;==>i++;

     a) int i=12;==>i=i-5;
     b) int i=12; ==>i -=5;
     c)int i=12;==>i--;

      */




    }
}
