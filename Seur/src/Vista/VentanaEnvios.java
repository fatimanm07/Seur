package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEnvios {

	private JFrame frame;
	private JTextField txtOrigen;
	private JTextField txtDestino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEnvios window = new VentanaEnvios();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaEnvios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCiudadOrigen = new JLabel("Ciudad Origen:");
		lblCiudadOrigen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblCiudadDestino = new JLabel("Ciudad Destino:");
		lblCiudadDestino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		txtOrigen = new JTextField();
		txtOrigen.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtOrigen.setColumns(10);
		
		txtDestino = new JTextField();
		txtDestino.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtDestino.setColumns(10);
		
		JRadioButton rdbtnNacional = new JRadioButton("Nacional");
		rdbtnNacional.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JRadioButton rdbtnExtranjero = new JRadioButton("Extranjero");
		
		JRadioButton rdbtnNacional2 = new JRadioButton("Nacional");
		rdbtnNacional2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JRadioButton rdbtnExtranjero2 = new JRadioButton("Extranjero");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paq 10 - Antes de las 10 horas.", "Paq 24 - Al día siguiente."}));
		comboBox.setToolTipText("");
		
		JLabel lblTipoEnvio = new JLabel("Tipo de Envio:");
		lblTipoEnvio.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblPeso = new JLabel("Peso :");
		lblPeso.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblkg = new JLabel("kg");
		lblkg.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		ButtonGroup Origen= new ButtonGroup();
		Origen.add(rdbtnNacional);
		Origen.add(rdbtnExtranjero);
		
		ButtonGroup Destino= new ButtonGroup();
		Destino.add(rdbtnNacional2);
		Destino.add(rdbtnExtranjero2);
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCiudadOrigen)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtOrigen, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCiudadDestino, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnNacional)
									.addGap(18)
									.addComponent(rdbtnExtranjero))
								.addComponent(txtDestino, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtnNacional2)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnExtranjero2))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblTipoEnvio)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblPeso, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblkg, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
							.addGap(108)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCiudadOrigen)
						.addComponent(txtOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNacional)
						.addComponent(rdbtnExtranjero))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCiudadDestino, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtnNacional2)
								.addComponent(rdbtnExtranjero2))
							.addGap(18)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblTipoEnvio))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPeso)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblkg))
					.addGap(18)
					.addComponent(btnCalcular)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
