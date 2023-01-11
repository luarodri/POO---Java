import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Utils {
public static boolean existe(Collection x, Planta y) {
	return x.contains(y);
}
public static Map retornaDados(Set conjuntoPlanta) {
	HashMap hm = new HashMap();
	Iterator it = conjuntoPlanta.iterator();
	while(it.hasNext()) {
		String palavra = (String) it.next();
		String[] x = palavra.split("#");
		if(x[3].equals("p")) {
			Pteridofita a = new Pteridofita(x[0]);
			a.setNome(x[1]);
			a.setTam(Double.parseDouble(x[2]));
			hm.put(x[0],a);
		}else if(x[3].equals("B")){
			Briofita b = new Briofita(x[0]);
			b.setNome(x[1]);
			b.setTam(Double.parseDouble(x[2]));
			hm.put(x[0],b);
			
		}
		
		
	}
	return hm;
  }
}