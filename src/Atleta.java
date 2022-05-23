
public class Atleta {
	public double peso;
	public double altura;
	public double imc;
	public void ObterIMC() {
		imc = this.peso / (this.altura * this.altura);
	}
	public void Classificar() {
		if(imc < 18.5) {
			System.out.println("Classificação: Abaixo do peso\nRisco de saúde: Muito alto");
		}
		else if(imc >= 18.5 && imc < 25) {
			System.out.println("IMC: " + this.imc + "\nClassificação: Peso normal\nRisco de saúde: baixo");
		}
		else if(imc >= 25 && imc < 30) {
			System.out.println("IMC: " + this.imc + "\nClassificação: Pre-Obesidade\nRisco de saúde: Média");
		}
		else if(imc >= 30 && imc < 35) {
			System.out.println("IMC: " + this.imc + "\nClassificação: Obesidade nível 1\nRisco de saúde: Alta");
		}
		else if(imc >= 35 && imc < 40) {
			System.out.println("IMC: " + this.imc + "\nClassificação: Obesidade nível 2\nRisco de saúde: Muito alta");
		}
		else{
			System.out.println("IMC: " + this.imc + "\nClassificação: Obesidade nível 3\nRisco de saúde: Muitíssimo alta");
		}
		
	}
}
