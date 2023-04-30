package day36exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E06 {
    /*
    1) FileNotFoundException ve IOException Compile Time Exceptionlardir, yani code'u yazarken hata aliriz
    2) FileNotFoundException path'in dogrulugu ve dosyanin varligi ile ilgilidir.
       IOException tum input ve output islemleri ile ilgilidir.
    3) IOException Class, FileNotFoundException Class'in parentidir
    4) Istenirse FileNotFoundException yerine IOException da kullanilabilir
    5) IOException class ve FileNotFoundException beraber kullanilacaksa FileNotFoundException ustte
        IOException altta kullanilmalidir.
    */
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("src/main/java/day36exceptions/file.txtp");
            int k=0;
            while ((k=fis.read())!=-1){
                System.out.print((char) k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the file does not exist");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}