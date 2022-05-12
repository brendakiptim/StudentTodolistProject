/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todolistfinal.views;

import java.awt.Color;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import todolistfinal.Utils;
import todolistfinal.dbConnection;
import java.util.Arrays;
/**
 *
 * @author kiptim
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginContainer = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nameInput = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordInput = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        confirmPasswordLabel = new javax.swing.JLabel();
        confirmPasswordInput = new javax.swing.JPasswordField();
        confirmLabel = new javax.swing.JLabel();
        roleInput = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        loginText = new javax.swing.JLabel();
        loginBtn = new javax.swing.JLabel();
        signUpStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(235, 94, 40));
        jPanel1.setPreferredSize(new java.awt.Dimension(749, 130));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STUDENT TODOLIST");
        jLabel1.setPreferredSize(new java.awt.Dimension(363, 42));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(302, 302, 302)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("SIGN UP");

        backgroundImage.setBackground(new java.awt.Color(255, 255, 255));
        backgroundImage.setPreferredSize(new java.awt.Dimension(546, 536));

        javax.swing.GroupLayout backgroundImageLayout = new javax.swing.GroupLayout(backgroundImage);
        backgroundImage.setLayout(backgroundImageLayout);
        backgroundImageLayout.setHorizontalGroup(
            backgroundImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
        );
        backgroundImageLayout.setVerticalGroup(
            backgroundImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIGN UP");

        nameInput.setPreferredSize(new java.awt.Dimension(64, 24));

        usernameLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        usernameLabel.setLabelFor(nameInput);
        usernameLabel.setText("Username:");

        passwordLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        passwordLabel.setLabelFor(passwordLabel);
        passwordLabel.setText("Password:");

        confirmPasswordLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N

        confirmLabel.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        confirmLabel.setText("Confirm:");

        roleInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "user" }));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setLabelFor(roleInput);
        jLabel3.setText("Role:");

        submitBtn.setBackground(new java.awt.Color(235, 94, 40));
        submitBtn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        submitBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        cancelBtn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        cancelBtn.setLabel("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        loginText.setFont(new java.awt.Font("Ubuntu", 0, 15)); // NOI18N
        loginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginText.setText("Already have an account?");

        loginBtn.setBackground(new java.awt.Color(235, 94, 40));
        loginBtn.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(235, 94, 40));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("LOGIN");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });

        signUpStatus.setBackground(new java.awt.Color(204, 0, 0));
        signUpStatus.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        signUpStatus.setForeground(new java.awt.Color(255, 51, 51));
        signUpStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout loginContainerLayout = new javax.swing.GroupLayout(loginContainer);
        loginContainer.setLayout(loginContainerLayout);
        loginContainerLayout.setHorizontalGroup(
            loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1071, Short.MAX_VALUE)
            .addGroup(loginContainerLayout.createSequentialGroup()
                .addComponent(backgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginContainerLayout.createSequentialGroup()
                        .addGap(0, 85, Short.MAX_VALUE)
                        .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(loginContainerLayout.createSequentialGroup()
                                .addComponent(confirmPasswordLabel)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginContainerLayout.createSequentialGroup()
                                .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(loginContainerLayout.createSequentialGroup()
                                        .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(loginContainerLayout.createSequentialGroup()
                                        .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(confirmLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(signUpStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                                    .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(loginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(loginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(confirmPasswordInput)
                                        .addComponent(roleInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginContainerLayout.createSequentialGroup()
                                            .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(76, 76, 76))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginContainerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(166, 166, 166))))
        );
        loginContainerLayout.setVerticalGroup(
            loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginContainerLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginContainerLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginText)
                        .addGap(0, 0, 0)
                        .addComponent(loginBtn)
                        .addGap(18, 18, 18)
                        .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordLabel))
                        .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(loginContainerLayout.createSequentialGroup()
                                .addComponent(confirmPasswordLabel)
                                .addGap(18, 18, 18)
                                .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(confirmPasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmLabel))
                                .addGap(69, 69, 69))
                            .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(roleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(signUpStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(loginContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37))))
        );

        usernameLabel.getAccessibleContext().setAccessibleName("NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
//        create new user details
                Utils allTasks = new Utils();

        String username = nameInput.getText();
        char[] password = passwordInput.getPassword();
         String encriptedPassword = allTasks.encryptPass(new String(password));
        System.out.println("encripted" + encriptedPassword.toCharArray());
        
        char[] confirmPassword = confirmPasswordInput.getPassword();
        String role = roleInput.getSelectedItem().toString();
//        try {
//            hashedPassword(password);
//        } catch (NoSuchAlgorithmException e) {
//            System.out.println("error hashing" + e.getMessage());
//        }
//check if username and password are empty

        if (username.isEmpty() || username.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Please input username!");
        } else if (password.length < 1 || password.length < 1) {
            JOptionPane.showMessageDialog(rootPane, "Please input password!");
        } else if (role.isEmpty() || role.isBlank()) {
            JOptionPane.showMessageDialog(rootPane, "Please input your role!");

        } else if (confirmPassword.length < 1 || confirmPassword.length < 1) {
            JOptionPane.showMessageDialog(rootPane, "Please confirm the  password!");

        } else if (!Arrays.equals(password,confirmPassword)) {
            JOptionPane.showMessageDialog(rootPane, "The two password do not match! Please try again");

        } else {

            try {
                //Instantiate DbConnection class to use the connection
                dbConnection stayconnected = new dbConnection();
                stayconnected.getConnection();
                //Execute the statement
                ResultSet rs = allTasks.createUser(username, encriptedPassword, role);
                //Handle the results in the Resultset here if needed
                if (rs.next()) {
                    signUpStatus.setText("Successful Sign");
                    this.dispose();
                    Login newPage = new Login();
                    newPage.setVisible(true);
                } else {
                    signUpStatus.setText("UnSuccessful signup");
                    signUpStatus.setForeground(Color.red);

                }
                //Close the connection
                stayconnected.con.close();
            } catch (SQLException error) {
                System.out.println("Error! See below details \n");
                System.out.println(error);
            }

        }

    }//GEN-LAST:event_submitBtnActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // redirect to the login page
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_loginBtnMouseClicked

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // remove the page from the screen
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundImage;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JPasswordField confirmPasswordInput;
    private javax.swing.JLabel confirmPasswordLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginBtn;
    private javax.swing.JPanel loginContainer;
    private javax.swing.JLabel loginText;
    private javax.swing.JTextField nameInput;
    private javax.swing.JPasswordField passwordInput;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JComboBox<String> roleInput;
    private javax.swing.JLabel signUpStatus;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
