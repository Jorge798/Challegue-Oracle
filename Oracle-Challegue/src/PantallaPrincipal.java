import javax.swing.JOptionPane;

public class PantallaPrincipal {
	
	public void VentanaPrincipal() {
		
		ConversorDinero cd = new ConversorDinero();
		
		Object[] op = {"Conversor de Moneda","Conversor de Masa"};
		
		Object sel = JOptionPane.showInputDialog(null,"Seleccione una Opcion","Proyecto-Conversor",
		JOptionPane.PLAIN_MESSAGE,null,op,op[0]);
		
		String sl = op.toString();
		
		switch(sl){
		
			case "Conversor de Moneda":
				break;
			case "Conversor de Masa":
				break;
		
		}
	}
	
}