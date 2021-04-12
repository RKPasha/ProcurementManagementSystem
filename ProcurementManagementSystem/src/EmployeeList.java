
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
}
