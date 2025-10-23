[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/q48hTQjn)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=21260073&assignment_repo_type=AssignmentRepo)
# algoritmaveprogramlama_LabS1_04
TF Yazılım Mühendisliği Algoritma ve Programlama - 1 dersi Laboratuvar Ortamı

# Java Programlama Laboratuvar Görevi 1 - Değişkenler ve Operatörler

## 📚 Task Bilgileri 
**Konu:** Değişkenler, Veri Tipleri, Operatörler ve Scanner  
**Teslim Tarihi:** 6 Kasım

## 🎯 Task Amaçları

Bu ödevde aşağıdaki konularda pratik yapacaksınız:
- Değişken tanımlama ve kullanma
- Farklı veri tiplerini kullanma (int, double, String)
- Scanner sınıfı ile kullanıcıdan veri alma
- Aritmetik operatörler (+, -, *, /, %)
- Sabit tanımlama (final)
- printf() ile formatlı çıktı
- Matematiksel hesaplamalar yapma

## 📝 Görevler

### Görev 1: Öğrenci Bilgi Sistemi (Kolay)
**Dosya:** `OgrenciBilgi.java`

Kullanıcıdan öğrenci bilgilerini alan ve bunları düzenli bir formatta ekrana yazdıran bir program yazın.

**İstenenler:**
- Öğrencinin adını (String)
- Soyadını (String)
- Öğrenci numarasını (int)
- Yaşını (int)
- GPA (not ortalaması - double, 0.00-4.00 arası)

**Çıktı Formatı:**
```
=== OGRENCI BILGI SISTEMI ===
Ad Soyad: Ahmet Yilmaz
Ogrenci No: 12345
Yas: 20
GPA: 3.45
Durum: Basarili Ogrenci
```

**İpuçları:**
- Scanner sınıfını kullanın
- printf() ile düzenli çıktı alın
- GPA'yi 2 ondalık basamakla gösterin

---

### Görev 2: Geometrik Hesaplayıcı (Orta)
**Dosya:** `GeometrikHesap.java`

Kullanıcıdan bir dairenin yarıçapını alan ve bu daireye ait çeşitli hesaplamaları yapan bir program yazın.

**Hesaplanacaklar:**
1. Dairenin alanı: π × r²
2. Dairenin çevresi: 2 × π × r
3. Dairenin çapı: 2 × r
4. Bu yarıçaplı bir kürenin hacmi: (4/3) × π × r³
5. Bu yarıçaplı bir kürenin yüzey alanı: 4 × π × r²

**Özel Gereksinimler:**
- PI değerini sabit (final) olarak tanımlayın: 3.14159
- Yarıçap double tipinde olmalı
- Tüm sonuçları 2 ondalık basamakla gösterin
- Düzenli ve anlaşılır çıktı formatı kullanın

**Örnek Çalışma:**
```
=== GEOMETRIK HESAPLAYICI ===
Dairenin yaricapini girin (cm): 5.0

SONUCLAR:
----------
Daire Alani        : 78.54 cm²
Daire Cevresi      : 31.42 cm
Daire Capi         : 10.00 cm
Kure Hacmi         : 523.60 cm³
Kure Yuzey Alani   : 314.16 cm²
```

**İpuçları:**
- Math.pow() fonksiyonunu kullanabilirsiniz (r³ için)
- printf() ile sütunları hizalayın
- Formülleri dikkatlice uygulayın

---

### Görev 3: Maaş Hesaplama Sistemi (Zor)
**Dosya:** `MaasHesap.java`

Bir çalışanın maaş bilgilerini hesaplayan detaylı bir program yazın.

**Kullanıcıdan Alınacak Bilgiler:**
1. Çalışanın adı ve soyadı (String)
2. Aylık brüt maaş (double, TL cinsinden)
3. Haftalık çalışma saati (int)
4. Mesai saati sayısı (int, normal çalışma saati dışında)

**Hesaplanacaklar:**
1. **Toplam Gelir:**
   - Brüt maaş + Mesai ücreti
   - Mesai ücreti = (Brüt Maaş / 160) × Mesai Saati × 1.5
   - (160 = Ayda ortalama çalışma saati, 1.5 = mesai katsayısı)

2. **Kesintiler:**
   - SGK Kesintisi: Toplam Gelirin %14'ü
   - Gelir Vergisi: Toplam Gelirin %15'i
   - Damga Vergisi: Toplam Gelirin %0.759'u
   - Toplam Kesinti: Tüm kesintilerin toplamı

3. **Net Maaş:**
   - Net Maaş = Toplam Gelir - Toplam Kesinti

4. **İstatistikler:**
   - Kesinti oranı (yüzde olarak)
   - Saatlik net kazanç
   - Günlük net kazanç (22 iş günü varsayımıyla)

**Özel Gereksinimler:**
- Tüm kesinti oranlarını sabit (final) olarak tanımlayın
- Para değerlerini 2 ondalık basamakla gösterin
- Yüzde değerlerini 1 ondalık basamakla gösterin
- Profesyonel görünümlü bir bordro formatı oluşturun

**Örnek Çalışma:**
```
=== MAAS HESAPLAMA SISTEMI ===

Çalışan adi soyadi: Ayse Demir
Brut maas (TL): 15000
Haftalik calisma saati: 40
Mesai saati sayisi: 10

====================================
         MAAS BORDROSI
====================================
Calisan: Ayse Demir
Tarih: [Sistem Tarihi]

GELIRLER:
  Brut Maas              : 15000.00 TL
  Mesai Ucreti (10 saat) :  1406.25 TL
  ------------------------
  TOPLAM GELIR           : 16406.25 TL

KESINTILER:
  SGK Kesintisi (14.0%)  :  2296.88 TL
  Gelir Vergisi (15.0%)  :  2460.94 TL
  Damga Vergisi (0.8%)   :   124.52 TL
  ------------------------
  TOPLAM KESINTI         :  4882.34 TL

NET MAAS                 : 11523.91 TL

ISTATISTIKLER:
  Kesinti Orani          : 29.8%
  Saatlik Net Kazanc     : 65.59 TL/saat
  Gunluk Net Kazanc      : 523.81 TL/gun
====================================
```

