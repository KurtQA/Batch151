package day22stringbuilder;

public class Student {

    //stdName public oldugu icin diger classlardan ulasilabilir.
    public String stdName= "Ali Can";


//Access Modifier'i default olan ile public olan class member'lar ayni package icinde
// kullanildiklarinda ayni ozellikleri gosterirler.
    //Fakat farkli package'a gectiginizde public olanlara
    //ulasilabilir, default olanlara ulasilamaz.
   int age=23;

   private String healthCondition= "Cancer";
   //ayni package da oldugu halde  StudentRunner2 Class'inda access modifier'i private olan healthCondition gorulemedi.
    //Olusturduklari class'in disina ciktiginizda ulasilmaz olurlar.

    //Access Modifier'i "protected" olan Class Member'lar ayni package icinde iken public gibi davranirlar.
     protected int salary=3000;
     //Farkli package'a gectiginizde "protected" olanlar sadece child classlardan gorulebilir.
     //Ayni class dan gorulebilirler
    //Classlari private yapamayiz. Aksi halde Java hata verir.

    //Note: Classlar public ve default olabilir, ama private ve protected olamazlar.
    //

}
