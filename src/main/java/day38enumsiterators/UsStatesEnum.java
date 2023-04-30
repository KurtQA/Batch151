package day38enumsiterators;
/*
Iterator'lar looplarin yaptigi ayni isi yapar. Iterator'da looplardaki gibi sonsuz loop olusma
ihtimali yoktur.
Iteratorlar ile looplar arasinda hiz bakimindan performans farki yoktur.

Itereatorlar bir collectiondan eleman silme ve collectiondaki elemani degistirme konusunda looplara nazaran
daha basarilidir.
Iki tip iterator vardir. Birincisi sadece iterator olup bu sadece eleman silmede kullanilir.
Eleman eklemek veya elemani degistirmek mumkun degildir.
Ikincisi ise ListIterator olup, elaman silebilir, ekleyebilir ve degistirebilir.
Iterator sadece soldan saga dogru for each loop gibi ilk elemandan son elemana kadar calisir.
ListIterator ise iki yonlu calisabilir. Bastan sona, sondan bas elemana gidebilir.

Main method icinde bir List olusturduk ve import ettik. Burada loop yerine Iterator kullandik.
Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. While loop kullandik.
While icine myItr.hasNext() yazarak iteratordaki sonraki eleman var mi diye soracagiz, varsa onu silmesini
isteyecegiz. Su sekilde devam ettik:
myItr.next();
myItr.remove();
Sonda sout icine myList yazarak elemanlari bir list icinde ekranda gorebildik. Iterator sayesinde sonsuz loop
tehlikesi ile karsilasmadik.
Biz bu kodu yazinca Java ayni elemanlari iterator yapisi icine koydu. Biz liste bakinca bir de iteratora bakinca
ayni seyi gorsek de yapi olarak farklidirlar. Fark: Ilk elemanin oncesine iterator bir pointer koyuyor.
Biz has.Next methodu kullaninca bu methodla ilk pointer'a gelip kendisinden sonra bir eleman var mi diye
sormus olduk. Pointer kendisinden sonra Tom olduguna isaret ediyor yani true oluyor. Daha sonra bir sonraki
elemanin onune java tarafindan konulan pointer'a gelip senden sonra eleman var mi diye methodumuz sormaya devam eder.
While loop condition'i true oldugu surece bir sonraki elemanin olup olmadigina bakilir.
Remove methodu ise gelip oldugu anlasilan ilk eleman silinir ve sonraki kisma gelir. Once has.Next sonra next methodu
ile bir sonrakine atlanir ve remove calisir, elemani siler.
remove methodu her eleman icin calisacak. Tum elamanlar silinince son olarak bos bir list gorecegiz ekranda

////

hasNext(); Iterator'da bir sonraki eleman var mi yok mu onu sorar.True veya false dondurur.
next();Iterator'da bir sonraki elemani almak icin kullanilir

Iterator kullandigimizda baslangic degeri ilk eleman olur, condition'da next methodu kullaniliyor.

///
ListIterator kullanmak icin yeni bir List yaptik. Elemanlarini add methodu ile ekledik.
yourList. yapinca methodlari gorduk ve ListIterator'i sectik. Bu bize String verecek. Listimizi ListIterator'a
cevirecek.
ListIterator<String> konteynerina yourListItr'yi assign ettik.
While loop kullandik ve parantez icinde listIterator'imizin ismini yazip nokta koyunca methodlari gorduk.
Methodlardan has.Next() methodunu secip condition olarak yazdik. Daha sonra ListItaretor'imizi kullanarak
baska methodlara baktik, Iterator'a oranla daha fazla method oldugunu gorduk.
Oradaki next methodunu aldik, next methodumuzu el isimli String'e assign ettik.ve devaminda yine
ListIterator'imiz ismini yazip nokta koyduk ve set methodunu aldik.
set methodu icine el + "!" yazarak her elamanin onundeki pointeri alip o elemanin uzerinden atlayip bir sonrakinin
onune poiter'i koymasini sagladik. Ancak her atlayista uzerinden atlanan elemanin yanina ! isareti eklenecek, cunku
biz set methodu ile bunu istedik. Set methodu icinde concatination yaptik.
Sout icine listimizin ismini yazinca ekrana [Tom!, Jim!, Clara!] yazildi. has.Next nethodu calisirken son elemandan
sonra bir eleman olmadigi anlasilinca false olur ve loop kirilir. Pointer en saga gelmeden hasPrevious methodunu
kullanamayiz. Kullanirsak bastaki elemanin oncesinde eleman olmadigindan loop kirilir.

 */
import java.util.Arrays;

public enum UsStatesEnum {

