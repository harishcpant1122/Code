package USBAssignment.USBAssignment;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class SortingProblem {

	public static void main(String[] args) {
		int sortColumn=0;
		String sortBy = "Amount";
		switch (sortBy) {
		  case "Tran ID":
			  sortColumn=0;
		    break;
		  case "Amount":
			  sortColumn=1;
		    break;
		  case "Typeoftran":
			  sortColumn=2;
		    break;
		  case "Status":
			  sortColumn=3;
		    break;
		}
		
		String[] columnNames = {"Tran ID",
                "Amount",
                "Typeoftrann",
                "Status"};
		Object[][] data = {
			    {5555, 200,"Credit","Approved"},
			    {2222, 500,"Debit","Declined"},
			    {1111, 300,"Check","Pending"},
			    {6666, 100,"Debit","Approved"},
			    {4444, 800,"Check","Declined"},
			    {3333, 700,"Credit","Pending"}
			};

		DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(tableModel);
		TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
		table.setRowSorter(sorter);

		List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
		sortKeys.add(new RowSorter.SortKey(sortColumn, SortOrder.ASCENDING));
		sorter.setSortKeys(sortKeys);
		
		System.out.println("Tran ID  |  Amount   | Typeoftran |  Status");
		for (int i=0;i<=5;i++)
		{
			System.out.println(table.getValueAt(i, 0)+"     |     "+table.getValueAt(i, 1)+"     |  "+table.getValueAt(i, 2)+"   |   "+table.getValueAt(i, 3));
		}
	}

}
