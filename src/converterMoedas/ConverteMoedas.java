package converterMoedas;

import javax.swing.JOptionPane;

public class ConverteMoedas {
	
	public void converterReaisParaDolares(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.13;
		moedaDolar = (double) Math.round(moedaDolar *100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " dólares" );
	}
	
	public void converterReaisParaEuros (double valorRecebido) {
		double moedaEuro = valorRecebido / 10.85;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " euros");
	}
	
	public void converterReaisParaLibras (double valorRecebido) {
		double moedaLibra = valorRecebido / 6.33;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " libras esterlinas");
	}
	
	public void converterReaisParaPesosArgentinos(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido / 0.039;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " pesos argentinos");
	}

	
	public void converterReaisParaPesosChilenos(double valorRecebido) {
		double moedaPesoChileno = valorRecebido / 0.0040;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " pesos chilenos");
	}
}
