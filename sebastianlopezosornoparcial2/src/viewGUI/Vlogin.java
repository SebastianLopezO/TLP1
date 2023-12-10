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
import javax.swing.SwingConstants;

public class Vlogin extends JPanel {
	private JTextField txtIngresausuario;
	private JTextField txtIngresacontraseña;

	public Vlogin(JFrame Vinicio, JPanel content) {
		setForeground(new Color(192, 192, 192));
		setBorder(new LineBorder(new Color(0, 0, 0), 3));
		setBackground(new Color(255, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.setBackground(Color.BLUE);
		
		txtIngresausuario = new JTextField();
		txtIngresausuario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresausuario.setText("");
			}
		});
		txtIngresausuario.setForeground(new Color(192, 192, 192));
		txtIngresausuario.setText("Estudiante:\r\n");
		txtIngresausuario.setName("");
		txtIngresausuario.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		txtIngresausuario.setSelectedTextColor(new Color(192, 192, 192));
		txtIngresausuario.setColumns(10);
		
		txtIngresacontraseña = new JTextField();
		txtIngresacontraseña.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresacontraseña.setText("");
			}
		});
		txtIngresacontraseña.setText("Contraseña:");
		txtIngresacontraseña.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresacontraseña.setName("");
		txtIngresacontraseña.setForeground(Color.LIGHT_GRAY);
		txtIngresacontraseña.setColumns(10);
		txtIngresacontraseña.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		JLabel titulo = new JLabel("Login\r\n\r\n");
		titulo.setFont(new Font("Cooper Black", Font.PLAIN, 23));
		titulo.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 128, 192), 2));
		panel_1.setBackground(new Color(0, 0, 255));
		
		JLabel lblVolver = new JLabel("Volver");
		lblVolver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Vinicio.getContentPane().removeAll();
				Vinicio.getContentPane().add(content);
				Vinicio.getContentPane().revalidate();
				Vinicio.getContentPane().repaint();
			}
		});
		lblVolver.setVerticalAlignment(SwingConstants.BOTTOM);
		lblVolver.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		lblVolver.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblVolver.setForeground(new Color(0, 0, 255));
		lblVolver.setFont(new Font("Arial", Font.BOLD, 11));
		lblVolver.setBackground(Color.WHITE);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(24)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(txtIngresacontraseña, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(titulo)
						.addComponent(txtIngresausuario, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVolver, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(63)
					.addComponent(titulo)
					.addGap(18)
					.addComponent(txtIngresausuario, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(4)
					.addComponent(txtIngresacontraseña, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblVolver)
					.addContainerGap(54, Short.MAX_VALUE))
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
		);
		
		JLabel inicio = new JLabel("Ingresar\r\n");
		inicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LEstudiante a = new LEstudiante();
				if(txtIngresausuario.getText().equals("") || txtIngresacontraseña.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Ingrese texto en todos los campos de texto.");
				}else{
					String usuario = txtIngresausuario.getText(), contra = txtIngresacontraseña.getText();
					
					if(txtIngresausuario.getText().equalsIgnoreCase("admin") && txtIngresacontraseña.getText().equalsIgnoreCase("admin") ) {
						Vadmin ops = new Vadmin(Vinicio);
						Vinicio.getContentPane().removeAll();
						Vinicio.getContentPane().add(ops);
						Vinicio.getContentPane().revalidate();
						Vinicio.getContentPane().repaint();
					}else {
						Estudiante h = a.BuscarUC(usuario, contra);
						if(h == null ) {
							JOptionPane.showMessageDialog(null, "Usuario o contraseña no validas");
						}else{
							Vapp ops = new Vapp(Vinicio, h.getId());
							Vinicio.getContentPane().removeAll();
							Vinicio.getContentPane().add(ops);
							Vinicio.getContentPane().revalidate();
							Vinicio.getContentPane().repaint();
						}
					}
					
					
					
				}
			}
		});
		inicio.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		inicio.setFont(new Font("Arial", Font.BOLD, 13));
		inicio.setForeground(new Color(255, 255, 255));
		panel_1.add(inicio);
		setLayout(groupLayout);
		
	}
}
