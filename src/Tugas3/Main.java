package Tugas3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga 100000");
        System.out.println("Baju B dengan harga 125000");
        System.out.println("Baju C dengan harga 175000");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = sc.next();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        int jumlah = sc.nextInt();
        Baju erigo = new Baju(jenis, jumlah);
        erigo.display();

    }
}


