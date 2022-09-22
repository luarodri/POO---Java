public class GatoTeste {
	public static void main(String[]args) {
	
		Gato gato = new Gato();
		Gato gato2 = new Gato();
		Gato gato3 = new Gato();
		
		gato.vivo =  true;
		gato2.vivo = true;
		gato3.vivo = false;
		
		gato.cor = "cinza";
		gato2.cor = "marrom";
		gato3.cor = "preto";
		
		gato.idade = 3;
		gato2.idade = 5;
		gato3.idade = 10;
		
		gato.nome = "Pitolomeu";
		gato2.nome = "Robertinho";
		gato3.nome = "Carlinhos";
		
		System.out.println(gato.vivo + " " + gato.cor + " " +  gato.idade + " " +  gato.nome);
		System.out.println(gato2.vivo + " " +  gato2.cor + " " + gato2.idade + " " + gato2.nome);
		System.out.println(gato3.vivo + " " +  gato3.cor + " " +  gato3.idade + " " +  gato3.nome);
		
	}


}
