package AdvancedJavaPractice;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println(" toplama icin 1\n cikarma icin 2\n bolme icin   3\n carpma icin  4");
		int islem = scan.nextInt();
		System.out.println("Lutfen iki tam sayi giriniz: ");//kullaniciya bildirimda bulunduk
		double num1 = scan.nextDouble();// 2 sayi assign edildi
		double num2 = scan.nextDouble();
		if (islem == 1) {
			System.out.println("toplama isleminin sonucu:" + num1 + "+" + num2 + "= " + (num1 + num2));
		} else if (islem == 2) {
			System.out.println("cikarma isleminin sonucu:" + num1 + "-" + num2 + "= " + (num1 - num2));
		} else if (islem == 3) {
			System.out.println("bolme isleminin sonucu:" + num1 + "/" + num2 + "= " + (num1 / num2));
		}else if (islem==4){
			System.out.println("carpma isleminin sonucu:"+num1+"*"+num2+"= "+(num1*num2));
		}else {
			System.out.println("hatali secim tekrar deneyin");
		}

	}

	}


