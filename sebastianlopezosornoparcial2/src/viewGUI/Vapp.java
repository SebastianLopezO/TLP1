package viewGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.MatteBorder;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import logic.LAdmin;
import logic.LEstudiante;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Vapp extends JFrame {
	int ident;
	boolean ban;
	JPanel opciones;
	JPanel panelmenu;
	JPanel background;
	JPanel panelops;
	/**
	 * Create the panel.
	 */
	public Vapp(JFrame Vprinci, int id) {
		LAdmin a = new LAdmin();
		ident = id;
		ban = true;
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		background = new JPanel();
		background.setBorder(null);
		background.setBackground(new Color(255, 255, 255));
		getContentPane().add(background, BorderLayout.CENTER);
		background.setLayout(new BorderLayout(0, 0));
		
		panelmenu = new JPanel();
		panelmenu.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(0, 0, 0)));
		panelmenu.setBackground(new Color(0, 0, 255));
		background.add(panelmenu, BorderLayout.WEST);
		panelmenu.setLayout(new BorderLayout(0, 0));
		
		JPanel titulo = new JPanel();
		titulo.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		titulo.setBackground(new Color(255, 255, 255));
		panelmenu.add(titulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("MUV-U");
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		titulo.add(lblNewLabel);
		
		JPanel BordeLd = new JPanel();
		BordeLd.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		BordeLd.setBackground(new Color(0, 64, 128));
		panelmenu.add(BordeLd, BorderLayout.EAST);
		
		JPanel BordeLI = new JPanel();
		BordeLI.setBackground(new Color(0, 64, 128));
		panelmenu.add(BordeLI, BorderLayout.WEST);
		
		opciones = new JPanel();
		opciones.setBackground(new Color(255, 255, 255));
		panelmenu.add(opciones, BorderLayout.CENTER);
		opciones.setLayout(new BorderLayout(0, 0));
		
		JPanel bordeI = new JPanel();
		bordeI.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		bordeI.setBackground(new Color(0, 64, 128));
		opciones.add(bordeI, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 255, 255));
		opciones.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Asesor");
		lblNewJgoodiesLabel.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		panel_3.add(lblNewJgoodiesLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(new Color(255, 255, 255));
		opciones.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(7, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Ingresar\r\n");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					LAdmin b = new LAdmin();
					if(b.Buscar(b.GenerarSerializado(),ident) == null) {
						ban = true;
						OpIngresar a = new OpIngresar(panelops, ident);
						panelops.removeAll();
						panelops.add(a);
						panelops.revalidate();
						panelops.repaint();
					}else {
						JOptionPane.showMessageDialog(null, "Ya has ingresado tus datos de contacto");
						ban = true;

					}
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Cometiste un error");
				}
				
				
			}
		});
		
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_6.add(lblNewLabel_1);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("Actualizar");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ban) {
					try {
						OpActualizar a = new OpActualizar(panelops, ident);
						panelops.removeAll();
						panelops.add(a);
						panelops.revalidate();
						panelops.repaint();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Cometiste un error");
					}
				}else {
					JOptionPane.showMessageDialog(null, "No has ingresado tu información de  contacto.");
				}
				
				
			}
		});
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_5.add(lblNewLabel_1_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_2 = new JLabel("Borrar");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ban) {
					panelops.removeAll();
					panelops.revalidate();
					panelops.repaint();

					LAdmin a = new LAdmin();
					ban = false;
					a.Ingresar(a.Eliminar(a.GenerarSerializado(), ident));
					JOptionPane.showMessageDialog(null, "Tú información ha sido eliminada, si deseas realizar acciones en la pestaña negocio debes de ingresar tus datos nuevamente.");
				}else {
					JOptionPane.showMessageDialog(null, "No hay información la cual borrar.");
				}
			}
		});
		lblNewLabel_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(0, 64, 128));
		lblNewLabel_1_2.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_7.add(lblNewLabel_1_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 255, 255));
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_3 = new JLabel("Agencia");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ban) {
					LAdmin b = new LAdmin();
					JPanel c = panelmenu, d = panelops;
					Vcursos a = new Vcursos( b.Buscar(b.GenerarSerializado(), ident), Vprinci);
					
					background.removeAll();
					background.add(a, BorderLayout.CENTER);
					background.revalidate();
					background.repaint();
					
				}else {
					JOptionPane.showMessageDialog(null, "No puedes acceder a esta opción.");
				}
				
			}
		});
		lblNewLabel_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(0, 64, 128));
		lblNewLabel_1_3.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_8.add(lblNewLabel_1_3, BorderLayout.SOUTH);
		
		panelops = new JPanel();
		panelops.setBackground(new Color(255, 255, 255));
		background.add(panelops, BorderLayout.CENTER);
		panelops.setLayout(new BorderLayout(0, 0));

	}
}
