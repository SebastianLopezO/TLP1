package viewGUI;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import Bean.Admin;
import logic.LAdmin;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Cursor;

public class OpActualizar extends JPanel {
	private JTextField txtIngresanombre;
	private JTextField txtIngresaTucorreo;
	private JTextField txtIngresaTutel;
	private JTextField txtIngresaElNombre;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	public LAdmin logica = new LAdmin();

	/**
	 * Create the panel.
	 */
	public OpActualizar(JPanel panelops, int id) {
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		add(panel, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 0, 255));
		
		txtIngresanombre = new JTextField();
		txtIngresanombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresanombre.setText("");
			}
		});
		txtIngresanombre.setText("Ingresa tu nombre\r\n");
		txtIngresanombre.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresanombre.setName("");
		txtIngresanombre.setForeground(Color.LIGHT_GRAY);
		txtIngresanombre.setColumns(10);
		txtIngresanombre.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		txtIngresaTucorreo = new JTextField();
		txtIngresaTucorreo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresaTucorreo.setText("");
			}
		});
		txtIngresaTucorreo.setText("Ingresa tu correo\r\n");
		txtIngresaTucorreo.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresaTucorreo.setName("");
		txtIngresaTucorreo.setForeground(Color.LIGHT_GRAY);
		txtIngresaTucorreo.setColumns(10);
		txtIngresaTucorreo.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		txtIngresaTutel = new JTextField();
		txtIngresaTutel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresaTutel.setText("");
			}
		});
		txtIngresaTutel.setText("Ingresa tu telefono\r\n\r\n");
		txtIngresaTutel.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresaTutel.setName("");
		txtIngresaTutel.setForeground(Color.LIGHT_GRAY);
		txtIngresaTutel.setColumns(10);
		txtIngresaTutel.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		txtIngresaElNombre = new JTextField();
		txtIngresaElNombre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresaElNombre.setText("");
			}
		});
		txtIngresaElNombre.setText("Ingresa el nombre de tu agencia\r\n\r\n");
		txtIngresaElNombre.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresaElNombre.setName("");
		txtIngresaElNombre.setForeground(Color.LIGHT_GRAY);
		txtIngresaElNombre.setColumns(10);
		txtIngresaElNombre.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 128, 192), 2));
		panel_2.setBackground(Color.BLUE);
		
		lblNewLabel_1 = new JLabel("Actualizar información");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					//Vinicio.ident = Integer.parseInt(txtIngresaTuIdentificacin.getText());
					Admin duenio = new Admin(id, txtIngresanombre.getText(), txtIngresaTucorreo.getText(), Long.parseLong(txtIngresaTutel.getText()), txtIngresaElNombre.getText(), null );
					ArrayList<Admin> a = logica.GenerarSerializado();
					logica.Ingresar(logica.Reemplazar(a, duenio, id));
					
					JOptionPane.showMessageDialog(null, "Tu información ha sido actualizada");
					panelops.removeAll();
					panelops.revalidate();
					panelops.repaint();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Ingresa informacion valida en los campos");
				}
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		panel_2.add(lblNewLabel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(76)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtIngresanombre, Alignment.LEADING)
						.addComponent(txtIngresaTucorreo, Alignment.LEADING)
						.addComponent(txtIngresaTutel, Alignment.LEADING)
						.addComponent(txtIngresaElNombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE))
					.addContainerGap(48, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap(160, Short.MAX_VALUE)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(140))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtIngresanombre, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtIngresaTucorreo, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtIngresaTutel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtIngresaElNombre, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(39, Short.MAX_VALUE))
		);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Actualizar información");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 23));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
		panel.setLayout(gl_panel);

	}
}
