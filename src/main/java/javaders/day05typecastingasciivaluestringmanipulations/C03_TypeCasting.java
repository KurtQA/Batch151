package javaders.day05typecastingasciivaluestringmanipulations;

public class C03_TypeCasting {

    public static void main(String[] args) {

    /*
    Numeric Data Type'larinin birbirine donusmesine Type Casting denir
    Numeric Data Type'lari byte<short<int<long<float<double
    Kucuk data typlerinin buyuk data typlerina donusturulmesine Auto Widening(Kucuk kutunun buyuk
    kutu icine yerlestirilmesi)
    tersi durumda buyuk kutunun kucuk kutuya d,nusturlmesinde Java sorumlulugu kabul etmez
    data kaybi olabilecegi icin kodu yazana birakir
    Buna Explicit Narrowing denir.
    Explicit Narrowing ve Auto Widening interview sorusu


     */
     byte age=13;
     int ageInt=age;
     //buna biz Auto Widening diyoruz. Kucuk data type'i buyuk data type icine koyduk.
     //long data type'ni short data type'ina cevirelim
     long population=2344444448L;
     short populationShort= (short) population;
        //short data type'i byte data type;ina cevirleim
        short numberShort=355;
        //byte numberByte=numberShort; bunu yazinca kirmizi rengi verdi cunku short daha buyuktu, byte daha kucuktu
        //bu data type'ina cevirmek icin casting yapmaliyiz yani explicit narrowing yapmaliyiz
        //bunun icin numberByte uzerine gidin, casting yapilmasi yonundeki oneriyi dikkate alip uzerini tikla
        //o zaman duzeliyor
        byte numberByte= (byte) numberShort;
        //gordugunuz gibi atama operatorunden (=) sonra parantez icinde byte yazisini ekledi ve duzeldi




    }
}
