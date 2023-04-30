package day_17_practice;
/*
super() constructor parent'daki parametresiz constructor'i calistirir.
Ikinci object'imizi parametreli yapinca parametre kisminda kizarikli olustu, cunku parametreli bir constructor
olusturmamiz gerekti. Kizaran kisma gelip create constructor kismina basinca ust tarafta bize parametreli
constructor olusturdu. Olusan constructor'in ilk satirinda constructor olan super(); gorduk.

Parametreli constructor'i olusturunca bu defa asagida ilk object'imizin parametresi kizardi. Cunku parametreli
yeni olusan constructor ile default constructor silindi. Biz bunun uzerine manual olarak parametresiz ikinci
constructor'i yazdik.

Daha sonra iki parametreli object ve ardindan iki parametreli constructor olusturduk.

Birinci parametresiz object ile parametresiz constructor'a gidilecek. Orada ilk satirda super(); oldugundan,
onunla parent'a giderek default construtor'i bulur. Onun ici bos olunca geri child classtaki  parametresiz
constructor'a gelip icindeki sout kismini yazdirir.

child class 1.object ---->child parametresiz constructor ve super();-------->parent default constructor
------>child parametresiz constructor ---sout yazdirir.

Eger parent class'da parametresiz class icinde sout olsaydi, once oradakini yazdirir ve sonra geri donup child
class paremetresiz constructor'daki sout'u yazdirir.

Tek parametreli 2. object calistiginda ayni class icindeki tek parametreli constructor'a gider orada super();
oldugundan bu onu parent'daki tek parametreli constructor'a goturecek ve oradaki sout'u yazdirdi. Kosa
kosa geri dondu ve child'daki tek parametreli constructor'daki sout icini yazdirdi.

iki parametreli 3. object once child'daki class'taki iki parametreli constructor'a gider. Orada super(); gorunmese
de biz oldugunu biliyoruz, onun sayesinde parent'in iki parametreli constructor'ina gider. Oradaki sout'u
yazdirir ve vakit kaybetmeden geri gelip iki parametreli child classindaki constructor tarafindan karsilanir.
Bu karsilamaya kayitsiz kalmayip oradaki sout icini yazdirir.

super(); icine bir deger versek ne olur? Buna 5,10,15 seklinde deger verince o kisimda kizarma oldu. Uzerine gidip
otomatik olarak parent class'inda uc parametreli constructor olusturulmasini sagladik.
Bu durumda ekran ciktisi nasil olur? iki parametreli 3. object calistiginda, bu iki parametreli constructor'a
gidecek ve orada yazilsa da yazilmasa da super(); ile parent'daki uc parametreli constructor'a gidip oradaki
sout'u yazdirir ve sonra geri donup uc parametreli super constructorin bulundugu child classdaki
iki parametreli constructor'da ne yaziyorsa onu yazdirir.
//

 */



public class Child2 extends Parent2 {

// Parent2 isminde bir class olusturunuz
    // Child2 class'ı, Parent2 class'a extends ediniz
    // Child2 class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent2' den ekran cıktısı alınız


    Child2 obj1=new Child2(); //parametresiz constructor
    Child2 obj2=new Child2(1); //tek parametreli constructor

    public Child2(int i) {
        super();//Bu parentdaki parametresiz constructor'i calistirir.
    }
    public Child2() {
        super();
    }
}
