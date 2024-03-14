/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FRAMES;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class Admission_SystemFrame extends javax.swing.JFrame {

    /**
     * Creates new form Admission_System
     */
    public Admission_SystemFrame() {
        initComponents();
         java.awt.Toolkit kit=this.getToolkit();
        java.awt.Dimension d=kit.getScreenSize();
        this.setBounds(0,0,d.width,d.height);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        facultyButton = new javax.swing.JButton();
        departmentButton = new javax.swing.JButton();
        programButton = new javax.swing.JButton();
        batchButton = new javax.swing.JButton();
        studentButton = new javax.swing.JButton();
        partButton = new javax.swing.JButton();
        teacherButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setTitle("UniversityOf Sindh");
        setBackground(new java.awt.Color(0, 0, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" ADMISSION SYSTEM");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 330, 40));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText(" U N I V E R S I T Y   O F    S I N D H");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 740, -1));

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 0, 0));
        exitButton.setText("EXIT");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 200, 70));

        facultyButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        facultyButton.setText("FACULTY");
        facultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(facultyButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, 200, 50));

        departmentButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        departmentButton.setText("DEPARTMENT");
        departmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(departmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 200, 50));

        programButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        programButton.setText("PROGRAM");
        programButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programButtonActionPerformed(evt);
            }
        });
        getContentPane().add(programButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 200, 50));

        batchButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        batchButton.setText("BATCH");
        batchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(batchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 200, 50));

        studentButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        studentButton.setText("STUDENT");
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        getContentPane().add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 200, 50));

        partButton.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        partButton.setText("PART");
        partButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partButtonActionPerformed(evt);
            }
        });
        getContentPane().add(partButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 500, 200, 50));

        teacherButton1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        teacherButton1.setText("TEACHER");
        teacherButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(teacherButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 200, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\JAVA_Programs_A_To_Z\\DataBase\\university-of-sindh (1) (2) (1) (1).jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void facultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyButtonActionPerformed
        // TODO add your handling code here:
          FacultyFrame ob= null;
        try {
            ob = new FacultyFrame();
        } catch (Exception ex) {
            Logger.getLogger(Admission_SystemFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        ob.show();
    }//GEN-LAST:event_facultyButtonActionPerformed

    private void departmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentButtonActionPerformed
        // TODO add your handling code here:
        DepartmentFrame ob=new DepartmentFrame();
        ob.show();
    }//GEN-LAST:event_departmentButtonActionPerformed

    private void programButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programButtonActionPerformed
        // TODO add your handling code here:
           ProgramFrame ob=new ProgramFrame();
        ob.show();
    }//GEN-LAST:event_programButtonActionPerformed

    private void batchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchButtonActionPerformed
        // TODO add your handling code here:
         BatchFrame ob=new BatchFrame();
        ob.show();
    }//GEN-LAST:event_batchButtonActionPerformed

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        // TODO add your handling code here:
         StudentFrame ob=new StudentFrame();
        ob.show();
    }//GEN-LAST:event_studentButtonActionPerformed

    private void partButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partButtonActionPerformed
        // TODO add your handling code here:
          PartFrame ob=new PartFrame();
        ob.show();
    }//GEN-LAST:event_partButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void teacherButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherButton1ActionPerformed
        // TODO add your handling code here:
        
        TeacherFrame ob=new TeacherFrame   ();
        ob.show();
    }//GEN-LAST:event_teacherButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admission_SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admission_SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admission_SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admission_SystemFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admission_SystemFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batchButton;
    private javax.swing.JButton departmentButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton facultyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton partButton;
    private javax.swing.JButton programButton;
    private javax.swing.JButton studentButton;
    private javax.swing.JButton teacherButton1;
    // End of variables declaration//GEN-END:variables
}