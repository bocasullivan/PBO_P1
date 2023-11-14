package UTS_PBO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static UTS_PBO.manajemenKaryawan.cariKaryawan;

public class main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int umr = 3850000;
        int thr = 2*umr;
        
        while (true) {
            System.out.println("MENU : ");
            System.out.println("1. Input Data Karyawan");
            System.out.println("2. Input Data Tunjangan Transport");
            System.out.println("3. Cetak Slip Gaji");
            System.out.println("4. Keluar");
            System.out.println(" ");
            System.out.print("Silahkan Pilih Layanan : ");
            int pilih = Integer.parseInt(br.readLine());
            
            switch (pilih){
                case 1 :
                    System.out.println("Masukkan Nama Karyawan = ");
                    String nama = br.readLine();
                    System.out.println("Masukkan Tempat dan Tanggal Lahir = ");
                    String ttl = br.readLine();
                    System.out.println("Masukkan Nomor Induk Karyawan = ");
                    String NIK = br.readLine();
                    System.out.println("Masukkan Lulusan Terakhir (S1 / S2 / S3) = ");
                    String lulusan = br.readLine();
                    System.out.println("Masukkan Jabatan Karyawan = ");
                    String jabatan = br.readLine();
                    System.out.println("Masukkan Jenis Karyawan (Tenaga Pendidik / Tenaga Kependidikan) = ");
                    String jk = br.readLine();
                    int tunjanganTransport = 0;
                    if (jk.equalsIgnoreCase("Tenaga Pendidik")){
                        if (lulusan.equalsIgnoreCase("S2")) {
                            int tunjangan = 1000000;
                            tenagaPendidik tp = new tenagaPendidik(nama,umr,thr, ttl, NIK, jabatan, lulusan, tunjangan, tunjanganTransport);
                        manajemenKaryawan.tambahkanKaryawan(tp);
                        }else if (lulusan.equalsIgnoreCase("S3")){
                            int tunjangan = 1500000;
                            tenagaPendidik tp = new tenagaPendidik(nama,umr,thr, ttl, NIK, jabatan, lulusan, tunjangan, tunjanganTransport);
                        manajemenKaryawan.tambahkanKaryawan(tp);
                        }else{
                            int tunjangan = 0;
                            tenagaPendidik tp = new tenagaPendidik(nama,umr,thr, ttl, NIK, jabatan,  lulusan, tunjangan, tunjanganTransport);
                            manajemenKaryawan.tambahkanKaryawan(tp);
                        }
                    }else {
                        int tunjangan = 0;
                        tenagaKependidikan tk = new tenagaKependidikan(nama, umr,thr, ttl, NIK, jabatan, lulusan, tunjangan, tunjanganTransport);
                        manajemenKaryawan.tambahkanKaryawan(tk);
                    }
                    break;
                case 2 :
                    System.out.println("Masukkan Nomor Induk Karyawan = ");
                    String nikTransport = br.readLine();
                    universitasDinamika karyawanTransport = cariKaryawan(nikTransport);
                    if (karyawanTransport != null) {
                        // Pengecekan jabatan sebelum memberikan tunjangan transport
                        if (!karyawanTransport.getJabatan().equalsIgnoreCase("tidak ada")) {
                            System.out.println("Masukkan Jumlah Tunjangan Transport untuk " + karyawanTransport.getNama() + " = ");
                            tunjanganTransport = Integer.parseInt(br.readLine());
                            karyawanTransport.setTunjanganTransport(tunjanganTransport);
                            System.out.println("Data Tunjangan Transport berhasil diinputkan untuk " + karyawanTransport.getNama());
                        } else {
                            System.out.println(karyawanTransport.getNama() + " tidak memenuhi syarat untuk mendapatkan tunjangan transport.");
                        }
                    } else {
                        System.out.println("Karyawan dengan NIK " + nikTransport + " tidak ditemukan.");
                    }
                    break;
                case 3 :
                    System.out.println("Daftar Karyawan = ");
                    manajemenKaryawan.tampilkanDaftarKaryawan();
                    break;
                case 4 :
                    System.out.println("KELUAR PROGRAM");
                    System.exit(0);
                case 5 :
                    System.out.println("Pilihan Tidak Valid");
                    break;
            }
            
        }
    }
    
}
