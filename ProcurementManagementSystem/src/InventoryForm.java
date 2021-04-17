
import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class InventoryForm extends javax.swing.JFrame {

    public static String itemName;
    Validators V = new Validators();
    /**
     * Creates new form InventoryForm
     */
    public InventoryForm(String name, String Action) {
        initComponents();
        InventoryTable t = new InventoryTable(Inventory.getObject().getAllInventory());
        jTable2.setModel(t);
        if (Action.equals("Add")) {
                //System.out.println("Here i m");
                InventoryForm.itemName = name;
                Inventory.getObject().getItem(name).setQuantity(Inventory.getObject().getItem(name).getQuantity()  + 1);
            }else if(Action.equals("Minus")){
                Inventory.getObject().getItem(name).setQuantity(Inventory.getObject().getItem(name).getQuantity()  - 1);
            }
        Action Add = new AbstractAction() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                InventoryTable model = (InventoryTable) table.getModel();
                model.addRow(row);
                Jhatka();
            }
        };
        ButtonColumn add = new ButtonColumn(jTable2, Add, 3);
        
        Action Minus = new AbstractAction() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int row = Integer.valueOf(e.getActionCommand());
                InventoryTable model = (InventoryTable) table.getModel();
                model.minusRow(row);
                Jhatka();
            }
        };
        ButtonColumn minusButton = new ButtonColumn(jTable2, Minus, 4);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addItemBtn = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addMenuItem = new javax.swing.JMenuItem();
        removeMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        closeMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        editMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        logoutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setResizable(false);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable2);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo1.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Inventory Dashboard");

        addItemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/additembtn.png"))); // NOI18N
        addItemBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addItemBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addItemBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addItemBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addItemBtnMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addItemBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addItemBtn)))
                .addContainerGap())
        );

        jMenu1.setText("File");

        addMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addMenuItem.setText("Add an Item");
        addMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(addMenuItem);

        removeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        removeMenuItem.setText("Remove an Item");
        removeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(removeMenuItem);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_HOME, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Go to Main Menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        closeMenuItem.setText("Close");
        closeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(closeMenuItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        editMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_INSERT, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        editMenuItem.setText("Edit an item");
        editMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(editMenuItem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Logout 🔒");

        logoutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logoutMenuItem.setText("Log Out");
        logoutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuItemActionPerformed(evt);
            }
        });
        jMenu3.add(logoutMenuItem);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuItemActionPerformed
        // TODO add your handling code here:
        addItem();
    }//GEN-LAST:event_addMenuItemActionPerformed

    private void closeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeMenuItemActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to exit from the System?", "Warning...!", 1);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                EmployeeList.getObject().saveEmloyeeData();
            } catch (Throwable ex) {
                Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Employee Data Failed to save", "⚠ Warning...!!", 1);
            }
            try {
                Inventory.getObject().saveInventory();
            } catch (Throwable ex) {
                Logger.getLogger(EmployeeForm.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Inventory Data Failed to save", "⚠ Warning...!!", 1);
            }
            System.exit(0);
        }
    }//GEN-LAST:event_closeMenuItemActionPerformed

    private void logoutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutMenuItemActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ManagerLogin.getObject().setVisible(true);
    }//GEN-LAST:event_logoutMenuItemActionPerformed

    private void addItemBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemBtnMouseEntered
        // TODO add your handling code here:
        addItemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/additembtn1.png"))); 
    }//GEN-LAST:event_addItemBtnMouseEntered

    private void addItemBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemBtnMouseExited
        // TODO add your handling code here:
        addItemBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/additembtn.png"))); 
    }//GEN-LAST:event_addItemBtnMouseExited

    private void addItemBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addItemBtnMouseClicked
        // TODO add your handling code here:
        addItem();
    }//GEN-LAST:event_addItemBtnMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainMenu.getObject().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void removeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeMenuItemActionPerformed
        // TODO add your handling code here:
        if (searchItem()) {
            Inventory.getObject().deleteAccessory(itemName);
            JOptionPane.showMessageDialog(null, "Item removed Successfully..!");
            this.setVisible(false);
            InventoryForm I = new InventoryForm("helo", "helo");
            I.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Item not Found");
        }
    }//GEN-LAST:event_removeMenuItemActionPerformed

    private void editMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editMenuItemActionPerformed
        // TODO add your handling code here:
        if (searchItem()) {
            try{
                Accessories A = new Accessories();
                String name = JOptionPane.showInputDialog(null, "Enter the updated name of Item", "Edit Item", 1);
                String quantity = JOptionPane.showInputDialog(null, "Enter the Quantity of Item", "Add Item", 1);
                int quant = Integer.parseInt(quantity);
                A.setItemName(name);
                A.setQuantity(quant);
                Inventory.getObject().updateAccessory(itemName, A);
                JOptionPane.showMessageDialog(null, "Item updated Successfully..!");
                this.setVisible(false);
                InventoryForm I = new InventoryForm("helo", "helo");
                I.setVisible(true);
            }catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Quantity...!", "Warning", 1);
        }
        } else {
            JOptionPane.showMessageDialog(null, "Item not Found");
        }
    }//GEN-LAST:event_editMenuItemActionPerformed

    public void addItem() {
        try {
            if (!(searchItem())) {
                if(itemName.equalsIgnoreCase("laptop") || itemName.equalsIgnoreCase("laptops")){
                    JOptionPane.showMessageDialog(null, "Sorry..! You can,t add laptop in this List", "Warning...!!", 1);
                } else {
                    String quantity = JOptionPane.showInputDialog(null, "Enter the Quantity of Item", "Add Item", 1);
                    int quant = Integer.parseInt(quantity);
                    Accessories A = new Accessories();
                    A.setItemName(itemName);
                    A.setQuantity(quant);
                    Inventory.getObject().addAccessory(A);
                    JOptionPane.showMessageDialog(null, "Item Successfully added to list...!", "Item Added", 1);
                    this.setVisible(false);
                    InventoryForm I = new InventoryForm("helo", "helo");
                    I.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Item Already Exist...!");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Quantity...!", "Warning", 1);
        }
    }

    public boolean searchItem(){
        boolean flag =   false;
        itemName = JOptionPane.showInputDialog(null, "Enter the name of item :", "Search Item..", 1);
        for (int i = 0; i < Inventory.getObject().getAllInventory().size(); i++) {
                if(Inventory.getObject().getAllInventory().get(i).getItemName().equalsIgnoreCase(itemName)){
                    flag = true;
                    break;
                }
            }
        return flag;
    }
    public void Jhatka(){
        this.setVisible(false);
        InventoryForm I = new InventoryForm("helo", "helo");
        I.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addItemBtn;
    private javax.swing.JMenuItem addMenuItem;
    private javax.swing.JMenuItem closeMenuItem;
    private javax.swing.JMenuItem editMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JMenuItem logoutMenuItem;
    private javax.swing.JMenuItem removeMenuItem;
    // End of variables declaration//GEN-END:variables
}
