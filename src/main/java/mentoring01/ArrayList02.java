package mentoring01;

import java.util.*;

public class ArrayList02 {
    public static void main(String[] args) {
        //Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
               // Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
                //(Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır

        List<String> kelime=new ArrayList<>();

        kelime.add("Sari");
        kelime.add("Mavi");
        kelime.add("Kirmizi");
        kelime.add("Yesil");

        List<String> kelime1=new ArrayList<>();
        kelime1.addAll(kelime);
        Collections.sort(kelime1);
        System.out.println(kelime);//[Sari, Mavi, Kirmizi, Yesil]
        System.out.println(kelime1);//[Kirmizi, Mavi, Sari, Yesil]
        int k=0;
        int size=kelime.size();
        for(int i=0; i<size; i++) {
            if (kelime1.get(i).equalsIgnoreCase(kelime.get(size - 1 - i))) {
                k++;
            }
        }
            if(k==size){
                System.out.println("Azalan siradadir");
            }else{
                System.out.println("Azalan sirada degildir");
            }

        }
    }
