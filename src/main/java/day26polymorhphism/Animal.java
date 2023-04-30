package day26polymorhphism;

public class Animal {

    public void eat(){
        System.out.println("Animals eat");

    }
    public void drink(){
        System.out.println("Animals drink");

    }

    public Animal() {
    }
    /*
    Parent Classdaki methodun Child class icinde ozellestirilerek kullanilmasina overriding denir
    Overriding de methodun parantezi ve methodun ismine(method signature) dokunulmaz.
    Child classdaki methodun access modifier'i parentdan daha dar olamaz.
    Child class da override edilen method return type i ile parent taki return type'i
    arasinda IS-A iliskisi varsa return type degistirilebilir. Ornek Parent da method public Animal create(){}
    return new Animal(); idi, child olan Cat bu methodu override edince method public Cat create(){
     return new Cat(); } olarak degisti. Yani methodun ismi ve return type'i degisebildi.
     Java'da bir method tipi olarak hem sınıfın adı hem de dönüş değeri olarak sınıfın adı kullanılabilir.
     Bu tür bir yapıya "Builder pattern" denir
    Parent da data type int(primitive) iken child'da data type int olmak zorunda.
    Methodun return type'i primitive type
    ise override yaparken child da return type degistirilemez.Primitiveler arasinda IS-A iliskisi yoktur.
     ayni olmali. IS-A iliskisi olan parentdan secilince problem yok.
     Parent da data type wrapper class ise ornek Integer ise override yapilinca child da baska bir wrapper class
     da secemiyoruz. Wrapper bir class olsa da wrapper classlar arasinda IS-A iliskisi yok.
     Child'da override edilen methodun return type ile parent daki methodun return type'i arasinda IS-A iliskisi
     yoksa return type degistirilemez.
     Mesela Integer Wrapper class'i ile Long Wrapper class'i arasinda IS-A iliskisi yoktur. O yuzden return
     type'i degistiremedik.
     Methodun return type'i void ise overriding yaparken return type degistirilemez. Return type sadece IS-A iliskisi
     oldugu parentdan alinirsa, parent isimli method ise.
     static methodlar override edilemezler.
     Final methodlar override edilemezler. Final methodlarin body'si degistirilemez ama override yapilirken
     body'si degistirileceginden Java override'a izin vermez.

     Final keyword'unu variablelar ile kullanabiliriz.
     final variablelarda deger atanmak zorunda ve o deger degistirilemez.
     Final keyword'u methodlar ile kullanilabilir. Methos final ise methodun body'si degistirilemez.
     Final keyword'u classlar ile kullanilabilir.
     Class final ise o class'in child'i olamaz.






     */

}
