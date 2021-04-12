
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class EmployeeData {
    
    private String name;
    private String CellNo;
    private Date dob;
    private String cnicNo;
    private String gender;
    private String email;
    private String EmpID;

       
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCellNo() {
        return CellNo;
    }

    public void setCellNo(String CellNo) {
        this.CellNo = CellNo;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCnicNo() {
        return cnicNo;
    }

    public void setCnicNo(String cnicNo) {
        this.cnicNo = cnicNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getEmpID() {
        return EmpID;
    }

    public void setEmpID(String EmpID) {
        this.EmpID = EmpID;
    }
    
}
