package cellphone;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Nokia", "3310");
        cp.powerOn();
        cp.chargeBattery(85);
        cp.displayInfo();
        cp.addContact("Fais", "0899123456");
        cp.addContact("Zuhair", "0879456123");
        cp.displayContacts();
        cp.topUpPulsa(500000);
        System.out.println("Sisa pulsa : " + cp.checkPulsa());
        cp.searchContact("Zuhair");
        cp.searchContact("Fais");
        cp.removeContact("Fais");
        cp.displayContacts();
        cp.powerOff();
    }
}
