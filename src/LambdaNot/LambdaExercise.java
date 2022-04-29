package LambdaNot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static LambdaNot.Lambda01.printElStuructured;

public class LambdaExercise {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        printElStuructured(sayi);
        // Task : Functional Programming ile listin cift elemanlarinin
        // karelerini ayni satirda aralarina bosluk bırakarak print ediniz

        sayi.stream().filter(Lambda01::ciftBul).map(t -> t * t).forEach(Lambda01::yazdir);
        //.//map()--> Stream içerisindeki elemanları başka tiplere
        // dönüştürmek veya üzerlerinde işlem yapmak (update) için Map kullanılmaktadır.

        //Task : "functional Programming" kullanarak list elemanlarını aynı satirda aralarında

    }}