**İpuçları:**
- Kesinti oranlarını yüzdelik değer olarak değil, ondalık olarak tanımlayın (örn: %14 = 0.14)
- Hesaplamaları adım adım yapın, ara değişkenler kullanın
- printf() ile düzgün hizalama yapın
- Çıktıyı okunabilir ve profesyonel yapın

---

## 📋 Genel Kurallar ve Değerlendirme Kriterleri

### ✅ Zorunlu Gereksinimler

1. **Kimlik Bilgileri:**
   ```java
   /*
    * Ad Soyad: [ADINIZ SOYADINIZ]
    * Ogrenci No: [OGRENCI_NUMARANIZ]
    * Tarih: [TARIH]
    * Aciklama: [HANGI GOREV OLDUGU]
    */
   ```
   - Her Java dosyasının başında yorum bloğu olarak bu bilgiler bulunmalı

2. **Kod Yapısı (30 puan):**
   - Doğru sınıf adı (dosya adıyla aynı)
   - main metodu doğru tanımlanmış
   - import ifadeleri doğru kullanılmış
   - Kod derlenebilir ve çalışabilir durumda

3. **Fonksiyonellik (40 puan):**
   - Program istenen tüm hesaplamaları yapıyor
   - Kullanıcıdan doğru şekilde veri alınıyor
   - Sonuçlar doğru hesaplanıyor
   - Çıktı formatı istenen gibi

4. **Kod Kalitesi (20 puan):**
   - Anlamlı değişken isimleri kullanılmış
   - Uygun veri tipleri seçilmiş
   - Sabitler (final) doğru tanımlanmış
   - Kod düzgün girintili ve okunabilir
   - Açıklayıcı yorumlar var

5. **Formatlanmış Çıktı (10 puan):**
   - printf() kullanılmış
   - Sayılar istenen ondalık basamakla gösteriliyor
   - Çıktı düzenli ve anlaşılır

### ⚠️ Dikkat Edilmesi Gerekenler

- **Birbirinin aynı kopyala yapıştır kodlar üretmeyin, yasaktır!** Benzer kodlar mutlaka olacaktır ama bu sizin yan yana aynı kodları yazmanız şeklinde ya da arkadaşınızdan kodu direkt almak şeklinde olmamalı. Herkes bağımsız çalışıp üretmeli.
- Kodunuz **kendi bilgisayarınızda test edilmeli** ve çalıştığından emin olunmalı.
- **Scanner'ı kapatmayı unutmayın:** `input.close();` (iyi pratik)
- Integer division hatası yapmayın: `1/2` değil `1.0/2` yazın
- nextInt() sonrası nextLine() kullanırken dikkatli olun (Scanner bug)

### 🚫 Yaygın Hatalar

1. ❌ Değişken tanımlanmadan kullanma
2. ❌ Yanlış veri tipi seçimi (int yerine double gerekirken int kullanma)
3. ❌ Scanner import etmeyi unutma
4. ❌ Matematiksel formüllerde parantez hatası
5. ❌ Integer division (1/2 = 0 sorunu)
6. ❌ Noktalı virgül unutma
7. ❌ Case sensitivity (buyuk/kucuk harf) hatası

## 📤 Teslim Etme

1. **Tüm Java dosyalarını doldurun:**
   - `OgrenciBilgi.java`
   - `GeometrikHesap.java`
   - `MaasHesap.java`

2. **Her dosyanın başına kimlik bilgilerinizi ekleyin**

3. **Kodunuzu test edin:**
   - Her programı çalıştırıp test edin
   - Farklı değerlerle deneyin
   - Hata almadığından emin olun

4. **GitHub Classroom'a push edin:**
   ```bash
   git add .
   git commit -m "Odev 1 tamamlandi"
   git push
   ```

5. **Son kontrol:**
   - GitHub'da dosyaların güncellendiğini kontrol edin
   - Herhangi bir commit hatası olmadığından emin olun

## 🆘 Yardım ve Destek
- **Ofis saatleri:** Cuma 10-12
- **E-posta:** fucar@firat.edu.tr

**Sık sorulan sorular için:**
- Java dokümantasyonu: https://docs.oracle.com/javase/
- Scanner sınıfı: https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

## 📊 Değerlendirme Özeti

| Kriter | Puan | Açıklama |
|--------|------|----------|
| Kod Yapısı | 30 | Derlenir, çalışır, doğru yapı |
| Fonksiyonellik | 40 | İstenenler eksiksiz yapılmış |
| Kod Kalitesi | 20 | Temiz, okunabilir, iyi pratikler |
| Çıktı Formatı | 10 | Düzgün ve istenen formatta |
| **TOPLAM** | **100** | |

**Görev Dağılımı:**
- Görev 1: 25 puan
- Görev 2: 30 puan
- Görev 3: 45 puan

## 🎓 Başarılar!

Bu ödev, Java programlamanın temellerini pekiştirmeniz için hazırlanmıştır. 
Her görevi dikkatlice okuyun, adım adım ilerleyin ve bol bol test edin. Başarılar dileriz!

**İyi çalışmalar! 🚀**

---

*Son Güncelleme: 23 Ekim, 22.22*  
*Doç. Dr. Ferhat Uçar - Algoritma ve Programlama I*
