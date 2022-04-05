package Projects.Projects_01;

import java.util.Scanner;

public class checkNumberVeysel {
    public static void main(String[] args) {
         /*
        Veri tipi int olan number verildiğinde, number  çift mi tek mi kontrol et

        Eğer number çift ise  print true

        Eğer number tek ise  print false

        result true ya da false olmalı.

     */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
       if (sayi%2==0){
           System.out.println(true);
       }else {
           System.out.println(false);
       }

        }

    }
