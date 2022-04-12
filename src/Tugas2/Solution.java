package Tugas2;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        MenghitungLuas soal = new MenghitungLuas();
        if (angka == 1) {
            soal.sisi = sc.nextInt();
            soal.persegi();
        } else if (angka == 2) {
            soal.alas = sc.nextInt();
            soal.tinggi = sc.nextInt();
            soal.segitiga();
        } else if (angka == 3) {
            soal.JariJari = sc.nextInt();
            soal.Lingkaran();
        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}
