package viewGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Cursor;
import java.awt.Window.Type;

public class Vhome extends JFrame {
	public int ident;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vhome window = new Vhome();
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
	public Vhome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setType(Type.UTILITY);
		frame.setBounds(100, 100, 576, 406);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		
		JPanel background = new JPanel();
		background.setForeground(new Color(0, 0, 255));
		background.setBackground(new Color(255, 255, 255));
		frame.getContentPane().add(background);
		background.setLayout(null);
		
		JPanel lateral = new JPanel();
		lateral.setBorder(new MatteBorder(0, 0, 0, 4, (Color) new Color(0, 120, 215)));
		lateral.setBackground(Color.BLUE);
		lateral.setBounds(0, 0, 87, 406);
		background.add(lateral);
		
		JPanel bienvenida = new JPanel();
		bienvenida.setBackground(new Color(255, 255, 255));
		bienvenida.setBounds(97, 83, 456, 76);
		background.add(bienvenida);
		bienvenida.setLayout(new BorderLayout(0, 0));
		
		JLabel mensajeb = new JLabel("Bienvenidos a MUV-U");
		mensajeb.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		bienvenida.add(mensajeb);
		
		JLabel mensajep = new JLabel("¿Qué acción deseas realizar?\r\n");
		mensajep.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		mensajep.setFont(new Font("Cooper Black", Font.PLAIN, 20));
		mensajep.setBounds(171, 210, 293, 46);
		background.add(mensajep);
		
		JLabel registrarse = new JLabel("Registrarse\r\n");
		registrarse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "regi");
				frame.getContentPane().removeAll();
				
				Vregistro a = new Vregistro( frame, background );
				frame.getContentPane().add(a, BorderLayout.CENTER);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();
				
			}
		});
		
		registrarse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		registrarse.setForeground(new Color(0, 0, 255));
		registrarse.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		registrarse.setBounds(200, 267, 94, 23);
		background.add(registrarse);
		
		JLabel inicios = new JLabel("Login\r\n");
		inicios.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Home");
				Vlogin a = new Vlogin(frame, background);
				frame.getContentPane().removeAll();
				frame.getContentPane().add(a, BorderLayout.CENTER);
				frame.getContentPane().revalidate();
				frame.getContentPane().repaint();

			}
		});
		
		inicios.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		inicios.setForeground(new Color(0, 0, 255));
		inicios.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		inicios.setBounds(302, 267, 106, 23);
		background.add(inicios);
		
		
		JLabel raya = new JLabel("");
		raya.setBorder(new MatteBorder(2, 0, 0, 0, (Color) new Color(0, 0, 255)));
		raya.setBounds(190, 288, 231, 14);
		background.add(raya);
	}
}
