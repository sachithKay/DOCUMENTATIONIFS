/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kay.document;

import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author sacklk
 */
public class Edit_Form extends javax.swing.JPanel {

   /**
    * Creates new form Edit_Form
    */
   public Edit_Form() {
      initComponents();
      
      jTextPane1.setContentType("text/html");
      jTextPane2.setContentType("text/html");
      jTextPane3.setContentType("text/html");
      jTextPane4.setContentType("text/html");
      jTextPane5.setContentType("text/html");
      jTextPane6.setContentType("text/html");
      jTextPane7.setContentType("text/html");
      
      jTextPane1.setText("<b><u>sachith</u></b>");
      
      HTMLDocument doc = new HTMLDocument();
     

  
      
      
   }

   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      btn_Edit = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextPane1 = new javax.swing.JTextPane();
      jScrollPane2 = new javax.swing.JScrollPane();
      jTextPane2 = new javax.swing.JTextPane();
      jScrollPane3 = new javax.swing.JScrollPane();
      jTextPane3 = new javax.swing.JTextPane();
      jScrollPane4 = new javax.swing.JScrollPane();
      jTextPane4 = new javax.swing.JTextPane();
      jScrollPane5 = new javax.swing.JScrollPane();
      jTextPane5 = new javax.swing.JTextPane();
      jScrollPane6 = new javax.swing.JScrollPane();
      jTextPane6 = new javax.swing.JTextPane();
      jScrollPane7 = new javax.swing.JScrollPane();
      jTextPane7 = new javax.swing.JTextPane();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();

      btn_Edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(btn_Edit, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.btn_Edit.text")); // NOI18N
      btn_Edit.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btn_EditActionPerformed(evt);
         }
      });

      jScrollPane1.setViewportView(jTextPane1);

      jScrollPane2.setViewportView(jTextPane2);

      jScrollPane3.setViewportView(jTextPane3);

      jScrollPane4.setViewportView(jTextPane4);

      jScrollPane5.setViewportView(jTextPane5);

      jScrollPane6.setViewportView(jTextPane6);

      jScrollPane7.setViewportView(jTextPane7);

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.jLabel1.text")); // NOI18N

      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.jLabel2.text")); // NOI18N

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.jLabel3.text")); // NOI18N

      jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.jLabel4.text")); // NOI18N

      jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.jLabel5.text")); // NOI18N

      jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.jLabel6.text")); // NOI18N

      jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(Edit_Form.class, "Edit_Form.jLabel7.text")); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel3)
               .addComponent(jLabel4)
               .addComponent(jLabel2)
               .addComponent(jLabel1)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(11, 11, 11)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel6)
                     .addComponent(jLabel7)
                     .addComponent(jLabel5))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createSequentialGroup()
                     .addComponent(btn_Edit)
                     .addGap(10, 10, 10))
                  .addComponent(jScrollPane1)
                  .addComponent(jScrollPane2)
                  .addComponent(jScrollPane3)
                  .addComponent(jScrollPane4)
                  .addComponent(jScrollPane5))
               .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(26, 26, 26))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(25, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel1))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel4))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel6))
            .addGap(26, 26, 26)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel7)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(btn_Edit)))
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
   }// </editor-fold>//GEN-END:initComponents

   private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_btn_EditActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btn_Edit;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JScrollPane jScrollPane6;
   private javax.swing.JScrollPane jScrollPane7;
   private javax.swing.JTextPane jTextPane1;
   private javax.swing.JTextPane jTextPane2;
   private javax.swing.JTextPane jTextPane3;
   private javax.swing.JTextPane jTextPane4;
   private javax.swing.JTextPane jTextPane5;
   private javax.swing.JTextPane jTextPane6;
   private javax.swing.JTextPane jTextPane7;
   // End of variables declaration//GEN-END:variables
}
