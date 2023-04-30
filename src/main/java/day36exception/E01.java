package day36exception;

public class E01 {
    /*
            * try kisminda birden fazla exception olusturma ihtimali olan kod varsa, coklu catch kullanabilirsiniz.
            * Coklu catch kullandiginizda Exception classlar arasinda parent-child iliskisi yoksa catch'lerin sirasi
            önemli degildir. Ama kod daki siralamaya uymak tavsiye edilir.
            * Coklu catch kullandiginizda Exception classlar arasinda parent-child iliskisi varsa catchlerin sirasina
            dikkat etmeliyiz, child class ustte olmalidir.
            * Exception classlar arasinda parent-child iliskisi varsa
                   =>ya child classi uste yazarak child ve parent icin ozellestirilmis codelar yazarsiniz
                   =>yada child i hic kullanmaz sadece parent ile exceptionlari handle etmeye calisirsiniz.
    */
    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        String s = "My Java";
        getCharFromString(s,a,b);//J

    }

    public static void getCharFromString(String s, int a, int b) {
        try{
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch(ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("olmayan index kullandiniz");
        }


    }


}