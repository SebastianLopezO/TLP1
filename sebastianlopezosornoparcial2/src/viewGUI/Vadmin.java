package viewGUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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

import Bean.Admin;
import Bean.Curso;
import logic.LAdmin;
import logic.LCursos;
import logic.LEstudiante;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Vadmin extends JFrame {
	LAdmin a = new LAdmin();
	JPanel opciones;
	JPanel panelmenu;
	JPanel background;
	JPanel panelops;
	/**
	 * Create the panel.
	 */
	public Vadmin(JFrame Vprinci) {
		setLayout(new BorderLayout(0, 0));
		
		background = new JPanel();
		background.setBorder(null);
		background.setBackground(new Color(255, 255, 255));
		add(background, BorderLayout.CENTER);
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
		
		JLabel lblNewLabel = new JLabel("TiendiStore");
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		titulo.add(lblNewLabel);
		
		JPanel BordeLd = new JPanel();
		BordeLd.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		BordeLd.setBackground(new Color(0, 0, 255));
		panelmenu.add(BordeLd, BorderLayout.EAST);
		
		JPanel BordeLI = new JPanel();
		BordeLI.setBackground(new Color(0, 0, 255));
		panelmenu.add(BordeLI, BorderLayout.WEST);
		
		opciones = new JPanel();
		opciones.setBackground(new Color(255, 255, 255));
		panelmenu.add(opciones, BorderLayout.CENTER);
		opciones.setLayout(new BorderLayout(0, 0));
		
		JPanel bordeI = new JPanel();
		bordeI.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		bordeI.setBackground(new Color(0, 0, 255));
		opciones.add(bordeI, BorderLayout.SOUTH);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new MatteBorder(0, 1, 2, 1, (Color) new Color(0, 0, 0)));
		panel_3.setBackground(new Color(255, 255, 255));
		opciones.add(panel_3, BorderLayout.NORTH);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Admin");
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
		
		JLabel lblNewLabel_1 = new JLabel("Registros");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] columnNames = {"MUV-U", "Momento del registro"};
				ArrayList<String> inv = a.LeerArchivo();
				String[][] info = new String[inv.size()][2];
				for(int i =0; i < inv.size()-1; i++) {
					info[i] = inv.get(i).split(",");
				}
				
		        JTable table = new JTable(info, columnNames);
		        table.setBackground(new Color(255, 255, 255));
		        panelops.removeAll();
		        panelops.add(new JScrollPane(table));
		        panelops.revalidate();
		        panelops.repaint();
	
			}
		});
		
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
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
					try {
						int id = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la id del admin al que se le actualizaran los datos"));
						String S =  JOptionPane.showInputDialog("Ingresar la nueva info del admin separado por comas");
						String[] SS = S.split(",");
						Admin bus = a.Buscar(a.GenerarSerializado(), id);
						Admin duenio = new Admin(id, SS[0], SS[1], Long.parseLong(SS[2]), bus.getAgencia(), bus.getInventario() );
						ArrayList<Admin> B = a.GenerarSerializado();
						a.Ingresar(a.Reemplazar(B, duenio, id));
						String[] columnNames = {"Id", "Nombre", "Correo", "Telefono", "Nombre Agencia"};
						ArrayList<Admin> inv = a.GenerarSerializado();
						String[][] info = new String[inv.size()][2];
						for(int i =0; i < inv.size(); i++) {
							info[i] = inv.get(i).Mostrar_InfoBasica().split(",");
						}
						
				        JTable table = new JTable(info, columnNames);
				        table.setBackground(new Color(255, 255, 255));
				        panelops.removeAll();
				        panelops.add(new JScrollPane(table));
				        panelops.revalidate();
				        panelops.repaint();
					} catch (Exception e2) {
						JOptionPane.showMessageDialog(null, "Cometiste un error");
					}
				
				
				
			}
		});
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
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
				try {
					a.Ingresar(a.Eliminar(a.GenerarSerializado(), Integer.parseInt(JOptionPane.showInputDialog("Ingresa id a eliminar"))));
				} catch (Exception e2) {}
				String[] columnNames = {"Id", "Nombre", "Correo", "Telefono", "Nombre Agencia"};
				ArrayList<Admin> inv = a.GenerarSerializado();
				String[][] info = new String[inv.size()][2];
				for(int i =0; i < inv.size(); i++) {
					info[i] = inv.get(i).Mostrar_InfoBasica().split(",");
				}
		        JTable table = new JTable(info, columnNames);
		        table.setBackground(new Color(255, 255, 255));
		        panelops.removeAll();
		        panelops.add(new JScrollPane(table));
		        panelops.revalidate();
		        panelops.repaint();
			}
		});
		lblNewLabel_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_2.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_7.add(lblNewLabel_1_2);
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBackground(Color.WHITE);
		panel_4.add(panel_7_1);
		panel_7_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Inicio");
		lblNewLabel_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] columnNames = {"Id", "Nombre", "Correo", "Telefono", "Agencia"};
				LAdmin a = new LAdmin();
				ArrayList<Admin> inv = a.GenerarSerializado();
				String[][] info = new String[inv.size()][2];
				for(int i =0; i < inv.size(); i++) {
					info[i] = inv.get(i).Mostrar_InfoBasica().split(",");
				}
				
		        JTable table = new JTable(info, columnNames);
		        
		        table.setBackground(new Color(255, 255, 255));
		        panelops.removeAll();
		        panelops.add(new JScrollPane(table));
		        panelops.revalidate();
		        panelops.repaint();
				
			}
		});
		lblNewLabel_1_2_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_2_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2_1.setForeground(Color.BLUE);
		lblNewLabel_1_2_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_2_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_7_1.add(lblNewLabel_1_2_1, BorderLayout.CENTER);
		
		panelops = new JPanel();
		panelops.setBackground(new Color(255, 255, 255));
		background.add(panelops, BorderLayout.CENTER);
		panelops.setLayout(new BorderLayout(0, 0));
		
		String[] columnNames = {"Id", "Nombre", "Correo", "Telefono", "Agencia"};
		LAdmin a = new LAdmin();
		ArrayList<Admin> inv = a.GenerarSerializado();
		String[][] info = new String[inv.size()][2];
		for(int i =0; i < inv.size(); i++) {
			info[i] = inv.get(i).Mostrar_InfoBasica().split(",");
		}
		
        JTable table = new JTable(info, columnNames);
        
        table.setBackground(new Color(255, 255, 255));
        panelops.removeAll();
        panelops.add(new JScrollPane(table));
        panelops.revalidate();
        panelops.repaint();

	}
}
