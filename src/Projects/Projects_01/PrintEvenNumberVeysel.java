package Projects.Projects_01;

import java.util.Scanner;

public class PrintEvenNumberVeysel {

           /*
    Veri tipi int olan bir sayı verildiğinde

    0 dan başlayarak verilen sayıya kadar olan tum cift sayıları print edin.

    Example 1:
    int input = 10;

    print  0 2 4 6 8 10  olmalı


    Example 2:
    int input = 15;

    print  0 2 4 6 8 10 12 14  olmalı





     */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("bir sayi giriniz: ");
            int maxNum = scanner.nextInt();
            for (int i = 0; i <=maxNum ; i++) {
                if (i%2==0) System.out.print(i+" ");

            }

    }
}
