/*
* Ad Soyad: [ENES ZUKRA]
* Ogrenci No: [250541616]
* Tarih: [30.10.2025]
* Aciklama: [öğrenci Bilgi Sistemi]
*/

import java.util.Scanner;
//bilgileri alan scanner sınıfını programımımza ithal ediyoruz
public class OgrenciBilgi {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        
        System.out.print("Adinizi girin: ");
        String ad = input.next();
        
        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();
        
        System.out.print("Ogrenci numaraniz: ");
        int ogrNo = input.nextInt();
        
        System.out.print("Yasiniz: ");
        int yas = input.nextInt();
        
        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();
//virgüllü sayı gireceğimiz için double kullandık



        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " + ogrNo);
        System.out.println("Yas: " + yas);
        System.out.printf("GPA: %.2f%n", gpa);
       
       
       
       
       //eğer gpa 2 den büyük veya eşitse başarılı öğrenci yazdır 
       //aksi durumda başarısız öğrenci yazdır
       
       
        if (gpa >= 2.0) {
            System.out.println("Durum: Basarili Ogrenci");
        } else {
            System.out.println("Durum: Basarisiz Ogrenci");
        }


//scanner i kapatıyoruz
        input.close();
    }
}
