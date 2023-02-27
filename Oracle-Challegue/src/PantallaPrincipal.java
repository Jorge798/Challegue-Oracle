import javax.swing.JOptionPane;

public class PantallaPrincipal {
	
	public void VentanaPrincipal() {
		Object[] op = {"Conversor de Moneda","Conversor de Masa"};
		Object sel = JOptionPane.showInputDialog(null,"Seleccione una Opcion","Proyecto-Conversor",
		JOptionPane.PLAIN_MESSAGE,null,op,op[0]);
		
		
	}
	
}