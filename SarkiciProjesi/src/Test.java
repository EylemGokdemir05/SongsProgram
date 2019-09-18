import java.util.Scanner;

public class Test {
	private static Sarkicilar sarkicilar=new Sarkicilar();
	private static Scanner scanner=new Scanner(System.in);
	
	public static void islemleri_bastir() {
		System.out.println("0)��lemleri G�r�nt�le");
		System.out.println("1)�ark�c�lar� G�r�nt�le");
		System.out.println("2)�ark�c� Ekle");
		System.out.println("3)�ark�c� G�ncelle");
		System.out.println("4)�ark�c� Sil");
		System.out.println("5)�ark�c� Ara");
		System.out.println("6)��k��");
	}
	public static void sarkicilari_goruntule() {
		sarkicilar.sarkicilari_bastir();
	}
	public static void sarkici_ekle() {
		System.out.print("Eklemek istedi�iniz �ark�c�:");
		String isim=scanner.nextLine();
		sarkicilar.sarkici_ekle(isim);
	}
	public static void sarkici_guncelle() {
		System.out.print("G�ncellemek istedi�iniz pozisyon(1,2,3..):");
		int pozisyon=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Eklemek istedi�iniz yeni �ark�c�:");
		String yeni_isim=scanner.nextLine();
		sarkicilar.sarkici_guncelle(yeni_isim, pozisyon-1);
	}
	public static void sarkici_sil() {
		System.out.print("Silmek istedi�iniz pozisyon(1,2,3..):");
		int pozisyon=scanner.nextInt();
		sarkicilar.sarkici_sil(pozisyon-1);
	}
	public static void sarkici_ara() {
		System.out.print("Aramak istedi�iniz �ark�c�:");
		String isim=scanner.nextLine();
		sarkicilar.sarkici_ara(isim);
	}

	public static void main(String[] args) {
		System.out.println("�ark�c� uygulamas�na ho�geldiniz..");
		islemleri_bastir();
		boolean cikis=false;
		int islem;
		while(!cikis) {
			System.out.print("Bir i�lem se�in:");
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
				System.out.println("Uygulamadan ��k�l�yor..");
				break;
			}
		}

	}

}
