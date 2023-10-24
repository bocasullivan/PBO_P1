package Lat_Constructor2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mainKotak {
    public static void main(String[] args){
        kotak k = new kotak(6, 3);

        System.out.println("Panjang = " + k.getPanjang());
        System.out.println("Lebar = " + k.getLebar());
    }
}
