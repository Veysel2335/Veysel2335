package AdvancedJavaPractice;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {




        /* TASK :
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.

        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!

        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.

        5. final notu double değerinde olmalı. (örn: 65,5)

        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.

        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.

        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.



                                        eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak AA,
                                                                        80(80dahil)   ile 90 arasında ise  BA,
                                                                        70(70 dahil)   ile 80 arasında ise BB,
                                                                        60(60dahil) ile 70 arasında ise CB,
                                                                        50(50 dahil) ile 60 arasında ise CC,
                                                                     40(40 dahil) ile 50 arasında ise DC,
                                                                     30(30 dahil) ile 40 arasında ise DD,
                                                                     30 'dan düşük ise FF            gelmeli.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("notunuzu giriniz:");
        double vize = scan.nextDouble();
        System.out.print("Vize sinavi icin hesaplama yüzdesini giriniz:");
        double vizeoran = scan.nextDouble() / 100;

        System.out.print("final giriniz:");
        double fnal = scan.nextDouble();
        System.out.print("final sinavi icin hesaplama yüzdesini giriniz:");
        double fnalorani = scan.nextDouble() / 100;

        double gecmeNotu = (vize * vizeoran) + (fnal * fnalorani);
        System.out.println("gecme notunuz:" + gecmeNotu);
        if (vize < 0 || fnal < 0) {//-deger konrolü yapildi
            System.out.println("bos kagit versen 0 alirdin neyin kafasi sana - aldirdi");
        } else {
            if (gecmeNotu >= 90) {
                System.out.println("agam tebrikler kim copy verdi gayet basarili AA");
            } else if ((gecmeNotu < 90 && gecmeNotu >= 80)) {
                System.out.println("gayet basarili BA");
            } else if ((gecmeNotu < 80 && gecmeNotu >= 70)) {
                System.out.println("gayet basarili BB");
            } else if ((gecmeNotu < 70 && gecmeNotu >= 60)) {
                System.out.println("gayet basarili CB");
            } else if ((gecmeNotu < 60 && gecmeNotu >= 50)) {
                System.out.println("gayet basarili CC");
            } else if ((gecmeNotu < 50 && gecmeNotu >= 40)) {
                System.out.println("gayet basarili DC");
            } else if ((gecmeNotu < 40 && gecmeNotu >= 30)) {
                System.out.println("gayet basarili DD");
            } else System.out.println("agam hic mo copy veren olmadi caktin ");
            {

            }// if ile yap ödev

        }
    }
}