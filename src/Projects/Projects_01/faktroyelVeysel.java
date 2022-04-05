package Projects.Projects_01;

import java.util.Scanner;

public class faktroyelVeysel {
    public static void main(String[] args) {

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720


         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= scan.nextInt();
        int fakt=1;
        for (int i = 1; i <=sayi ; i++) {
            fakt=fakt*i;

        }
        System.out.println("Sonuc :"+fakt);

        System.out.println("*************");
        Scanner dp = new Scanner(System.in);

        String  strNum = dp.nextLine();

        int number = Integer.parseInt(strNum);

        int faktoriyel=1;
        for (int i = 1; i <=number ; i++) {
            faktoriyel*=i;
        }
        System.out.println(faktoriyel);

    }
}



