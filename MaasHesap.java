/*
* Ad Soyad: ENES ZUKRA
* Ogrenci No: 250541616
* Tarih: 25/10/2025
* Aciklama:  MaasHesap
*/

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;
        final int AYLIK_CALISMA_SAATI = 160;
        final int AYLIK_NET_SAAT = 176;
        final int AYLIK_GUN = 22;

        
        Scanner input = new Scanner(System.in);

      
        System.out.println("====================================");
        System.out.println("MAAS HESAPLAMA SISTEMI");
        System.out.println("====================================");

        
        System.out.print("Calisanin ad soyadini girin: ");
        String adSoyad = input.nextLine();

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati sayisi: ");
        int mesaiSaat = input.nextInt();

        double mesaiUcreti = (brutMaas / AYLIK_CALISMA_SAATI) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

      
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

       
        double netMaas = toplamGelir - toplamKesinti;

      
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / AYLIK_NET_SAAT;
        double gunlukNetKazanc = netMaas / AYLIK_GUN;

   
        System.out.println("====================================");
        System.out.println("MAAS BORDROSU");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas               : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat)  : %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR            : %.2f TL%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%)     : %.2f TL%n", SGK_ORANI * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%)     : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)     : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI          : %.2f TL%n", toplamKesinti);

        System.out.printf("NET MAAS                : %.2f TL%n", netMaas);
        System.out.println("====================================");

       
        System.out.printf("Kesinti Orani: %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc: %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc: %.2f TL%n", gunlukNetKazanc);
        System.out.println("====================================");

       
        input.close();
    }
}
