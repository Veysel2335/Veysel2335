package AdvancedJavaPractice;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        //TASK :  Kullanıcıdan aldığınız koordinat noktasının hangi bölgede olduğunu yazdıran bir kod yazınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("x ve y degerlerini giriniz");
        int x= scan.nextInt();
        int y= scan.nextInt();
        if (x>0 && y>0){
            System.out.println("girdiniz degerler birinci bolgeye ait");
        }else if (x<0 && y>0){
            System.out.println("girdiniz degerler ikinci bolgeye ait");
        }else if (x<0 && y<0){
            System.out.println("girdiniz degerler ucuncu bolgeye ait");
        }else if (x>0 && y<0){
            System.out.println("girdiniz degerler dorduncu bolgeye ait");
        }else if (x!=0 && y==0){
            System.out.println("girdiniz degerler x ekseninde ");//x ekseni
        }else if (x==0 && y!=0){
            System.out.println("girdiniz degerler y ekseninde ");// y ekseni
        }else {
            System.out.println("girdiginiz degerler orjindedir");

        }

    }
}
