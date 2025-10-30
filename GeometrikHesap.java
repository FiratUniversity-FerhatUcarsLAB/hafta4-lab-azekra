/*
* Ad Soyad: [ENES ZUKRA]
* Ogrenci No: [250541616]
* Tarih: [30.10.2025]
* Aciklama: [ Geometrik Hesaplayıcı ]
*/

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Sabit Pi Tanımlama
        final double pi = 3.14;

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin [cm] : ");
        
        
        //yarıçapı cm cinsinden gir 
        
        double r = input.nextDouble();

        // geometrik Hesaplamalar
        double dreAlani = pi * r * r;
        double dreCevresi = 2 * pi * r;
        double dreCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * pi * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * pi * r * r;

        // sonuçları yazdır
        
        System.out.println("\nSONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani       : %.2f cm^2%n", dreAlani);
        System.out.printf("Daire Cevresi     : %.2f cm%n", dreCevresi);
        System.out.printf("Daire Capi        : %.2f cm%n", dreCapi);
        System.out.printf("Kure Hacmi        : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani  : %.2f cm^2%n", kureYuzeyAlani);

        input.close();
    }
}

