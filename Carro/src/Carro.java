
public class Carro {

	//atributos
	private String marca;
	private	boolean ligado;
	private int velocidade;
	private int marcha;	

	//construtor sem valor
	public Carro() {


	}
	// construtor com valores
	public Carro(String marca, boolean ligado, int velocidade, int marcha) {

		this.marca = marca;
		this.ligado = ligado;
		this.velocidade = velocidade;
		this.marcha = marcha;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public void LigarCarro()
	{
		if(this.ligado==true) {
			System.out.println("O carro está Ligado");
		}
		else {
			System.out.println(" O carro está desligado");
		}
	}
	public void Acelerar()
	{
		
		
			System.out.println("O caro está acelerando");
		
	}

}



