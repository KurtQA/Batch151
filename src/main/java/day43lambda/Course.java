package day43lambda;

/*
Sagi tiklayip, generate'den constructor'i secip orada gordugumuz asagida yazdigimiz 4 variable'i secerek
bu variablelarin parametre olarak girildigi otomatik bir constructor'imiz ve sonrasinda bir variable secmeden
default constructor'imizi olusturduk.

Variablelarimiz private oldugu ve onlari okumamiz gerektigi icin generate'den herbirini secip getter'lari ve
degisiklik yapabilmek icin herbiri icin setter'lari olusturduk.

Object'i olustururken tum ozellikleri ile gorup yazdirabilmemi icin toString methodunu yine generate'den secip
olusturduk.

Bu 5 seyi(private variable, constructor, getter, setter, toString) barindiran POJO denir. Plain Old Java Object.

 */


/*
        Icinde
            i)private variable'lar
            ii)Parametreli ve parametresiz constructor'lar
            iii)getter'lar
            iv)setter'lar
            v)toString() method'u
        barindiran class'lara "POJO" Class denir.
        POJO: Plain Old Java Object
     */

public class Course {

    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudents, String season, double averageScore) {
        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }

    public Course() {

    }

    public String getCourseName() {
        return courseName;
    }
    public int getNumOfStudents() {
        return numOfStudents;
    }
    public String getSeason() {
        return season;
    }
    public double getAverageScore() {
        return averageScore;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}