package day12switchloops;

public class IncrementDecrement {

    public static void main(String[] args) {

/*
increment-arttirmak
1) age=age+1(+1 ve +100 de olabilir)
2) age+=1
3)age++(bir arttirma halinde)

increment-carpma
1)int salary=120000
salary=salary*1.1;
2)salary*=1.1;

Decrement-azaltmak
decrement-cikarma
1) int price=12;
price=price-3;
2) price-=3;
3) price-- (bir azaltmak icin)
decrement-bolme
1)int slary=1200;
salary=salary/3;
2) salary/=3
carpma ve bolme islemlerinde toplama ve cikarma islemlerindeki yukaridaki 3.yol yoktur
yani salary// ya da salary** methodu yoktur.




 */
 int age =12;
        System.out.println(age);//12'yi veriyor
        age=age++;
        System.out.println(age);//yine 12'yi veriyor. Nicin arttirilmis halini gormedi. Java arti kismini gormeden
        //atama operatoru sonrasindaki age'i aldi sadece. Oyleyse Java'ya once arttirmayi gormesini isteyecegiz
        //age=age++ buna post increment
        //age=++age buna pre increment denir.
        //eger atama yapmazsaniz sadece age=age++ yazarsak int conteynerina koymazsak sayiyi arttirir
        //ya da age=++age yazarak Javaya once arttirmayi gormesi soylenmis olacak ve sayi arttirilmis haliyle yazilir
        int salary=48;
        salary=salary--;
        System.out.println(salary);
        salary=--salary;
        System.out.println(salary);


    }
}
