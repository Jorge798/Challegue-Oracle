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
		
		String tipoMoneda = new String();
		
		String sel = selOpcion.toString();
		
		switch(sel){
			case "De Bolivianos a Dolares":
				res = Moneda/dolar;
				tipoMoneda = "Dolares";
				break;
			case "De Bolivianos a Euros":
				res = Moneda/euro;
				tipoMoneda = "Euros";
				break;
			case "De Bolivianos a Libra":
				res = Moneda/libra;
				tipoMoneda = "Libras";
				break;
			case "De Bolivianos a Yen":
				res = Moneda/yen;
				tipoMoneda = "Yenes";
				break;
			case "De Bolivianos a Won":
				res = Moneda/won;
				tipoMoneda = "Wones";
				break;
			case "De Dolares a Bolivianos":
				res = Moneda*dolar;
				tipoMoneda = "Bolivanos";
				break;
			case "De Euros a Bolivianos":
				res = Moneda*euro;
				tipoMoneda = "Bolivanos";
				break;
			case "De Libra a Bolivianos":
				res = Moneda*libra;
				tipoMoneda = "Bolivanos";
				break;
			case "De Yen a Bolivianos":
				res = Moneda*yen;
				tipoMoneda = "Bolivanos";
				break;
			case "De Won a Bolivianos":
				res = Moneda*won;
				tipoMoneda = "Bolivanos";
				break;
			default:
				break;
		}
		JOptionPane.showMessageDialog(null,"Usted tiene "+Math.round(res*100.0)/100.0+" "+tipoMoneda);
	}
	
	public void ConvertirMoneda(){
		AgregarValor av = new AgregarValor();
		av.RegistrarValor();
		SeleccionarMoneda(av.getDato());
	}
}