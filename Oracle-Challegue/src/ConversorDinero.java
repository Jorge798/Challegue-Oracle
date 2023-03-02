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
		
		String sel = selMoneda.toString();
		
		switch(sel){
			case "De Bolivianos a Dolares":
				res = Moneda/dolar;
				break;
			case "De Bolivianos a Euros":
				res = Moneda/euro;
				break;
			case "De Bolivianos a Libra":
				res = Moneda/libra;
				break;
			case "De Bolivianos a Yen":
				res = Moneda/yen;
				break;
			case "De Bolivianos a Won":
				res = Moneda/won;
				break;
			case "De Dolares a Bolivianos":
				res = Moneda*dolar;
				break;
			case "De Euros a Bolivianos":
				res = Moneda*euro;
				break;
			case "De Libra a Bolivianos":
				res = Moneda*libra;
				break;
			case "De Yen a Bolivianos":
				res = Moneda*yen;
				break;
			case "De Won a Bolivianos":
				res = Moneda*won;
				break;
			default:
				break;
		}
	}
	
	public void ConvertirMoneda(){
		IngresarValor iv = new IngresarValor();
		iv.RegistrarValor();
		SeleccionarMoneda(iv.getMoneda());
	}
}