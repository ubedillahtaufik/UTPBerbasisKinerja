package Tugas1;
import java.util.Scanner;
public class Selde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();  int reversed = 0;
        int num2 = num;

        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        if(reversed==num2){
            System.out.println(reversed+" adalah selde.");
        }else{
            System.out.println(num2+" bukan selde.");
        }
    }
}
