package converterMoedas;

import javax.swing.*;

public class Funcao {

	ConverteMoedas moedas = new ConverteMoedas();
	ConversorReais reais = new ConversorReais();

	public void converterMoeda(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog(null, "Escolha a moeda para converção", "Moedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Reais para Dólares", "Reais para Euros", "Reais para Libras",
						"Reais para Peso Argentino", "Reais para Peso Chileno ", "Dólares para Reais",
						"Euro para Reais ", "Libras para Reais ", "Peso Argentino para Reais",
						"Peso Chileno para Reais" },
				"Escolha")).toString();

		switch (opcao) {

		case "Reais para Dólares":
			moedas.converterReaisParaDolares(valorRecebido);
			break;

		case "Reais para Euros":
			moedas.converterReaisParaEuros(valorRecebido);
			break;

		case "Reais para Libras":
			moedas.converterReaisParaLibras(valorRecebido);
			break;

		case "Reais para Peso Argentino":
			moedas.converterReaisParaPesosArgentinos(valorRecebido);
			break;

		case "Reais para Peso Chileno ":
			moedas.converterReaisParaPesosChilenos(valorRecebido);
			break;

		case "Dólares para Reais":
			reais.converterDolaresParaReais(valorRecebido);
			break;

		case " Euro para Reais ":
			reais.converterEurosParaReais(valorRecebido);
			break;

		case "Libras para Reais ":
			reais.converterLibrasParaReais(valorRecebido);
			break;

		case "Peso Argentino para Reais":
			reais.converterPesosArgentinosParaReais(valorRecebido);
			break;

		case "Peso Chileno para Reais":
			reais.converterPesosChilenosParaReais(valorRecebido);
			break;
		}

	}

}
