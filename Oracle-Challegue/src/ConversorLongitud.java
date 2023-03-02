import javax.swing.JOptionPane;

public class ConversorLongitud {
	
	private void seleccionarLongitud(double Longitud){
		
		Object[] selLongitud = {"De Metros a Milimetros","De Metros a Centimetros","De Metros a Kilometros","De Metros a Pulgadas",
				"De Metros a Pies","De Milimetros a Metros","De Centimetros a Metros","De Kilometros a Metros","De Pulgadas a Metros",
				"De Pies a Metros"};
		
		Object selOpcion = JOptionPane.showInputDialog(null,"Seleccione una opcion de conversion","Longitud",JOptionPane.PLAIN_MESSAGE,
				null,selLongitud,selLongitud[0]);
		
		double Milimetros = 1000;
		double Centimetros = 100;
		double Kilometros = 0.001;
		double Pulgadas = 39.3701;
		double Pies = 3.28084;
		double res = 0.0;
		
		String sel = selOpcion.toString();
		String tipoLongitud = new String();
		
		switch(sel){
			case "De Metros a Milimetros":
				res = Longitud*Milimetros;
				tipoLongitud = "Milimetros";
				break;
			case "De Metros a Centimetros":
				res = Longitud*Centimetros;
				tipoLongitud = "Centimetros";
				break;
			case "De Metros a Kilometros":
				res = Longitud*Kilometros;
				tipoLongitud = "Kilometros";
				break;
			case "De Metros a Pulgadas":
				res = Longitud*Pulgadas;
				tipoLongitud = "Pulgadas";
				break;
			case "De Metros a Pies":
				res = Longitud*Pies;
				tipoLongitud = "Pies";
				break;
			case "De Milimetros a Metros":
				res = Longitud/Milimetros;
				tipoLongitud = "Metros";
				break;
			case "De Centimetros a Metros":
				res = Longitud/Centimetros;
				tipoLongitud = "Metros";
				break;
			case "De Kilometros a Metros":
				res = Longitud/Kilometros;
				tipoLongitud = "Metros";
				break;
			case "De Pulgadas a Metros":
				res = Longitud/Pulgadas;
				tipoLongitud = "Metros";
				break;
			case "De Pies a Metros":
				res = Longitud/Pies;
				tipoLongitud = "Metros";
				break;
			default:
				break;
		}
		JOptionPane.showMessageDialog(null,"Usted tiene "+Math.round(res*100.0)/100.0+" "+tipoLongitud);
	}
	
	public void convertirLongitud(){
		AgregarValor av = new AgregarValor();
		av.RegistrarValor();
		seleccionarLongitud(av.getDato());
	}
}