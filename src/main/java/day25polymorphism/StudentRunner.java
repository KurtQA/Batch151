package day25polymorphism;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1=new Student();
         System.out.println(s1.getStdID());//AC2023102T
        //s1. yapinca methodlar icinde getStdID() methodu gorundu ve onu sout icine alinca ekrana private olan
        //Student classtaki methodun degerini ekrana yazdirir.
        System.out.println(s1.getGpa());//3.87
        //double gpa variable'i private olup, getter'dan gpa'yi kilitli olarak bulduk ve onu sectik. O method
        //Student classta alt kisimda olustu ve StudentRunner olan bu class'a geldik. s1 olan object ismi ile methodlara
        //baktik ve orada getGpa'yi gorup, sout icine aldik. Private olsa da bu yontem ile 3.87 olan gpa degerini gorduk

        s1.setGpa(3.99);
        System.out.println(s1.getGpa());//3.99
        //yukarida daha once getGpa 3.87 idi biz degistirdik. Ancak ekranda onceki 3.87 ve 3.99 gorundu. Yani 3.87
        //degismemis gibi yukarida kaldi. s1 objesini Student class'indan olusturduk. Bu nedenle classtaki her sey bu objede
        //olacak.
        /*
        ilk gpa kodunu calistirinca, Java bunu okudu ve ekranda 3.87 gorundu. Daha sonra Java'ya s1'e git ve gpa'yi
        3.99'a cevir dedik. Class'a dokunmadan obje uzerinden degisiklik yaptik. Java s1'e gelip son gpa degerine bakti ve
        3.99 ekranda yazildi. Biz set methodunu kullanmis olsak da class calibinda gpa ile ilgili degisiklik olmadi
        Java get ve set methodunu class uzerinde degil objeler uzerinde kullanir. Get methodu objenin uzerindekini okuyan
        methoddur.
         */
    }
}
