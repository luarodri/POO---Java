
public class Teste {
	public static void main(String[]args) {
		
		ContaBancaria c1 = new ContaBancaria();
		
		c1.setdataAberturaFormatada(02, 9, 2022);
		c1.setSaldo(27000);
		
		//c1.sacar(290);
		c1.sacar(28000);
		
		System.out.println(c1.getdataAberturaFormatada(2, 9, 2022));
		
		
		
	}
}
