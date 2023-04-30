package day27interface;


//Honda Class'ini interface'in child'i yapamadik. extends Engine eklenince uyari verdi. extends yerine implements keyword'u kullaninca child
//olabildi. Ancak burada da hata verdi. Sunu dedi: Interface icindeki method yarim kalmis diyor. Bunun uzerine kirmizilik olan
//public class Honda implements Engine uzerine gelip bekledik, import secenegini verdi. Tikladik ve oradan hangi methodu implement yapmak
//istediysek onu sectik ve hata vermesi durdu.
//Asagi kisimda @overrride ile implement oldu.

public class Honda implements Engine, Break {

    @Override
    public void start() {
        System.out.println("Start...");
    }

    @Override
    public void slow() {
        System.out.println("Par the barke...");
        System.out.println("Pay the engine...");
    }

    @Override
    public void payment() {
        System.out.println("Be slow...");
    }

}
