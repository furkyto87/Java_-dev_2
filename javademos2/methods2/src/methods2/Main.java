package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yenimesaj = sehirVer();
		System.out.println(yenimesaj);
		int sayi = topla(15, 7);
		System.out.println(sayi);
		int toplam = topla2(2, 3, 4, 5, 6, 10);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");
	}

	public static void sil() {
		System.out.println("Silindi");
	}

	public static void güncelle() {
		System.out.println("Güncellendi");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static int topla2(int... sayilar) {
		int toplamı = 0;
		for (int sayi : sayilar) {
			toplamı += sayi;
		}

		return toplamı;
	}

	public static String sehirVer() {
		return "Ankara";
	}

}
