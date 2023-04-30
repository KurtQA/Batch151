package day27interface;

public class CarRunner {

    public static void main(String[] args) {
        //Engine. yapinca stop()'a ulasabildik ancak eco methoduna ulasamadik. Cunku stop methodu static oldugundan
        //interface(Engine) ismi ile ulastik. Methodumuz Engine icinde idi ve soyle idi:
        //static void stop(){ sout}
        Engine.stop();

        //Engine e=new Engine(); yazinca sikayet etti cunku eco() statik olmadigindan interface ismi ile ulasamadik
        //object ile ulasabilecegimiz icin object olusturunca ulastik.
        //default ile olusturulan methodlara object olusturarak ulasabiliriz.
        //eco methodu Engine icinde ve soyleydi default void eco(){sout}
        Honda h=new Honda();
        h.eco();//object ismi ile eco()'ya ulastik.

    }
}