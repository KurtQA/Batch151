package selfstudying1;


import java.util.ArrayList;
import java.util.List;


public class ArrayListGet_Set {

    public static void main(String[] args) {

   //Bir array list olusturup, 10 dan kucuk olan elementleri 88'e cevir ve listi yazdir

        List<Integer> num=new ArrayList<>();
        num.add(34);
        num.add(2);
        num.add(12);
        num.add(8);
        num.add(10);
        System.out.println(num);//[34, 2, 12, 8, 10]

        for (int i = 0; i < num.size(); i++) {
            if (num.get(i)<10){
                num.set(i,88);
            }

        }
        System.out.println(num);//[34, 88, 12, 88, 10] 10'dan kucuk sayilarin yerinde 88 var

        List<Integer> yourList=new ArrayList<>();
        yourList.add(2);
        yourList.add(4);
        yourList.add(7);
        yourList.add(3);
        yourList.add(2);
        yourList.add(5);
        System.out.println(yourList);//[2, 4, 7, 3, 2, 5]

        for (int i = 0; i < yourList.size(); i++) {
            Integer el=yourList.get(i);
            if (yourList.indexOf(el)!=yourList.lastIndexOf(el)){
                yourList.remove(el);
                i--;
            }

        }
        System.out.println(yourList);//[4, 7, 3, 2, 5] Tekrarli sadece 2 idi, tekrar olan kismi alinmis oldu
        //bu koda gore
    }
}
