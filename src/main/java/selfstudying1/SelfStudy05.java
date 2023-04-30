package selfstudying1;

public class SelfStudy05 {

    public static void main(String[] args) {
        //String içindeki tüm küçük harfleri yıldız işaretiyle yazdırmak için gereken kodu yazınız.
        String s = "Ali Can?";
        s = s.replaceAll("[^a-z]", "");
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            String r = s.substring(i, i + 1);
            t = t + r+ "*";

        }
        System.out.println(t);

    }

}
