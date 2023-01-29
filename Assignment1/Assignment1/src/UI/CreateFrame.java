/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;
import Model.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import javax.swing.*;
import java.awt.*;


/**
 *
 * @author xyh10
 */
public class CreateFrame extends javax.swing.JFrame {
    private PersonCatelog pc;
    private ImageIcon imageIcon;
    

    /**
     * Creates new form CreateFrame
     */
    public CreateFrame() {
        initComponents();
       
    }
    public void setPersonCatelog(PersonCatelog pc){
        this.pc = pc;
    }
    
    
    public boolean validateUserName(){
        String str = fieldUserName.getText();
        
        // 1. is empty
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your userName!");
            return false;
        }else if(!Person.validateUserName(str)){   // 2. if contains only letters, digit, _, $
            JOptionPane.showMessageDialog(this, "Please enter valid userName(consists of only letters, digit, _, $!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateFirstName(){
        String str = fieldFirstName.getText();
        
        // 1. is empty
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your firstName!");
            return false;
        }else if(!Person.validateFirstName(str)){   // 2. if contains unvalid character
            JOptionPane.showMessageDialog(this, "Please enter valid firstName(consists of only Enhlist letters)!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateLastName(){
        String str = fieldLastName.getText();
        
        // 1. is empty
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your lastName!");
            return false;
        }else if(!Person.validateLastName(str)){   // 2. if contains unvalid character
            JOptionPane.showMessageDialog(this, "Please enter valid lastName(consists of only Enhlist letters)!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateEmailID(){
        String str = fieldEmailID.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your Email ID!");
            return false;
        }else if(!Person.validateEmailID(str)){
            JOptionPane.showMessageDialog(this, "Please enter valid email adress!");  
            return false;
        }
        
        return true;
    }
    
    
    public boolean validatePhone(){
        String str = fieldPhone.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your Phone!");
            return false;
        }else if(!Person.validatePhone(str)){
            JOptionPane.showMessageDialog(this, "Please enter valid 9 digit phone number!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateRecipeTitle(){
        String str = fieldRecipeTitle.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your recipe title!");
            return false;
        }else if(!Recipe.validateRecipeTitle(str)){
            JOptionPane.showMessageDialog(this, "Please enter valid recipe title(contains only letters and digits)!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateNoOfServing(){
        String str = fieldNoOfServings.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter number of servings!");
            return false;
        }else if(!Recipe.validateNoOfServings(str)){
            JOptionPane.showMessageDialog(this, "Please enter valid number!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateDifficultyLevel(){
        String str = fieldDifficultyLevel.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter difficulty level!");
            return false;
        }else if(Recipe.validateDifficultyLevel(str) == 1){
            JOptionPane.showMessageDialog(this, "Please enter valid number!");  
            return false;
        }else if(Recipe.validateDifficultyLevel(str) == 2){
            JOptionPane.showMessageDialog(this, "The difficulty level should range from 1 to 5!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateNoOfIngredient(){
        String str = fieldNoOfIngredient.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter number of ingredient!");
            return false;
        }else if(!Recipe.validateNoOfServings(str)){
            JOptionPane.showMessageDialog(this, "Please enter valid number!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateCategoryOfFood(){
        String str = fieldCategoryOfFood.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter food category!");
            return false;
        }else if(!Recipe.validateCategoryOfFood(str)){
            JOptionPane.showMessageDialog(this, "Please enter valid category(consists only of English letters)!");  
            return false;
        }
        
        return true;
    }
    
    public boolean validateDescription(){
        // check whether is empty 
        String str = fieldDescription.getText();
        
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter desciption!");
            return false;
        }else if(str.equals("Enter your description here...")){
            JOptionPane.showMessageDialog(this, "Please enter desciption!");
            return false;
        }
        
        return true;
    }
    
    public boolean validateName(Person p){
        //check wether names are correct; if this person is newly created, then skip this part
        if(p.getFirstName().equals("unkown") && p.getLastName().equals("unkown")){
            return true;
        }else if(!p.getFirstName().equals(fieldFirstName.getText())){
            JOptionPane.showMessageDialog(this, "First Name is incorrect! Go to update page to update information if needed!");
            return false;
        }else if(!p.getLastName().equals(fieldLastName.getText())){
            JOptionPane.showMessageDialog(this, "Last Name is incorrect! Go to update page to update information if needed!");
            return false;
        }
        
        return true;
    }
    
    public boolean validateImage(){
        if(imageIcon == null){
            JOptionPane.showMessageDialog(this, "please upload an image!");
            return false;
        }
        
        return true;
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
        jLabel1 = new javax.swing.JLabel();
        fieldFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldUserName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldRecipeTitle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldNoOfServings = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        isGlutenFree = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fieldNoOfIngredient = new javax.swing.JTextField();
        fieldCategoryOfFood = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldDescription = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        fieldEmailID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        fieldPhone = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        fieldDifficultyLevel = new javax.swing.JTextField();
        imageField = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("FirstName");

        fieldFirstName.setBackground(new java.awt.Color(255, 255, 255));
        fieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldFirstNameActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("LastName");

        fieldLastName.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("UserName");

        fieldUserName.setBackground(new java.awt.Color(255, 255, 255));
        fieldUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldUserNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Recipe Information");

        fieldRecipeTitle.setBackground(new java.awt.Color(255, 255, 255));
        fieldRecipeTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRecipeTitleActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Recipe title");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("No. of servings");

        fieldNoOfServings.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Is gluten free");

        isGlutenFree.setForeground(new java.awt.Color(0, 0, 0));
        isGlutenFree.setText("yes");
        isGlutenFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isGlutenFreeActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Difficulty Level");

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("No. of ingredient");

        fieldNoOfIngredient.setBackground(new java.awt.Color(255, 255, 255));

        fieldCategoryOfFood.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Category of food");

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Description");

        fieldDescription.setBackground(new java.awt.Color(255, 255, 255));
        fieldDescription.setColumns(20);
        fieldDescription.setRows(5);
        fieldDescription.setText("Enter your description here...");
        jScrollPane1.setViewportView(fieldDescription);

        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Select recipe picture");

        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("email ID");

        fieldEmailID.setBackground(new java.awt.Color(255, 255, 255));
        fieldEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailIDActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("phone");

        fieldPhone.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        SubmitBtn.setBackground(new java.awt.Color(255, 153, 153));
        SubmitBtn.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(0, 0, 0));
        SubmitBtn.setText("submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });

        fieldDifficultyLevel.setBackground(new java.awt.Color(255, 255, 255));

        imageField.setBackground(new java.awt.Color(204, 204, 204));
        imageField.setOpaque(true);

        jLabel15.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Create chef information or recipe here!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(327, 327, 327)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldCategoryOfFood, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fieldNoOfServings, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(isGlutenFree)
                                            .addComponent(fieldDifficultyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(fieldNoOfIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addGap(68, 68, 68)
                                                .addComponent(jButton1))
                                            .addComponent(imageField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(162, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(fieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jButton1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fieldRecipeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(fieldNoOfServings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(isGlutenFree)))
                    .addComponent(imageField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(fieldDifficultyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldNoOfIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(fieldCategoryOfFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
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

    private void fieldEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailIDActionPerformed

    private void fieldRecipeTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRecipeTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRecipeTitleActionPerformed

    private void fieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldFirstNameActionPerformed

    private void fieldUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldUserNameActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        // 1. validate all the fields
        if(!validateUserName()) return;
        String username = fieldUserName.getText();
        
        if(!validateFirstName()) return;
        String firstname = fieldFirstName.getText();
        
        if(!validateLastName()) return ;
        String lastname = fieldLastName.getText();
        
        if(!validateEmailID()) return ;
        String emailID = fieldEmailID.getText();
        
        if(!validatePhone()) return;
        String phone = fieldPhone.getText();
        
        if(!validateRecipeTitle()) return;
        String recipetitle = fieldRecipeTitle.getText();
        
        if(!validateNoOfServing()) return;
        long noOfservings = Long.parseLong(fieldNoOfServings.getText());
        
        boolean isGlutenFree = this.isGlutenFree.isSelected() ? true:false;
        
        if(!validateDifficultyLevel()) return;
        double difficultyLevel = Double.parseDouble(fieldDifficultyLevel.getText());
        
        if(!validateNoOfIngredient()) return;
        int noofingredient = Integer.parseInt(fieldNoOfIngredient.getText());
        
        if(!validateCategoryOfFood()) return;
        String category = fieldCategoryOfFood.getText();
        
        if(!validateDescription()) return;
        String description = fieldDescription.getText();
        
        if(!validateImage()) return;

        
        // 2. get the person acording to the username Or create a new one with this username
        Person person = pc.getOrCreate(username);
        
        if(!validateName(person)) return;   // check wether names are correct; if this person is newly created, then skip this part
        person.setFirstName(firstname);
        person.setLastName(lastname);
        person.setEmailID(emailID);
        person.setPhone(phone);
        
        Recipe recipe = new Recipe(person);
        person.addRecipe(recipe);
        recipe.setTitle(recipetitle);
        recipe.setNoOfServings(noOfservings);
        recipe.setIsGlutenFree(isGlutenFree);
        recipe.setDifficultyLevel(difficultyLevel);
        recipe.setNoOfIngredient(noofingredient);
        recipe.setCategory(category);
        recipe.setDescription(description);
        recipe.setImage(imageIcon);
        
       
        
        JOptionPane.showMessageDialog(this, "Information created successfully!");
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter fef = new FileNameExtensionFilter("Image", "jpg","png","gif", "jpeg","webp");
        jf.addChoosableFileFilter(fef);
        
        int fileDialog = jf.showOpenDialog(null);
        
        if(fileDialog == JFileChooser.APPROVE_OPTION){
            File imageFile = jf.getSelectedFile();
            String imagePath = imageFile.getAbsolutePath();
            
            ImageIcon ii = new ImageIcon(imagePath);
            Image image = ii.getImage().getScaledInstance(200, 150,Image.SCALE_SMOOTH );
            imageIcon = new ImageIcon(image) ;
            imageField.setIcon(imageIcon);
            
            System.out.println(imagePath);
            
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void isGlutenFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isGlutenFreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isGlutenFreeActionPerformed

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
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JTextField fieldCategoryOfFood;
    private javax.swing.JTextArea fieldDescription;
    private javax.swing.JTextField fieldDifficultyLevel;
    private javax.swing.JTextField fieldEmailID;
    private javax.swing.JTextField fieldFirstName;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldNoOfIngredient;
    private javax.swing.JTextField fieldNoOfServings;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JTextField fieldRecipeTitle;
    private javax.swing.JTextField fieldUserName;
    private javax.swing.JLabel imageField;
    private javax.swing.JCheckBox isGlutenFree;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
