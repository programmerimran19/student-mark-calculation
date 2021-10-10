/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Programmer Imran
 */
public class studentmarkscalculation extends javax.swing.JFrame {

    public studentmarkscalculation() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtoop = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtooplab = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtdbms = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtdbmslab = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txteee = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtged = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txttotalmarks = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtgpa = new javax.swing.JTextField();
        Calculation1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtaverage = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtname1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtgrade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Student Marks Calculation System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel11.setText("Course Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 107, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel12.setText("OOP");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 40, -1));
        getContentPane().add(txtoop, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 110, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel13.setText("OOP Lab");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));
        getContentPane().add(txtooplab, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 110, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel14.setText("DBMS");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));
        getContentPane().add(txtdbms, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 110, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel15.setText("DBMS Lab");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));
        getContentPane().add(txtdbmslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 110, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel16.setText("EEE");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 30, -1));
        getContentPane().add(txteee, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 110, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel17.setText("GED");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 30, -1));
        getContentPane().add(txtged, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 110, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel18.setText("Total Marks");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 70, -1));
        getContentPane().add(txttotalmarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 110, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel19.setText("GPA");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 30, -1));
        getContentPane().add(txtgpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 110, -1));

        Calculation1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Calculation1.setText("Calculation");
        Calculation1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculation1ActionPerformed(evt);
            }
        });
        getContentPane().add(Calculation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Student ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 59, -1, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 63, 232, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel3.setText("Average");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 60, -1));
        getContentPane().add(txtaverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 110, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel20.setText("Marks");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 59, -1));
        getContentPane().add(txtname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 93, 232, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Student Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 89, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel21.setText("Grade");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 410, 40, -1));
        getContentPane().add(txtgrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, 110, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Calculation1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculation1ActionPerformed
        
        int a = Integer.parseInt(txtoop.getText());
        int b = Integer.parseInt(txtooplab.getText());
        int c = Integer.parseInt(txtdbms.getText());
        int d = Integer.parseInt(txtdbmslab.getText());
        int e = Integer.parseInt(txteee.getText());
        int f = Integer.parseInt(txtged.getText());
        
        int total = (a + b + c + d + e + f);
        txttotalmarks.setText(String.valueOf(total));
        
        int avg = total / 6;
        txtaverage.setText(String.valueOf(avg));
        
        
        
        if(avg >=80)
        {
            //System.out.println("A+");
            txtgrade.setText("A+");
            txtgpa.setText("4.00");
        }
        else if(avg >=75)
        {
            //System.out.println("A");
            txtgrade.setText("A");
            txtgpa.setText("3.75");
        }
        else if(avg >=70)
        {
            //System.out.println("A-");
            txtgrade.setText("A-");
            txtgpa.setText("3.50");
        }
        else if(avg >=60)
        {
            //System.out.println("B+");
            txtgrade.setText("B+");
            txtgpa.setText("3.25");
        }
        else if(avg >=55)
        {
            //System.out.println("B");
            txtgrade.setText("B");
            txtgpa.setText("3.00");
        }
        else if(avg >=50)
        {
            //System.out.println("C");
            txtgrade.setText("C");
            txtgpa.setText("2.75");
        }
        else if(avg >=45)
        {
            //System.out.println("D");
            txtgrade.setText("D");
            txtgpa.setText("2.50");
        }
        else
        {
            //System.out.println("F");
            txtgrade.setText("F");
            txtgpa.setText("0.00");
            
        }
        
        
        
        
        
        
        
        
        
        
        //txtTotal.setText(String.valueOf(tot));
        
    }//GEN-LAST:event_Calculation1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentmarkscalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentmarkscalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentmarkscalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentmarkscalculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentmarkscalculation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculation1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtaverage;
    private javax.swing.JTextField txtdbms;
    private javax.swing.JTextField txtdbmslab;
    private javax.swing.JTextField txteee;
    private javax.swing.JTextField txtged;
    private javax.swing.JTextField txtgpa;
    private javax.swing.JTextField txtgrade;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtname1;
    private javax.swing.JTextField txtoop;
    private javax.swing.JTextField txtooplab;
    private javax.swing.JTextField txttotalmarks;
    // End of variables declaration//GEN-END:variables
}
