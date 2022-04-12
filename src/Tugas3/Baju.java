package Tugas3;
import java.util.Scanner;

class Baju {
    static Scanner sc = new Scanner(System.in);
    String jenis;
    int harga;
    int jumlah;

    public Baju(String a, int b) {
        this.jenis = a;
        this.jumlah = b;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void hargaa() {
        harga = bajua;
        if (jumlah > 100) {
            harga = 95000;
        }
    }

    void hargab() {
        harga = bajub;
        if (jumlah > 100) {
            harga = 120000;
        }
    }

    void hargac() {
        harga = bajuc;
        if (jumlah > 100) {
            harga = 160000;
        }
    }

    void display() {
        if (jenis.equalsIgnoreCase("a"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b"))
            hargab();
        else if (jenis.equalsIgnoreCase("c"))
            hargac();
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah       : " + harga);
        System.out.println("Total harga          : " + harga * jumlah);

    }
}


