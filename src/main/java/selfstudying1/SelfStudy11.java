package selfstudying1;

public class SelfStudy11 {

    public static void main(String[] args) {
        int b=10;
        b+=5;

        int c=25;
        c++;
        c-=11;

        int r=77;
        r/=11;

        int k=6;
        k*=4;
        k++;
        k=b++;

        System.out.println(b+c+r+k);

        int y=90;
        int g=10;
        y=g++;
        System.out.println(y);
        y=++g;
        System.out.println(y);


        int p=17;
        int n=p--;
        System.out.println("p" +p);
        System.out.println("n" +n);

       int s=20;
       int t=--s;
        System.out.println("s" +s);
        System.out.println("t" +t);

    }
}
