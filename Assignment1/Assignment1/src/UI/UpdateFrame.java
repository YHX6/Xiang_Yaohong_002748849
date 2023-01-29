/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Model.*;
import javax.swing.JOptionPane;
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
public class UpdateFrame extends javax.swing.JFrame {
    ImageIcon imageIcon;
    PersonCatelog pc;

    /**
     * Creates new form UpdateFrame
     */
    public UpdateFrame() {
        initComponents();
    }
    
    public void setPersonCatelog(PersonCatelog pc){
        this.pc = pc;
    }

     public Person validatePersonalInfor(){
        String str = fieldUserName1.getText();
        
        // 1. is empty
        if(str.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your userName!");
            return null;
        }else if(!str.matches("[A-Za-z0-9_$]*")){   // 2. if contains only letters, digit, _, $
            JOptionPane.showMessageDialog(this, "Please enter valid userName(consists of only letters, digit, _, $!");  
            return null;
        }else{ // check if this user exist
            Person p = pc.getPerson(str);
            if(p == null){
                JOptionPane.showMessageDialog(this, "User not found!");
                return null;
            }else{
                return p;
            }
            
        }
        
    }
     
     
     
    public Recipe validateRecipeInfor(){
        String username = fieldUserName2.getText();
        String recipetile = fieldRecipeName.getText();
        
        // 1. is empty
        if(username.trim().isEmpty() || recipetile.trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter your userName and recipe name!");
            return null;
        }else if(!username.matches("[A-Za-z0-9_$]*")){   // 2. if contains only letters, digit, _, $
            JOptionPane.showMessageDialog(this, "Please enter valid userName(consists of only letters, digit, _, $!");  
            return null;
        }else{ // check if this user exist
            Person p = pc.getPerson(username);
            if(p == null){
                JOptionPane.showMessageDialog(this, "User not found!");
                return null;
            }
            
            Recipe recipe = p.findRecipe(recipetile);
            if(recipe == null){
                JOptionPane.showMessageDialog(this, "Recipe not found!");
                return null;
            }
            
            return recipe;
            
            
            
        }
        
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
        String str = fieldCategory.getText();
        
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldUserName1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        checkFirstName = new javax.swing.JCheckBox();
        fieldFirstName = new javax.swing.JTextField();
        checkLastName = new javax.swing.JCheckBox();
        fieldLastName = new javax.swing.JTextField();
        checkEmailID = new javax.swing.JCheckBox();
        fieldEmailID = new javax.swing.JTextField();
        checkPhone = new javax.swing.JCheckBox();
        fieldPhone = new javax.swing.JTextField();
        PersonInfoBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldUserName2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fieldRecipeName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        checkNoOfServings = new javax.swing.JCheckBox();
        fieldNoOfServings = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        isGlutenFree = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        fieldDifficultyLevel = new javax.swing.JTextField();
        checkDifficultyLevel = new javax.swing.JCheckBox();
        checkNoOfIngredient = new javax.swing.JCheckBox();
        fieldNoOfIngredient = new javax.swing.JTextField();
        checkCategory = new javax.swing.JCheckBox();
        fieldCategory = new javax.swing.JTextField();
        checkDescription = new javax.swing.JCheckBox();
        checkPicture = new javax.swing.JCheckBox();
        UploadImage = new javax.swing.JButton();
        fieldPicture = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldDescription = new javax.swing.JTextArea();
        RecipeInfoBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 600));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Update your Personal Info");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Enter your username:");

        fieldUserName1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Update your information:");

        checkFirstName.setForeground(new java.awt.Color(0, 0, 0));
        checkFirstName.setText("FirstName");

        fieldFirstName.setBackground(new java.awt.Color(255, 255, 255));

        checkLastName.setForeground(new java.awt.Color(0, 0, 0));
        checkLastName.setText("LastName");

        fieldLastName.setBackground(new java.awt.Color(255, 255, 255));

        checkEmailID.setForeground(new java.awt.Color(0, 0, 0));
        checkEmailID.setText("email ID");

        fieldEmailID.setBackground(new java.awt.Color(255, 255, 255));

        checkPhone.setForeground(new java.awt.Color(0, 0, 0));
        checkPhone.setText("Phone");

        fieldPhone.setBackground(new java.awt.Color(255, 255, 255));

        PersonInfoBtn.setBackground(new java.awt.Color(255, 153, 153));
        PersonInfoBtn.setForeground(new java.awt.Color(0, 0, 0));
        PersonInfoBtn.setText("submit");
        PersonInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PersonInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldLastName))
                            .addComponent(jLabel3)
                            .addComponent(fieldUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(checkFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldFirstName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkEmailID)
                                    .addComponent(checkPhone))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldEmailID)
                                    .addComponent(fieldPhone)))
                            .addComponent(PersonInfoBtn))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(fieldUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFirstName)
                    .addComponent(fieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkLastName)
                    .addComponent(fieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkEmailID)
                    .addComponent(fieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkPhone)
                    .addComponent(fieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(PersonInfoBtn)
                .addGap(41, 41, 41))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 600));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Update your Recipe Information");

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Enter your username and recipe title:");

        fieldUserName2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Username");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Recipe name");

        fieldRecipeName.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Update your recipe information");

        checkNoOfServings.setForeground(new java.awt.Color(0, 0, 0));
        checkNoOfServings.setText("No. of servings");
        checkNoOfServings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNoOfServingsActionPerformed(evt);
            }
        });

        fieldNoOfServings.setBackground(new java.awt.Color(255, 255, 255));

        isGlutenFree.setBackground(new java.awt.Color(255, 255, 255));
        isGlutenFree.setForeground(new java.awt.Color(0, 0, 0));
        isGlutenFree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " --- choose to update ---", "yes", "no" }));
        isGlutenFree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isGlutenFreeActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("is gluten free");

        fieldDifficultyLevel.setBackground(new java.awt.Color(255, 255, 255));

        checkDifficultyLevel.setForeground(new java.awt.Color(0, 0, 0));
        checkDifficultyLevel.setText("Difficulty level");

        checkNoOfIngredient.setForeground(new java.awt.Color(0, 0, 0));
        checkNoOfIngredient.setText("No. of ingredient");

        fieldNoOfIngredient.setBackground(new java.awt.Color(255, 255, 255));

        checkCategory.setForeground(new java.awt.Color(0, 0, 0));
        checkCategory.setText("category of food");

        fieldCategory.setBackground(new java.awt.Color(255, 255, 255));

        checkDescription.setForeground(new java.awt.Color(0, 0, 0));
        checkDescription.setText("Description");

        checkPicture.setForeground(new java.awt.Color(0, 0, 0));
        checkPicture.setText("Picture");

        UploadImage.setText("Upload");
        UploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImageActionPerformed(evt);
            }
        });

        fieldPicture.setBackground(new java.awt.Color(204, 204, 204));
        fieldPicture.setForeground(new java.awt.Color(204, 204, 204));
        fieldPicture.setText("jLabel11");
        fieldPicture.setOpaque(true);

        fieldDescription.setBackground(new java.awt.Color(255, 255, 255));
        fieldDescription.setColumns(20);
        fieldDescription.setRows(5);
        jScrollPane2.setViewportView(fieldDescription);

        RecipeInfoBtn.setBackground(new java.awt.Color(255, 153, 153));
        RecipeInfoBtn.setForeground(new java.awt.Color(0, 0, 0));
        RecipeInfoBtn.setText("submit");
        RecipeInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecipeInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RecipeInfoBtn)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkNoOfIngredient)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel10)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(isGlutenFree, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(fieldNoOfIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(checkCategory)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(UploadImage)
                                        .addComponent(fieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkDescription)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(47, 47, 47)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(checkPicture)
                                .addComponent(fieldPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(checkNoOfServings)
                                    .addGap(18, 18, 18)
                                    .addComponent(fieldNoOfServings, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(checkDifficultyLevel)
                                    .addGap(27, 27, 27))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(fieldUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fieldRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(54, 54, 54))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(296, 296, 296))))
                            .addComponent(fieldDifficultyLevel))))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldUserName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(fieldRecipeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkNoOfServings)
                    .addComponent(fieldNoOfServings, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkDifficultyLevel)
                    .addComponent(fieldDifficultyLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkNoOfIngredient)
                    .addComponent(fieldNoOfIngredient, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkCategory)
                    .addComponent(fieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(isGlutenFree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkDescription)
                            .addComponent(checkPicture)
                            .addComponent(UploadImage)))
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(RecipeInfoBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void isGlutenFreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isGlutenFreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isGlutenFreeActionPerformed

    private void checkNoOfServingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNoOfServingsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkNoOfServingsActionPerformed

    private void PersonInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PersonInfoBtnActionPerformed
        // TODO add your handling code here:
        
        boolean infoChanged = false;
        
        // find the person
        Person person = validatePersonalInfor();
        if(person == null) return ;
        
        if(checkFirstName.isSelected()){
            if(!validateFirstName()) return;
            person.setFirstName(fieldFirstName.getText());
            infoChanged = true;
        }
        
        if(checkLastName.isSelected()){
            if(!validateLastName()) return ;
            person.setLastName(fieldLastName.getText());
            infoChanged = true;
        }
        
        if(checkEmailID.isSelected()){
            if(!validateEmailID()) return;
            person.setEmailID(fieldEmailID.getText());
            infoChanged = true;
        }
        
        if(checkPhone.isSelected()){
            if(!validatePhone()) return ;
            person.setPhone(fieldPhone.getText());
            infoChanged = true;
        }
        
        // output: if we update successfully
        if(infoChanged == true){
            JOptionPane.showMessageDialog(this, "Updated successfully!");
        }else{
            JOptionPane.showMessageDialog(this, "Please enter the field that you want to update!");
        }
        
        
    }//GEN-LAST:event_PersonInfoBtnActionPerformed

    private void RecipeInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecipeInfoBtnActionPerformed
        // TODO add your handling code here:
        
        
        Recipe recipe = validateRecipeInfor();
        if(recipe == null) return ;
        
        boolean infoChanged = false;
        
        if(checkNoOfServings.isSelected()){
            if(!validateNoOfServing()) return ;
            recipe.setNoOfServings(Long.parseLong(fieldNoOfServings.getText()));
            infoChanged = true;
        }
        
        
        if(checkDifficultyLevel.isSelected()){
            if(!validateDifficultyLevel()) return ;
            recipe.setDifficultyLevel(Double.parseDouble(fieldDifficultyLevel.getText()));
            infoChanged = true;
        }
        
        if(checkNoOfIngredient.isSelected()){
            if(!validateNoOfIngredient()) return ;
            recipe.setNoOfIngredient(Integer.parseInt(fieldNoOfIngredient.getText()));
            infoChanged = true;
        }
        
        if(checkCategory.isSelected()){
            if(!validateCategoryOfFood()) return ;
            recipe.setCategory(fieldCategory.getText());
            infoChanged = true;
        }
        
        if(isGlutenFree.getSelectedIndex() == 1){
            recipe.setIsGlutenFree(true);
            infoChanged = true;
        }else if(isGlutenFree.getSelectedIndex() == 2){
            recipe.setIsGlutenFree(false);
            infoChanged = true;
        }
        
        if(checkDescription.isSelected()){
            if(!validateDescription()) return ;
            recipe.setDescription(fieldDescription.getText());
            infoChanged = true;
        }
        
        if(checkPicture.isSelected()){
            recipe.setImage(imageIcon);
            infoChanged = true;
        }
        
        // output: if we update sucessfully
        if(infoChanged == true){
            JOptionPane.showMessageDialog(this, "Updated successfully!");
        }else{
            JOptionPane.showMessageDialog(this, "Please enter the field that you want to update!");
        }
    }//GEN-LAST:event_RecipeInfoBtnActionPerformed

    private void UploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImageActionPerformed
        // TODO add your handling code here:
        JFileChooser jf = new JFileChooser();
        FileNameExtensionFilter fnf = new FileNameExtensionFilter("Image", "jpg", "png","jpeg");
        jf.addChoosableFileFilter(fnf);
        
        int fileDialog = jf.showOpenDialog(null);
        
        if(fileDialog == JFileChooser.APPROVE_OPTION){
            File imageFile = jf.getSelectedFile();
            String imagePath = imageFile.getAbsolutePath();
            
            ImageIcon ii = new ImageIcon(imagePath);
            Image image = ii.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            imageIcon = new ImageIcon(image);
            
            fieldPicture.setIcon(imageIcon);
        }
    }//GEN-LAST:event_UploadImageActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PersonInfoBtn;
    private javax.swing.JButton RecipeInfoBtn;
    private javax.swing.JButton UploadImage;
    private javax.swing.JCheckBox checkCategory;
    private javax.swing.JCheckBox checkDescription;
    private javax.swing.JCheckBox checkDifficultyLevel;
    private javax.swing.JCheckBox checkEmailID;
    private javax.swing.JCheckBox checkFirstName;
    private javax.swing.JCheckBox checkLastName;
    private javax.swing.JCheckBox checkNoOfIngredient;
    private javax.swing.JCheckBox checkNoOfServings;
    private javax.swing.JCheckBox checkPhone;
    private javax.swing.JCheckBox checkPicture;
    private javax.swing.JTextField fieldCategory;
    private javax.swing.JTextArea fieldDescription;
    private javax.swing.JTextField fieldDifficultyLevel;
    private javax.swing.JTextField fieldEmailID;
    private javax.swing.JTextField fieldFirstName;
    private javax.swing.JTextField fieldLastName;
    private javax.swing.JTextField fieldNoOfIngredient;
    private javax.swing.JTextField fieldNoOfServings;
    private javax.swing.JTextField fieldPhone;
    private javax.swing.JLabel fieldPicture;
    private javax.swing.JTextField fieldRecipeName;
    private javax.swing.JTextField fieldUserName1;
    private javax.swing.JTextField fieldUserName2;
    private javax.swing.JComboBox<String> isGlutenFree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
