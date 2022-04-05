package Projects.Projects_01;

import java.util.Scanner;

public class ageVeysel {
    public static void main(String[] args) {
       /*
        Eğer age 10 dan küçük veya eşit ise
        facebook hesabi acmak icin cok gencsin print yapın.

        Eğer age 16 dan küçük veya eşit ise
        ehliyet almak icin cok gencsin print yapın.

                Eğer age 18 den küçük veya eşit ise
        dovme yaptirmak icin cok gencsin print yapın.

                Eğer age 21 den küçük veya eşit ise
        alkol icmek icin cok gencsin print yapın.

                Eğer age 21 den büyük ise
        istedigini yapabilirsin print yapın.
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        if (yas<=10) System.out.println("Facebook icin gencsin yegen");
        else if (yas<=16) System.out.println("ehliyet almak icin genscsin");
        else if (yas<=18) System.out.println("dovme yaptirmak icin cok gensin");
        else if (yas<=21) System.out.println("alkol icin daha gencsin");
        else {
            System.out.println("istedigini yap");
        }
    }
}
