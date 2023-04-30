package day19arraysforeachloops;

import java.util.ArrayList;

public class ArrayList01 {



        /*
              1)Ayni data type'indeki coklu data'lari depolamak icin Array kullaniriz.
              2)Array'erin bir negatif yonu var; icine koyacagınız eleman sayisini en basta belirlemek zorundasiniz.
              3)Array'ler eleman sayisinda esnek degildirler, bu yuzden Java "ArrayList" adli yeni bir yapi olusturdu,
               bu yapi eleman sayisinda esnektir. Hic eleman koymazsaniz eleman sayisini sifir olarak ayarlar, 1000 eleman
               koyarsaniz eleman sayisini 1000 olarak ayarlar.
              4)"ArrayList" yerine sadece "List" de diyebiliriz.
              5)Java "ArrayList"leri olusturduktan sonra Array'leri iptal etmedi cunku;
                  i)Array'ler super hizlidir.
                  ii)Array'ler memory'de coook az yer kaplar.
              6)Array'ler primitive data type'leri ve reference'leri depolayabilir,ama "ArrayList"ler "non-primitive"
                data type'larini depolar bu yuzden "ArrayList"ler Array'lerden daha cok yer kaplar

         */
        public static void main(String[] args) {

            //ArrayList nasil olusturulur ?
            ArrayList<Integer> ages =new ArrayList<>();

            //ArrayList'e eleman nasil eklenir ?
            System.out.println(ages); //[ ]
            ages.add(12);
            ages.add(24);
            ages.add(9);//add() methodu elemanlari "giris sirasina" gore List'e yerlestirir.
            System.out.println(ages); //[12, 24, 9]

            //2.Way
            ages.add(1,99);
            System.out.println(ages);//[12, 99, 24, 9]

            ArrayList<Integer> price =new ArrayList<>();
            price.add(23);
            price.add(33);

            //3.Way:addAll() method'u bir List'i diger bir List'in icine yerlestirir..
            ages.addAll(price);
            System.out.println(ages);//[12, 99, 24, 9, 23, 33]

            //4.Way
            ages.addAll(3,price);
            System.out.println(ages);//[12, 99, 24, 23, 33, 9, 23, 33]

            //ArrayList'de eleman sayisi nasil bulunur ?
            int numOfElement =ages.size();// size() method'u bir List'teki eleman sayisini verir.
            System.out.println(numOfElement);// 8

            //ArrayList'te specific bir eleman nasil alinir?
            int a =ages.get(3);//get() method'u index kullanarak istedigimiz elemani almaya yarar.
            System.out.println(a);//23

            //ArrayList'te specific bir eleman nasil degistirilir?
            ages.set(6,111);
            System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]

            //ArrayList'te specific bir eleman'in var olup olmadigini nasil anlariz ?
            boolean b=ages.contains(99);
            System.out.println(b);//true

            //bir ArrayList'in bos olup olmadigini nasil kontrol ederiz ?
            boolean c =ages.isEmpty();
            System.out.println(c);//false

            //Bir ArrayList'teki tum elemanlari nasil sileriz ?
            ages.clear();
            System.out.println(ages);// []

            boolean d =ages.isEmpty();
            System.out.println(d);//true


         //Example 1: Bir List'in bos olup olmadigini kontrol eden kodu yaziniz
            ArrayList<String> names=new ArrayList<>();
            names.add("Ajda");
            names.add("Cuneyt");
            names.add("Angelina");
            names.add("Brad");

            //1.Way:
            if (names.size()==0) {
                System.out.println("List bostur");
            }else{
                System.out.println("Listte en az bir eleman vardir");//Listte en az bir eleman vardir
            }

            //2.Way:
            if(names.isEmpty()){
            System.out.println("List bostur");
        }else {
                System.out.println("Listte en az bir eleman vardir");//Listte en az bir eleman vardir


            }



        }
    }

