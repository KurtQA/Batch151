package day35exception;


public class E02 {
    public static void main(String[] args) {
        String s = "1234";
        convertStringToInt(s);
        String t = "1234a";
        convertStringToInt(t);
    }
    public static void convertStringToInt(String s){
        //Eger icinde rakamlar disinda character olan bir string i sayiya cevirmek isterseniz java NumberFormatException atar
        try{
            int intS =  Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir stringin sayiya donusturulebilmesi icin rakam disi character icermemesi gerekir");
            System.out.println(e.getMessage());//For input string: "1234a"
        }
    }
}
