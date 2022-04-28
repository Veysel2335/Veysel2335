package LambdaDay03;

import java.util.Optional;

public class C01_Q11 {
    public static void main(String[] args) {
        Integer numara = null;

        Optional<Integer> opt = Optional.ofNullable(numara);

        opt.ifPresent(num -> {
            Double karesi = Math.pow(num , 2);
            System.out.println("Sonuç: " + karesi);
        });
    }

}
