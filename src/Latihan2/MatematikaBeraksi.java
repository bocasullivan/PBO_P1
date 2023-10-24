package Latihan2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatematikaBeraksi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Matematika mm = new Matematika();

//        System.out.println("Masukkan Bilangan Pertama = ");
//        mm.bil1 = Integer.parseInt(br.readLine());
//        System.out.println("Masukkan Bilangan Kedua = ");
//        mm.bil2 = Integer.parseInt(br.readLine());

        mm.pertambahan(mm.bil1, mm.bil2);
        mm.pengurangan(mm.bil1, mm.bil2);
        mm.perkalian(mm.bil1, mm.bil2);
        mm.pembagian(mm.bil1, mm.bil2);
    }
}
