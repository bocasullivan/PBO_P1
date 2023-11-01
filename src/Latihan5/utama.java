package Latihan5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class utama {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        INSTANCE OF MANUSIA
        manusia[] m = new manusia[2];
//        DEKLARASI VARIABLE
        int x = 0;
        do {
//            INPUT
            System.out.println("User : " + (x + 1));
            System.out.println("Masukkan tinggi badan : ");
            double t = Double.parseDouble(br.readLine());
            System.out.println("Masukkan Berat Badan : ");
            double b = Double.parseDouble(br.readLine());
            System.out.println("Masukkan Jenis Kelamin anda : ");
            String jk = br.readLine();
//            PROSES + OUTPUT
            if (jk.toUpperCase().equals("L")) {
                m[x] = new lakilaki(t, b);
                System.out.println("Berat badan laki laki ideal anda adalah : " + m[x].htgBBI());
                System.out.println("IMT anda adalah : " + m[x].IMT());
                if (m[x].IMT() < 18.5) {
                    System.out.println("Berat Badan Anda KURANG !");
                } else if (m[x].IMT() >= 18.5 && m[x].IMT() <= 24.9) {
                    System.out.println("Berat Badan Anda IDEAL !");
                } else if (m[x].IMT() >= 25 && m[x].IMT() <= 29.9) {
                    System.out.println("Berat Badan Anda Kelebihan dan Memasuki Pre - Obesitas");
                } else if (m[x].IMT() >= 30 && m[x].IMT() <= 34.9) {
                    System.out.println("Berat Badan Anda Obesitas Tingkat I");
                } else if (m[x].IMT() >= 35 && m[x].IMT() <= 39.9) {
                    System.out.println("Berat Badan Anda Obesitas Tingkat II");
                } else if (m[x].IMT() >= 40) {
                    System.out.println("Berat Badan Anda Obesitas Tingkat III");
                    System.out.println("");
                }
            }else{
                m[x] = new perempuan(t, b);
                System.out.println("Berat badan perempuan ideal anda adalah : " + m[x].htgBBI());
                System.out.println("IMT anda adalah : " + m[x].IMT());
                if (m[x].IMT() < 18.5) {
                    System.out.println("Berat Badan Anda KURANG !");
                } else if (m[x].IMT() >= 18.5 && m[x].IMT() <= 24.9) {
                    System.out.println("Berat Badan Anda IDEAL !");
                } else if (m[x].IMT() >= 25 && m[x].IMT() <= 29.9) {
                    System.out.println("Berat Badan Anda Kelebihan dan Memasuki Pre - Obesitas");
                } else if (m[x].IMT() >= 30 && m[x].IMT() <= 34.9) {
                    System.out.println("Berat Badan Anda Obesitas Tingkat I");
                } else if (m[x].IMT() >= 35 && m[x].IMT() <= 39.9) {
                    System.out.println("Berat Badan Anda Obesitas Tingkat II");
                } else if (m[x].IMT() >= 40) {
                    System.out.println("Berat Badan Anda Obesitas Tingkat III");
                    System.out.println("");
                }
//                COUNTER
            }x++;
            }while (x < 2) ;
        }
    }
