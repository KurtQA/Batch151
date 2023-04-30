package day34exceptions;

public class E02 {

    public static void main(String[] args) {

        String a[] = {"A", "V", "A", "J"};

        System.out.println(getElement(a, 3));
        System.out.println(getElement(a, 1));
        System.out.println(getElement(a, 4));
        System.out.println(getElement(a, 2));

        System.out.println(getElement(a, 6));
        System.out.println(getElement(a, -3));
    }


    //Bir String Array'den istenilen bir elemani eleman sirasiyla alan method olusturunuz.

    public static String getElement(String[] a, int numOfElement){

        String result = "";

        try{
            result = a[numOfElement-1];
        }catch(ArrayIndexOutOfBoundsException e){//ArrayIndexOutOfBoundsException array islemlerinde olmayah index kullandiginizda atilir.
            if(numOfElement-1<0){
                result = a[0];
            }else{
                result = a[a.length-1];
            }
        }
        return result;

    }


    /*

    ArrayIndexOutOfBoundsException array islemlerinde olmayan index kullandiginizda atilir.
    a array'imizde 4 eleman var, 6. elemani istersek hata verir. Cunku 6. eleman yok. 6. eleman index 5'tedir ve index
    5 olmadigi icin, yazdirma islemi yaptigimizda ekranda problem exception olarak yazilir ve hangi satirda problem
    oldugu belirtilir.

    Array'imiz [A,V,A,J], numOfElement 6 ise numOfElement-1 5'tir.
    Bu arrayimizde 5. index olmadigindan bu durumda bir exeption atilacak ve bu exepitoni catch yakalayacak. If stament
    icinde 5<0 durumunda false verecek. indexi 0 olan eleman A'yi verir. if

    Javaya numOfElement -3 istersek, bu durumda index -4 olur ve -4 indexi olmayinca exception atilacak


     */
}
