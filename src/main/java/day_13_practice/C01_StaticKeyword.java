package day_13_practice;


/*

Bir static variable olustururken class seviyesinde main method uzerinde olustururuz. Ornek static int sayi1;
Bir deger atamasi yapmadik. Deger atamadigimiz iki int variable'imiz var, biri static digeri degil.

Main method icerisinde instance variable'a ulasabilmemiz icin object olustururuz. Ornek:
C01_StaticKeyword obj1= new C01_StaticKeyword();

Iki object olusturduk, obj1 ve obj2
main method icinde variable ismini yazinca ekrana o variable degerini yazdirir.
Static variablelar class'a instance variable object'e bagli olur.


static olan variable'i main method icinde sadece ismini yazarak ve yanina ++; ekleyerek arttirabiliriz, ancak
static olmayan variable'in degerini object'i kullanarak arttirabildik. Ornek: obj1.sayi2++;
Daha sonra sout icine obj1.sayi2 yazinca ekrana arttirilmis haliyle gorebildik.

static olan variable'i object ismi ile birlikte sout icine yazinca calisabilir, ama java bunu yalin haliyle
yazmamizi tavsiye ediyor.

obj2 uzerinden static methodu artirabilir miyiz? Bu mumkun. obj2.sayi1++; Normalde object olmadan artirmayi
zaten yapabiliyorduk.



 */

public class C01_StaticKeyword {
    // Bir tane static variable, bir tane instance variable olusturalım bunların kullanımını main method icerisinde gosterelim.
    static int sayi1;
    int sayi2;
    public static void main(String[] args) {
        C01_StaticKeyword obj1 = new C01_StaticKeyword();
        C01_StaticKeyword obj2 = new C01_StaticKeyword();
        System.out.println(sayi1); // 0
        System.out.println(obj1.sayi2);  // 0
        sayi1++;
        obj1.sayi2++;
        System.out.println(sayi1);  // 1
        System.out.println(obj1.sayi2);  // 1
        System.out.println(obj2.sayi2);  // 0
        System.out.println(obj1.sayi1); // 1
        System.out.println(obj2.sayi1);  // 1
        obj2.sayi1++;
        obj2.sayi2++;
        System.out.println(obj2.sayi2);  // 1
        System.out.println(obj2.sayi1);  // 2
        System.out.println(obj1.sayi2);  // 1
        System.out.println(obj1.sayi1); // 2
        obj1.sayi1++;
        obj1.sayi2++;
        System.out.println(obj1.sayi2); // 2
        System.out.println(obj1.sayi1);  // 3
        System.out.println(obj2.sayi2);  // 1
        System.out.println(obj2.sayi1);  // 3
    }
}
