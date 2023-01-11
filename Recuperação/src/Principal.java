
import java.util.Scanner;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;

public class Principal {
	public static void main(String [] args) {
		Set s = LerArquivo.retornaStrings("c:/Planta.txt");
		
		Map planta = Utils.retornaDados(s);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id da planta: ");
		String id = sc.nextLine();
		Planta c1 = new Planta(id);
		boolean existe = (Utils.existe(planta.values(), c1 ));
		if(existe) {
			System.out.println(s);
		}else {
			System.out.println("A planta com o id:" + " " + c1.getId() + " " + "não existe");
		}
		
	}

}
