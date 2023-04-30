package day22stringbuilder;

public class Sbf01 {

    public static void main(String[] args) {

    /*
    1)StringBuffer Javada String ureten bir Class'dir
    2)StringBuffer, StringBuilder'a cok benzer, yani ikisi de degisebilir String uretir
    3)StringBuffer "multi-thread" dir ama StringBuilder "multi-thread" degildir.(Coklu is yapmaya uygun degil)
    4)Java StringBuffer'i StringBuilder dan once olusturdu.
    5)StringBuilder "multi-thread" olmadigi icin StringBuffer dan daha hizli callisir
    6)"multi-thread" yapilirken yapilan islerin siralamsi onem arzeder.


    3 tane String olusturan Class var
    1)immutable String  lazimsa String Class
    2)Mutable String Lazimsa StringBuilder ya da StringBuffer
    StringBuilder'i multi-thread gerekmezse kullaniriz
    StringBuffer'i multi-thread gerekirse kullaniriz

    */

     StringBuffer sbf1=new StringBuffer("Java");






    }
}
