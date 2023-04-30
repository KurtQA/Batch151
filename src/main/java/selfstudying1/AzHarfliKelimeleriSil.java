package selfstudying1;

import java.util.ArrayList;
import java.util.List;

public class AzHarfliKelimeleriSil {

    public static void main(String[] args) {

        // create a new ArrayList of Strings
        ArrayList<String> str = new ArrayList<>();

        // add the elements to the ArrayList
        str.add("orange");
        str.add("apple");
        str.add("banana");
        str.add("kiwi");
        str.add("pear");
        str.add("mango");

        // print out the elements of the ArrayList
        System.out.println("Elements of the ArrayList: ");

        for (String s : str) {
            if (s.length() > 5) {
                System.out.print(s + " ");// orange banana
            }
        }
        //2.way
        List<String> names = new ArrayList<>();
        names.add("Nermin");
        names.add("Ayse");
        names.add("Saliha");
        names.add("Sema");
        names.add("Hilal");
        System.out.println(names);

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() < 5) {
                names.remove(names.get(i));
                i--;
            }
        }
        System.out.println(names);//[Nermin, Saliha, Hilal]
    }

}