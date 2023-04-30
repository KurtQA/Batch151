package day37exceptionsenums;

/*
Kendi olusturdugumuz classlara custom exception denir. Custom Exception class olusturmak icin exception class'a
extend etmeliyiz. Bu durumda custom exception compile time exception olur.
Bizim exception'imizi Parent class olan Exception'in child'i yapinca parent'a ait ozellikleri de kullanabilecegiz.
Custom Exception Class olustururken constructor olusturmaliyiz. Bu constructor parenttaki constructor'i
cagirmali ve mesajli olani veya olmayani seklinde olusturulmalidir.
Javaya object'i buradan degil parent'tan olustur diyoruz. Istersek mesaj veren ya da mesaji olmayan costructor'i
kullanabiliriz. Bir classin icinde birden fazla constructor olabilecegini biliyoruz.
Custom Exception Class olusturdugumuzda ismin sonunda Exception kelimesini kullanmaliyiz, IllegalGradeException'nda
oldugu gibi.


        1)Custom Exception Class olusturmak icin Exception Class'a extend etmeliyiz.
          Exception Class'a extend ederek olusturdugunuz Custom Exception "Compile Time Exception" olur.

        2)Custom Exception Class olustururken "constructor" olusturmalisiniz.
          Bu "constructor" parent'taki constructor'i cagirmalidir.
          Bu "constructor" mesaj verecek veya vermeyecek sekilde olusturulabilir.

        3)Custom Exception Class olusturdugunuzda ismin sonunda "Exception" kelimesini kullanmalisiniz,
          IllegalGradeException da oldugu gibi.

 */



public class IllegalGradeException extends Exception {
    public IllegalGradeException(String message){
        super(message);
    }

    public IllegalGradeException(){
        super();
    }
}
