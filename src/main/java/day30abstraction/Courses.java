package day30abstraction;

public abstract class Courses {
    public abstract void math();
/*
  Basta methodumuzun body'si {} vardi ve icine sout yazmistik. Daha sonra body'i abstract yapmak
  icin sildik. Bunun uzerine class ve method uzerinde  kirmizi cizgi belirdi. public sonrasi hem method hem de
  class da abstract keyword'unu ekleyince uyari kayboldu.

  Eger bir classtan object olusturulmasini istemiyorsak ve bu classi sadece child classlar override
  yapmak zorunda olduklari gorevleri belilemek icin kullaniyorsak "Abstraction" yapariz.

  Bazen parent classdaki methodun body'si child class tarafindan kullanilmaz.
  Bu durumda parentaki method body yazmak hic kullanilmadigi icin mantikli degildir.
  Biz de o methoda body yazmayiz.

  Methodun body'sini yazmayinca java bize hata verir,
  abstract keywordunu kullanarak javaya bu methodun body'si olmayacak deriz.

  Abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz
  Abstract keywordunu kullaninca elde ettigimiz abstract method normal classlara konulamaz,
  o yuzden classi da abstract yapmaliyiz
  Parent taki method abstract ise butun child classlar o methodu override etmek zorundadir
  Bu yuzden tum chidlar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir
 */
   public void art() {
       System.out.println("Learn art");
   }
   //Bu methodun body'si var yani concrete bir method. Class'imiz abstract olsa da concrete bir method
    //olusturmaya bir sikayet gelmedi. Ayrica concrete olan bu method child classlar tarafindan override
    //etmek zorunda degiller. Isterlerse kullanabilirler. Secmeli ders gibi oldu. Biz bu concrete methodu
    //olusturunca child classlardan sikayet gelmedi.
    /*
    Abstract classlarda hem abstract hem concrete method olusturulabilir.
     */

    //public abstract void science();//child classlarda kirmizilik goruldu.
    // Cunku bu methodu override yapmak zorundalar
    //methdoun body'sini ekledik ve abstract'i cikardik ve kirmizilik child classlarda sona erdi

    public void science(){

    }
    /*
    final methodlar abstract olamazlar ve override edilemezler. Oysaki abstract methodlar override edilmek
    icin olusturulurlar ve bu bir celiskidir. Bu yuzden java abstract methodlarin final olmasina
    musade etmez.
    Bir Runner class olusturduk ve object olusturunca hata verdi. Cunku Abstract class'tan object uretilemez
    Abstract class'in abstract child'i olabilir.
    Abstract methodlar private olamaz. Access modifer her zaman publictir.

     */


}
