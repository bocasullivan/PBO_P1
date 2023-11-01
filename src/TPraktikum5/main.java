package TPraktikum5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sepatu[] s = new sepatu[2];
        int x = 0;
        do{
            System.out.println("User ke - " + (x+1));
            System.out.print("Masukkan Panjang Telapak Kaki = ");
            double p = Double.parseDouble(br.readLine());
            s[x] = new ukuranSepatu(p);
            System.out.println("Ukuran EUROPE anda adalah : " + s[x].hasilEU());
            System.out.println("Ukuran UK anda adalah : " + s[x].hasilUK());
            x++;
            System.out.println(" ");
        }while (x<2);

    }
}
