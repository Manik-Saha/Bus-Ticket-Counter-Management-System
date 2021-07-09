//import java.awt.*;

import javax.swing.*;

public class BusDetailInterface extends JFrame {
	
	JTextField txt1,txt2,txt3;
	JPanel panel ;
	JLabel coach_no,date,time,root,title;
	
	  public BusDetailInterface() {
		  setBounds(200,10,700,600);
	 	    setTitle("BUS Schedule");
	        setLayout(null);
	 	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	     
	 	    JPanel panel1 = new JPanel();
	 	    panel1.setBounds(0,0,700,600);
	 	    add(panel1);
	 	     
	 	    JLabel coachNo = new JLabel("Coach No");
			coachNo.setBounds(0,10, 80, 30);
			panel1.add(coachNo);
			
			txt1 = new JTextField();
			txt1.setBounds(120,10,50, 30);
			panel1.add(txt1);
			
			JLabel date = new JLabel("Date");
			date.setBounds(0,60, 80, 30);
			panel1.add(date);
			
			txt2 = new JTextField();
			txt2.setBounds(120,60, 50, 30);
			panel1.add(txt2);
			
			JLabel time = new JLabel("Time");
			time.setBounds(0,110, 80, 30);
			panel1.add(time);
			
			txt3 = new JTextField();
			txt3.setBounds(120,110, 50, 30);
			panel1.add(txt3);
	    }

			
}

