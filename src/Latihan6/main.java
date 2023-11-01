package Latihan6;

public class main {
    public static void main(String[] args) {
        kalkulator k = new kalkulator(10,2);
        k.penjumlahan();
        k.pengurangan();
        System.out.println("Hasil Perkalian = " + k.perkalian());
        System.out.println("Hasil Pembagian = " + k.pembagian());
    }
}
