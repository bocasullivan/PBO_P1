package Lat_Constructor;

public class mobil {
    String warna;
    String merk;
    int tahunProduksi;


    public mobil(String warna, int tahunProduksi, String merk){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
        this.merk = merk;
    }
    public void info(){
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahunProduksi);
    }

}
