package AdvancedJavaPractice;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
        Scanner scan=new Scanner(System.in);
        System.out.print("Ehliyetiniz var ise 1,yok ise 0 yaziniz:");
        int ehliyet= scan.nextInt();
        System.out.print("lutfen hizinizi giriniz:");
        int hiz= scan.nextInt();
if (ehliyet==0|| ehliyet==1){//ehl varlik yokluguna gore diger kosullar calisacak


        if(ehliyet==1){
            if (hiz<0){
                System.out.println("hatali veri girdiniz:");
            }else if (hiz>54 && hiz<75){
                System.out.println("ceza 100$ dir");
            }else if (hiz>=75 && hiz<84){
                System.out.println("Ceza 150$ dir ");
            }else if (hiz >=84 && hiz<94){
                System.out.println("ceza 320& dir");

            }else if (hiz>=95){
                System.out.println("ceza 500$ dir");
            }else {
                System.out.println("Hiz sinirinda seyehat ediyorsunuz hayirli yolculuklar");
            }

        }else if (ehliyet==0){
            if (hiz > 54 && hiz < 75) {
                System.out.println("Ceza 300 $'dır.");
            } else if (hiz >= 75 && hiz < 85) {
                System.out.println("Ceza 350 $'dır.");
            } else if (hiz >= 84 && hiz < 94) {
                System.out.println("Ceza 520 $'dır.");
            } else if (hiz >= 95) {
                System.out.println("Ceza 700 $'dır.");
            } else {
                System.out.println("Sadece Ehliyetsiz kullanımdan dolayı cezanız  200 $'dır. ");
            }
        } else {
            System.out.println("Lütfen Geçerli Bir değer Giriniz!");
        }
    }else System.out.println("agam bizimle eglenir ehliyet yok mu");{//ehliyetin hatali olmasi kontrolü

        }
}
}




