import javax.swing.JOptionPane;

public class IngresarValor {
	
	double Moneda;
	
	public IngresarValor(){
		Moneda = 0.0;
	}
	
	public double getMoneda(){
		return Moneda;
	}
	
	public void RegistrarValor(){
		String dato = JOptionPane.showInputDialog(null,"El valor que desea convertir","Ingrese",JOptionPane.QUESTION_MESSAGE);
		
		if(dato!=null){
			try{
				Moneda = Double.parseDouble(dato);
			}catch(Exception ex){
				System.out.println(ex);
				JOptionPane.showMessageDialog(null,"Ingrese un dato valido");
			}
		}
	}
}
