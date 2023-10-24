package Latihan2;

public class Matematika {
    int bil1 = 0;
    int bil2 = 0;
    int hasil = 0;

//    METHOD
    void pertambahan (int bil1, int bil2){
        hasil = bil1 + bil2;
        System.out.println("Hasil Pertambahan = " + hasil);
    }
    void pengurangan (int bil1, int bil2){
        hasil = bil1 - bil2;
        System.out.println("Hasil Pengurangan = " + hasil);
    }
    void perkalian (int bil1, int bil2){
        hasil = bil1 * bil2;
        System.out.println("Hasil Perkalian = " + hasil);
    }
    void pembagian (int bil1, int bil2){
        hasil = bil1/bil2;
        System.out.println("Hasil Pembagian = " + hasil);
    }
}
