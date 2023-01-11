
public class Planta {
	private String id;
	private String nome;
	private double tam;
	
	
	public Planta(String id) {
		this.id = id;
	}
	
	public void setId (String id) {
		this.id = id;
	}

	public String getId(){
		return id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setTam(double tam) {
		this.tam = tam;
	}
	
	public double getTam(){
		return tam;
	}


public String toString () {
	return this.id + this.nome + this.tam;
	}

public boolean equals(Object o) {
	if(o instanceof Planta) {
		Planta p = (Planta) o;
		return this.id.contentEquals(p.getId());
	}else {
		return false;
		}
	}

}
