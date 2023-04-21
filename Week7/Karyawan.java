import java.util.Scanner;

public class Karyawan {
    String nip, nama, status;
    Scanner input = new Scanner(System.in);

    public void inputKar() {
        System.out.println("DATA KARYAWAN");
        System.out.print("Input NIP                     : ");
        nip = input.nextLine();
        System.out.print("Input Nama                    : ");
        nama = input.nextLine();
        System.out.print("Input Status(Tetap/Kontrak)   : ");
        status = input.nextLine();
    }
}
