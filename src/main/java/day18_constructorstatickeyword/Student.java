package day18_constructorstatickeyword;

public class Student {

    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
        numOfRegisteredStd++;
        num++;


    }

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        System.out.println(numOfRegisteredStd);//3
        System.out.println(s1.num);// 1
        //numOfReg artarken, num da artiyordu. Ancak num her artista ayri ayri kutularda birer tane artarken
        //numOfReg tum artislari bir kutuda topladi. Olayda uc kez arttirma yapinca numOfReg kismi uc artti
        //num ise uc ayri kutuda sonuc olarak sadece bir gorundu. Birindeki artis digerini etkilemedi
        //numOfReg kismi static oldugu icin her artistan haberdar
        //num ise birbirinden habersiz ve birbirini etkilemeden artti.
        /*
        1)Static class members (variable+method+constructor+code blocks) tum objectler tarafindan
        paylasilir.
        2)Static class members daki degisiklikler otomatic olarak gorulur.
        3)Static class members gokteki ayin dunyaya bagli oldugu gibi class'a baglidirlar. Bu yuzden,
        statik variable'lara class variable da denir.Bu yaygin olarak soylenir.
        Statik methodlara class method da denir, ancak bu az soylenir.
        4)Statik class members nasil calisir? Anlamak icin cizim yapip, statik olanlari class'a, olmayanlari object'e
        baglayarak dusunmek dogru olur.
         */


    }
}