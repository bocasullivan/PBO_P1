package Latihan4;

class Software {
    private String kode, nama, lisensi;

    Software (){

    }
    Software (String kode, String nama, String lisensi) {
        this.kode = kode;
        this.nama = nama;
        this.lisensi = lisensi;
    }

    public void setKode (String kode) {
        this.kode = kode;
    }
    public void setNama (String nama) {
        this.nama = nama;
    }
    public void setLisensi (String lisensi) {
        this.lisensi = lisensi;
    }

    public String getKode () {
        return this.kode;
    }
    public String getNama () {
        return this.nama;
    }
    public String getLisensi () {
        return this.lisensi;
    }
}
