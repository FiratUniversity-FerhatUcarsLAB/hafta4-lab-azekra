
// Ad Soyad: Enes Zukra
// Ogrenci No: 250541616
// Tarih: 24/10/2025
  
// Kullanicidan bir yaricap (r) alir ve bu degere gore
// daire ve kure ile ilgili geometrik hesaplamalari yaparak sonuclari formatli sekilde ekrana yazdirir.
  

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner input = new Scanner(System.in);

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double r = input.nextDouble();

        double daireAlani = PI * r * r;
        double daireCevresi = 2 * PI * r;
        double daireCapi = 2 * r;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3);
        double kureYuzeyAlani = 4 * PI * r * r;
        
        
        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm^2%n", kureYuzeyAlani);

        input.close();
    }
}

