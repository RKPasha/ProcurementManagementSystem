
import java.util.ArrayList;
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
public class InventoryTable extends AbstractTableModel{
     private List<Accessories> li = new ArrayList<Accessories>();
    private final String[] columnNames = {"Sr No.", "Item Name",  "Quantity Present", "Add", "Minus"};
    public int x = 1;

    public InventoryTable(List<Accessories> list) {
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
        Accessories A = li.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return x++;
            case 1:
                return A.getItemName();
            case 2:
                return A.getQuantity();
            case 3:
                return "Add";
            case 4:
                return "Minus";
        }
        return null;
    }
    
     @Override
    public Class<?> getColumnClass(int columnIndex) {
        //System.out.println("column index = " + columnIndex);
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
        }
        return null;
    }
    
    
     @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
      
        return  columnIndex == 3 || columnIndex == 4;
    }
    

        public void addRow(int row){
     String name = (String)getValueAt(row, 1);
     InventoryForm F = new InventoryForm(name, "Add");
    }
      
    public void minusRow(int row){
     String name = (String)getValueAt(row, 1);
     InventoryForm F = new InventoryForm(name, "Minus");    
    }
}
