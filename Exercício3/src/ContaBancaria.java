
public class ContaBancaria {
	private double saldo = 0.0;
	private Data dataAbertura; //guarda a data da abertura da conta bancária

	public double getSaldo(){
		return this.saldo;	
	}
	public void setSaldo(double s) {
		this.saldo = s;
		
	}
	public Data getdataAbertura() {
		return this.dataAbertura;
	}
	public void setdataAbertura(Data dataAbertura) {
		this.dataAbertura = dataAbertura;
		
	}
	public String getdataAberturaFormatada(int d, int m, int a){
		return d + "/" + m + "/" + a;
		
	}
	public void setdataAberturaFormatada(int d, int m, int a){
		this.getdataAberturaFormatada(d, m, a);
		
	}
	
	public String getsaldoFormatado(double s){
		return "R$" + s;	
	}
	public void setsaldoFormatado(double s) {
		this.getsaldoFormatado(s);
	}
	
	
	public void depositar(double val) {
		saldo += val;
		
	}
	public void sacar(double valSacar) {
		if(valSacar>saldo) {
			System.out.println("Proibido sacar!!!");
		}else {
			saldo-=valSacar;
			System.out.println("Liberando saque...");
		}
	}
}



