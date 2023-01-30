/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import java.util.*;
import Model.*;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;

/**
 *
 * @author xyh10
 */
public class ReadFrame extends javax.swing.JFrame {
    PersonCatelog pc;
    DefaultTableModel model;
    Object[][] data = new Object[25][9];
    String[] tableTitle = new String [] {
                "Name", "Email ID", "Phone", "Recipe title", "No. of servings", "Is gluten free", "Difficulty level", "No. of Ingredients", "Category"
        };
    
    HashMap<Integer, Recipe> tableInformation = new HashMap<>();
    
    /**
     * Creates new form ReadFrame
     */
    public ReadFrame() {
        initComponents();
        model = new DefaultTableModel(data, tableTitle);
        Table.setModel(model);
        
    }
    
    public boolean validateChefName(){
        String str = fieldChefName.getText();

        
        if(!str.matches("([A-Za-z]*) ([A-Za-z]*)")){
            JOptionPane.showMessageDialog(this, "Please enter validate name(Example: John Smith!");
            return false;
        }
        return true;
    }
    
    public boolean validateRecipeName(){
        String str = fieldRecipeName.getText();

        
        if(!str.matches("[A-Za-z]*")){
            JOptionPane.showMessageDialog(this, "Please enter validate name!");
            return false;
        }
        return true;
        
    }
    
    public void setPersonCatelog(PersonCatelog pc){
        this.pc = pc;
    }
    
    public void loadTable(String chiefName, String recipeName){
        // clean the data
        data = new Object[25][9];
        tableInformation = new HashMap<>();
        int index = 0;

        // add all information
        for(Person p:pc.getCatelog()){
            
            if(!chiefName.isEmpty() && !p.matchName(chiefName)){  // to match the name or skill if no name required
                continue;
            }
            
            for(Recipe recipe:p.getRecipes()){
                if(!recipeName.isEmpty() && !recipeName.equals(recipe.getTitle())){  // to match the name or skill if no name required
                    continue;
                }
                tableInformation.put(index, recipe);
                // name
                data[index][0] = p.getFirstName() + " " + p.getLastName();
                // emial id
                data[index][1] =p.getEmailID();
                // phone
                data[index][2] = p.getEmailID();
                //recipe title
                data[index][3] = recipe.getTitle();
                // no of servings
                data[index][4] = recipe.getNoOfServings();
                // is gluten free
                data[index][5] = recipe.isIsGlutenFree();
                //difficulty level
                data[index][6] = recipe.getDifficultyLevel();
                //no of ingredient
                data[index][7] = recipe.getNoOfIngredient();
                // catefory
                data[index][8] = recipe.getCategory();
                
                index ++;
                if(index == 25) return ;
                
            }
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        showTable = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fieldChefName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldRecipeName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Email ID", "Phone", "Recipe title", "No. of servings", "Is gluten free", "Difficulty level", "No. of Ingredients", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.Boolean.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setGridColor(new java.awt.Color(0, 0, 0));
        Table.setOpaque(false);
        Table.setShowHorizontalLines(true);
        Table.setShowVerticalLines(true);
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        showTable.setText("Search");
        showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Search by chef's name:");

        fieldChefName.setBackground(new java.awt.Color(255, 255, 255));
        fieldChefName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldChefNameActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Search by recipe name:");

        fieldRecipeName.setBackground(new java.awt.Color(255, 255, 255));
        fieldRecipeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRecipeNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Read recipe information list!");

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Click the table record to see detail information!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fieldRecipeName, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                                    .addComponent(fieldChefName))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showTable)
                                    .addComponent(jLabel4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldChefName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showTable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fieldRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableActionPerformed
        // TODO add your handling code here:
        String chefName = fieldChefName.getText();
        if(!chefName.trim().isEmpty() && !validateChefName()) return;
            
        String recipeName = fieldRecipeName.getText();
        if(!recipeName.trim().isEmpty() && !validateRecipeName()) return ;
        

        loadTable(chefName, recipeName);
        Table.setModel(new DefaultTableModel(data, tableTitle));
    }//GEN-LAST:event_showTableActionPerformed

    private void fieldChefNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldChefNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldChefNameActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        // TODO add your handling code here:
        int row = Table.getSelectedRow();
//        System.out.println(row);
        
        Recipe recipe = null;
        if(tableInformation.containsKey(row)) recipe = tableInformation.get(row);
      
        
        ReadDetailsFrame rdf = new ReadDetailsFrame();
        rdf.setVisible(true);
        rdf.initialize(recipe);
        
        
    }//GEN-LAST:event_TableMouseClicked

    private void fieldRecipeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRecipeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRecipeNameActionPerformed

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
            java.util.logging.Logger.getLogger(ReadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReadFrame().setVisible(true);
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JTextField fieldChefName;
    private javax.swing.JTextField fieldRecipeName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showTable;
    // End of variables declaration//GEN-END:variables
}
