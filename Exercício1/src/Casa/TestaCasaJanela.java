package Casa;

public class TestaCasaJanela {
	public static void main(String[]args) {
		
		Janela janela = new Janela();
		janela.cor = "marrom";
		janela.material = "zinco";
		
		Casa casa3 = new Casa();
		casa3.numero = 10;
		casa3.cor = "bege";
		casa3.janela = janela;
		
		System.out.println("A casa de número"+ " " +  casa3.numero+ " " +  "tem cor"+ " " +  casa3.cor);
		System.out.println("A janela da casa de número" + " " + casa3.numero + " " + "tem cor" + " " + janela.cor + " " + "e material de" + " " + janela.material);
	}
	
}
