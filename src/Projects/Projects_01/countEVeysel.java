package Projects.Projects_01;

import java.util.Scanner;

public class countEVeysel {
    public static void main(String[] args) {
          /*  Kullanıcı tarafından girilen inputda kac tane 'b' karakteri olduğunu belirle ve print et.

     input: Test output
            b: 0
        output 0 olmalı


     input: bucket
            b:1
        output 1 olmalı
        */


        //hint: .charAt, length(), for, index, counter,

        Scanner scan=new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String kelime= scan.nextLine();

        int counter=0;
        for (int i = 0; i <kelime.length(); i++) {
            if (kelime.charAt(i)=='b'){
                counter++;
            }


        }
        System.out.println("girdiginiz textde:"+counter +" adet b vardir");

    }
}
