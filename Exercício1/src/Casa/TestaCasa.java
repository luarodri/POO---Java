package Casa;

public class TestaCasa {
	public static void main(String[]args) {
		Casa casa1 = new Casa();
		Casa casa2 = new Casa();
		
		casa1.numero = 4;
		casa2.numero = 6;
		
		casa1.cor = "verde";
		casa2.cor = "branca";
		
		System.out.println("A casa de número" + " " + casa1.numero + " " + "tem cor" + " " + casa1.cor);
		System.out.println("A casa de número" + " " + casa2.numero + " " + "tem cor" + " " + casa2.cor);
		
		
		
	}

}
