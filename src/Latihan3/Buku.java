package Latihan3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Buku{
    String judul;
    String pengarang;
    String penerbit;
    int tahunTerbit;

    public Buku(String judul, String pengarang, String penerbit, int tahunTerbit){
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahunTerbit = tahunTerbit;
    }
    public void cetakBuku(){
        System.out.println("Judul Buku = " + judul);
        System.out.println("Nama Pengarang = " + pengarang);
        System.out.println("Nama Penerbit = " + penerbit);
        System.out.println("Tahun Terbit = " + tahunTerbit);
    }
}

