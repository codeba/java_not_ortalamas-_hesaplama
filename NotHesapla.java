package patika;

import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {
        int fizik,kimya,mat,turkce,tarih,müzik;
        Scanner sc=new Scanner(System.in);

        System.out.print("Matematik notunu giriniz:");
        mat=sc.nextInt();
        System.out.print("Kimya notunu giriniz:");
        fizik=sc.nextInt();
        System.out.print("Fizik notunu giriniz:");
        kimya=sc.nextInt();
        System.out.print("Türkçe notunu giriniz:");
        tarih=sc.nextInt();
        System.out.print("Tarih notunu giriniz:");
        müzik=sc.nextInt();
        System.out.print("Müzik notunu giriniz:");
        turkce=sc.nextInt();

        double ort=(mat+kimya+fizik+tarih+müzik+turkce)/6;
        System.out.println("Ortalamanız:"+ort);
       String sonuc= (ort>=60) ? "Geçtiniz!!!":"Kaldınız!!!";
        System.out.println(sonuc);

    }
}
