package advanced_project;

import java.awt.*;
import java.util.ArrayList;

public class ResturantTask {
/*
    Proje:   Restaurant Fiş Üretme Uygulaması (BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun. Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü, sipariş oluşturma/iptal ve hesap oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin.

    Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
    Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
    Her bir yiyecek siparişi için tutar hesaplansın

       5-Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
    Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve toplam tutarı gösteren bir hesap fişi yazdırılsın.

 */

    private ArrayList<MenuItem> menu = new ArrayList<>();
    private static ArrayList<Order> order = new ArrayList<>();
    public static void main(String[] args) {

        MenuItem item1= new MenuItem(101,"Hamburger",500.00);
        MenuItem item2= new MenuItem(102,"Pizza",600.00);
        MenuItem item3= new MenuItem(103,"Kofte",700.00);
        MenuItem item4= new MenuItem(104,"Salata",100.00);


    }//main

}

