public class Main {
	public static void main(String[] args) {
		Veiculo carro = new Carro();
		Veiculo motocicleta = new Motocicleta();

		carro.ligar();
		carro.desligar();

		motocicleta.ligar();
		motocicleta.desligar();
	}
}
