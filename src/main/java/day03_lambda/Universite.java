package day03_lambda;

public class Universite {

    private String name;
    private String bolumAdi;
    private int ogrenciSayisi;
    private int notOrtalamasi;

    public Universite() { //parametresiz cons. Bunu sagi tiklayip generate kismindan constructor'a giderek
        //select none kismina basinca parametresiz constructor olustu.
    }

    public Universite(String name, String bolumAdi, int ogrenciSayisi, int notOrtalamasi) {
        //Bu constructor'i genarate ve constructor'dan olustururken variablelarimiz gorundu ve hepsini secince
        //arguman olarak constructorimiz icine alindilar.
        this.name = name;
        this.bolumAdi = bolumAdi;
        this.ogrenciSayisi = ogrenciSayisi;
        this.notOrtalamasi = notOrtalamasi;
    }
    //Tum variablelarin degerlerinin getirilmesi ve degismesi mumkun olsun diye genarate kismindan tum variable
    //lari getter ve setter ile secerek getirdik. Asagida getName, setName kisimlarinin tamami otomatik
    //olarak olustu.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBolumAdi() {
        return bolumAdi;
    }

    public void setBolumAdi(String bolumAdi) {
        this.bolumAdi = bolumAdi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getNotOrtalamasi() {
        return notOrtalamasi;
    }

    public void setNotOrtalamasi(int notOrtalamasi) {
        this.notOrtalamasi = notOrtalamasi;
    }

    @Override
    public String toString() {
        //generate kismindan toString ile tum variable'lari secerek tum bilgilerin yazilmasini sagladik. Biz toString'e
        //basinca asagidaki kisim otomatik olarak yazildi. Asagida yazilmasini istemedigimiz bir kisim varsa o satiri
        //silebiliriz.
        return "Universite{" +
                "name='" + name + '\'' +
                ", bolumAdi='" + bolumAdi + '\'' +
                ", ogrenciSayisi=" + ogrenciSayisi +
                ", notOrtalamasi=" + notOrtalamasi +
                '}';
    }
    //Daha sonra Lambda02 classina gittik ve orada Universite classinin ismi ile yeni bir object olusturduk.
    //parametre olarak sirasiyla "hacettepe", "fizik", "1000", "75" yazdik ve devaminda ayni sekilde
    //olusturdugumuz objectlere yeni parametreler koyduk.
}