import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textInvRecNumber;
	private JTextField textLeaseNumber;
	private JTextField textCompanyName;
	private JTextField textHowInvoiced;
	private JTextField textArNumber;
	private JTextField textInvoiceNumber;
	private JTextField textStartDate;
	private JTextField textEndDate;
	private JTextField textPtinted;
	private JTextField textInvoiceMonth;
	private JTextField textCharge;
	private JTextField textDateEntered;
	private JTextField textRentalRate;
	private JComboBox comboCar;
	private JComboBox comboIcode;
	private JComboBox comboComments;
	private JComboBox comboSubls;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 460);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTop = new JPanel();
		panelTop.setBackground(new Color(165, 12, 16));
		panelTop.setBounds(0, 0, 584, 47);
		contentPane.add(panelTop);
		panelTop.setLayout(null);
		
		JButton btn1 = new JButton("-");
		btn1.setBackground(new Color(153, 153, 255));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(10, 11, 45, 25);
		btn1.setFocusable(false);
		panelTop.add(btn1);
		
		JButton btn2 = new JButton("^");
		btn2.setBackground(new Color(153, 153, 255));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(55, 11, 45, 25);
		btn2.setFocusable(false);
		panelTop.add(btn2);
		
		JButton btn3 = new JButton("x");
		btn3.setBackground(new Color(153, 153, 255));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(100, 11, 45, 25);
		btn3.setFocusable(false);
		panelTop.add(btn3);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String car = (String) comboCar.getSelectedItem();
				String icode = (String) comboIcode.getSelectedItem();
				String comments = (String) comboComments.getSelectedItem();
				String subls = (String) comboSubls.getSelectedItem();
				
			try {
				FileWriter writer = new FileWriter("poem.txt");
				writer.write("--RECIBO--"+"\n" +
    					"Inv Rec Number: " + textInvRecNumber.getText() + "\n" +
    					"Lease Number: " + textLeaseNumber.getText() + "\n" +
    					"Company Name: " + textCompanyName.getText() + "\n" +
    					"How Invoiced: " + textHowInvoiced.getText() + "\n" +
    					"Ar Number: " + textArNumber.getText() + "\n" +
    					"Invoice Number: " + textInvoiceNumber.getText() + "\n" +
    					"Start Date: " + textStartDate.getText() + "\n" +
    					"End Date: " + textEndDate.getText() + "\n" +
    					"Ptinted: " + textPtinted.getText() + "\n" +
    					"Invoice Month: " + textInvoiceMonth.getText() + "\n" +
    					"Charge: " + textCharge.getText() + "\n" +
    					"Date Entered: " + textDateEntered.getText() + "\n" +
    					"Rental Rate: " + textRentalRate.getText() + "\n" +
    					"Car: " + car + "\n" +
    					"Icode: " + icode + "\n" +
    					"Comments: " + comments + "\n" +
    					"Subls: " + subls + "\n");
				writer.close();
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
				
				
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSave.setBackground(new Color(153, 153, 255));
		btnSave.setBounds(186, 11, 77, 25);
		btnSave.setFocusable(false);
		panelTop.add(btnSave);
		
		JButton btn4 = new JButton("");
		btn4.setIcon(new ImageIcon(Ventana.class.getResource("/img/cal.png")));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setFocusable(false);
		btn4.setBackground(new Color(153, 153, 255));
		btn4.setBounds(529, 11, 45, 25);
		panelTop.add(btn4);
		
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(new Color(153, 153, 255));
		panelBottom.setBounds(0, 46, 584, 375);
		contentPane.add(panelBottom);
		panelBottom.setLayout(null);
		
		textInvRecNumber = new JTextField();
		textInvRecNumber.setBounds(10, 36, 130, 25);
		panelBottom.add(textInvRecNumber);
		textInvRecNumber.setColumns(10);
		
		textLeaseNumber = new JTextField();
		textLeaseNumber.setColumns(10);
		textLeaseNumber.setBounds(10, 91, 130, 25);
		panelBottom.add(textLeaseNumber);
		
		textCompanyName = new JTextField();
		textCompanyName.setColumns(10);
		textCompanyName.setBounds(10, 196, 304, 25);
		panelBottom.add(textCompanyName);
		
		textHowInvoiced = new JTextField();
		textHowInvoiced.setColumns(10);
		textHowInvoiced.setBounds(10, 249, 50, 25);
		panelBottom.add(textHowInvoiced);
		
		textArNumber = new JTextField();
		textArNumber.setColumns(10);
		textArNumber.setBounds(10, 300, 80, 25);
		panelBottom.add(textArNumber);
		
		textInvoiceNumber = new JTextField();
		textInvoiceNumber.setColumns(10);
		textInvoiceNumber.setBounds(175, 36, 130, 25);
		panelBottom.add(textInvoiceNumber);
		
		textStartDate = new JTextField();
		textStartDate.setColumns(10);
		textStartDate.setBounds(343, 91, 86, 25);
		panelBottom.add(textStartDate);
		
		textEndDate = new JTextField();
		textEndDate.setColumns(10);
		textEndDate.setBounds(467, 91, 86, 25);
		panelBottom.add(textEndDate);
		
		textPtinted = new JTextField();
		textPtinted.setColumns(10);
		textPtinted.setBounds(119, 300, 50, 25);
		panelBottom.add(textPtinted);
		
		textInvoiceMonth = new JTextField();
		textInvoiceMonth.setColumns(10);
		textInvoiceMonth.setBounds(119, 249, 110, 25);
		panelBottom.add(textInvoiceMonth);
		
		textCharge = new JTextField();
		textCharge.setColumns(10);
		textCharge.setBounds(269, 249, 80, 25);
		panelBottom.add(textCharge);
		
		textDateEntered = new JTextField();
		textDateEntered.setColumns(10);
		textDateEntered.setBounds(389, 249, 80, 25);
		panelBottom.add(textDateEntered);
		
		textRentalRate = new JTextField();
		textRentalRate.setColumns(10);
		textRentalRate.setBounds(359, 196, 110, 25);
		panelBottom.add(textRentalRate);
		
		comboSubls = new JComboBox();
		comboSubls.setModel(new DefaultComboBoxModel(new String[] {"", "123", "42123", "321321", "5412", "43214", "12", "412"}));
		comboSubls.setBackground(Color.WHITE);
		comboSubls.setBounds(175, 91, 139, 25);
		panelBottom.add(comboSubls);
		
		comboCar = new JComboBox();
		comboCar.setModel(new DefaultComboBoxModel(new String[] {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		comboCar.setBackground(Color.WHITE);
		comboCar.setBounds(343, 36, 139, 25);
		panelBottom.add(comboCar);
		
		comboIcode = new JComboBox();
		comboIcode.setModel(new DefaultComboBoxModel(new String[] {"", "11", "22", "33", "44", "55", "66", "77", "88", "99"}));
		comboIcode.setBackground(Color.WHITE);
		comboIcode.setBounds(10, 141, 50, 25);
		panelBottom.add(comboIcode);
		
		comboComments = new JComboBox();
		comboComments.setModel(new DefaultComboBoxModel(new String[] {"", "Muy bueno", "Bueno", "Malo ", "Muy malo"}));
		comboComments.setBackground(Color.WHITE);
		comboComments.setBounds(146, 141, 407, 25);
		panelBottom.add(comboComments);
		
		JLabel lblNewLabel = new JLabel("Inv Rec Number");
		lblNewLabel.setBounds(10, 21, 110, 14);
		panelBottom.add(lblNewLabel);
		
		JLabel lblInvoiceNumber = new JLabel("Invoice Number");
		lblInvoiceNumber.setBounds(175, 21, 110, 14);
		panelBottom.add(lblInvoiceNumber);
		
		JLabel lblCarNumber = new JLabel("Car Number");
		lblCarNumber.setBounds(343, 21, 110, 14);
		panelBottom.add(lblCarNumber);
		
		JLabel lblLeaseNumber = new JLabel("Lease Number");
		lblLeaseNumber.setBounds(10, 72, 110, 14);
		panelBottom.add(lblLeaseNumber);
		
		JLabel lblSublsNumber = new JLabel("Subls. Number");
		lblSublsNumber.setBounds(175, 72, 110, 14);
		panelBottom.add(lblSublsNumber);
		
		JLabel lblStartDate = new JLabel("Start Date");
		lblStartDate.setBounds(343, 72, 110, 14);
		panelBottom.add(lblStartDate);
		
		JLabel lblEndDate = new JLabel("End Date");
		lblEndDate.setBounds(464, 72, 110, 14);
		panelBottom.add(lblEndDate);
		
		JLabel lblIcode = new JLabel("Icode");
		lblIcode.setBounds(10, 126, 110, 14);
		panelBottom.add(lblIcode);
		
		JLabel lblComments = new JLabel("Comments");
		lblComments.setBounds(146, 126, 110, 14);
		panelBottom.add(lblComments);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setBounds(10, 182, 110, 14);
		panelBottom.add(lblCompanyName);
		
		JLabel lblRentalRate = new JLabel("Rental Rate");
		lblRentalRate.setBounds(359, 182, 110, 14);
		panelBottom.add(lblRentalRate);
		
		JLabel lblHowInvoiced = new JLabel("How Invoiced");
		lblHowInvoiced.setBounds(10, 232, 110, 14);
		panelBottom.add(lblHowInvoiced);
		
		JLabel lblInvoiceMonth = new JLabel("Invoice Month");
		lblInvoiceMonth.setBounds(119, 232, 110, 14);
		panelBottom.add(lblInvoiceMonth);
		
		JLabel lblCharge = new JLabel("Charge");
		lblCharge.setBounds(269, 232, 56, 14);
		panelBottom.add(lblCharge);
		
		JLabel lblded = new JLabel("(Ded.)");
		lblded.setForeground(Color.RED);
		lblded.setBounds(313, 232, 56, 14);
		panelBottom.add(lblded);
		
		JLabel lblDateEntered = new JLabel("Date Entered");
		lblDateEntered.setBounds(389, 232, 93, 14);
		panelBottom.add(lblDateEntered);
		
		JLabel lblArNumber = new JLabel("AR Number");
		lblArNumber.setBounds(10, 286, 110, 14);
		panelBottom.add(lblArNumber);
		
		JLabel lblPrinted = new JLabel("Printed?");
		lblPrinted.setBounds(119, 285, 110, 14);
		panelBottom.add(lblPrinted);
		
		JButton btnClose = new JButton("Close");
		btnClose.setIcon(new ImageIcon(Ventana.class.getResource("/img/close.png")));
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClose.setFocusable(false);
		btnClose.setBackground(new Color(153, 153, 255));
		btnClose.setBounds(467, 339, 107, 30);
		panelBottom.add(btnClose);
	}
}
