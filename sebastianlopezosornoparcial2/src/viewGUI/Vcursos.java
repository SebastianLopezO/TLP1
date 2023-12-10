package viewGUI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.border.MatteBorder;

import Bean.Admin;
import Bean.Curso;
import logic.LAdmin;
import logic.LCursos;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Vcursos extends JPanel {
	JPanel panelops;
	JPanel background;
	LAdmin A = new LAdmin();
	LCursos B = new LCursos();

	/**
	 * Create the panel.
	 */
	public Vcursos(Admin due, JFrame Vinicio) {
		setLayout(new BorderLayout(0, 0));
		
		background = new JPanel();
		background.setBorder(null);
		background.setBackground(new Color(255, 255, 255));
		add(background, BorderLayout.CENTER);
		background.setLayout(new BorderLayout(0, 0));
		
		JPanel panelmenu = new JPanel();
		panelmenu.setBorder(new MatteBorder(0, 0, 0, 2, (Color) new Color(0, 0, 0)));
		panelmenu.setBackground(Color.BLUE);
		background.add(panelmenu, BorderLayout.WEST);
		panelmenu.setLayout(new BorderLayout(0, 0));
		
		JPanel BordeLd = new JPanel();
		BordeLd.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		BordeLd.setBackground(Color.BLUE);
		panelmenu.add(BordeLd, BorderLayout.EAST);
		
		JPanel BordeLI = new JPanel();
		BordeLI.setBackground(Color.BLUE);
		panelmenu.add(BordeLI, BorderLayout.WEST);
		
		JPanel titulo = new JPanel();
		titulo.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 0)));
		titulo.setBackground(Color.WHITE);
		panelmenu.add(titulo, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("MUV-U");
		lblNewLabel.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		titulo.add(lblNewLabel);
		
		JPanel opciones = new JPanel();
		opciones.setBackground(Color.WHITE);
		panelmenu.add(opciones, BorderLayout.CENTER);
		opciones.setLayout(new BorderLayout(0, 0));
		JPanel bordeI = new JPanel();
		opciones.add(bordeI, BorderLayout.SOUTH);
		bordeI.setBorder(new MatteBorder(0, 0, 0, 0, (Color) new Color(0, 0, 0)));
		bordeI.setBackground(Color.BLUE);
		
		 panelops = new JPanel();
		panelops.setBackground(Color.WHITE);
		background.add(panelops, BorderLayout.CENTER);
		panelops.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_3 = new JPanel();
		try {
			panel_3.setBorder(new MatteBorder(0, 1, 2, 1, (Color) new Color(0, 0, 0)));
			panel_3.setBackground(new Color(255, 255, 255));
			opciones.add(panel_3, BorderLayout.NORTH);
			//try no has ingresado
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No has ingresado el nombre de la empresa");
		}
		JLabel lblNewLabel_1 = new JLabel(due.getAgencia());
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		panel_3.add(lblNewLabel_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new MatteBorder(0, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_4.setBackground(Color.WHITE);
		opciones.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(9, 1, 0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_4.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1 = new JLabel("Ingresar curso\r\n");
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				due.getCorreo();
				OpIngresarC a = new OpIngresarC(panelops, due );
				panelops.removeAll();
				panelops.add(a);
				panelops.revalidate();
				panelops.repaint();

				
			}
		});
		lblNewLabel_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_6.add(lblNewLabel_1_1, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(Color.WHITE);
		panel_4.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_2 = new JLabel("Reemplazar curso");
		lblNewLabel_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OpActualizarC a = new OpActualizarC(panelops, due );
				panelops.removeAll();
				panelops.add(a);
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
		panel_5.add(lblNewLabel_1_2, BorderLayout.SOUTH);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.WHITE);
		panel_4.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_3 = new JLabel("Buscar curso\r\n");
		lblNewLabel_1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String bus = JOptionPane.showInputDialog("Ingresa el nombre del curso al que deseas buscar");
				String[] columnNames = {"Nombre curso", "Cantidad Semanas"};
				LCursos B = new LCursos();
				ArrayList<Curso> inv = due.getInventario();
				
				
	            
	            try {
	            	Curso a = B.Buscar(inv, bus);
	            	String[][] info = new String[1][];
					info[0] = a.MostrarInfo().split(",");
					JTable table = new JTable(info, columnNames);
		            table.setBackground(new Color(255, 255, 255));
		            panelops.removeAll();
		            panelops.add(new JScrollPane(table));
		            panelops.revalidate();
		            panelops.repaint();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "No se ha encontrado el curso");
				}
			}
		});
		lblNewLabel_1_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(Color.BLUE);
		lblNewLabel_1_3.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_3.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_7.add(lblNewLabel_1_3, BorderLayout.SOUTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.WHITE);
		panel_4.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_4 = new JLabel("Cambiar cantidad de semanas del curso");
		lblNewLabel_1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OpcantC a = new OpcantC(panelops, due );
				panelops.removeAll();
				panelops.add(a);
				panelops.revalidate();
				panelops.repaint();
			}
		});
		lblNewLabel_1_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setForeground(Color.BLUE);
		lblNewLabel_1_4.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_4.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_8.add(lblNewLabel_1_4, BorderLayout.SOUTH);
		
		JPanel panel_6_1 = new JPanel();
		panel_6_1.setBackground(Color.WHITE);
		panel_4.add(panel_6_1);
		panel_6_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Eliminar curso");
		lblNewLabel_1_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ArrayList<Curso> a = new ArrayList<Curso>();
				panelops.removeAll();
				panelops.revalidate();
				panelops.repaint();
				String bus = JOptionPane.showInputDialog("Ingresa el nombre del curso al que desea eliminar");
				due.setInventario(B.Eliminar(due.getInventario(), bus));
				A.Ingresar(A.Reemplazar(A.GenerarSerializado(), due, due.getIdentificacion()));
			}
		});
		lblNewLabel_1_1_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_2.setForeground(Color.BLUE);
		lblNewLabel_1_1_2.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_1_2.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_6_1.add(lblNewLabel_1_1_2, BorderLayout.SOUTH);
		
		JPanel panel_6_2 = new JPanel();
		panel_6_2.setBackground(Color.WHITE);
		panel_4.add(panel_6_2);
		panel_6_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Generar Informe");
		lblNewLabel_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] columnNames = {"Nombre curso", "Cantidad semanas"};
				LCursos B = new LCursos();
				ArrayList<Curso> inv = due.getInventario();
				try {
					String[][] info = new String[inv.size()][2];
					for(int i =0; i < inv.size(); i++) {
						info[i] = inv.get(i).MostrarInfo().split(",");
					}
					
		            JTable table = new JTable(info, columnNames);
		            table.setBackground(new Color(255, 255, 255));
		            panelops.removeAll();
		            panelops.add(new JScrollPane(table));
		            panelops.revalidate();
		            panelops.repaint();
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "No has ingresado ningun curso");
				}
				
	            //JOptionPane.showMessageDialog(null, new JScrollPane(table), "Tabla de Datos", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		lblNewLabel_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_6_2.add(lblNewLabel_1_1_1, BorderLayout.CENTER);
		
		JPanel panel_6_3 = new JPanel();
		panel_6_3.setBackground(Color.WHITE);
		panel_4.add(panel_6_3);
		panel_6_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Regresar\r\n");
		lblNewLabel_1_1_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				background.removeAll();
				Vapp a = new Vapp(Vinicio, due.getIdentificacion());
				background.add(a);
				background.revalidate();
				background.repaint();
			}
		});
		lblNewLabel_1_1_1_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1_1_1_1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setForeground(Color.BLUE);
		lblNewLabel_1_1_1_1.setFont(new Font("Cooper Black", Font.PLAIN, 11));
		lblNewLabel_1_1_1_1.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(0, 0, 255)));
		panel_6_3.add(lblNewLabel_1_1_1_1, BorderLayout.CENTER);
	}

}
