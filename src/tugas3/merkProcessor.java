package tugas3;

// INI CLASS
class Processor {

//    INI VARIABLE DAN MODIFIER
    private String merek;
    private String slot;
    private int thnProduksi;

//    INI KONSTRUKTOR
    public Processor(String merek, String slot, int thnProduksi) {
        this.merek = merek;
        this.slot = slot;
        this.thnProduksi = thnProduksi;
    }

//    INI METHOD
    public void tampilkanInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Jenis: " + slot);
        System.out.println("Tahun Produksi: " + thnProduksi);
    }
}

public class merkProcessor {
    public static void main(String[] args) {
//        INI OBJECT
        Processor prosesor = new Processor("INTEL CORE I7 - 13700KF", "LGA 1700", 2023);

        System.out.println("Informasi Processor:");
        prosesor.tampilkanInfo();
    }
}

