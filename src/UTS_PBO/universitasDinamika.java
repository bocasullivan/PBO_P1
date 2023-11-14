package UTS_PBO;

// Soal
// Universitas Dinamika memiliki 200 karyawan yang terbagi ke dalam kelompok tenaga pendidik dan tenaga kependidikan
// tenaga pendidik mendapatkan gaji umr + tunjangan, JIKA S2 TUNJANGAN 1 JUTA, JIKA S3 TUNJANGAN 1.5 JUTA
// tenaga kependidikan mendapatkan gaji umr tanpa tunjangan
// selain gaji ada tunjangan hari raya 2x setahun untuk semua karyawan sebesar 1X UMR
// Bagi karyawan yang menjabat dapat tunjangan transport dengan nilai fleksibel
// UMR = 3.850.000
// Buatlah program penggajian tersebut dengan menerapkan proses PBO (Abstract, Enkapsulasi, PolyMorphism, dan Inheritance)
// Buatlah menu sbg berikut : 
    // 1. Input Data Karyawan
    // 2. Input Data Tunjangan Transport
    // 3. Cetak Slip Gaji
    // 4. Keluar

import java.util.ArrayList;

abstract class universitasDinamika {
    private String nama, ttl, NIK;
    private int umr = 3850000;
    private int thr = 2*umr;
    private String jabatan;
    private int tunjanganTransport;

    public universitasDinamika(String nama,int umr,int thr, String ttl, String NIK, String jabatan, int tunjanganTransport) {
        this.nama = nama;
        this.umr = umr;
        this.thr = thr;
        this.ttl = ttl;
        this.NIK = NIK;
        this.jabatan = jabatan;
        this.tunjanganTransport = tunjanganTransport;
        
    }
    
//    SETTER
    public void setNama (String nama){
        this.nama = nama;
    }
    public void setUmr (int umr){
        this.umr = umr;
    }
    public void setThr(int thr){
        this.thr = thr;
    }
    public void setTtl (String ttl){
        this.ttl = ttl;
    }
    public void setNik (String NIK){
        this.NIK = NIK;
    }
    public void setJabatan (String jabatan){
        this.jabatan = jabatan;
    }

    public void setTunjanganTransport(int tunjanganTransport) {
        this.tunjanganTransport = tunjanganTransport;
    }
    
//    GETTER
    public String getNama(){
        return this.nama;
    }
    public int getUmr(){
        return this.umr;
    }
    public int getThr (){
        return this.thr;
    }
    public String getTtl(){
        return this.ttl;
    }
    public String getNik(){
        return this.NIK;
    }
    public String getJabatan(){
        return this.jabatan;
    }
    public int getTunjanganTransport() {
        return this.tunjanganTransport;
    }
    public abstract String getLulusan();
    public abstract int getTunjangan();
}
class tenagaKependidikan extends universitasDinamika{
    private String lulusan;
    private int tunjangan;


    public tenagaKependidikan(String nama,int umr,int thr, String ttl, String NIK, String jabatan, String lulusan, int tunjangan, int tunjanganTransport) {
        super(nama,umr,thr, ttl, NIK, jabatan, tunjanganTransport);

        this.lulusan = lulusan;
        this.tunjangan = tunjangan;
    }
    public String getLulusan (){
        return lulusan;
    }
    public int getTunjangan (){
        return tunjangan;
    }
}
class tenagaPendidik extends universitasDinamika{
    private String lulusan;
    private int tunjangan;

    public tenagaPendidik(String nama,int umr,int thr, String ttl, String NIK, String jabatan, String lulusan, int tunjangan, int tunjanganTransport ) {
        super(nama,umr,thr, ttl, NIK, jabatan, tunjanganTransport);

        this.lulusan = lulusan;
        this.tunjangan = tunjangan;
    }
    public String getLulusan (){
        return lulusan;
    }
    public int getTunjangan (){
        return tunjangan;
    }
}
class manajemenKaryawan {
    private static ArrayList<universitasDinamika> daftarKaryawan = new ArrayList<>();
    public static void tambahkanKaryawan(universitasDinamika undika){
        daftarKaryawan.add(undika);
    }
    public static void tampilkanDaftarKaryawan(){
        for (universitasDinamika undika : daftarKaryawan){
            System.out.println("Nama Karyawan = " + undika.getNama());
            System.out.println("Tempat Tanggal Lahir = " + undika.getTtl());
            System.out.println("Nomor Induk Karyawan =  " + undika.getNik());
            System.out.println("Lulusan Karyawan = " + undika.getLulusan());
            System.out.println("Jabatan Karyawan = " + undika.getJabatan());
            System.out.println("Gaji UMR Karyawan = " + undika.getUmr());
            System.out.println("Tunjangan Karyawan = " + undika.getTunjangan());
            System.out.println("Tunjangan Hari Raya = " + undika.getThr());
            if (undika instanceof universitasDinamika) {
                int tunjanganTransport = ((universitasDinamika) undika).getTunjanganTransport();
                System.out.println("Tunjangan Transport = " + tunjanganTransport);
            }
            System.out.println("Total Gaji Karyawan 1 Tahun = " + ((undika.getUmr() + undika.getTunjangan()
                    + undika.getThr())*12));
        }
    }
    public static universitasDinamika cariKaryawan(String nik) {
        for (universitasDinamika karyawan : daftarKaryawan) {
            if (karyawan.getNik().equals(nik)) {
                return karyawan;
            }
        }
        return null;
    }
}
