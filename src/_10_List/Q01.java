package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        ArrayList<String >isimler=new ArrayList<String >(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String >aOlmayanIsimlerisimler=new ArrayList<String >();//a olmayan isimlerin atanacagi bos list creat edildi
        for (String  w:isimler){//isimlerin her birini w ye atadim cekirdek mantigi
            if (!w.toLowerCase().contains("a")){//""a bulundurmyan isimler
                aOlmayanIsimlerisimler.add(w);
            }

        }

        System.out.println("a olmayan isimler:"+aOlmayanIsimlerisimler);
isimler.clear();
isimler.addAll(aOlmayanIsimlerisimler);
        System.out.println(isimler);//[Veli, Omer]
        //aslist str olrk verilen ifadeyin heps arrylist icine atar.yani list olust.tek tek add demek zorunda kalmayiz

    }


}
