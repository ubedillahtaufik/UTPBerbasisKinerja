package Tugas2;
import java.util.*;

class MenghitungLuas {
    int alas, tinggi, sisi, JariJari;

    void persegi(){
        int luas =(int) Math.pow(sisi,2);
        System.out.println(luas);
    }
    void segitiga(){
        int luas = alas*tinggi/2;
        System.out.println(luas);
    }
    void Lingkaran(){
        if(JariJari%7==0){
            int luas = (int)(22/7*Math.pow(JariJari,2));
            System.out.println((double)luas);
        }else{
            int luas2 = (int)(3.14*Math.pow(JariJari,2));
            System.out.println((double)luas2);
        }
    }
}

