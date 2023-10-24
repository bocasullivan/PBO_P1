package Latihan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int menu;

        segitiga s = new segitiga();
        lingkaran l = new lingkaran();

        do {
            System.out.println("1. Insert Data Segitiga");
            System.out.println("2. Insert Data Lingkaran");
            System.out.println("3. View Luas Segita dan Lingkaran");
            System.out.println("4. Keluar");
            System.out.println("========================================");
            System.out.print("Silahkan Pilih Menu = ");
            menu = Integer.parseInt(br.readLine());
            switch (menu){
                case 1 :
                    System.out.println("1. Insert Data Segitiga");
                    System.out.print("Masukkan Alas Segitiga = ");
                    s.alas = Double.parseDouble(br.readLine());
                    System.out.print("Masukkan Tinggi Segitiga = ");
                    s.tinggi = Double.parseDouble(br.readLine());
                    System.out.println("=====================================");
                    break;
                case 2 :
                    System.out.println("1. Insert Data Segitiga");
                    System.out.print("Masukkan Jari - Jari = ");
                    l.jari = Double.parseDouble(br.readLine());
                    System.out.println("=====================================");
                    break;
                case 3 :
                    System.out.println("3. View Luas Segitiga dan Lingkaran");
                    s.hitungLuas();
                    l.hitungLuas();
                    System.out.println("=====================================");
                    break;
                case 4 :
                    System.out.println("4. Keluar");
                    System.exit(0);
            }
        }while (true);
    }
}
