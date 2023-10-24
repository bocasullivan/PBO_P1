package TPraktikum4;

public class Main {
    public static void main(String[] args) {
        Produk pd = new Produk("Indomie", 3000, 10);
        Kategori kt = new Kategori("Indomie", 3000, 10, "Makanan");

        System.out.println("==== Informasi Produk ====");
        kt.tampilkanInfo();
    }
}
