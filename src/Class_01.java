import java.util.Scanner;
import java.util.Random;

public class Class_01 {

	public static void main(String[] args) throws InterruptedException {

		int kontrol = 0;
		int kalanhak = 3;
		int kalanhakdongu = 0;
		String kullaniciadi, sifre;
		Scanner tarama = new Scanner(System.in);
		int bakiye1 = 3000;
		int bakiye2 = 3000;
		int iban = 1234;

		System.out.println("----------Hoşgeldiniz----------");
		System.out.println("Lütfen Kullanıcı adı ve şifrenizi girin.");
		while (true) {
			if (kalanhak == 0) {
				kalanhakdongu = dogrulama(tarama);
				if (kalanhakdongu == 1) {
					kalanhak = 3;
				}
				continue;
			}
			System.out.print("Kullanıcı adı:");
			kullaniciadi = tarama.next();
			System.out.print("Şifre:");
			sifre = tarama.next();
			kontrol = giris(kullaniciadi, sifre);
			if (kontrol == 1) {
				System.out.println("Giriş başarılı. Menüye aktarılıyorsunuz..");
				break;
			} else {
				System.out.println("Kullanıcı adı veya şifreniz yanlış. Lütfen tekrar deneyiniz.");
				kalanhak--;
				System.out.println(kalanhak + " hakkınız kaldı.");
				continue;
			}
		}
		menu(tarama, bakiye1, bakiye2, iban);

		System.out.println("Yapılan tüm değişiklikler kaydediliyor..");
		Thread.sleep(2000);
		System.out.println("Tüm değişiklikler başarıyla kaydedildi. İyi Günler");

	}

	public static int giris(String kullaniciadkontrol, String sifrekontrol) {
		String kullaniciad = "yusuf";
		String sifre = "123";
		int donus = 0;
		if (kullaniciad.equals(kullaniciadkontrol) && sifre.equals(sifrekontrol)) {
			donus = 1;
		} else {
			donus = 0;
		}
		return donus;
	}

	public static int dogrulama(Scanner tarama) {
		Random rnd = new Random();
		while (true) {
			System.out.println("Kalan hak sayınızı sıfırlamak için aşağıdaki kodu girin.");
			int sayi = 100000 + rnd.nextInt(900000);
			System.out.println(sayi);
			int sayikontrol = tarama.nextInt();
			if (sayi == sayikontrol) {
				System.out.println("Doğrulama başarılı..");
				break;
			} else {
				System.out.println("Doğrulama başarısız. Tekrar deneyin.");
				continue;
			}
		}
		return 1;
	}

