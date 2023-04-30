package selfstudying1;

public class SelfStudy08 {


    public static void main(String[] args) {


        //Verilen bir String arraydeki belirli bir öğenin var olup olmadığını bulmak için kod yaziniz
        String[] arr = new String[]{"Apex", "is", "Apex", "object", "oriented", "programming", "language"};
        String s = "pex";
        int counter = 0;

        for (String w : arr) {
            if (w.equalsIgnoreCase(s)) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println(counter);
            System.out.println(s + " vardir");


        } else {

            System.out.println(s + " yoktur");



        }
    }
}

