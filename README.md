# ATM Console Application (Java)

Bu proje, Java dili kullanılarak geliştirilmiş **konsol tabanlı bir ATM simülasyonudur**.  
Kullanıcı girişi, bakiye işlemleri, para transferi ve fatura ödeme gibi temel ATM fonksiyonlarını içerir.

---

## Özellikler

- **Giriş Güvenliği:** Kullanıcı adı & şifre ile giriş.
- **Doğrulama Sistemi:** 3 hatalı girişten sonra rastgele üretilen 6 haneli kod ile doğrulama.
- **Finansal İşlemler:** Bakiye görüntüleme, para yatırma ve çekme (limit kontrollü).
- **Transfer & Ödeme:** IBAN ile para gönderme ve fatura (Elektrik/Su/Telefon) ödeme sistemi.
- **Veri Kaydı:** Çıkış yaparken simüle edilmiş kayıt süreci (Thread.sleep ile gecikmeli).

---

## Giriş Bilgileri (Varsayılan)

| Bilgi | Değer |
|:---:|:---:|
| Kullanıcı Adı | `yusuf` |
| Şifre | `123` |
| Başlangıç Bakiyesi | `3000 TL` |
| Geçerli IBAN | `1234` |

---

## Kullanılan Teknolojiler

- **Dil:** Java (JDK 17+)
- **Sınıflar:** `Scanner`, `Random`, `Thread`
- **Platform:** Docker (Cross-platform uyumluluk için)

---

## Docker ile Çalıştırma

Uygulamayı herhangi bir Java kurulumuna ihtiyaç duymadan Docker üzerinden hızlıca ayağa kaldırabilirsiniz.

1.  **İmajı Oluşturun:**
    ```bash
    docker build -t atm-app .
    ```

2.  **Konteyneri Çalıştırın:**
    ```bash
    docker run -it --name atm-container atm-app
    ```

---

## Proje Yapısı

```text
Atm_Project
├── src
│   └── Class_01.java   
├── Dockerfile          
└── README.md           
