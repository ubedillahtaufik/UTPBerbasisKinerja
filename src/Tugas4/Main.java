package Tugas4;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        info();

        int input = 0;

        DataMerchant.merk = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merk = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merk = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        menu(input);

    }
    public static int input(){
        int input = sc.nextInt();
        sc.nextLine();

        return input;
    }
    public static void menu(int input){
        do{
            DataMerchant.Menu();
            input = input();
            if(input == 1){
                DataMerchant.tampilData();
            }
            else if(input == 2){
                DataMerchant.tambahMerchant();
            }
            else if(input == 3){
                DataMerchant.cariMerchant();
            }
            else if(input == 4){
                DataMerchant.updateMerchant();
            }
            else if(input == 5){
                System.out.println("Terima Kasih Telah menggunakan program ini");
            }else{
                System.out.println("Inputan salah, silahkan kembali program awal");
            }

        }while(input != 5);
    }
    public static void info(){
        System.out.print("nama : ");
        String nama = sc.nextLine();
        System.out.print("nim : ");
        String nim = sc.nextLine();
        System.out.println("Nama : "+nama);
        System.out.println("NIM    : "+nim);

    }


}

