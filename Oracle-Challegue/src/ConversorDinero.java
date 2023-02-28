import javax.swing.JOptionPane;

public class ConversorDinero {

	private void SeleccionarMoneda(double Moneda){
		
		Object[] selMoneda = {"De Bolivianos a Dolares","De Bolivianos a Euros","De Bolivianos a Libras",
				"De Bolivianos a Yen","De Bolivianos a Won","De Dolares a Bolivianos","De Euros a Bolivianos",
				"De Libra a Bolivianos","De Yen a Bolivianos","De Won a Bolivianos"};
		
		Object selOpcion = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Monedas",JOptionPane.PLAIN_MESSAGE,
				null,selMoneda,selMoneda[0]);
		
		double dolar = 6.92;
		double euro = 7.30;
		double libra = 8.27;
		double yen = 0.051;
		double won = 0.0052;
		double res = 0.0;
	}
	
}