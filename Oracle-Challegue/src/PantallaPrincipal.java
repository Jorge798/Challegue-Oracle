import javax.swing.JOptionPane;

public class PantallaPrincipal {
	
	public void VentanaPrincipal() {
		
		Object[] op = {"Conversor de Moneda","Conversor de Masa"};
		
		Object sel = JOptionPane.showInputDialog(null,"Seleccione una Opcion","Proyecto-Conversor",
		JOptionPane.PLAIN_MESSAGE,null,op,op[0]);
		
		String sl = sel.toString();
		
		if(sel!=null){
			SeleccionarOpcion(sl);
		}
	}
	
	private void SeleccionarOpcion(String opcion){
		
		switch(opcion){
			case "Conversor de Moneda":
				ConversorDinero cd = new ConversorDinero();
				cd.ConvertirMoneda();
				break;
			case "Conversor de Masa":
				ConversorLongitud cl = new ConversorLongitud();
				cl.convertirLongitud();
				break;
		}
	}
}	