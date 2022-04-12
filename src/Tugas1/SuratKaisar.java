package Tugas1;
import java.util.Scanner;

public class SuratKaisar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int geser = sc.nextInt();
        penggeseran(kata, geser);

    }

    public static void penggeseran(String kalimat, int bergeser) {
        String hasil = "";
        char huruf ;
        for (int i = 0; i < kalimat.length(); i++) {
            huruf = kalimat.charAt(i);

            if (huruf >= 'a' && huruf <= 'z') {
                huruf = (char) (huruf + bergeser);

                if (huruf > 'z') {
                    huruf = (char) (huruf + 'a' - 'z' - 1);
                }
                hasil = hasil + huruf;

            } else if (huruf >= 'A' && huruf <= 'Z') {
                huruf = (char) (huruf + bergeser);

                if (huruf > 'Z') {

                    huruf = (char) (huruf + 'A' - 'Z' - 1);
                }
                hasil = hasil + huruf;
            }

            else {
                hasil = hasil + huruf;
            }

        }
        System.out.println(hasil);

    }

}

