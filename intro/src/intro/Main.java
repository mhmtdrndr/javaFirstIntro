package intro;

public class Main {

	public static void main(String[] args) {
		
		String krediler[] = 
			{
					"H�zl� Kredi",
					"Konu Kredisi",
					"Ta��t Kredisi",
					"��retmen Kredisi",
					"�ift�i Kredisi",
					"Personel Kredisi"
			};
		
		//foreach ile krediler dizisindeki elemanlar� yazd�rma
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		//for d�ng�s� ile krediler dizi i�indeki elemanlar� yazd�rma
		for(int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}

}
