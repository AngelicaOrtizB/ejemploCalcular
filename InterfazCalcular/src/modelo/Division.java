package modelo;

public class Division {
	int dividendo;
	int divisor;
	public Division(int dividendo, int divisor) {
		this.dividendo = dividendo;
		this.divisor = divisor;
	}
	
	public double calcularDivision() {
		
		double resultado= this.dividendo/this.divisor;
		return resultado;
		
	}
	
	

}
