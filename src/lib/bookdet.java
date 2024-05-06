/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib;

import CONFIG.DBCONNECTOR;
import internalpage.dashabord;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import java.awt.print.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author User
 */
public class bookdet extends javax.swing.JFrame {
DefaultTableModel model;
   
    public bookdet() {
        initComponents();
        displayData();
    }
    
    
       public void search(String str){
    model = (DefaultTableModel) BOOKDET.getModel();
    TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
    BOOKDET.setRowSorter(trs);
    trs.setRowFilter(RowFilter.regexFilter(str));
    }
       
       public void filter(String qry ){
             model = (DefaultTableModel) BOOKDET.getModel();
         TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
         BOOKDET.setRowSorter(trs);
       
         if(qry =="ALL"){
        BOOKDET.setRowSorter(trs);
         }else{
         trs.setRowFilter(RowFilter.regexFilter(qry));
         }
       
       }
       
  public void close(){
        this.dispose();
        DASHBOARD dash = new DASHBOARD();
        dash.setVisible(true);
        dashabord up = new dashabord();
        dash.maindesk.add(up).setVisible(true);
    }
  
    public void displayData(){
        try{
       
            DBCONNECTOR dbc = new DBCONNECTOR();
            ResultSet rs = dbc.getData("SELECT * FROM book_details");
            BOOKDET.setModel(DbUtils.resultSetToTableModel(rs));
       
        }catch(SQLException ex){
            System.out.println("Error Message: "+ex);
       
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
        rSMaterialButtonCircle3 = new necesario.RSMaterialButtonCircle();
        search = new app.bolivia.swing.JCTextField();
        FILTER = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BOOKDET = new rojeru_san.complementos.RSTableMetro();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 58, 140));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSMaterialButtonCircle3.setBackground(new java.awt.Color(153, 0, 0));
        rSMaterialButtonCircle3.setText("PRINT");
        rSMaterialButtonCircle3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle3ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 130, 110, 40));

        search.setBorder(null);
        search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        search.setPlaceholder("SEARCH");
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 420, 20));

        FILTER.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "SCI-FI", "HORROR", "MYSTERY", "NOVEL", "FANTASY", "MATHIMATICS", "SCIENCE", "BIOLOGY", "TECHNOLOGY", " " }));
        FILTER.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FILTERItemStateChanged(evt);
            }
        });
        jPanel1.add(FILTER, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 140, 30));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/book (7).png"))); // NOI18N
        jLabel2.setText("BOOK DETAILS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 930, 70));

        BOOKDET.setColorBackgoundHead(new java.awt.Color(153, 0, 0));
        BOOKDET.setGrosorBordeFilas(0);
        BOOKDET.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jScrollPane1.setViewportView(BOOKDET);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 940, 400));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(153, 0, 0));
        rSMaterialButtonCircle2.setText("BACK");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });
        jPanel1.add(rSMaterialButtonCircle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 120, 40));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bg.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        close();
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

    private void rSMaterialButtonCircle3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle3ActionPerformed
        MessageFormat head = new MessageFormat("BOOK DETAILS");
        MessageFormat FOOT = new MessageFormat("Page{0, number , integer}");

        try {
            BOOKDET.print(JTable.PrintMode.NORMAL, head, FOOT);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "cannot print");
        }
    }//GEN-LAST:event_rSMaterialButtonCircle3ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String seachst = search.getText();
        search(seachst);
    }//GEN-LAST:event_searchKeyReleased

    private void FILTERItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FILTERItemStateChanged
     String qry = FILTER.getSelectedItem().toString();
     
        filter(qry);
    }//GEN-LAST:event_FILTERItemStateChanged

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
            java.util.logging.Logger.getLogger(bookdet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookdet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookdet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookdet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookdet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojeru_san.complementos.RSTableMetro BOOKDET;
    private javax.swing.JComboBox<String> FILTER;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private necesario.RSMaterialButtonCircle rSMaterialButtonCircle3;
    private app.bolivia.swing.JCTextField search;
    // End of variables declaration//GEN-END:variables
}