package mainPackage;

import java.awt.EventQueue;
import javax.swing.BoxLayout;
import javax.swing.JFrame;


/**
 * 
 * @author Spikelcy
 * Main file that starts the program
 *
 */


public class Main extends JFrame {
	
	static Main frame;
	/**
	 * Create the frame.
	 */
	public Main() {
		
		
		// should set a fixed bounds that looks nice.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		//start at connectionMenu first
		Options optionMenu = new Options(this);
		
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(optionMenu);
		
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		frame = new Main();
		//Top level frame
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
	
}
