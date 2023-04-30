package day18_constructorstatickeyword;

public class MethodOverLoading {

    /*
    1)Bir method ayni ve farkli parametrelerle olusturulursa bune Method Overlooading denir.
    2)Method Overloading Java da iyi organizasyon icin onemlidir.
    3)Method Overloading yaparken parametre 3 sekilde degirtirilebilir
    i)Parametrelerin sayilari degistirilebilir
    ii)Parametrelerin data typelarini degistirebilirsiniz
    iii)Parametrelerin data typelari farkli ise yerleri degistirilebilir
     */

    public static void main(String[] args) {

    }
        //interview sorusu
        public static int add( int a, int b){
            return a + b;

        }
        public static int add( int a, int b, int c){
          return a+b+c;
        }
        public static  double add(double a, int b){
            return a+b;
        }
        public static  double add(int a, double b){
            return a+b;
        }

    }


