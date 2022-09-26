package grothem;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class MyMain {

	private JFrame frame;
	private JTextField textItem;
	private JTextField textCost;
	private JTextField textQuantity;
	private JTextField textSales;
	private JButton btnBuild;
	private JTextArea textOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyMain window = new MyMain();
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
	public MyMain() {
		initialize();
		SalesSlip obj = new SalesSlip();
		btnBuild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sales(obj);
			}
		});
	}

	private void sales(SalesSlip obj) {
		SalesItem str = new SalesItem(textItem.getText(), textCost.getText(), textQuantity.getText());
		obj.add(str);
		textOutput.setText(obj.toString());
		textSales.setText(obj.totalSales(str));
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Item(s)");
		lblNewLabel.setBounds(45, 40, 72, 14);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Cost");
		lblNewLabel_1.setBounds(45, 84, 82, 14);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Quantity");
		lblNewLabel_2.setBounds(45, 118, 72, 14);
		frame.getContentPane().add(lblNewLabel_2);

		textItem = new JTextField();
		textItem.setBounds(127, 37, 172, 20);
		frame.getContentPane().add(textItem);
		textItem.setColumns(10);

		textCost = new JTextField();
		textCost.setBounds(127, 81, 86, 20);
		frame.getContentPane().add(textCost);
		textCost.setColumns(10);

		textQuantity = new JTextField();
		textQuantity.setBounds(127, 115, 86, 20);
		frame.getContentPane().add(textQuantity);
		textQuantity.setColumns(10);

		btnBuild = new JButton("Add item(s) to sales list");
		btnBuild.setBounds(127, 155, 175, 23);
		frame.getContentPane().add(btnBuild);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(125, 189, 174, 136);
		frame.getContentPane().add(scrollPane);

		textOutput = new JTextArea();
		textOutput.setText("Shopping is fun lol :)");
		scrollPane.setViewportView(textOutput);

		JLabel lblNewLabel_3 = new JLabel("Total Sales");
		lblNewLabel_3.setBounds(45, 362, 82, 14);
		frame.getContentPane().add(lblNewLabel_3);

		textSales = new JTextField();
		textSales.setBounds(127, 359, 86, 20);
		frame.getContentPane().add(textSales);
		textSales.setColumns(10);
	}
}
