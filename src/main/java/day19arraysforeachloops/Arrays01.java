package day19arraysforeachloops;

import java.util.Arrays;

public class Arrays01 {


    public static void main(String[] args) {

        //Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz.
       //1.YOL
        String names[]={"K","C","R","A","S"};
        String el="K";

        int counter=0;
        for (String w:names) {
            if (w.equals(el)) {
                counter++;
                break;
            }
        }if (counter > 0) {
                System.out.println("Array has==>" + el);
            } else {
                System.out.println("Array does not have==> +el");
            }
        //2. YOL
        //Arrays.binarySearch(,) icine arama yapmak istedigimiz array'in ismini once yaziyoruz
        //virgul sonrasi ise array de aranacak eleman ornek el(olusturdugumuz String adi) yaziliyor.
        //bunu kullanacaksak mutlaka arrays clasindaki short methodu kullanmaliyiz. Bu method
        //elemanlari siralar ve binary search methodu ile aradigimizi buluruz. Aradigimiz elemanin indexini
        //veriyor. Biz "R"y' aradik 3 verdi. £ sifirdan buyuk. K icin 2 verdi ve Array has==>K yazdi. Yani bu elemani icinde barindiriyor.
        //binary search ler hep int donduruyor. O zaman int sepetine koyacagiz.
        //aradigimiz deger olmasaydi onu - ile gosterirdi. Ornek array icinde 0 1 2 var biz 5 'i aradik. 5 olsaydi
        //index sirasi 3 olurdu. Bunu -3 olarak gosterirdi. a b d var z 'yi aradik. Z yok ve olsaydi kacinci
        //sirada olurdu -3 olurdu.

        Arrays.sort(names);
        int result=Arrays.binarySearch(names, el);
        System.out.println(result);

        if(result<0){
            System.out.println("Array does not have==> "+el);
        }else{
            System.out.println("Array has==> " +el);
        }


        }


    }

