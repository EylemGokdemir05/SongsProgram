import java.util.Scanner;

public class Test {
	private static Sarkicilar sarkicilar=new Sarkicilar();
	private static Scanner scanner=new Scanner(System.in);
	
	public static void islemleri_bastir() {
		System.out.println("0)Ýþlemleri Görüntüle");
		System.out.println("1)Þarkýcýlarý Görüntüle");
		System.out.println("2)Þarkýcý Ekle");
		System.out.println("3)Þarkýcý Güncelle");
		System.out.println("4)Þarkýcý Sil");
		System.out.println("5)Þarkýcý Ara");
		System.out.println("6)Çýkýþ");
	}
	public static void sarkicilari_goruntule() {
		sarkicilar.sarkicilari_bastir();
	}
	public static void sarkici_ekle() {
		System.out.print("Eklemek istediðiniz þarkýcý:");
		String isim=scanner.nextLine();
		sarkicilar.sarkici_ekle(isim);
	}
	public static void sarkici_guncelle() {
		System.out.print("Güncellemek istediðiniz pozisyon(1,2,3..):");
		int pozisyon=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Eklemek istediðiniz yeni þarkýcý:");
		String yeni_isim=scanner.nextLine();
		sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
	}
	public static void sarkici_sil() {
		System.out.print("Silmek istediðiniz pozisyon(1,2,3..):");
		int pozisyon=scanner.nextInt();
		sarkicilar.sarkici_sil(pozisyon-1);
	}
	public static void sarkici_ara() {
		System.out.print("Aramak istediðiniz þarkýcý:");
		String isim=scanner.nextLine();
		sarkicilar.sarkici_ara(isim);
	}

	public static void main(String[] args) {
		System.out.println("Þarkýcý uygulamasýna hoþgeldiniz..");
		islemleri_bastir();
		boolean cikis=false;
		int islem;
		while(!cikis) {
			System.out.print("Bir iþlem seçin:");
			islem=scanner.nextInt();
			scanner.nextLine();
			switch(islem) {
			case 0:
				islemleri_bastir();
				break;
			case 1:
				sarkicilari_goruntule();
				break;
			case 2:
				sarkici_ekle();
				break;
			case 3:
				sarkici_guncelle();
				break;
			case 4:
				sarkici_sil();
				break;
			case 5:
				sarkici_ara();
				break;
			case 6:
				cikis=true;
				System.out.println("Uygulamadan çýkýlýyor..");
				break;
			}
		}

	}

}
