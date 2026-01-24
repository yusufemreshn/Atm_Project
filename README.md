# ATM Console Application (Java)

Bu proje, Java dili kullanılarak geliştirilmiş **konsol tabanlı bir ATM simülasyonudur**.  
Kullanıcı girişi, bakiye işlemleri, para transferi ve fatura ödeme gibi temel ATM fonksiyonlarını içerir.

Proje, Java diline yeni başlayanlar için pratik amaçlı geliştirilmiştir.

---

## Özellikler

- Kullanıcı adı & şifre ile giriş
- 3 hatalı girişten sonra doğrulama kodu sistemi
- Bakiye görüntüleme
- Para yatırma
- Para çekme (bakiye kontrolü ile)
- IBAN ile para gönderme
- Elektrik / Su / Telefon faturası görüntüleme ve ödeme
- Güvenli çıkış

---

## Giriş Bilgileri (Varsayılan)

| Bilgi | Değer |
|-----|------|
| Kullanıcı Adı | `yusuf` |
| Şifre | `123` |
| Başlangıç Bakiyesi | `3000 TL` |
| Geçerli IBAN | `1234` |

> 3 kez hatalı giriş yapılırsa sistem doğrulama kodu ister.

---

## Kullanılan Teknolojiler

- **Java**
- **Eclipse IDE**
- Konsol (Terminal) tabanlı uygulama
- `Scanner` ve `Random` sınıfları

---

## Proje Yapısı

Atm_Project

└── src

└── Class_01.java


> `bin/`, `.settings/`, `.classpath`, `.project` gibi IDE dosyaları GitHub'a eklenmemiştir.

---

## Nasıl Çalıştırılır?

1. Repoyu klonlayın:
   
   ```bash
   git clone https://github.com/kullanici-adi/Atm_Project.git
