package Tugas2;

import java.util.*;

public class MenghitungLuas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu, sisi, alas, tinggi, jari2;

        menu = input.nextInt();

        if (menu == 1) {
            sisi = input.nextInt();
            Persegi luas1 = new Persegi();
            System.out.println(luas1.luasPersegi(sisi));
        }
        else if (menu == 2) {
            alas = input.nextInt();
            tinggi = input.nextInt();
            Segitiga luas2 = new Segitiga();
            System.out.println(luas2.luasSegitiga(alas, tinggi));
        }
        else if (menu == 3) {
            jari2 = input.nextInt();
            Lingkaran luas3 = new Lingkaran();
            System.out.println((double)luas3.luasLingkaran(jari2));
        }
        else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

}

class Persegi {

    private int luas;

    public int luasPersegi(int sisi) {
        luas = sisi * sisi;
        return luas;
    }

}

class Segitiga {

    private int luas;

    public int luasSegitiga(int alas, int tinggi) {
        luas = alas * tinggi / 2;
        return luas;
    }

}

class Lingkaran {

    private final double PHI = 3.14;
    private double luas;
    private int mod, hasil;

    public int luasLingkaran(int jari2) {
        mod = jari2 % 7;

        if (mod == 0 && jari2 >= 7) {
            luas = 22 / 7 * jari2 * jari2;
        }
        else {
            luas = PHI * jari2 * jari2;
        }
        hasil = (int) luas;
        return hasil;

    }

}