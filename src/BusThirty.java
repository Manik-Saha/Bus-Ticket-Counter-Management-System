import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BusThirty extends JFrame implements ActionListener {
	
	JButton a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3,g1,g2,g3,h1,h2,h3,i1,i2,i3,j1,j2,j3;
	
	JButton[] available = {a1,a2,a3,b1,b2,b3,c1,c2,c3,d1,d2,d3,e1,e2,e3,f1,f2,f3,g1,g2,g3,h1,h2,h3,i1,i2,i3,j1,j2,j3};
    JButton[] booked;
    JButton confirm;
	
public BusThirty() {
	createThirty();
}

public void createThirty(){
	//super(Thirty);
	this.setSize(800,800);
    setLocation(0,0);
    //setVisible(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    
    JPanel panel1 = new JPanel(new FlowLayout());
    panel1.setBounds(200,200,200, 600);
    add(panel1);
    //panel1.setBackground(Color.cyan);
    
    a1 = new JButton("A1");
    //a1.setBounds(x, y, width, height);
    panel1.add(a1);
    this.a1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			a1.setBackground(Color.red);
			booked[0]=a1;
			System.out.println(booked[0]);
		}
    });
    
    
    a2 = new JButton("A2");
    //a2.setBounds(x, y, width, height);
    panel1.add(a2);
    this.a2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			a2.setBackground(Color.red);
			
		}
    });
    
    a3 = new JButton("A3");
    //a3.setBounds(x, y, width, height);
    panel1.add(a3);
    this.a3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			a3.setBackground(Color.red);
			
		}
    });
    
    b1 = new JButton("B1");
    //b1.setBounds(x, y, width, height);
    panel1.add(b1);
    this.b1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			b1.setBackground(Color.red);
			
		}
    });
    
    
    b2 = new JButton("B2");
    //b2.setBounds(x, y, width, height);
    panel1.add(b2);
    this.b2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			b2.setBackground(Color.red);
			
		}
    });
    
    b3 = new JButton("B3");
    //b3.setBounds(x, y, width, height);
    panel1.add(b3);
    this.b3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			b3.setBackground(Color.red);
			
		}
    });
    
    c1 = new JButton("C1");
    //c1.setBounds(x, y, width, height);
    panel1.add(c1);
    this.c1.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			c1.setBackground(Color.red);
			
		}
    });
    
    c2 = new JButton("C2");
   // c2.setBounds(x, y, width, height);
    panel1.add(c2);
    this.c2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			c2.setBackground(Color.red);
			
		}
    });
    
    c3 = new JButton("C3");
    //c3.setBounds(x, y, width, height);
    panel1.add(c3);
    this.c3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			c3.setBackground(Color.red);
			
		}
    });
    
    d1 = new JButton("D1");
    // d1.setBounds(x, y, width, height);
     panel1.add(d1);
     this.d1.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			d1.setBackground(Color.red);
 			
 		}
     });
     
     d2 = new JButton("D2");
    // d2.setBounds(x, y, width, height);
     panel1.add(d2);
     this.d2.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			d2.setBackground(Color.red);
 			
 		}
     });
     
     d3 = new JButton("D3");
     //d3.setBounds(x, y, width, height);
     panel1.add(d3);
     this.d3.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			d3.setBackground(Color.red);
 			
 		}
     });
    
     e1 = new JButton("E1");
     //e1.setBounds(x, y, width, height);
     panel1.add(e1);
     this.e1.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			e1.setBackground(Color.red);
 			
 		}
     });
     
     e2 = new JButton("E2");
     //e2.setBounds(x, y, width, height);
     panel1.add(e2);
     this.e2.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			e2.setBackground(Color.red);
 			
 		}
     });
     
     e3 = new JButton("E3");
    // e3.setBounds(x, y, width, height);
     panel1.add(e3);
     this.e3.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			e3.setBackground(Color.red);
 			
 		}
     });
    
     f1 = new JButton("F1");
     //f1.setBounds(x, y, width, height);
     panel1.add(f1);
     this.f1.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			f1.setBackground(Color.red);
 			
 		}
     });
     
     f2 = new JButton("F2");
     //f2.setBounds(x, y, width, height);
     panel1.add(f2);
     this.f2.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			f2.setBackground(Color.red);
 			
 		}
     });
     
     f3 = new JButton("F3");
     //f3.setBounds(x, y, width, height);
     panel1.add(f3);
     this.f3.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			f3.setBackground(Color.red);
 			
 		}
     });
     
     
     g1 = new JButton("G1");
     //g1.setBounds(x, y, width, height);
     panel1.add(g1);
     this.g1.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			g1.setBackground(Color.red);
 			
 		}
     });
     
     g2 = new JButton("G2");
     //g2.setBounds(x, y, width, height);
     panel1.add(g2);
     this.g2.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			g2.setBackground(Color.red);
 			
 		}
     });
     
     g3 = new JButton("G3");
    // g3.setBounds(x, y, width, height);
     panel1.add(g3);
     this.g3.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			g3.setBackground(Color.red);
 			
 		}
     });
    
    
     h1 = new JButton("H1");
     //h1.setBounds(x, y, width, height);
     panel1.add(h1);
     this.h1.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			h1.setBackground(Color.red);
 			
 		}
     });
     
     h2 = new JButton("H2");
     //h2.setBounds(x, y, width, height);
     panel1.add(h2);
     this.h2.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			h2.setBackground(Color.red);
 			
 		}
     });
     
     h3 = new JButton("H3");
    // h3.setBounds(x, y, width, height);
     panel1.add(h3);
     this.h3.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			h3.setBackground(Color.red);
 			
 		}
     });
    
     i1 = new JButton("I 1");
     //i1.setBounds(x, y, width, height);
     panel1.add(i1);
     this.i1.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			i1.setBackground(Color.red);
 			
 		}
     });
     
     i2 = new JButton("I 2");
     //i2.setBounds(x, y, width, height);
     panel1.add(i2);
     this.i2.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			i2.setBackground(Color.red);
 		}
     });
     
     i3 = new JButton("I 3");
     //i3.setBounds(x, y, width, height);
     panel1.add(i3);
     this.i3.addActionListener(new ActionListener() {

 		@Override
 		public void actionPerformed(ActionEvent e) {
 			// TODO Auto-generated method stub
 			i3.setBackground(Color.red);
 			
 		}
     });

    	
     j1 = new JButton("J1");
     // j1.setBounds(x, y, width, height);
      panel1.add(j1);
      this.j1.addActionListener(new ActionListener() {

  		@Override
  		public void actionPerformed(ActionEvent e) {
  			// TODO Auto-generated method stub
  			j1.setBackground(Color.red);
  		}
      });
      
      j2 = new JButton("J2");
     // j2.setBounds(x, y, width, height);
      panel1.add(j2);
      this.j2.addActionListener(new ActionListener() {

  		@Override
  		public void actionPerformed(ActionEvent e) {
  			// TODO Auto-generated method stub
  			j2.setBackground(Color.red);
  			
  		}
      });
      
      j3 = new JButton("J3");
     // j3.setBounds(x, y, width, height);
      panel1.add(j3);
      this.j3.addActionListener(new ActionListener() {

  		@Override
  		public void actionPerformed(ActionEvent e) {
  			// TODO Auto-generated method stub
  			j3.setBackground(Color.red);
  			
  		}
      });
      confirm = new JButton("confirm");
      //a3.setBounds(x, y, width, height);
      panel1.add(confirm);
      this.confirm.addActionListener(new ActionListener() {

  		@Override
  		public void actionPerformed(ActionEvent e) {
  			// TODO Auto-generated method stub
  		     new CustomerInformation().setVisible(true);
  		     setVisible(false);
  		     
  			
  		}
      });
    }
   

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}

}
					