    ALABAMA("Alabama", "AL", "Montgomery"),
    ALASKA("Alaska", "AK", "Juneau"),
    AMERICAN_SAMOA("American Samoa", "AS", "Pago Pago"),
    ARIZONA("Arizona", "AZ", "Phoenix"),
    ARKANSAS("Arkansas", "AR", "Little Rock"),
    CALIFORNIA("California", "CA", "Sacramento"),
    COLORADO("Colorado", "CO", "Denver"),
    CONNECTICUT("Connecticut", "CT", "Hartford"),
    DELAWARE("Delaware", "DE", "Dover"),
    DISTRICT_OF_COLUMBIA("District of Columbia", "DC", "Washington"),
    FLORIDA("Florida", "FL", "Tallahassee"),
    GEORGIA("Georgia", "GA", "Atlanta"),
    GUAM("Guam", "GU", "Hagatna"),
    HAWAII("Hawaii", "HI", "Honolulu"),
    IDAHO("Idaho", "ID", "Boise"),
    ILLINOIS("Illinois", "IL", "Springfield"),
    INDIANA("Indiana", "IN", "Indianapolis"),
    IOWA("Iowa", "IA", "Des Moines"),
    KANSAS("Kansas", "KS", "Topeka"),
    KENTUCKY("Kentucky", "KY", "Frankfort"),
    LOUISIANA("Louisiana", "LA", "Baton Rouge"),
    MAINE("Maine", "ME", "Augusta"),
    MARSHALL_ISLANDS("Marshall Islands", "", "Majuro"),
    MARYLAND("Maryland", "MD", "Annapolis"),
    MASSACHUSETTS("Massachusetts", "MA", "Boston"),
    MICHIGAN("Michigan", "MI", "Lansing"),
    MINNESOTA("Minnesota", "MN", "Saint Paul"),
    MISSISSIPPI("Mississippi", "MS", "Jackson"),
    MISSOURI("Missouri", "MO", "Jefferson City"),
    MONTANA("Montana", "MT", "Helena"),
    NEBRASKA("Nebraska", "NE", "Lincoln"),
    NEVADA("Nevada", "NV", "Carson City"),
    NEW_HAMPSHIRE("New Hampshire", "NH", "Concord"),
    NEW_JERSEY("New Jersey", "NJ", "Trenton"),
    NEW_MEXICO("New Mexico", "NM", "Santa Fe"),
    NEW_YORK("New York", "NY", "Albany"),
    NORTH_CAROLINA("North Carolina", "NC", "Raleigh"),
    NORTH_DAKOTA("North Dakota", "ND", "Bismarck"),
    NORTHERN_MARIANA_ISLANDS("Northern Mariana Islands", "MP", "Saipan"),
    OHIO("Ohio", "OH", "Columbus"),
    OKLAHOMA("Oklahoma", "OK", "Oklahoma City"),
    OREGON("Oregon", "OR", "Salem"),
    PENNSYLVANIA("Pennsylvania", "PA", "Harrisburg"),
    PUERTO_RICO("Puerto Rico", "PR", "San Juan"),
    RHODE_ISLAND("Rhode Island", "RI","Providence"),
    SOUTH_CAROLINA("South Carolina", "SC", "Columbia"),
    SOUTH_DAKOTA("South Dakota", "SD", "Pierre"),
    TENNESSEE("Tennessee", "TN", "Nashville"),
    TEXAS("Texas", "TX", "Austin"),
    US_VIRGIN_ISLANDS("US Virgin Islands", "VI", "Charlotte Amalie"),
    UTAH("Utah", "UT", "Salt Lake City"),
    VERMONT("Vermont", "VT", "Montpelier"),
    VIRGINIA("Virginia", "VA", "Richmond"),
    WASHINGTON("Washington", "WA", "Olympia"),
    WEST_VIRGINIA("West Virginia", "WV", "Charleston"),
    WISCONSIN("Wisconsin", "WI", "Madison"),
    WYOMING("Wyoming", "WY", "Cheyenne");

    private final String stateName;
    private final String abbreviation;
    private final String capital;

    UsStatesEnum(String stateName, String abbreviation, String capital) {
        this.stateName = stateName;
        this.abbreviation = abbreviation;
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public String getCapital() {
        return capital;
    }

    //State kisaltmasini verince state'in ismini veren method
    public static String getStateNameByUsingAbbreviation(String abbreviation){
        return Arrays.stream(values())
                .filter(usState -> usState.getAbbreviation().equals(abbreviation))
                .findFirst().get().getStateName();
    }

    //State ismini verince state'in kisaltmasini veren method
    public static String getAbbreviationForStateName(String stateName) {
        return Arrays.stream(values())
                .filter(usState -> usState.getStateName().equals(stateName))
                .findFirst().get().getAbbreviation();
    }
}