
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class EmployeeDataTable extends AbstractTableModel{

    private List<EmployeeData> li = new ArrayList<EmployeeData>();
    private final String[] columnNames = {"Sr No.", "Name",  "Contact Number", "CNIC No.", "Email", "EMP-ID", "Info", "Edit", "Delete"};

    public EmployeeDataTable(List<EmployeeData> list) {
        this.li = list;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }
    
    @Override
    public int getRowCount() {
        return li.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        EmployeeData E = li.get(rowIndex);
        int x = 1;
        switch (columnIndex) {
            case 0:
                return x++;
            case 1:
                return E.getName();
            case 2:
                return E.getCellNo();
            case 3:
                return E.getCnicNo();
            case 4:
                return E.getEmail();
            case 5:
                return E.getEmpID();
            case 6:
                return E.getDob();
            case 7:
                return E.getGender();
            case 8:
                return "Delete";
        }
        return null;
    }
    
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        System.out.println("column index = " + columnIndex);
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            case 6:
                return Date.class;
            case 7:
                return String.class;
            case 8:
                return String.class;
        }
        return null;
    }
}
