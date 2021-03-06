
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
    }

    private static MainMenu obj;
    public static MainMenu getObject()
    {
        if (obj == null)
        {
            obj = new MainMenu();
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

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        EMPBtn = new javax.swing.JLabel();
        SMBtn = new javax.swing.JLabel();
        LogoutBtn = new javax.swing.JLabel();
        ExitBtn = new javax.swing.JLabel();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(480, 415));
        setMinimumSize(new java.awt.Dimension(480, 415));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N
        jPanel1.add(logo);
        logo.setBounds(0, 0, 100, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/untitled.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 0, 290, 70);

        EMPBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/EMPM.png"))); // NOI18N
        EMPBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EMPBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EMPBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EMPBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EMPBtnMouseExited(evt);
            }
        });
        jPanel1.add(EMPBtn);
        EMPBtn.setBounds(90, 100, 330, 56);

        SMBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/SM.png"))); // NOI18N
        SMBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SMBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SMBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SMBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SMBtnMouseExited(evt);
            }
        });
        jPanel1.add(SMBtn);
        SMBtn.setBounds(110, 180, 290, 56);

        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/logout1.png"))); // NOI18N
        LogoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseExited(evt);
            }
        });
        jPanel1.add(LogoutBtn);
        LogoutBtn.setBounds(180, 270, 150, 56);

        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/button.png"))); // NOI18N
        ExitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ExitBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitBtnMouseExited(evt);
            }
        });
        jPanel1.add(ExitBtn);
        ExitBtn.setBounds(358, 350, 112, 60);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/procurement-3.png"))); // NOI18N
        jPanel1.add(backGround);
        backGround.setBounds(0, 0, 480, 414);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 480, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EMPBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPBtnMouseEntered
        // TODO add your handling code here:
        EMPBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/EMPM1.png")));
    }//GEN-LAST:event_EMPBtnMouseEntered

    private void EMPBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPBtnMouseExited
        // TODO add your handling code here:
        EMPBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/EMPM.png")));
    }//GEN-LAST:event_EMPBtnMouseExited

    private void SMBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMBtnMouseEntered
        // TODO add your handling code here:
        SMBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/SM1.png")));
    }//GEN-LAST:event_SMBtnMouseEntered

    private void SMBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMBtnMouseExited
        // TODO add your handling code here:
        SMBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/SM.png")));
    }//GEN-LAST:event_SMBtnMouseExited

    private void LogoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseEntered
        // TODO add your handling code here:
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/logout2.png")));
    }//GEN-LAST:event_LogoutBtnMouseEntered

    private void LogoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseExited
        // TODO add your handling code here:
        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/logout1.png")));
    }//GEN-LAST:event_LogoutBtnMouseExited

    private void ExitBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseEntered
        // TODO add your handling code here:
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/button (1).png")));
    }//GEN-LAST:event_ExitBtnMouseEntered

    private void ExitBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseExited
        // TODO add your handling code here:
        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/button.png")));
    }//GEN-LAST:event_ExitBtnMouseExited

    private void ExitBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitBtnMouseClicked
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
    }//GEN-LAST:event_ExitBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        ManagerLogin.getObject().setVisible(true);
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void EMPBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EMPBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        EmployeeForm E = new EmployeeForm("helo" ,"helo" ,"no");
        E.setVisible(true);
    }//GEN-LAST:event_EMPBtnMouseClicked

    private void SMBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SMBtnMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        InventoryForm I = new InventoryForm("helo", "helo");
        I.setVisible(true);
    }//GEN-LAST:event_SMBtnMouseClicked


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EMPBtn;
    private javax.swing.JLabel ExitBtn;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JLabel SMBtn;
    private javax.swing.JLabel backGround;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