	public static void menu(Scanner tarama, int bakiye1, int bakiye2, int iban) {
		int elektrik = 900;
		int su = 500;
		int telefon = 300;
		while (true) {
			int donus = 0;
			System.out.println("1- Bakiye Görüntüleme");
			System.out.println("2- Para Yatırma");
			System.out.println("3- Para Çekme");
			System.out.println("4- Para Gönderme");
			System.out.println("5- Fatura Görüntüleme/Ödeme");
			System.out.println("6- Çıkış");
			System.out.print("Lütfen yapmak istediğiniz işlemin numarasını giriniz.");
			int deger = tarama.nextInt();
			switch (deger) {
			case 1:
				System.out.println("Hesabınızın bakiyesi " + bakiye1 + " TL.");
				while (true) {
					System.out.print("Menüye dönmek için 1' e uygulamadan çıkmak için 2'ye basın. ");
					donus = tarama.nextInt();
					if (donus == 1) {
						break;
					} else if (donus == 2) {
						System.out.println("Uygulama kapatılıyor..");
						return;
					} else {
						System.out.println("Hatalı tuşlama yaptınız. Lütfen tekrar deneyiniz.");
						continue;
					}
				}
				break;
			case 2:
				System.out.print("Yatırmak istediğiniz tutarı girin: ");
				bakiye1 += tarama.nextInt();
				System.out.println("Para yatırma işlemi başarılı..");
				while (true) {
					System.out.print("Menüye dönmek için 1' e uygulamadan çıkmak için 2'ye basın. ");
					donus = tarama.nextInt();
					if (donus == 1) {
						break;
					} else if (donus == 2) {
						System.out.println("Uygulama kapatılıyor..");
						return;
					} else {
						System.out.println("Hatalı tuşlama yaptınız. Lütfen tekrar deneyiniz.");
						continue;
					}
				}
				break;
			case 3:
				while (true) {
					System.out.println("Çekmek istediğiniz tutarı girin: ");
					int cekmetutar = tarama.nextInt();
					if (cekmetutar > bakiye1) {
						System.out
								.println("Çekmek istediğiniz tutar hesap bakiyesinden yüksek. Lütfen tekrar deneyin.");
						continue;
					} else {
						bakiye1 = bakiye1 - cekmetutar;
						System.out.println("Para çekme işlemi başarılı..");
						break;
					}
				}
				while (true) {
					System.out.print("Menüye dönmek için 1' e uygulamadan çıkmak için 2'ye basın. ");
					donus = tarama.nextInt();
					if (donus == 1) {
						break;
					} else if (donus == 2) {
						System.out.println("Uygulama kapatılıyor..");
						return;
					} else {
						System.out.println("Hatalı tuşlama yaptınız. Lütfen tekrar deneyiniz.");
						continue;
					}
				}
				break;
			case 4:
				while (true) {
					System.out.print("Para göndermek istediğiniz IBAN numarasını giriniz. ");
					int gonderilecekiban = tarama.nextInt();
					if (iban == gonderilecekiban) {
						while (true) {
							System.out.print("Göndermek istediğiniz miktar: ");
							int miktar = tarama.nextInt();
							if (miktar > bakiye1) {
								System.out.println(
										"Göndermek istediğiniz miktar hesap bakiyesinden fazla. Tekrar deneyin.");
								continue;
							} else {

								bakiye1 = bakiye1 - miktar;
								System.out.println("Gönderim başarılı. Kalan bakiye " + bakiye1 + " TL");
								break;
							}
						}
						break;
					} else {
						System.out.println("İban numarası hatalı. Lütfen tekrar deneyin.");
						continue;
					}
				}
				while (true) {
					System.out.print("Menüye dönmek için 1' e uygulamadan çıkmak için 2'ye basın. ");
					donus = tarama.nextInt();
					if (donus == 1) {
						break;
					} else if (donus == 2) {
						System.out.println("Uygulama kapatılıyor..");
						return;
					} else {
						System.out.println("Hatalı tuşlama yaptınız. Lütfen tekrar deneyiniz.");
						continue;
					}
				}
				break;
			case 5:
				System.out.println("----------Faturalarınız---------");
				System.out.println("Elektrik " + elektrik + " TL");
				System.out.println("Su " + su + " TL");
				System.out.println("Telefon " + telefon + " TL");
				while (true) {
					System.out.println("Faturalarınızı Ödemek için 1'e menüye dönmek için 2'ye basın.");
					int deger1 = tarama.nextInt();
					if (deger1 == 1) {
						if (bakiye1 >= elektrik + su + telefon) {
							bakiye1 = bakiye1 - elektrik - su - telefon;
							elektrik = 0;
							su = 0;
							telefon = 0;
							System.out.println("Tüm faturalarınız başarıyla ödendi. Menüye aktarılıyorsunuz..");
							break;
						} else {
							System.out.println("Hesap Bakiyesi Yetersiz.");
						}
					} else if (deger1 == 2) {
						System.out.println("Menüye dönülüyor..");
						break;
					} else {
						System.out.println("Geçersiz değer girdiniz. Lütfen Tekrar deneyin.");
					}
				}
				break;
			case 6: System.out.println("Çıkış yapılıyor.."); return;
				
			}
		}
	}
}
