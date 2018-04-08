package praktek03;
    
public class Perahu {
  private String bahan;
  private String warna;
  private double harga;
   
   void cetakInfo(){
       System.out.println("Merk  \t:"+bahan+"\n"+
                          "Warna \t:"+warna+"\n"+
                          "Harga \t:"+harga);
   
   }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
   
}
