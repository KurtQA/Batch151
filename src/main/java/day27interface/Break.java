package day27interface;

public interface Break {
    void slow();//bu abstract method implement yani override olmasi gerekirken yapilmadigi halde uyari vermedi. Biz Honda class'ina
    //gittik ve orada onceden Engine'i implement yaptigimiz halde bu defa bir , koyarak Brake ekledik. Brake'inde child'i oldu
    //tabii Honda class ta bir daha override yaptik

    void payment();
}
