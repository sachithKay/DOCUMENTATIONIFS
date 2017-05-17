
package org.kay.document;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Tag;




/**
 *
 * @author sacklk
 */
public class New_document extends javax.swing.JPanel {

   /**
    * Creates new form New_document
    */
   
   String component;
   String packageName;
   String method;
   String description;
   String param;
   String returns;
   String purpose;
   String example;
   
   public New_document() 
   {
      initComponents();
      ArrayList<Package> packages = new DataHandler().retrieveAllPackages();
      DefaultComboBoxModel<Package> model = new DefaultComboBoxModel<Package>();
    
      for(Package x:packages)
         model.addElement(x);
      
      jComboBox1.setModel(model);
      jComboBox1.setRenderer(new PackageComboRenderer());
         
   }

   /**
    * This method is called from within the constructor to
    * initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is
    * always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jScrollPane3 = new javax.swing.JScrollPane();
      methodBox = new javax.swing.JTextPane();
      jScrollPane4 = new javax.swing.JScrollPane();
      descriptionBox = new javax.swing.JTextPane();
      jScrollPane5 = new javax.swing.JScrollPane();
      paramBox = new javax.swing.JTextPane();
      jScrollPane6 = new javax.swing.JScrollPane();
      returnBox = new javax.swing.JTextPane();
      jScrollPane7 = new javax.swing.JScrollPane();
      purpBox = new javax.swing.JTextPane();
      jButton1 = new javax.swing.JButton();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();
      jLabel4 = new javax.swing.JLabel();
      jLabel5 = new javax.swing.JLabel();
      jLabel6 = new javax.swing.JLabel();
      jLabel7 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      exBox = new javax.swing.JTextPane();
      jLabel1 = new javax.swing.JLabel();
      jComboBox1 = new javax.swing.JComboBox();

      jScrollPane3.setViewportView(methodBox);

      jScrollPane4.setViewportView(descriptionBox);

      jScrollPane5.setViewportView(paramBox);

      jScrollPane6.setViewportView(returnBox);

      jScrollPane7.setViewportView(purpBox);

      jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jButton1, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jButton1.text")); // NOI18N
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel2.text")); // NOI18N

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel3.text")); // NOI18N

      jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel4, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel4.text")); // NOI18N

      jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel5, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel5.text")); // NOI18N
      jLabel5.setToolTipText(org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel5.toolTipText")); // NOI18N

      jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel6, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel6.text")); // NOI18N

      jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel7, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel7.text")); // NOI18N

      jScrollPane1.setViewportView(exBox);

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(New_document.class, "New_document.jLabel1.text")); // NOI18N

      jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jButton1))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                     .addComponent(jLabel1))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                     .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                     .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
                     .addComponent(jScrollPane3)
                     .addComponent(jScrollPane4)
                     .addComponent(jScrollPane5)
                     .addComponent(jScrollPane1)
                     .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(27, 27, 27)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jLabel2)
               .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(16, 16, 16)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel5))
            .addGap(12, 12, 12)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel6))
            .addGap(13, 13, 13)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addComponent(jLabel1)
                  .addGap(0, 0, Short.MAX_VALUE)))
            .addGap(18, 18, 18)
            .addComponent(jButton1)
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
      //Logic for pushing information into the database
   Package pckg =(Package)jComboBox1.getSelectedItem();
   packageName = pckg.getPackage();
   method = methodBox.getText();
   description = descriptionBox.getText();
   param = paramBox.getText();
   returns = returnBox.getText();
   purpose = purpBox.getText();
   example = exBox.getText();


   
   Element meth = new Element(Tag.valueOf("div"),"");
   meth.attr("id", "method");
   meth.html("<p>"+method+"</p>");
   
   Element desc = new Element(Tag.valueOf("div"),"");
   desc.attr("id", "desc");
   desc.html("<p>"+description+"</p>");
   
   
   Element para = new Element(Tag.valueOf("div"),"");
   para.attr("id", "para");
   para.html("<p>"+param+"</p>");
   
   Element ret = new Element(Tag.valueOf("div"),"");
   ret.attr("id", "ret");
   ret.html("<p>"+returns+"</p>");
   
   
   Element purp = new Element(Tag.valueOf("div"),"");
   purp.attr("id", "purp");
   purp.html("<p>"+purpose+"</p>");
   
   
   Element exmpl = new Element(Tag.valueOf("div"), "");
   exmpl.attr("id", "exmpl");
   exmpl.html("<pre>" + example + "</pre>");
   
   Element notes = new Element(Tag.valueOf("div"),"");
   notes.attr("id","notes");
   notes.html("");
   
   
   if(true)
   {
   Method method = new Method();
   
   
   method.setMethod(meth.outerHtml());
   method.setPackage_(pckg.getPackage_ID());
   method.setDescription(desc.outerHtml());
   method.setParameters(para.outerHtml());
   method.setReturns(ret.outerHtml());
   method.setPurpose(purp.outerHtml());
   method.setExample(exmpl.outerHtml());
   method.setNotes(notes.outerHtml());
   
   
   DataHandler Data= new DataHandler();
   boolean done = Data.insertMethod(method);
   
   if(done)
      JOptionPane.showMessageDialog(null, "done");
     
   }
   
   else
   {
         JOptionPane.showMessageDialog(null, "Something wrong with the package");

   
   }
      
      
   }//GEN-LAST:event_jButton1ActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JTextPane descriptionBox;
   private javax.swing.JTextPane exBox;
   private javax.swing.JButton jButton1;
   private javax.swing.JComboBox jComboBox1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JLabel jLabel4;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel7;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane4;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JScrollPane jScrollPane6;
   private javax.swing.JScrollPane jScrollPane7;
   private javax.swing.JTextPane methodBox;
   private javax.swing.JTextPane paramBox;
   private javax.swing.JTextPane purpBox;
   private javax.swing.JTextPane returnBox;
   // End of variables declaration//GEN-END:variables
}