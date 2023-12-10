package viewGUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import Bean.Estudiante;
import logic.LEstudiante;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Vregistro extends JPanel {
	private JPanel registro = this;
	private JTextField txtIngresaTuNombre;
	private JTextField txtIngresaTuApellido;
	private JTextField txtIngresaTuAo;
	private JTextField id;

	public Vregistro(JFrame Vprinci, JPanel content) {
		setForeground(new Color(192, 192, 192));
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setBackground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBackground(Color.BLUE);
		
		txtIngresaTuNombre = new JTextField();
		txtIngresaTuNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresaTuNombre.setText("");
			}
		});
		txtIngresaTuNombre.setForeground(new Color(192, 192, 192));
		txtIngresaTuNombre.setText("Ingresa tu nombre\r\n");
		txtIngresaTuNombre.setName("");
		txtIngresaTuNombre.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		txtIngresaTuNombre.setSelectedTextColor(new Color(192, 192, 192));
		txtIngresaTuNombre.setColumns(10);
		
		txtIngresaTuApellido = new JTextField();
		txtIngresaTuApellido.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresaTuApellido.setText("");
			}
		});
		txtIngresaTuApellido.setText("Ingresa tu apellido");
		txtIngresaTuApellido.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresaTuApellido.setName("");
		txtIngresaTuApellido.setForeground(Color.LIGHT_GRAY);
		txtIngresaTuApellido.setColumns(10);
		txtIngresaTuApellido.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		txtIngresaTuAo = new JTextField();
		txtIngresaTuAo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresaTuAo.setText("");
			}
			
		});
		txtIngresaTuAo.setText("Ingresa tu año de nacimineto\r\n");
		txtIngresaTuAo.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresaTuAo.setName("");
		txtIngresaTuAo.setForeground(Color.LIGHT_GRAY);
		txtIngresaTuAo.setColumns(10);
		txtIngresaTuAo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		JLabel lblNewLabel = new JLabel("Registro de usuario.\r\n");
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 23));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 128, 192), 2));
		panel_1.setBackground(new Color(0, 0, 255));
		
		id = new JTextField();
		id.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id.setText("");
			}
		});
		id.setText("Ingresa tu identificación\r\n");
		id.setSelectedTextColor(Color.LIGHT_GRAY);
		id.setName("");
		id.setForeground(Color.LIGHT_GRAY);
		id.setColumns(10);
		id.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtIngresaTuAo, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtIngresaTuApellido, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(txtIngresaTuNombre, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(id, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(63)
					.addComponent(lblNewLabel)
					.addGap(18)
					.addComponent(txtIngresaTuNombre, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(txtIngresaTuApellido, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtIngresaTuAo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(id, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(70, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel_1 = new JLabel("Generar usuario");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LEstudiante a = new LEstudiante();
				if(txtIngresaTuNombre.getText().equals("") || txtIngresaTuApellido.getText().equals("") || txtIngresaTuAo.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Ingrese texto en todos los campos de texto.");
				}else{
					Random rn = new Random();
					String nombre = txtIngresaTuNombre.getText(), apellido = txtIngresaTuApellido.getText(), año = txtIngresaTuAo.getText(), usuario, contra;
					usuario = Character.toString(nombre.charAt(0)) + rn.nextInt(0, 200) + "_" + apellido + año;
					contra = Long.toString(rn.nextLong(1000, 10000));
					Estudiante us = new Estudiante(usuario, contra, Integer.parseInt(id.getText()));
					a.Ingresar(us);
					JOptionPane.showMessageDialog(null, "Usuario: "+ usuario +"\n"
							+ "Contraseña: " + contra);
					Vlogin h = new Vlogin(Vprinci, content);
					Vprinci.getContentPane().removeAll();
					Vprinci.getContentPane().add(h, BorderLayout.CENTER);
					Vprinci.getContentPane().revalidate();
					Vprinci.getContentPane().repaint();
				}
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_1);
		setLayout(groupLayout);
		
	}
}
