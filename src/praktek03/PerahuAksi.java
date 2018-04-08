
package praktek03;

public class PerahuAksi {
    public static void main(String[] args) {
        Perahu p = new Perahu();
        
        p.setBahan("Gabus");
        p.setWarna("Putih Kelabu");
        p.setHarga(5000);
        
        p.cetakInfo();
        
        System.out.print("Bahannya \t: ");
        System.out.println(p.getBahan());
        System.out.print("Warnanya \t: ");
        System.out.println(p.getWarna());
        System.out.print("Harganya \t: ");
        System.out.println(p.getHarga());
    }
}
