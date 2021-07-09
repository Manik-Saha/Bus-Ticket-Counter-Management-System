import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;


public class UpdateBusSchedule extends JFrame {
	JTextField t1,t2,t3,t4,t5;
	JLabel coach,date,time,root,title,type,to;
	JPanel panel,panel2;
	JButton b,dot;
	JComboBox box1,box2;
	String[] place = {"Dhaka","Khulna","Chittagong","Rajshahi","Barishal","Comilla","Shylet"};
	ResultSet rs=null;
	private AdminInterface r;
	public String coach_no,date1,time1,type1;
	private static JTextField txtSearch;
	private static JTable tblUsers;
	
	public UpdateBusSchedule(){
		setLocation(0,0);
		setSize(800,800);
		//r.setVisible(false);
		setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel(new FlowLayout());
		panel.setBounds(100,50,250,600);
		//panel.setLayout(null);
		add(panel);
		
		panel2 = new JPanel(new FlowLayout());
		panel2.setBounds(0,0,800,30);
		//panel.setLayout(null);setCoachNosetCoachNo
		add(panel2);
		
		//this.coach_no = r.getCoachNo();;
		title = new JLabel("Update Bus Schedule");
		//title.setBounds(0, 0, 350, 30);
		panel2.add(title);
		getValue();
		coach = new JLabel("Coach No");
		panel.add(coach);
		
		t1 = new JTextField(coach_no);
		panel.add(t1);
		
		date = new JLabel("Date  :");
	    panel.add(date);
		
		t2 = new JTextField(20);
		panel.add(t2);
		
		//dot = new JButton("...");
		
		time = new JLabel("time   :");
		panel.add(time);
		
		t3 = new JTextField(20);
		panel.add(t3);
		
		root = new JLabel("root 	:");
		panel.add(root);
		
		box1 = new JComboBox(place);
		panel.add(box1);
		
		to = new JLabel("To");
		panel.add(to);
		
		box2 = new JComboBox(place);
		panel.add(box2);
		
	    type = new JLabel("type   :");
		panel.add(type);
		
		t5 = new JTextField(20);
		panel.add(t5);
	
		b = new JButton("Update");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0){
				
				updateSchedule();
				//SellerInterface.populateTable();
				r.setVisible(false);
				r.setVisible(true);
			}
		});
		panel.add(b);
	}
	
	public void getValue() {
		String query = "SELECT * FROM bus";     
        Connection con=null;//for connection
        Statement st = null;//for query execution
		ResultSet rs = null;//to get row by row result from DB
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}//load driver
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketCounterDatabase","root","");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("connection done");//connection with database established
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//create statement
		System.out.println("statement created");
		try {
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//getting result
		System.out.println("results received");
		
		
		while(rs!=null)
		{
            try {
				String coach_no = rs.getString("coach_no");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				String date1 = rs.getString("date1");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				String time1 = rs.getString("time");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            try {
				String type1 = rs.getString("type");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}

	
	public void updateSchedule() {
		
			String newCoach = t1.getText().toString();
			String newDate = t2.getText().toString();
			String newTime = t3.getText().toString();
			String fromRoot = box1.getSelectedItem().toString();
			String toRoot = box2.getSelectedItem().toString();
			String newType = t5.getText().toString();
			
			System.out.println(fromRoot);
			System.out.println(toRoot);
			String query1 = "UPDATE bus SET `coach_no`='"+newCoach+"',`date`='"+newDate+"',`time`='"+newTime+"',`root`='"+fromRoot+"-"+toRoot+"',`type`='"+newType+"' WHERE `coach_no`='"+newCoach+"' ";
			System.out.println(query1);
	        try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketCounterDatabase", "root", "");
				Statement stm = con.createStatement();
				stm.execute(query1);
				stm.close();
				con.close();
				if (newCoach == null || newDate == null || newTime == null || fromRoot == null || toRoot == null|| newType == null) {
					JOptionPane.showMessageDialog(this, "Fill Up All !!!");	
				}
				else {
					JOptionPane.showMessageDialog(this, "Success !!!");	
				}
			
			}
	        catch(Exception ex)
			{
				JOptionPane.showMessageDialog(this, "Oops error !!!");
	        }
	}
}	
	
	



