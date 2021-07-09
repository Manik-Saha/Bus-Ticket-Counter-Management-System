import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class DataAccess {
   private Connection con;
   private Statement myStatement;
   private ResultSet result,result2;
	public DataAccess(){
		String url = "jdbc:mysql://localhost:3306/ticketcounterdatabase";
		try{
			this.con = (Connection) DriverManager.getConnection(url, "root", "");
			this.myStatement = (Statement) con.createStatement();
		}
		catch(SQLException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
	
	
	public ArrayList<Bus> GetUsers(String sql){
		ArrayList<Bus> list = new ArrayList<Bus>();
		
		try{
			result = myStatement.executeQuery(sql);
			while(result.next())
			{
				Bus ab = new Bus();
				ab.coach_no = result.getString("coach_no");
				ab.date = result.getString("date");
				ab.time = result.getString("time");
				ab.root = result.getString("root");
				ab.type = result.getString("type");
				list.add(ab);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public ArrayList<Booking> GetData(String sql){
		ArrayList<Booking> list = new ArrayList<Booking>();
		
		try{
			result2 = myStatement.executeQuery(sql);
			while(result2.next())
			{
				Booking ab = new Booking();
				ab.name = result2.getString("name");
				ab.phone = result2.getString("phone");
				ab.seat_no = result2.getString("seat_no");
				//ab.coach_no = result.getString("coach_no");
				//ab.type = result.getString("type");
				list.add(ab);
			}
		}
		catch (SQLException e){
			e.printStackTrace();
		}
		return list;
	}
	
	public void insert(String sql){
		try {
			System.out.println(sql);
			myStatement.executeUpdate(sql);
			myStatement.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

