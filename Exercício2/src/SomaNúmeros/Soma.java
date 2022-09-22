package SomaNúmeros;

public class Soma {
	static int soma = 0;
	
	public static void main(String[]args) {
		for(int i = 1; i<=50000; i++) {
			if(i<=99) {
				soma+=i;
				if(i>=138) {
					soma+=i;
				}
			}
		}
		System.out.println("Soma dos números é igual a" + " " + soma);
	}

}
