public class Soma {
	static int soma = 0;
	
	public static void main(String[]args) {
		for(int i = 1; i<=10000; i++) {
			if(i%2 == 1) {
				soma+=i;
			}
		}
		System.out.println("Soma dos ímpares de 1 a 10000 é igual a" + " " + soma);
	}
}