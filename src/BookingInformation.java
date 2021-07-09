
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class BookingInformation extends JFrame{
	
     private JPanel panel,panel2 ;
     private JLabel title ;
     private static JTextField txtSearch;
 	 private static JTable tblUsers;
 	 
 	Connection con =null;
 	ResultSet rs = null;
 	Statement pst = null;
     
	public BookingInformation() {
		super("Login");
		createBooking();
	}
		
	public void createBooking(){	
		setLocation(650,0);
		setSize(600,600);
		setLayout(null);
		//setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
	    panel.setBounds(0, 0, 600, 30);
		add(panel);
		
		title = new JLabel("Ticket Management System");
		title.setBounds(0, 0, 350, 30);
		panel.add(title);
		
		panel2 = new JPanel();
		this.panel2.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 1),"All Booked Information"));
		this.panel2.setBounds(0, 40, 550, 450);
		//panel2.setLayout(null);
		add(this.panel2);
		
		
		tblUsers = new JTable();
		tblUsers.setBackground(Color.white);
		
		JScrollPane sp = new JScrollPane();
		sp.setBounds(0, 0, 550, 320);
		panel2.add(sp);
		sp.setViewportView(tblUsers);
		populateTable();
		
       }
	
   public static void populateTable() {
		
		AllBookingTableModel model = new AllBookingTableModel();
		tblUsers.setModel(model);
	}

}
