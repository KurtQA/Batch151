package day_11_practice;

public class Den_C03_Cons {
    public static void main(String[] args) {



            C03_Constructor obj1 =new C03_Constructor();

            obj1.marka = "Mercedes";
            obj1.model = "C180";
            obj1.yil = 2023;
            obj1.yakit = "Benzin";


            System.out.println(obj1.marka); // Mercedes
            System.out.println(obj1.model);  // C180
            System.out.println(obj1.yil); // 2023
            System.out.println(obj1.yakit);  // Benzin


        }



    }
        //objeyi olustururken icinde bulundugumuz class ismini degil
        //ulasmak istedigimiz variable'in bulundugu classin ismini yazarak
        //olusturduk. Olusturdugumuz objenin constructor'i(C03_Constructor();)
        //parametresiz olup buradan gitmek istedigimiz class'in default
        //constructor'ina ' gidecek. Default constructor gorunmuyor. Default
        //constructor parametresi ici bos oldugundan bir sey yapamadan
        //geri donus yapar. Bu nedenle biz instance variablelara kendimiz
        //olusturdugumuz objeyi kullanarak deger atamasi yapacagiz.
    /*
    obj1 objesi uzerinden marka variable'ina "Mercedes"'i assign ettik.
    obj1 uzerinden model variable'ina "C180" degerini assign ettik.
    obje1 uzerinden yil variable'ina 2023'u assign ettik
    obje1 uzerinden yakit variable'ina "Benzin" degerini atadik.

    Sonra sout ile her bir deger verdigimiz variable'a bakacagiz. Sout
    icine obje ismi (.) ve ekinde marka, model, yil, yakit yazinca yeni
    degerlerini gorebildik.
     */



