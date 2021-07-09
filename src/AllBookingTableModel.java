import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class AllBookingTableModel extends AbstractTableModel {
	
	private String[] colNames = {"name","phone","seat_no"};
	private ArrayList<Booking> allBooked = new ArrayList<Booking>();
	
	public AllBookingTableModel() {
		String query = "SELECT * FROM booked";
		//if(!key.equals(""))
			//query = query + " where name like '%"+key+"%'";
		
		DataAccess da = new DataAccess();
		allBooked = da.GetData(query);
	}
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return colNames.length;
	}
	
	public String getColumnName(int col) {
		// TODO Auto-generated method stub
		return colNames[col];
	}

	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return allBooked.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		if(allBooked.size()==0)
			return null;
		
		
		try
		{
			Booking u = allBooked.get(row);
			switch(col)
			{
				case 0:
					return u.name;
				case 1:
					return u.phone;
				case 2:
					return u.seat_no;
				default:
					return null;
			}
			
		}
		catch(Exception ex){
			return null;
		}
	}
	
	

}
