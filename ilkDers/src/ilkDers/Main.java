package ilkDers;

public class Main {

	public static void main(String[] args) {
		
		String mesajKarsilama = ("Merhaba Say�n M��terimiz, Dolar Bug�n : ");
		int dolarDun = 7;
		int dolarBugun = 8;
		
		if (dolarDun<dolarBugun) {
			System.out.println(mesajKarsilama + "Y�kseldi");
		}
		else if (dolarDun>dolarBugun) {
			System.out.println(mesajKarsilama + "D��t�");
		}
		else {
			System.out.println(mesajKarsilama + "E�it");
		}
			
		

	}

}
