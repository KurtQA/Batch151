package day_11_practice;

public class Den_C04_Cons {

    public static void main(String[] args) {

        C04_Constructor obj1 = new C04_Constructor("Honda","Civic",2020,"Benzin");
    /*
    Yeni olustrudugumuz objenin constructor'i icine parametre girince, o kisimda
    bir uyari verdi. Uzerine gidince yeni constructor create onerisini
    gorduk ve onu tiklayinca icinde instance variablelar olan
    class'a gidip bizim icin bir constructor olusturdu. Olusan
    constructor'in parametre kismina giderek icini biz duzenledik.
    yeni constructor altina giderek instance variable isimlerini
    alt alta yazdik.


     */
        System.out.println(obj1.marka); // Honda
        System.out.println(obj1.model);  // Civic
        System.out.println(obj1.yil);  // 2020
        System.out.println(obj1.yakit); // Benzin
    }
}




