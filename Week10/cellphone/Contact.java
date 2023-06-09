package cellphone;

public class Contact {
    String nama;
    String nomor;

    public Contact(String nama, String nomor2)
    {
        this.nama = nama;
        this.nomor = nomor2;
    }

    String getNama()
    {
        return this.nama;
    }

    String getNomor()
    {
        return this.nomor;
    }

}