package day26abstraction;

//abstract method yaptik, bunun uzerine hata verdi, class'a da  abstract ekleyince duzeldi. Cunku abstract methodlar, abstract
//classlarda olabilir.
/*
Bazen parent classdaki methodun body'si hicbir child class tarafindan kullanilmaz.
Bu durumda parentdaki methoda body yazmak hic kullanilmayacaksa mantikli degildir.
Body'si olmayan methoda abstract method denir.
Parentdaki method abstract ise butun child classlar o methodu override etmek zorundadir.
Bu yuzden tum childlar icin mecburi olmasini istedigimiz fonksiyonlari abstract yapmak mantikli bir secimdir.
Abstract class icine body'si olan concrete methodlar yazilabilir. Ancak abstract method, abstract olmayan class'a yazilamaz
bu durumda class'i abstract'a cevirebiliriz. Hem abstract yazip hem body ekleyemeyiz.
Abstract classlardan obje uretilemez cunku eksigi var, body'si yok.
 */

/*
  final keyword'u aciklar misiniz? i)variable'larda ii)methodlarda iii)classlarda kullanilir
  i)variable'larda kullanildiginda a)O variablelara kesinlikle bir deger atamasi yapilmalidir
  b)Ilk atanan deger degistirirlemez

  ii)methodlarda kullanildiginda o methodun body'si degistirilemez. O method override edilemez

  iii)Classlarda kullanildiginda o classin child classi olamaz. Ancak final class'in kendisi child
  olabilir.
  hem final hem abstract yazamiyoruz methodlarda. Bir final method varsa o mutlaka concrete olmali
  Abstract methodlar child classlar tarafindan override edilmek zorunda oldugundan private methodlardan
  override yapilamayacagindan private methodlarda abstract olamiyor.

 Abstract class'in abstract ya da concrete child'i olabilir.


 */
public abstract class Courses {

    public abstract void math();//Bu method'un {} yani body'si yok.


    public void art(){
        System.out.println("Learn art");
    }
    //yukaridaki method'un body'si var ve abstract class icine yazilabilir. Body'si olan methoda concrete method denir.






}

