import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
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


public class AdminInterface extends JFrame{
	
	protected static final String JButton = null;
	private JPanel upperPanel;
	private JPanel lowerPanel;
	private Login receive;
	private JLabel lblSearch;
	private static JTextField txtSearch;
	private JButton btnSearch,btnEdit,btnSeller,btnBack;
	public String coach_no,date,time,type;
	private static JTable tblUsers;
	
	public AdminInterface(Login receive){
		super("All Bus Schedule");
		this.receive=receive;
		this.receive.setVisible(false);
		this.setLocation(50, 50);
		this.setSize(600, 600);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		upperPanel = new JPanel(new FlowLayout());
		this.upperPanel.setBorder(new LineBorder(Color.black, 1));
		this.upperPanel.setBounds(5, 5, 570, 40);
		add(this.upperPanel);
				

		lowerPanel = new JPanel(null);
		this.lowerPanel.setBorder(new TitledBorder(new LineBorder(Color.GREEN, 1),"Data"));
		this.lowerPanel.setBounds(5, 50, 570, 340);
		add(this.lowerPanel);
		
		this.AddUpperComponent();
		this.AddLowerComponent();
	}
	public void setCoachNo(String coach_no) {
		this.coach_no=coach_no;
	}
	
	public String getCoachNo() {
		return this.coach_no;
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
		
		btnBack = new JButton("Logout");
		btnBack.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				receive.setVisible(true);
				setVisible(false);
			}

		});
		//this.setVisible(false);
		this.upperPanel.add(btnBack);
		
		btnEdit = new JButton("Update");
	    /*coach_no = tblUsers.getModel().getValueAt(row, 0).toString();
	    setCoachNo(coach_no);
	    date = tblUsers.getModel().getValueAt(row, 1).toString();
	    time = tblUsers.getModel().getValueAt(row, 2).toString();
	    type = tblUsers.getModel().getValueAt(row, 4).toString();*/
		btnEdit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int row = tblUsers.getSelectedRow();

				if(row<0)
				{
					JOptionPane.showMessageDialog(null, "Please Select one Row ");
					return;
				}
					new UpdateBusSchedule().setVisible(true);
				
			}
		});
		this.upperPanel.add(btnEdit);
		
		btnSeller = new JButton("Add Seller");
		btnSeller.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new AddSeller().setVisible(true);
			}
		});
		this.upperPanel.add(btnSeller);
		
	
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
	
}

