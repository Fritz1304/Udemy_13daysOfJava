import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		while(true) {
		int option = Integer.parseInt(JOptionPane.showInputDialog("""
				1. Suma
				2. Resta
				3. Multiplicación
				4. División	
				5. Salir
				
				"""));
		try {
			
			if(option >= 1 && option <=4) {
				executeOperation(option);
			}else if(option == 5) {
				System.out.println("Saliendo...");
				break;
			}else {
				System.out.println("Opcion erronea: " + option);
			}
			 System.out.println();
		}catch (Exception e){
	        System.out.println("Ocurrio un error: " + e.getMessage());
	      }
		}
	}
	
	private static void executeOperation(int operation) {
		
		  // Crear los campos de texto
	    JTextField campo1 = new JTextField(5);
	    JTextField campo2 = new JTextField(5);

	    // Crear un panel para poner ambos campos y etiquetas
	    JPanel panel = new JPanel(new GridLayout(2, 2, 5, 5));
	    panel.add(new JLabel("Proporciona valor operando1:"));
	    panel.add(campo1);
	    panel.add(new JLabel("Proporciona valor operando2:"));
	    panel.add(campo2);

	    // Mostrar el panel en un JOptionPane
	    int resultadoVentana = JOptionPane.showConfirmDialog(
	            null,
	            panel,
	            "Ingresar operandos",
	            JOptionPane.OK_CANCEL_OPTION,
	            JOptionPane.PLAIN_MESSAGE
	    );

	    // Si el usuario presiona "Cancelar" o cierra la ventana, salimos
	    if (resultadoVentana != JOptionPane.OK_OPTION) {
	        JOptionPane.showMessageDialog(null, "Operación cancelada.");
	        return;
	    }

	    try {
	        double operando1 = Double.parseDouble(campo1.getText());
	        double operando2 = Double.parseDouble(campo2.getText());
	        double resultado = 0;

	        switch (operation) {
	            case 1 -> {
	                resultado = operando1 + operando2;
	                JOptionPane.showMessageDialog(null, "Resultado Suma: " + resultado);
	            }
	            case 2 -> {
	                resultado = operando1 - operando2;
	                JOptionPane.showMessageDialog(null, "Resultado Resta: " + resultado);
	            }
	            case 3 -> {
	                resultado = operando1 * operando2;
	                JOptionPane.showMessageDialog(null, "Resultado Multiplicación: " + resultado);
	            }
	            case 4 -> {
	                if (operando2 == 0) {
	                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.");
	                    return;
	                }
	                resultado = operando1 / operando2;
	                JOptionPane.showMessageDialog(null, "Resultado División: " + resultado);
	            }
	            default -> JOptionPane.showMessageDialog(null, "Opción errónea: " + operation);
	        }
	    } catch (NumberFormatException e) {
	        JOptionPane.showMessageDialog(null, "Por favor ingresa solo números válidos.");
	    }
		
	}
}
