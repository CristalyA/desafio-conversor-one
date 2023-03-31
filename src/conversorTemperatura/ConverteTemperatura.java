package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConverteTemperatura {

	public double converterCelsiusParaFahrenheit(double valorRecebido) {
		double celsiusParaFahrenheit = valorRecebido * 1.8 + 32;
		celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null,
				valorRecebido + "Graus Celsius são " + celsiusParaFahrenheit + " graus Fahrenheit");
		return celsiusParaFahrenheit;
	}

	public double converterCelsiusParaKelvin(double valorRecebido) {
		double celsiusParaKelvin = valorRecebido + 273.15;
		celsiusParaKelvin = (double) Math.round(celsiusParaKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são " + celsiusParaKelvin + " Kelvin");
		return celsiusParaKelvin;
	}

	public double converterFahrenheitParaCelsius(double valorRecebido) {
		double fahrenheitParaCelsius = (valorRecebido - 32) / 1.8;
		fahrenheitParaCelsius = (double) Math.round(fahrenheitParaCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorRecebido + "Graus Fahrenheit são " + fahrenheitParaCelsius + " Celsius");
		return fahrenheitParaCelsius;
	}

	public double converterKelvinParaCelsius(double valorRecebido) {
		double kelvinParaCelsius = (valorRecebido - 32) / 1.8;
		kelvinParaCelsius = (double) Math.round(kelvinParaCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorRecebido + "Kelvin são " + kelvinParaCelsius + " Celsius");
		return kelvinParaCelsius;
	}

	public double converterKelvinParaFahrenheti(double valorRecebido) {
		double kelvinParaFahrenheit = (valorRecebido - 273.15) * 9 / 5 + 32;
		kelvinParaFahrenheit = (double) Math.round(kelvinParaFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, valorRecebido + "Kelvin são " + kelvinParaFahrenheit + " Fahrenheit");
		return kelvinParaFahrenheit;
	}
}
