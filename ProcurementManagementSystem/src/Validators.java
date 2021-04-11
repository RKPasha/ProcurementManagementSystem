
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abdullah
 */
public class Validators {

    // Name Validator
    public Boolean checkName(String name) {
        boolean flag = false;
        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') || (name.charAt(i) >= 'a' && name.charAt(i) <= 'z') || (name.charAt(i) == ' ')) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }

    // Date of Birth validator
    public Boolean checkDateOfBirth(Date dob) {
        boolean flag = false;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy");
            String date1 = "Jan 01, 2005";
            String date2 = "Dec 31, 1990";
            Date d1 = formatter.parse(date1);
            Date d2 = formatter.parse(date2);
            boolean dateBefore = dob.before(d1);
            boolean dateAfter = dob.after(d2);
            if ((dateBefore) && (dateAfter)) {
                flag = true;
            } else {
                System.out.println("You have Entered invalid Date.");
                flag = false;
            }
        } catch (ParseException e) {
            System.out.println("You have Entered invalid Date.");
        }
        return flag;
    }

    // Email Validator
    public Boolean isValidEmail(String Email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
                              
        Pattern pat = Pattern.compile(emailRegex);
        if (Email == null)
            return false;
        return pat.matcher(Email).matches();
    }

    //CNIC No Validator
    public Boolean isValidCNIC(String CNIC) {
        int size = CNIC.length();
        boolean f1 = false, f2 = false, f3 = false;
        try{
            if (size == 15) {
            for (int i = 0; i < 5; i++) {
                if (CNIC.charAt(i) >= '0' && CNIC.charAt(i) <= '9') {
                    f1 = true;
                }
            }
            for (int i = 6; i < 13; i++) {
                if (CNIC.charAt(i) >= '0' && CNIC.charAt(i) <= '9') {
                    f2 = true;
                }
            }
            if ((CNIC.charAt(5) == '-' && CNIC.charAt(13) == '-') && (CNIC.charAt(14) >= '0' && CNIC.charAt(14) <= '9')) {
                f3 = true;
            }
        } else {
            return false;
        }
        }catch(Exception e)
        {
        }
         if ((f1 == true && f2 == true) && (f3 == true)) {
                return true;
            } else {
                return false;
            }
    }

    // Cell-no validator........
    public Boolean isValidCellNo(String CellNo) {
        int size = CellNo.length();
        boolean f1 = false, f2 = false;
        if (size == 12) {
            if ((CellNo.charAt(0) == '0' && CellNo.charAt(1) == '3') && (CellNo.charAt(2) >= '0' && CellNo.charAt(2) <= '9') && (CellNo.charAt(3) >= '0' && CellNo.charAt(3) <= '9') && (CellNo.charAt(4) == '-')) {
                f1 = true;
            }
            for (int i = 5; i < size; i++) {
                if (CellNo.charAt(i) >= '0' && CellNo.charAt(i) <= '9') {
                    f2 = true;
                }
            }
            if (f1 == true && f2 == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
