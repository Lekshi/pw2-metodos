
public class Atleta {
	public double peso;
	public double altura;
	public double imc;
	public void ObterIMC() {
		imc = this.peso / (this.altura * this.altura);
	}
	public void Classificar() {
		if(imc < 18.5) {
			System.out.println("Classifica��o: Abaixo do peso\nRisco de sa�de: Muito alto");
		}
		else if(imc >= 18.5 && imc < 25) {
			System.out.println("IMC: " + this.imc + "\nClassifica��o: Peso normal\nRisco de sa�de: baixo");
		}
		else if(imc >= 25 && imc < 30) {
			System.out.println("IMC: " + this.imc + "\nClassifica��o: Pre-Obesidade\nRisco de sa�de: M�dia");
		}
		else if(imc >= 30 && imc < 35) {
			System.out.println("IMC: " + this.imc + "\nClassifica��o: Obesidade n�vel 1\nRisco de sa�de: Alta");
		}
		else if(imc >= 35 && imc < 40) {
			System.out.println("IMC: " + this.imc + "\nClassifica��o: Obesidade n�vel 2\nRisco de sa�de: Muito alta");
		}
		else{
			System.out.println("IMC: " + this.imc + "\nClassifica��o: Obesidade n�vel 3\nRisco de sa�de: Muit�ssimo alta");
		}
		
	}
}
