import java.util.ArrayList;
import java.sql.ResultSet;

import javax.swing.table.AbstractTableModel;


public class AllBusTableModel extends AbstractTableModel {
	
	private String[] colNames = {"coach_no","date","time","root","type"};
	private ArrayList<Bus> allBus = new ArrayList<Bus>();
	
	public AllBusTableModel(String key) {
		String query = "SELECT * FROM bus";
		if(!key.equals(""))
			query = query + " where date like '%"+key+"%'";
		
		DataAccess da = new DataAccess();
		allBus = da.GetUsers(query);
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
		return allBus.size();
	}

	@Override
	public Object getValueAt(int row, int col) {
		// TODO Auto-generated method stub
		if(allBus.size()==0)
			return null;
		
		
		try
		{
			Bus u = allBus.get(row);
			switch(col)
			{
				case 0:
					return u.coach_no;
				case 1:
					return u.date;
				case 2:
					return u.time;
				case 3:
					return u.root;
				case 4:
					return u.type;
				default:
					return null;
			}
			
		}
		catch(Exception ex){
			return null;
		}
	}
	
	

}
