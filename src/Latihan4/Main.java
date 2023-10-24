package Latihan4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Game gameA = new Game(" ", " ", " ");
        Game gameB = new Game(" ", " ", " ", " ", " ");

        try {
            do{
                System.out.println("====================");
                System.out.println("      MENU GAME     ");
                System.out.println("====================");
                System.out.println("1. Input Game A");
                System.out.println("2. Input Game B");
                System.out.println("3. Lihat Data Game");
                System.out.println("4. Keluar");

                int pilihan = Integer.parseInt(br.readLine());

                switch (pilihan){
                    case 1 :
                        System.out.println("====================");
                        System.out.println("    INPUT GAME A    ");
                        System.out.println("====================");
                        System.out.println("Masukkn Kode : ");
                        String kode = br.readLine();
                        System.out.println("Masukkan Nama Game : ");
                        String namaGame = br.readLine();
                        System.out.println("Masukkan Lisensi : ");
                        String lisensi = br.readLine();

                        gameA = new Game (kode, namaGame, lisensi);
                        System.out.println();
                        System.out.println("### DATA GAME TELAH DISIMPAN ###");
                        break;
                    case 2 :

                }
            }while(true);
        }catch(Exception e){
            System.out.println("Inputab Harus Berupa Angka");
        }
    }
}
