package Projects.Projects_02;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeArray_Veysel {
    public static void main(String[] args) {
          /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevir

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple

       Arrayi print edin

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String myStr = scan.nextLine();

        String[] UseThisArray = myStr.split(" ");
        for (int i = 0; i <UseThisArray.length ; i++) {
            if (UseThisArray[i].equals("Orange")){
                UseThisArray[i]="Apple";
            }

        }
        System.out.println(Arrays.toString(UseThisArray));

    }
}
