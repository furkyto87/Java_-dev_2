package inheritanceDemo;

public class KrediUI {
//	public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager) {
//		ogretmenKrediManager.Hesapla();
//	}
	
	// BaseKrediManager hem OgretmenKrediManager hemde TarimKrediManager
	// sınıfının özelliklerini tutar. Bu nedenle ebeveyn kullanmak daha pratiktir.
	// İsteğimiz çocuğu main'de çağırabiliriz.(Öğretmen veya Tarım Kredisi)
	public void KrediHesapla(BaseKrediManager baseKrediManager) {
		baseKrediManager.Hesapla();
	}
}
