/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package todolistfinal.views;

import todolistfinal.*;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author kiptim
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {

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

        mainContainer = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        tasksContainer = new javax.swing.JPanel();
        pendingItemsContainer = new javax.swing.JPanel();
        pendingItemsLabel = new javax.swing.JLabel();
        pendingTaskCheckBox = new javax.swing.JCheckBox();
        addTodoListItem = new javax.swing.JLabel();
        HomebackgroundImage = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("container");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        mainContainer.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(0, 0, 0));

        title.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        title.setForeground(new java.awt.Color(235, 94, 40));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("TODOLIST");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(429, 429, 429))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pendingItemsLabel.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        pendingItemsLabel.setText("Pending Tasks:");

        pendingTaskCheckBox.setFont(new java.awt.Font("Liberation Sans", 2, 18)); // NOI18N
        pendingTaskCheckBox.setSelected(true);
        pendingTaskCheckBox.setText("this is  a pending todo item");
        pendingTaskCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pendingTaskCheckBoxActionPerformed(evt);
            }
        });

        addTodoListItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/addIcon.png"))); // NOI18N
        addTodoListItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTodoListItemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pendingItemsContainerLayout = new javax.swing.GroupLayout(pendingItemsContainer);
        pendingItemsContainer.setLayout(pendingItemsContainerLayout);
        pendingItemsContainerLayout.setHorizontalGroup(
            pendingItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingItemsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pendingItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pendingItemsContainerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pendingTaskCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(265, Short.MAX_VALUE))
                    .addGroup(pendingItemsContainerLayout.createSequentialGroup()
                        .addComponent(pendingItemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addTodoListItem)
                        .addGap(26, 26, 26))))
        );
        pendingItemsContainerLayout.setVerticalGroup(
            pendingItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingItemsContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pendingItemsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pendingItemsLabel)
                    .addComponent(addTodoListItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pendingTaskCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tasksContainerLayout = new javax.swing.GroupLayout(tasksContainer);
        tasksContainer.setLayout(tasksContainerLayout);
        tasksContainerLayout.setHorizontalGroup(
            tasksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksContainerLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(pendingItemsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tasksContainerLayout.setVerticalGroup(
            tasksContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tasksContainerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(pendingItemsContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        HomebackgroundImage.setBackground(new java.awt.Color(235, 94, 40));

        javax.swing.GroupLayout HomebackgroundImageLayout = new javax.swing.GroupLayout(HomebackgroundImage);
        HomebackgroundImage.setLayout(HomebackgroundImageLayout);
        HomebackgroundImageLayout.setHorizontalGroup(
            HomebackgroundImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        HomebackgroundImageLayout.setVerticalGroup(
            HomebackgroundImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainContainerLayout = new javax.swing.GroupLayout(mainContainer);
        mainContainer.setLayout(mainContainerLayout);
        mainContainerLayout.setHorizontalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addComponent(HomebackgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tasksContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        mainContainerLayout.setVerticalGroup(
            mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainContainerLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(mainContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tasksContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HomebackgroundImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(mainContainer);
        renderTodolists();

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void pendingTaskCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pendingTaskCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pendingTaskCheckBoxActionPerformed

    private void addTodoListItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTodoListItemMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_addTodoListItemMouseClicked

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HomebackgroundImage;
    private javax.swing.JLabel addTodoListItem;
    private javax.swing.JPanel header;
    private javax.swing.JPanel mainContainer;
    private javax.swing.JPanel pendingItemsContainer;
    private javax.swing.JLabel pendingItemsLabel;
    private javax.swing.JCheckBox pendingTaskCheckBox;
    private javax.swing.JPanel tasksContainer;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void renderTodolists() {
        Utils allTasks = new Utils();
        ResultSet tasks = allTasks.fetchTodos();
        try {
            while (tasks.next()) {

                System.out.println("tasks: " + tasks.getString("name"));
                JCheckBox newCheckBox = new JCheckBox("new one");

                newCheckBox.setText(tasks.getString("name"));
                newCheckBox.setSelected(false);
                mainContainer.add(newCheckBox);
                newCheckBox.setVisible(true);
            }
        } catch (SQLException e) {
            System.out.println("error getting tasks: " + e.getMessage());
        }
    }
}
