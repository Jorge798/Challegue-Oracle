import javax.swing.JOptionPane;

public class PantallaPrincipal {
	
	public void VentanaPrincipal() {
		String name = JOptionPane.showInputDialog("Tipo de nombre");
		JOptionPane.showMessageDialog(null, "hello" +name);
	}
	
}