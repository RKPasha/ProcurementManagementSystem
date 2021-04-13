
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class EmployeeList {
    
    private static EmployeeList obj;
    
    private List<EmployeeData> list;
    
    private EmployeeList(){
        list = new ArrayList<EmployeeData>();
    }
    
    public static EmployeeList getObject() {
        if (obj == null) {
            obj = new EmployeeList();
        }
        return obj;
    }
 
    public void addEmployee(EmployeeData E) {
        list.add(E);
    }
    
    public List<EmployeeData> getAllEmployee() {
        return list;
    }
    
    protected void saveEmloyeeData() throws Throwable {
        try {
            FileWriter fw = new FileWriter("Employee_Data.csv");
            fw.write("Name,Contact Number,Date Of Birth,CNIC No,Gender,Email ID,Employee ID\n");
            for (int i = 0; i < list.size(); i++) {
                fw.write(list.get(i).getName() + ","
                        + list.get(i).getCellNo() + ","
                        + list.get(i).getDob() + ","
                        + list.get(i).getCnicNo() + ","
                        + list.get(i).getGender() + ","
                        + list.get(i).getEmail() + ","
                        + list.get(i).getEmpID() + "\n");
            }
            fw.flush();
            fw.close();
            super.finalize();
            System.out.println("Receipts Saved Successfully");
        } catch (Throwable e) {
            throw e;
        }
    }
}
