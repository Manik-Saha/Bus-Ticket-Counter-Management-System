import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class AllCoachNo extends JFrame {
  
	private static JTable tblUsers;
	private static JTextField txtSearch;

	
	public  AllCoachNo() {
		setBounds(200,10,1000,800);
	    setTitle("All the buses");
	    setVisible(true);
        setLayout(null);
	    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    
		
		tblUsers = new JTable();
		tblUsers.setBackground(Color.white);
		
		JScrollPane sp = new JScrollPane();
		sp.setBounds(5, 15, 490, 320);
		add(sp);
		sp.setViewportView(tblUsers);
		
		populateTableData();
		
	}
	    
	    public static void populateTableData() {
			
	    	AllBusTableModel model = new AllBusTableModel(txtSearch.getText());
			tblUsers.setModel(model);
		}
	}
