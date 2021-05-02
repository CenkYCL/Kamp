/*
IF
*/

package ilkDers;

public class Main {

	public static void main(String[] args) {
		
		String mesajKarsilama = ("Merhaba Sayýn Müþterimiz, Dolar Bugün : ");
		int dolarDun = 7;
		int dolarBugun = 8;
		
		if (dolarDun<dolarBugun) {
			System.out.println(mesajKarsilama + "Yükseldi");
		}
		else if (dolarDun>dolarBugun) {
			System.out.println(mesajKarsilama + "Düþtü");
		}
		else {
			System.out.println(mesajKarsilama + "Eþit");
		}
			
		

	}

}
