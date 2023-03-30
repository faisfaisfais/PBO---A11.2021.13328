public class Kendaraan {
    //atribute
    int roda;
    String warna;
    int kecepatan;
    String merk;

    public void berjalan(String arah){
        System.out.println("Bergerak ke "+arah);
    }

    public void berhenti(){
        kecepatan = 0;
        System.out.println("berhenti");
    }

    public void infoKendaraan(){
        System.out.println("Kendaraan beroda "+roda);
        System.out.println("Kendaraan berwarna "+warna);
        System.out.println("Kendaraan bermerk "+merk);
    }

    public int kecepatanSekarang(int speed, String tipe){
        int x=0;
        if(tipe == "cepat"){
            x = kecepatan + speed;
        }else if(tipe == "lambat"){
            x = kecepatan - speed;
        }
        return x;
    }

    public void mundur(){
        int x = 5;
        kecepatan = kecepatan - x;
    }
}
