package cofre;

public class Moedas {
	private double vReal;
	private double vDolar;
	private double vEuro;
	
	
	
	
	public double getvReal() {
		return vReal;
	}
	public void setvReal(double vReal) {
		this.vReal = vReal;
	}
	public double getvDolar() {
		return vDolar;
	}
	public void setvDolar(double vDolar) {
		this.vDolar = vDolar;
	}
	public double getvEuro() {
		return vEuro;
	}
	public void setvEuro(double vEuro) {
		this.vEuro = vEuro;
	}
	
	
	
	public void conversao(double vDolar, double vEuro) {
		
		double dolar = vDolar * 5;
		double euro = vEuro * 5;
		double total = dolar + euro + getvReal();
		System.out.printf("Total Convertido em reais : %.2f R$",total);
		System.out.println(" ");
	}
	
	public void Listar() {
		System.out.printf("Listar de Valores \n1 - Real : %.2f R$\n2 - Dolar : %.2f $\n3 - Euro : %.2f E\n  ", vReal,vDolar,vEuro);
		
	}
	
	//Remove
	
	public void RemoveReal(double real) {
		this.vReal = this.vReal - real;
	}
	
	public void RemoveDolar(double dolar) {
		this.vDolar = this.vDolar - dolar;
	}
	
	public void RemoveEuro(double euro) {
		this.vEuro = this.vEuro - euro;
	}
	
	
	
}


