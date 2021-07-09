
import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class SellerInterface extends JFrame{
	
	private JPanel upperPanel;
	private JPanel lowerPanel;
	private Login receive;
	private JLabel lblSearch;
	private static JTextField txtSearch;
	private JButton btnSearch,btnBack,seat,booking;
	private String co;
	private static JTable tblUsers;
	//private Login previous ;
	
	public SellerInterface(Login receive){
		super("All Bus Schedule");
		receive.setVisible(false);
		this.receive=receive;
		this.setLocation(50, 50);
		this.setSize(600, 600);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		upperPanel = new JPanel(new FlowLayout());
		this.upperPanel.setBorder(new LineBorder(Color.black, 1));
		this.upperPanel.setBounds(5, 5, 570, 40);
		add(this.upperPanel);
				

		lowerPanel = new JPanel(null);
		this.lowerPanel.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 1),"All Busess"));
		this.lowerPanel.setBounds(5, 50, 570, 340);
		add(this.lowerPanel);
		
		this.AddUpperComponent();
		this.AddLowerComponent();
}
	
	private void AddUpperComponent() {
		
		lblSearch = new JLabel("Search");
		this.upperPanel.add(lblSearch);
		
		txtSearch = new JTextField(10);
		this.upperPanel.add(txtSearch);
		
		btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				populateTable();
			}
		});
		this.upperPanel.add(btnSearch);
		
		seat = new JButton("Select Seat");
		seat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				int row = tblUsers.getSelectedRow();
				String query = "SELECT * FROM bus";
				Connection con=null;//for connection
			    Statement st = null;//for query execution
				ResultSet rs = null;

				if(row<0)
				{
					JOptionPane.showMessageDialog(null, "Please Select A Row First");
					return;
				}
			     try {
			    	    Class.forName("com.mysql.jdbc.Driver");//load driver
						System.out.println("driver loaded");
						con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketCounterDatabase","root","");
						System.out.println("connection done");//connection with database established
						st = con.createStatement();//create statement
						System.out.println("statement created");
						rs = st.executeQuery(query);//getting result
						System.out.println("results received");
						
						String catagory = tblUsers.getModel().getValueAt(row, 4).toString();
					   if(catagory.equals("NON-AC"))
					{
						
						 new BusFourty().setVisible(true); 
					 }
					 else {
						 new BusThirty().setVisible(true);
					 }
					 
				} catch (SQLException | ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	
			}
			});
		this.upperPanel.add(seat);
		
		
		btnBack = new JButton("Logout");
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				receive.setVisible(true);
				setVisible(false);
				
			}
		});
		this.upperPanel.add(btnBack);
		
		booking = new JButton("Show all Booking");
		booking.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("manaik");
				new BookingInformation().setVisible(true);
			}
		});
		this.upperPanel.add(booking);
		
	}

	
	
	private void AddLowerComponent() {
		
		tblUsers = new JTable();
		tblUsers.setBackground(Color.white);
		
		JScrollPane sp = new JScrollPane();
		sp.setBounds(5, 15, 550, 320);
		this.lowerPanel.add(sp);
		sp.setViewportView(tblUsers);
		
		populateTable();
	}

	public static void populateTable() {
		
		AllBusTableModel model = new AllBusTableModel(txtSearch.getText());
		tblUsers.setModel(model);
	}
	
	public String getCoachNo() {
		return co;
	}
	
}










