import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        kotak k = new kotak();

        System.out.println("Masukkan panjang = ");
        k.panjang = Integer.parseInt(br.readLine());
        System.out.println("Masukkan lebar = ");
        k.lebar = Integer.parseInt(br.readLine());

        k.hitungLuas(k.panjang, k.lebar);

        System.out.println("Keliling = " + k.hitungKeliling(k.panjang, k.lebar));
    }
}