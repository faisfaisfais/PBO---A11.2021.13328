public class MahasiswaLulus extends Mahasiswa {
    // Atribut
    int tahunWisuda;
    float ipk;

    // Method
    boolean ikutWisuda() {
        if (tahunWisuda <= 2020) {
            System.out.println("Apakah sudah wisuda? ");
            return true;
        } else {
            System.out.println("Apakah sudah wisuda? ");
            return false;
        }
    }

    @Override
    public void infoMahasiswa() {
        if (ikutWisuda() == true) {
            int temp = loop * 4;
            this.ipk = (super.totalIPK / temp) + 2;
            System.out.println("Lulus dengan IPK " + ipk);
            super.infoMahasiswa();
        } else {
            super.infoMahasiswa();
        }
    }
}
