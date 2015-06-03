package Vistas;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class VistaInicial extends JPanel {
	private static final long serialVersionUID = 7618248448122231508L;
	private JTextField textField;
	private JTextField textField_1;
	String[] telefonos = {"687622552","967622552"};
	JComboBox<String> comboBox = new JComboBox<String>(telefonos);
	
	public VistaInicial() {
		setLayout(null);
		
		//Añadimos los numeros de teléfono
		comboBox.addItem(telefonos[0]);
		comboBox.addItem(telefonos[1]);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 100, 14);
		add(lblNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 36, 208, 20);
		add(textField);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 71, 100, 14);
		add(lblApellidos);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 96, 208, 20);
		add(textField_1);
		
		JLabel lblNewLabel = new JLabel("Teléfonos");
		lblNewLabel.setBounds(10, 141, 93, 14);
		add(lblNewLabel);
		
		comboBox = new JComboBox<String>(telefonos);
		comboBox.setBounds(10, 173, 208, 20);
		add(comboBox);

	}
}
