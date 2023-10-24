package TPraktikum4;

public class Produk {
    private String nama;
    private int harga;
    private int stok;

//    CONSTRUCTOR
    public Produk(){

    }
    public Produk (String nama, int harga, int stok){
        this.nama     = nama;
        this.harga    = harga;
        this.stok     = stok;
    }
//    SETTER
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
//    GETTER
    public String getNama(){
        return this.nama;
    }
    public int getHarga(){
        return this.harga;
    }
    public int getStok(){
        return this.stok;
    }

}
