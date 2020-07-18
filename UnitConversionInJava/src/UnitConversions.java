import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class UnitConversions extends JFrame {

	private JPanel contentPane;
	private JTextField kmpersec;
	private JTextField meterpersec;
	private JTextField dollar;
	private JTextField rupees;
	private JTextField meter;
	private JTextField cm;
	private JTextField kmperhour;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UnitConversions frame = new UnitConversions();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UnitConversions() {
		DecimalFormat df5 = new DecimalFormat("#.#####");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 551, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Unit conversions"+ "", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dollar");
		panel.add(lblNewLabel);
		lblNewLabel.setBounds(12, 101, 53, 16);
		
		JButton btnNewButton = new JButton("ConvertTo");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double km=Double.parseDouble(kmperhour.getText());
				meterpersec.setText(String.valueOf(df5.format(km * 0.277778)));
			}
		});
		btnNewButton.setBounds(185, 13, 116, 44);
		panel.add(btnNewButton);
		
		meterpersec = new JTextField();
		meterpersec.setColumns(10);
		meterpersec.setBounds(313, 12, 116, 47);
		panel.add(meterpersec);
		
		kmperhour = new JTextField();
		kmperhour.setColumns(10);
		kmperhour.setBounds(51, 13, 116, 47);
		panel.add(kmperhour);
		 
		JLabel lblNewLabel_1 = new JLabel("m/s");
		lblNewLabel_1.setBounds(443, 27, 28, 16);
		panel.add(lblNewLabel_1);
		
		JLabel lblKmh = new JLabel("km/h");
		lblKmh.setBounds(12, 27, 40, 16);
		panel.add(lblKmh);
		
		dollar = new JTextField();
		dollar.setColumns(10);
		dollar.setBounds(51, 86, 116, 47);
		panel.add(dollar);
		
		JButton button = new JButton("ConvertTo");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double i=Double.parseDouble(dollar.getText());
				rupees.setText(String.valueOf(df5.format(i * 75.67)));
			}
		});
		button.setBounds(185, 87, 116, 44);
		panel.add(button);
		
		rupees = new JTextField();
		rupees.setColumns(10);
		rupees.setBounds(313, 86, 116, 47);
		panel.add(rupees);
		
		JLabel lblRupees = new JLabel("Rupees");
		lblRupees.setBounds(441, 101, 53, 16);
		panel.add(lblRupees);
		
		JLabel lblNewLabel_2 = new JLabel("Meter");
		lblNewLabel_2.setBounds(9, 170, 56, 16);
		panel.add(lblNewLabel_2);
		
		meter = new JTextField();
		meter.setColumns(10);
		meter.setBounds(51, 153, 116, 47);
		panel.add(meter);
		
		JButton button_1 = new JButton("ConvertTo");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=Integer.parseInt(meter.getText());
				cm.setText(Integer.toString(i*100));
			}
		});
		button_1.setBounds(185, 155, 116, 47);
		panel.add(button_1);
		
		cm = new JTextField();
		cm.setColumns(10);
		cm.setBounds(313, 155, 116, 47);
		panel.add(cm);
		
		JLabel lblCentimeter = new JLabel("CentiMeter");
		lblCentimeter.setBounds(441, 170, 63, 16);
		panel.add(lblCentimeter);
		
	}
}
