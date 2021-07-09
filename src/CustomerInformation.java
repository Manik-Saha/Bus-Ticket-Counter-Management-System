import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CustomerInformation extends JFrame implements ActionListener {
	
	JLabel title, customerLabel, phoneLabel,ticket1;
	JTextField customerTF, phoneTF,ticket2;
	JButton confirmBtn;
	JPanel panel;
	SellerInterface dd;
	public CustomerInformation() {
		
		super("Customer Information");
		createCustomerInterface();

	}
	
	public void createCustomerInterface() {
		setLocation(0,0);
		setSize(800,800);
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel(new FlowLayout());
		panel.setBounds(100,20,250,500);
		//panel.setLayout(null);
		add(panel);
		
		title = new JLabel("Customer Information");
		title.setBounds(0, 0, 350, 30);
		add(title);
		
		customerLabel = new JLabel("Customer Name : ");
		//customerLabel.setBounds(0, 40, 60 , 30);
		panel.add(customerLabel);
		
		customerTF = new JTextField(10);
		//customerTF.setBounds(70, 40, 100,30);
		panel.add(customerTF);
		
		phoneLabel = new JLabel("Phone Number : ");
		//phoneLabel.setBounds(0, 80, 70 , 30);
		panel.add(phoneLabel);
		
		phoneTF = new JTextField(10);
		//phoneTF.setBounds(80, 80, 100,30);
		panel.add(phoneTF);
		
		ticket1 = new JLabel("seat no : ");
		//ticket1.setBounds(0, 120, 70 , 30);
		panel.add(ticket1);
		
		ticket2 = new JTextField(10);
		//ticket2.setBounds(80, 120, 70 , 30);
		panel.add(ticket2);
		
		confirmBtn = new JButton("Confirm");
		//confirmBtn.setBounds(120, 150, 80, 30);
		confirmBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0){
				
				String seatno = ticket2.getText();
				//String coachno = dd.getCoachNo();
				String name = customerTF.getText();
				String phoneno = phoneTF.getText();
				
				String sql = "INSERT INTO booked VALUES ('"+name+"','"+phoneno+"','"+seatno+"')";
				//System.out.println(coachno);
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketCounterDatabase", "root", "");
					Statement stm = con.createStatement();
					stm.execute(sql);
					stm.close();
					con.close();
					//JOptionPane.showMessageDialog(this, "Success !!!");
				}
		        catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, "Oops error !!!");
		        }
				//AllCoachNo.populateTableData();
				JOptionPane.showMessageDialog(null, "Ticket Confirmed");
				setVisible(false);
				
			}
		});
		panel.add(confirmBtn);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


}