public class kotak {
    int panjang;
    int lebar;

    void hitungLuas (int panjang, int lebar){
        System.out.println("Luas : " + ( panjang * lebar ));

    }

    int hitungKeliling (int panjang, int lebar){
        return 2 * (panjang + lebar);
    }
}
