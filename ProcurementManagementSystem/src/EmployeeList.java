
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    private EmployeeList() {
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
    
    private int searchEmployee(String ID)
    {
        int index = -1;
         for(int i = 0 ; i  < list.size(); i++)
         {
             if(list.get(i).getEmpID().equals(ID))
             {
                 System.out.println("Employee Found");
                 index = i;
                 break;
             }
         }
        return index;
    }
    
    
    public EmployeeData getEmployee(String ID)
    {
        int index = searchEmployee(ID);
        return list.get(index);
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
            System.out.println("Employee's personal info Saved Successfully");
        } catch (Throwable e) {
            throw e;
        }
    }

    public void loadEmployeeData() throws ParseException {
        try {
            FileReader fr = new FileReader("Employee_Data.csv");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            line = br.readLine();
            while (line != null) {
                EmployeeData E = new EmployeeData();
                String[] toks = line.split(",");

                E.setName(toks[0]);
                E.setCellNo(toks[1]);
                SimpleDateFormat formatter5 = new SimpleDateFormat("E MMM dd HH:mm:ss yyyy");
                Date d = formatter5.parse(toks[2].replace(" PKT", ""));
                E.setDob(d);
                E.setCnicNo(toks[3]);
                E.setGender(toks[4]);
                E.setEmail(toks[5]);
                E.setEmpID(toks[6]);
                EmployeeList.getObject().addEmployee(E);
                line = br.readLine();
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
}
