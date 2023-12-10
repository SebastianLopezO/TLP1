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
import Bean.Curso;
import logic.LAdmin;
import logic.LCursos;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Cursor;

public class OpIngresarC extends JPanel {
	private JTextField txtIngresanombre;
	private JTextField txtIngresacant;
	private JPanel panel_2;
	private JLabel lblNewLabel_1;
	public LAdmin logica = new LAdmin();
	LCursos B = new LCursos();

	/**
	 * Create the panel.
	 */
	public OpIngresarC(JPanel panelops,Admin due) {
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
		
		txtIngresacant = new JTextField();
		txtIngresacant.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtIngresacant.setText("");
			}
		});
		txtIngresacant.setText("Ingresa las existencias de los cursos");
		txtIngresacant.setSelectedTextColor(Color.LIGHT_GRAY);
		txtIngresacant.setName("");
		txtIngresacant.setForeground(Color.LIGHT_GRAY);
		txtIngresacant.setColumns(10);
		txtIngresacant.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(192, 192, 192)));
		
		panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 128, 192), 2));
		panel_2.setBackground(Color.BLUE);
		
		lblNewLabel_1 = new JLabel("Almacenar cursos");
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					ArrayList<Curso> a = new ArrayList<Curso>();
					Curso p = new Curso(txtIngresanombre.getText(), Integer.parseInt(txtIngresacant.getText()));
					a.add(p);
					B.Ingresar(a, due);
					due.getInventario();
					logica.Ingresar(logica.Reemplazar(logica.GenerarSerializado(), due, due.getIdentificacion()));
					panelops.removeAll();
					panelops.revalidate();
					panelops.repaint();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Ingresa informacion validas");
				}
			}
		});
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		panel_2.add(lblNewLabel_1);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(76)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(txtIngresacant, Alignment.LEADING)
							.addComponent(txtIngresanombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)))
					.addContainerGap(161, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(txtIngresanombre, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtIngresacant, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(115, Short.MAX_VALUE))
		);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Ingresar curso");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 23));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel, BorderLayout.CENTER);
		panel.setLayout(gl_panel);

	}
}
