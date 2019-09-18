import java.util.ArrayList;

public class Sarkicilar {
	private ArrayList<String> sarkici_listesi=new ArrayList<String>();
	public void sarkicilari_bastir() {
		System.out.println("�ark�c� listesinde "+sarkici_listesi.size()+" kadar �ark�c� var.");
		for (int i = 0; i < sarkici_listesi.size(); i++) {
			System.out.println((i+1)+".�ark�c�:"+sarkici_listesi.get(i));
		}
	}
	public void sarkici_ekle(String isim) {
		sarkici_listesi.add(isim);
		System.out.println("Yeni �ark�c� eklendi..");
	}
	public void sarkici_guncelle(String yeni_isim,int pozisyon) {
		sarkici_listesi.set(pozisyon, yeni_isim);
		System.out.println("�ark�c� listesi g�ncellendi..");
	}
	public void sarkici_sil(int pozisyon) {
		String isim=sarkici_listesi.get(pozisyon);
		sarkici_listesi.remove(pozisyon);
		System.out.println(isim+" isimli �ark�c� listeden silindi..");
	}
	public void sarkici_ara(String sarkici_ismi) {
		int pozisyon=sarkici_listesi.indexOf(sarkici_ismi);
		if(pozisyon>=0) {
			System.out.println("�ark�c� bulundu.");
			System.out.println(sarkici_ismi+" isimli �ark�c� "+(pozisyon+1)+".pozisyonda.");
		}
		else {
			System.out.println("�ark�c� bulunamad�!");
		}
	}

}
