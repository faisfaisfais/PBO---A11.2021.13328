public class HitungBangunDatar {
    public static void main(String[] args){
        //Kamus
        int aSegitiga, tSegitiga;
        float phi, dLingkaran, dTabung, tTabung;
        phi = 3.14f;
        dLingkaran = 10;
        aSegitiga = 6;
        tSegitiga = 8;
        dTabung = 5;
        tTabung = 10;

        //Menghitung Keliling Lingkaran
        float keliling = phi * dLingkaran;
        System.out.println("Hasil keliling dari lingkaran berdiameter " + dLingkaran + " adalah " + keliling + "\n");

        //Menghitung Luas Segitiga Siku-Siku
        int luas = (aSegitiga * tSegitiga) / 2;
        System.out.println("Hasil Luas dari Segitiga siku - siku dengan alas " + aSegitiga + " dan tingi " + tSegitiga + " adalah " + luas + "\n");

        //Menghitung Volume Tabung
        float volume = (phi * ((dTabung / 2) * (dTabung / 2)) * tTabung);
        System.out.println("Hasil volume dari tabung dengan  diameter alas " + dTabung + " dan tingi " + tTabung + " adalah " + volume + "\n");
    }
    
}
