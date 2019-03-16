import javax.swing.JOptionPane;

public class CALCULADORA {

	private int valor1;
	private int valor2;
	public CALCULADORA() {

	}

	public CALCULADORA(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}

	private int getValor1() {
		return valor1;
	}

	private void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	private int getValor2() {
		return valor2;
	}

	private void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public void somar () {
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1"));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2"));


		System.out.println("A soma dos valores é " + (valor1 + valor2));

	}

}
