package intro;

public class Main {

	public static void main(String[] args) {
		
		String krediler[] = 
			{
					"Hýzlý Kredi",
					"Konu Kredisi",
					"Taþýt Kredisi",
					"Öðretmen Kredisi",
					"Çiftçi Kredisi",
					"Personel Kredisi"
			};
		
		//foreach ile krediler dizisindeki elemanlarý yazdýrma
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		//for döngüsü ile krediler dizi içindeki elemanlarý yazdýrma
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
