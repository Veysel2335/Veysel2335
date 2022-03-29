package _06_Method_Creation;

import java.util.Scanner;

public class Q3Ek {
    public static void main(String[] args) {
        Scanner _scanner=new Scanner(System.in);
        System.out.println("Mili kilometreye cevirme uygulamasina hosgeldiniz:");
        System.out.println("Lutfen cevirmek istediginiz degeri girin giriniz:");
        double girilenMil=_scanner.nextDouble();
        //girilenMil=_scanner.nextDouble();
        double km=girilenMil*1.6;
        System.out.println(girilenMil+" mil="+km+"km");

        Scanner scan =new Scanner(System.in);
        System.out.println("Saati saniyeye cevirme uygulamasina hosgeldiniz:");
        System.out.println("Lutfen cevirmek istediginiz degeri girin giriniz:");
        long girilenSaat;
        girilenSaat=_scanner.nextLong();
        long saniye=girilenSaat*60*60;
        System.out.println(girilenSaat+" saat="+saniye+" sn");


        //kg grama
        Scanner scanner =new Scanner(System.in);
        System.out.println("kg grama cevirme uygulamasina hosgeldiniz:");
        System.out.println("Lutfen cevirmek istediginiz degeri girin giriniz:");
        int gram= scan.nextInt();
        int kg=gram*1000;
        System.out.println(gram+"kg="+kg+" gram");

    }
}
