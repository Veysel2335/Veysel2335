package _07_ForLoop;

public class Q17_1 {
    public static void main(String[] args) {
        int sayi = 0;
        for (int i = sayi; i >=1; i++) {
            for (int j =1; j<=sayi  ; j++) {
                if (j >= i) {
                    System.out.print(j+ " " );
                } else System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
