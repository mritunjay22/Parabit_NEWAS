package com.parabittechnology.parabit_newas;

import java.awt.Image;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mritunjay Singh
 */
public class PbtNN_ReportData extends javax.swing.JDialog {
ParabitDB rec , update;
int landId;
byte []img1,img2,img3,img4,img5;
String according,cath;
String P="P";//inspector
String Z ="Z";//zonal
String H ="H";//Head Q
String noteString;
    /**
     * Creates new form PbtNN_ReportData
     */
    public PbtNN_ReportData(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    public PbtNN_ReportData(ParabitDB ob,String verification)
    {
        rec = ob;
        cath = verification;
        update = new ParabitDB();
        initComponents();
        additonal();
        
    }
    public PbtNN_ReportData(ParabitDB fromEnv, boolean r){
        rec = fromEnv;
        update = new ParabitDB();
        initComponents();
        additonal();
        comment.setText("Please Observe The Information Here And Fill Appropriate Details in Other Tab");
        comment.setEditable(false);
        upholdLable.setText("NOTE");
        jCB1.setVisible(false);
        UpHoldButton.setVisible(false);
        jButton1.setVisible(false);
        
        System.out.println("from Env Expt");
        
    }
    public void additonal()
    {
        this.setTitle("REPORT DATA");
        System.out.println("HERE MAYBE");
        try
        {
             landId = rec.rs.getInt("Land_Id");
         jlLandType.setText( rec.rs.getString("LandType")); 
         jLSoilType.setText(rec.rs.getString("SoilType"));
         jLAreaLand.setText(rec.rs.getString("AreaSize"));
         jLShape.setText(rec.rs.getString("Shape"));
         jLOwner.setText(rec.rs.getString("Owner"));
         jLx1.setText(rec.rs.getString("LatX1"));
         jLy1.setText(rec.rs.getString("LogY1"));
         jLx2.setText(rec.rs.getString("LatX2"));
         jLy2.setText(rec.rs.getString("LogY2"));
         setImage(img1=rec.rs.getBytes("LImg1"),lImg1);// DIRECT IMAGE BYTE ARRAY ME LEKE DIRECT FUNCTION KO THROW KRDIYAA
         setImage(img2=rec.rs.getBytes("LImg2"),lImg2);// DARNA MAT EASY HAIIIIII!!!!
         setImage(img3=rec.rs.getBytes("LImg3"),lImg3);//KHUD TEZZ BANKE LIKHAA HAI YE AP SAMJHOOOO
        setImage(img4=rec.rs.getBytes("LImg4"),lImg4);
        setImage(img5=rec.rs.getBytes("LImg5"),lImg5);
         
         
         if(cath.equals("P"))
         {
          according ="Z"; //Inspector se aaya toh ye ho jaegaaaa Z neeche update ke liyeeee
            //noteString = "Land Id- "+landId+" is Forwarded to Head Q. on Date--   
            UpHoldButton.setText("DELETE REPORT");
            upholdLable.setVisible(false);
            comment.setVisible(false);
         }
         if(cath.equals("Z"))
         {
             UpHoldButton.setText("REVERIFY");
             according ="H";// AGAR ZONAL SE AAYA TOH HO JAEGA H NECHEEE UPDATE KE LIYEE HEAD QUATER KE LIYEEE  
         }
         if(cath.equals("H"))
         {
             according ="E"; // AGAR hEADq SE AAAYA THEN THIS TIME E MATLAB ENV EXPERT PE FORWARD HOGAA
             UpHoldButton.setText("DELETE REPORT");//env expert pr jaega
             upholdLable.setVisible(false);
            comment.setVisible(false);
         }
   
        }catch(Exception w)
            {
                System.out.println(w);
            }
        
    }
    public String myDate()
{
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
  LocalDate localDate = LocalDate.now();
  System.out.println(dtf.format(localDate));
  String date = dtf.format(localDate);
//JOptionPane.showMessageDialog(null,date);
return date;
}
    private void setImage(byte[] path, JLabel name)
    {
        ImageIcon i1 = new ImageIcon(path);
Image i = i1.getImage();
Image my = i.getScaledInstance(name.getWidth(),name.getHeight(),Image.SCALE_SMOOTH);
ImageIcon newImage = new ImageIcon(my);
name.setIcon(newImage);
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
        jlLandType = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLSoilType = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLAreaLand = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLShape = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLOwner = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lImg1 = new javax.swing.JLabel();
        lImg2 = new javax.swing.JLabel();
        lImg3 = new javax.swing.JLabel();
        lImg4 = new javax.swing.JLabel();
        lImg5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLx1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLy1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLx2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLy2 = new javax.swing.JLabel();
        upholdLable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comment = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        UpHoldButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCB1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LAND INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("LAND TYPE");

        jlLandType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlLandType.setText("/");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("SOIL TYPE");

        jLSoilType.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLSoilType.setText("/");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("AREA OF LAND");

        jLAreaLand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLAreaLand.setText("/");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("SHAPE OF LAND");

        jLShape.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLShape.setText("/");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("LAND OWNER");

        jLOwner.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLOwner.setText("/");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IMAGES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lImg1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
            .addComponent(lImg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lImg3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lImg4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lImg5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lImg1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lImg2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lImg3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lImg4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lImg5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLSoilType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlLandType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLAreaLand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLShape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLOwner, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jlLandType))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLSoilType))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLAreaLand))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLShape))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLOwner))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LOCATION INFORMATION", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText(" EXACT lOCATION");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("STARTING"));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("LATITUDE");

        jLx1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLx1.setText("/");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("LONGITUDE");

        jLy1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLy1.setText("/");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLx1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLy1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLx1)
                    .addComponent(jLabel14)
                    .addComponent(jLy1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("ENDING"));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("LATITUDE");

        jLx2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLx2.setText("/");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setText("LONGITUDE");

        jLy2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLy2.setText("/");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLx2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel18)
                .addGap(32, 32, 32)
                .addComponent(jLy2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLx2)
                    .addComponent(jLabel18)
                    .addComponent(jLy2))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        upholdLable.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        upholdLable.setText("Reason For Uphold");

        comment.setColumns(20);
        comment.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 12)); // NOI18N
        comment.setRows(5);
        jScrollPane1.setViewportView(comment);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(upholdLable, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(upholdLable)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("FORWARD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        UpHoldButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        UpHoldButton.setText("DISCARD REPORT");
        UpHoldButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpHoldButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCB1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCB1.setText("FORWARD");
        jCB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCB1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(36, 36, 36)
                        .addComponent(UpHoldButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCB1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpHoldButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpHoldButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpHoldButtonActionPerformed
String delete= "Update  landdata set Status='-1' where Land_Id ='"+landId+"'";
try{
       if(cath.equals("P"))
{
   update.stm.executeUpdate(delete);
    JOptionPane.showMessageDialog(this,"LAND SUCCESSFULLY DELECTED");
    System.out.println("From Inspector Side");
    
}else if(cath.equals("H"))
{
    update.stm.executeUpdate(delete);
     JOptionPane.showMessageDialog(this,"LAND SUCCESSFULLY DELECTED");
     System.out.println("From HeadQ Side");
}
}catch(Exception e){System.out.println(e);}
   
if(cath.equals("Z"))
{
    String reasonInComment = comment.getText();
    if(comment.getText()=="")
    {
        JOptionPane.showMessageDialog(this,"PLEASE ENTER REASON FOR REVERIFICATION");
    }else{
    try{
           String o = "Update  landdata set Status ='R',Comment='"+reasonInComment+"' where Land_Id ='"+landId+"'";

        update.stm.executeUpdate(o);
        JOptionPane.showMessageDialog(null,"Land Review Submitted Successfully");
                this.dispose();
      }catch(Exception e)
      {
          System.out.println(e);
      }
    }
}
    }//GEN-LAST:event_UpHoldButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(jCB1.isSelected())
{
    try{
           String o = "Update  landdata set Status ='"+according+"' where Land_Id ='"+landId+"'";

        update.stm.executeUpdate(o);
        JOptionPane.showMessageDialog(null,"Land  Forwarded SUCCESSFULLY");
        if("H".equals(according))
        {
            String insert = "Update landdata set FD_Zonal='"+myDate()+"' where Land_Id='"+landId+"'";
        update.stm.executeUpdate(insert);
      
        System.out.println("FD ZONAL inserted successfully");

        }
        if("E".equals(according))
        {
          String insert = "Update landdata set FD_HEADQ ='"+myDate()+"' where Land_Id='"+landId+"'";
        update.stm.executeUpdate(insert);
      
        System.out.println("HeadQ Date inserted successfully");  
        }
                this.dispose();
      }catch(Exception e){System.out.println(e);}
}else{JOptionPane.showMessageDialog(this,"PLEASE SELECT THE ABOVE CHECKBOX TO FORWARD");}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCB1ActionPerformed

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
            java.util.logging.Logger.getLogger(PbtNN_ReportData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PbtNN_ReportData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PbtNN_ReportData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PbtNN_ReportData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PbtNN_ReportData dialog = new PbtNN_ReportData(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton UpHoldButton;
    private javax.swing.JTextArea comment;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCB1;
    private javax.swing.JLabel jLAreaLand;
    private javax.swing.JLabel jLOwner;
    private javax.swing.JLabel jLShape;
    private javax.swing.JLabel jLSoilType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLx1;
    private javax.swing.JLabel jLx2;
    private javax.swing.JLabel jLy1;
    private javax.swing.JLabel jLy2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlLandType;
    private javax.swing.JLabel lImg1;
    private javax.swing.JLabel lImg2;
    private javax.swing.JLabel lImg3;
    private javax.swing.JLabel lImg4;
    private javax.swing.JLabel lImg5;
    private javax.swing.JLabel upholdLable;
    // End of variables declaration//GEN-END:variables
}
