package converterMoedas;

import javax.swing.JOptionPane;

public class ConversorReais {
	
	public void converterDolaresParaReais(double valorRecebido) {
		double moedaDolar = valorRecebido * 5.13;
		moedaDolar = (double) Math.round(moedaDolar * 100d) /100 ;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaDolar + " reais");
	}
	
	public void converterEurosParaReais(double valorRecebido) {
		double moedaEuro = valorRecebido * 10.85;
		moedaEuro = (double) Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaEuro + " reais");
	}
	
	public void converterLibrasParaReais(double valorRecebido) {
		double moedaLibra = valorRecebido * 6.33;
		moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " +  moedaLibra + " reais");		
	}
	
	public void converterPesosArgentinosParaReais(double valorRecebido) {
		double moedaPesoArgentino = valorRecebido * 0.039;
		moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + " reais");
	}
	
	public void converterPesosChilenosParaReais(double valorRecebido) {
		double moedaPesoChileno = valorRecebido * 0.0040;
		moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d ) / 100;
		JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " reais");
	}

}
