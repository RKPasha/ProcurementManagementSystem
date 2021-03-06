
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


//import java.awt.Image;
//import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class ManagerLogin extends javax.swing.JFrame {

    
    /**
     * Creates new form ManagerLogin
     */
    public ManagerLogin(String load){
         initComponents();
        try {
            EmployeeList.getObject().loadEmployeeData();
        } catch (Exception ex) {
            System.out.println("Error loading Employee_Data file");
        }
        try {
            Inventory.getObject().loadInventory();
        } catch (Exception ex) {
            System.out.println("Error loading Inventory file");
        }
    }
    public ManagerLogin() {
        initComponents();
    }
    
    private static ManagerLogin obj;
    public static ManagerLogin getObject()
    {
        if (obj == null)
        {
            obj = new ManagerLogin();
        }
        return obj;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        loginBtn = new javax.swing.JLabel();
        exitBtn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JPasswordField();
        ShowPassword = new javax.swing.JCheckBox();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(661, 291));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/login.png"))); // NOI18N
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
        });
        getContentPane().add(loginBtn);
        loginBtn.setBounds(390, 220, 130, 60);

        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/button.png"))); // NOI18N
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitBtnMouseExited(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(530, 220, 120, 60);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Email");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 100, 37, 16);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 140, 70, 21);

        Email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                EmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                EmailFocusLost(evt);
            }
        });
        Email.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EmailMouseExited(evt);
            }
        });
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        getContentPane().add(Email);
        Email.setBounds(480, 90, 160, 28);

        Password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PasswordFocusLost(evt);
            }
        });
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PasswordMouseExited(evt);
            }
        });
        getContentPane().add(Password);
        Password.setBounds(480, 130, 160, 28);

        ShowPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        ShowPassword.setForeground(new java.awt.Color(0, 0, 0));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPassword);
        ShowPassword.setBounds(480, 170, 120, 22);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/untitled_page.png"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 661, 291);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        // TODO add your handling code here:
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/button (2).png")));
    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        // TODO add your handling code here:
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/login.png")));
    }//GEN-LAST:event_loginBtnMouseExited

    private void exitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseEntered
        // TODO add your handling code here:
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/button (1).png")));
    }//GEN-LAST:event_exitBtnMouseEntered

    private void exitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseExited
        // TODO add your handling code here:
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/button.png")));
    }//GEN-LAST:event_exitBtnMouseExited

    private void exitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBtnMouseClicked
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to exit from the System?", "Warning...!", 1);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                EmployeeList.getObject().saveEmloyeeData();
            } catch (Throwable ex) {
                Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Employee Data Failed to save", "??? Warning...!!", 1);
            }
            try {
                Inventory.getObject().saveInventory();
            } catch (Throwable ex) {
                Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Inventory Data Failed to save", "??? Warning...!!", 1);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnMouseClicked

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
        MainMenu menu = new MainMenu();
        if (Email.getText().equals("admin") && Password.getText().equals("admin")) {
            //JOptionPane.showMessageDialog(null, "Admin Successfully login????????????????", "Congratualations????????", 1);
            this.setVisible(false);
            menu.setVisible(true);
             }
        else
        {
            JOptionPane.showMessageDialog(null, "Invalid credentials!!", "Warning??????", 1);
            this.setVisible(true);
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_EmailActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        // TODO add your handling code here:
         if(ShowPassword.isSelected()){
            Password.setEchoChar((char)0);
        }
        else{
            Password.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void EmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusLost
        // TODO add your handling code here:
        if (Email.getText().matches("admin")) {
            Email.setBackground(Color.GREEN);
        } else {
            Email.setBackground(Color.red);
        }
    }//GEN-LAST:event_EmailFocusLost

    private void PasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordMouseExited

    private void EmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmailMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailMouseExited

    private void PasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusLost
        // TODO add your handling code here:
        if (Password.getText().matches("admin")) {
            Password.setBackground(Color.GREEN);
        } else {
            Password.setBackground(Color.red);
        }
    }//GEN-LAST:event_PasswordFocusLost

    private void EmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EmailFocusGained
        // TODO add your handling code here:
        Email.setBackground(Color.WHITE);
    }//GEN-LAST:event_EmailFocusGained

    private void PasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PasswordFocusGained
        // TODO add your handling code here:
         Password.setBackground(Color.WHITE);
    }//GEN-LAST:event_PasswordFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerLogin("load").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Email;
    private javax.swing.JPasswordField Password;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel exitBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loginBtn;
    // End of variables declaration//GEN-END:variables
}
