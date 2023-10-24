package Latihan4;

class Game extends Software {
    private String jenis = "unknown";
    private String tipe = "unknown";

    Game (String kode, String nama, String lisensi) {
        super(kode, nama, lisensi);
    }

    Game (String kode, String nama, String lisensi, String jenis, String tipe) {
        super.setKode(kode);
        super.setNama(nama);
        super.setLisensi(lisensi);

        this.jenis = jenis;
        this.tipe = tipe;
    }
}
