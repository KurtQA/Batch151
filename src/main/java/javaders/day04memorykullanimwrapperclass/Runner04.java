package javaders.day04memorykullanimwrapperclass;

public class Runner04 {

    public static void main(String[] args) {

        OgrenciEmrah ogrenci = new OgrenciEmrah();
        System.out.println(ogrenci.brans);
        System.out.println(ogrenci.name);
        System.out.println(ogrenci.yas);
        ogrenci.study();
        ogrenci.derseDevam();

    }
}
