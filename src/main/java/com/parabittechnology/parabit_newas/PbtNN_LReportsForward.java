/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.parabittechnology.parabit_newas;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mritunjay Singh
 */
public class PbtNN_LReportsForward extends javax.swing.JDialog {
ParabitDB fetch,recieve,tableData,appr,reVerify;
String fromInsp ="P";
String fromZonal="Z";
String fromHeadQ="H";
String recieved;
    /**
     * Creates new form PbtNN_LReportsForward
     */
    public PbtNN_LReportsForward(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public PbtNN_LReportsForward(ParabitDB rec)
    {
        //*Inspector
        //* Its from Inspector
        recieve =rec;
        fetch = new ParabitDB();
        tableData = new ParabitDB();
        appr = new ParabitDB();
        reVerify = new ParabitDB();
        initComponents();
        additional(fromInsp);
        
     
    }
    public PbtNN_LReportsForward(ParabitDB rec , String re)
    {
        //*ZONAL DASHBOARD
        //*its from Zonal DashBoard
        recieve = rec;
        fetch = new ParabitDB();
        tableData = new ParabitDB();
        reVerify = new ParabitDB();
        initComponents();
        additional(fromZonal);
        jTabbedPane1.setEnabledAt(1,false);
        
    }
    public PbtNN_LReportsForward(ParabitDB recc, String empid, String workProfile)
    {
        //*HEADQUATER
        //it is of HeadQ Sara Khel Yhiii hai
        recieve= recc;
        fetch = new ParabitDB();
        tableData = new ParabitDB();
        appr = new ParabitDB();
        reVerify = new ParabitDB();
        initComponents();
        additional(fromHeadQ);
         jTabbedPane1.setEnabledAt(1,false);
    }
    
    public void additional(String r)
    {
        this.setTitle("REPORT FORWARD");
         recieved = r;
        System.out.println("helllooooo");
        DefaultTableModel model =(DefaultTableModel)jTableToSend1.getModel();
        model.setRowCount(0);
        try
        {
         String d = "Select * from landdata where Status ='"+recieved+"'";
         PreparedStatement pt = fetch.con.prepareStatement(d);
         fetch.rs= pt.executeQuery();
         while(fetch.rs.next())
         {
          int STCode = fetch.rs.getInt("STCode");
          int DTCode = fetch.rs.getInt("DTCode");
          int landId = fetch.rs.getInt("Land_Id");
          String landType = fetch.rs.getString("LandType");
          String landPurpose = fetch.rs.getString("LandPurpose");
          System.out.println(landId);
          model.addRow(new Object[]{STCode,DTCode,landId,landType,landPurpose});
           
         }  
        }catch(Exception e)
        {
         System.out.println(e);
        }
        //Another block    of code{}
        
        System.out.println("Reverify Table From here");
        DefaultTableModel model1 = (DefaultTableModel)JTableReVerify.getModel();
        model1.setRowCount(0);
        try{
            String verify = "Select * from landdata where Status='R'";
            PreparedStatement pst = fetch.con.prepareStatement(verify);
            fetch.rs= pst.executeQuery();
            while(fetch.rs.next())
            {
                int verifyLandId = fetch.rs.getInt("Land_Id");
                String inspDate = fetch.rs.getString("InspTime");
                String comment = fetch.rs.getString("Comment");
                model1.addRow(new Object[]{verifyLandId,inspDate,comment});
                
                
            }
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableToSend1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableReVerify = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lLandId = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        latistart = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTableToSend1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableToSend1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ST CODE", "DT Code", "LANDID", "LAND TYPE", "LAND PURPOSE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableToSend1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableToSend1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableToSend1);
        if (jTableToSend1.getColumnModel().getColumnCount() > 0) {
            jTableToSend1.getColumnModel().getColumn(0).setResizable(false);
            jTableToSend1.getColumnModel().getColumn(1).setResizable(false);
            jTableToSend1.getColumnModel().getColumn(2).setResizable(false);
            jTableToSend1.getColumnModel().getColumn(3).setResizable(false);
            jTableToSend1.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("PENDING", jPanel1);

        JTableReVerify.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        JTableReVerify.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Land Id", "Insp Date", "REASON"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableReVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableReVerifyMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTableReVerify);
        if (JTableReVerify.getColumnModel().getColumnCount() > 0) {
            JTableReVerify.getColumnModel().getColumn(0).setResizable(false);
            JTableReVerify.getColumnModel().getColumn(1).setResizable(false);
            JTableReVerify.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("RESUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Land Id");

        lLandId.setText(".");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("START"));

        jLabel2.setText("LATITUTE START");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(latistart, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(latistart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("END"));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lLandId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(lLandId))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("REVERIFY", jPanel2);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("<");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableToSend1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableToSend1MouseClicked
        DefaultTableModel model1 = (DefaultTableModel)jTableToSend1.getModel();
        String landIdo = model1.getValueAt(jTableToSend1.getSelectedRow(),2).toString();
        System.out.println("1 IM HERE");
        try
        {
            String s = "Select * from  landdata where Land_Id ='"+landIdo+"'";
            PreparedStatement pst = tableData.con.prepareStatement(s);
            tableData.rs= pst.executeQuery();
            if(tableData.rs.next())
            {
                PbtNN_ReportData reportData = new PbtNN_ReportData(tableData,recieved);
                reportData.setVisible(true);

            }else
            {
                JOptionPane.showMessageDialog(this,"Some Thing Went Wrong");
                this.dispose();
            }

        }catch(Exception e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTableToSend1MouseClicked

    private void JTableReVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableReVerifyMouseClicked
        DefaultTableModel mdl = (DefaultTableModel)JTableReVerify.getModel();
        String landId = mdl.getValueAt(JTableReVerify.getSelectedRow(),0).toString();
        String fetch = "Select * from landdata where Land_Id='"+landId+"'";
        try{
           PreparedStatement pst = reVerify.con.prepareStatement(fetch);
           reVerify.rs= pst.executeQuery();
           if(reVerify.rs.next())
           {
               int lId = reVerify.rs.getInt("Land_Id");
               lLandId.setText(lId+"");
               String latiX1 = reVerify.rs.getString("LatX1");
               latistart.setText(latiX1);
               
               
               //here i have to show data to text field
               
               
               
               
           }
           
        }catch(Exception e)
        {
          System.out.println(e);  
        }
    }//GEN-LAST:event_JTableReVerifyMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model1 = (DefaultTableModel)JTableReVerify.getModel();
        String landId = model1.getValueAt(JTableReVerify.getSelectedRow(),0).toString();
        String LatX1 = latistart.getText();
        try{
            String update = "update landdata set Status='Z' ,LatX1='"+LatX1+"' where Land_Id='"+landId+"'";
            reVerify.stm.executeUpdate(update);// again Status = Z for reverification
            JOptionPane.showMessageDialog(this,"LAND ID- "+landId+" IS SUCCESSFULLY RESUBMITTED");
            this.dispose();
             
        }catch(Exception e)
        {
            System.out.println(e);
        }
        
        // again Status = Z
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PbtNN_LReportsForward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PbtNN_LReportsForward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PbtNN_LReportsForward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PbtNN_LReportsForward.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PbtNN_LReportsForward dialog = new PbtNN_LReportsForward(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTableReVerify;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableToSend1;
    private javax.swing.JLabel lLandId;
    private javax.swing.JTextField latistart;
    // End of variables declaration//GEN-END:variables
}
