package Latihan6;

interface operasi {
    public void penjumlahan();
    public void pengurangan();
    public double perkalian();
    public double pembagian();
}
public class kalkulator implements operasi{
    double bil1;
    double bil2;

    kalkulator(){

    }
    kalkulator (double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    public void penjumlahan () {
        System.out.println("Hasil Penjumlahan = " + (this.bil1 + this.bil2));
    }
    public void pengurangan (){
        System.out.println("Hasil Pengurangan = " + (this.bil1 - this.bil2));
    }
    public double perkalian (){
        return (this.bil1 * this.bil2);
    }
    public double pembagian (){
        return (this.bil1 / this.bil2);
    }

}
