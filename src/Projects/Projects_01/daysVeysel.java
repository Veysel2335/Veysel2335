package Projects.Projects_01;

import java.util.Scanner;

public class daysVeysel {
    public static void main(String[] args) {
         /*
            Veri tipi int olan variable(değişken) verildiğinde

                Eger int 1 ise print monday
                Eger int 2 ise print tuesday
                Eger int 3 ise print wednesday
                Eger int 4 ise print thursday
                Eger int 5 ise print friday
                Eger int 6 ise print saturday
                Eger int 7 ise print sunday
                Eger int 8 den buyuk ise  print "this is not a valid day"

                NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir gun giriniz");
        int gun = scan.nextInt();

        switch (gun){
            case 1:
                System.out.println("\"pazartesi\" = " + "pazartesi");
                break;
            case 2:
                System.out.println("sali");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4:
                System.out.println("persembe");
                break;
                case 5:
                System.out.println("cuma");
                break;
                case 6:
                System.out.println("cumartesi");
                break;
                case 7:
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli bir gun gir");
        }

    }
}
