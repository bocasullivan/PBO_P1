package TPraktikum4;

class Kategori extends Produk{
    private String kategoriBrg;

    Kategori(String nama, int harga, int stok){
        super (nama, harga, stok);
    }

    Kategori(String nama, int harga, int stok, String kategoriBrg){
        super.setNama(nama);
        super.setHarga(harga);
        super.setStok(stok);

        this.kategoriBrg = kategoriBrg;
    }
    public void setKategoriBrg(String kategoriBrg){
        this.kategoriBrg = kategoriBrg;
    }
    public String getKategoriBrg(){
        return this.kategoriBrg;
    }
    public void tampilkanInfo (){
        System.out.println("Nama Produk = " + getNama());
        System.out.println("Harga Produk = " + getHarga());
        System.out.println("Stok Produk = " + getStok());
        System.out.println("Kategori Produk = " + getKategoriBrg());
    }
}
