package day29encapsulation;

public class StudentRunner {

    public static void main(String[] args) {

      Student s1= new Student();
        System.out.println(s1.getStdID());//AC2023102T
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        s1.setNotOrt(4.99);
        s1.setStdID("MU123456");
        s1.setSuccessful(true);

        System.out.println(s1.getStdID());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

        s1.setNotOrt(4.5);
        s1.setStdID("DH313756");
        s1.setSuccessful(true);

        System.out.println(s1.getStdID());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesful());

    }
    //AC2023102T
    //3.53
    //false

    //MU123456
    //4.99
    //true

    //DH313756
    //4.5
    //true

    /*
    Bir tane objemiz olmasina ragmen set ve get ile birden fazla kez kullanabildik.
     */
}
