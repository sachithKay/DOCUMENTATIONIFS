/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kay.document;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openide.util.Exceptions;

/**
 *
 * @author sacklk
 */
public class Doc_Selector extends javax.swing.JPanel {

   int selected_Component;
   DataHandler data;
   String LINK= "http://localhost:19159/Web_Documentation/DOC.jsp?method=";
   DefaultListModel<Method> P_model;
    
   public Doc_Selector() 
   {
   
      
      initComponents();
      
      
      jTextPane1.addHyperlinkListener(new HyperlinkListener() {
    public void hyperlinkUpdate(HyperlinkEvent e) {
        if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().browse(e.getURL().toURI());
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } catch (URISyntaxException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
        }
    }

      
      });

      data = new DataHandler();
      ArrayList<Component> components = data.retrieveComponents();
      DefaultListModel<Component> model = new DefaultListModel<Component>();
      for(Component c:components)
         model.addElement(c);
      
      jList1.setModel(model);
      jList1.setCellRenderer(new ListCellRenderer());
      jList2.setToolTipText("Right click for more.");
      
      
   final JPopupMenu popupMenu = new JPopupMenu();
   popupMenu.add(new JMenuItem(new AbstractAction("View more") {
      
      @Override
      public void actionPerformed(ActionEvent e)
      {
 
         try
         {
            Desktop.getDesktop().browse(new URL("http://localhost:19159/Web_Documentation/PACKAGE_DOC.jsp?package_id="+((Package)jList2.getSelectedValue()).getPackage_ID()).toURI());
         } catch (MalformedURLException ex)
         {
            Exceptions.printStackTrace(ex);
         } 
         catch (IOException ex) 
         {
            Exceptions.printStackTrace(ex);
         }
         catch (URISyntaxException ex)
         {
            Exceptions.printStackTrace(ex);
         }
         
      
      }
   }));
  
   
    jList2.addMouseListener(new MouseAdapter()
    {
     @Override
     public void mouseClicked(MouseEvent me) {
       // if right mouse button clicked (or me.isPopupTrigger())
       if (SwingUtilities.isRightMouseButton(me)
           && !jList2.isSelectionEmpty()
           && jList2.locationToIndex(me.getPoint())
              == jList2.getSelectedIndex()) {
               popupMenu.show(jList2, me.getX(), me.getY());
               }
           }
        }
     );


   
   }


   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jList1 = new javax.swing.JList();
      jScrollPane2 = new javax.swing.JScrollPane();
      jList2 = new javax.swing.JList();
      jScrollPane3 = new javax.swing.JScrollPane();
      jList3 = new javax.swing.JList();
      jButton1 = new javax.swing.JButton();
      jScrollPane5 = new javax.swing.JScrollPane();
      jTextPane1 = new javax.swing.JTextPane();
      jButton2 = new javax.swing.JButton();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jLabel3 = new javax.swing.JLabel();

      jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
         public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            component_Changed(evt);
         }
      });
      jScrollPane1.setViewportView(jList1);

      jList2.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
         public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            package_changed(evt);
         }
      });
      jScrollPane2.setViewportView(jList2);

      jList3.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
         public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
            methodChanged(evt);
         }
      });
      jScrollPane3.setViewportView(jList3);

      jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      jButton1.setLabel(org.openide.util.NbBundle.getMessage(Doc_Selector.class, "Doc_Selector.jButton1.label")); // NOI18N
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      jTextPane1.setEditable(false);
      jTextPane1.setContentType("text/html\n"); // NOI18N
      jScrollPane5.setViewportView(jTextPane1);
      jTextPane1.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(Doc_Selector.class, "Doc_Selector.jTextPane1.AccessibleContext.accessibleDescription")); // NOI18N

      jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jButton2, org.openide.util.NbBundle.getMessage(Doc_Selector.class, "Doc_Selector.jButton2.text")); // NOI18N
      jButton2.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
         }
      });

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(Doc_Selector.class, "Doc_Selector.jLabel1.text")); // NOI18N

      jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel2, org.openide.util.NbBundle.getMessage(Doc_Selector.class, "Doc_Selector.jLabel2.text")); // NOI18N

      jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      org.openide.awt.Mnemonics.setLocalizedText(jLabel3, org.openide.util.NbBundle.getMessage(Doc_Selector.class, "Doc_Selector.jLabel3.text")); // NOI18N

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(6, 6, 6)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(10, 10, 10)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jButton2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(jButton1)))
            .addContainerGap())
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jLabel1)
            .addGap(44, 44, 44)
            .addComponent(jLabel2)
            .addGap(67, 67, 67)
            .addComponent(jLabel3)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel1)
                     .addComponent(jLabel2)
                     .addComponent(jLabel3))
                  .addGap(15, 15, 15)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(jButton1)
               .addComponent(jButton2))
            .addContainerGap())
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 0, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
      );
   }// </editor-fold>//GEN-END:initComponents

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      

    Edit_Form_2 edit = new Edit_Form_2(((Method)jList3.getSelectedValue()));
    JFrame parent = new JFrame("Edit view");
    parent.add(edit);
    parent.setSize(1000, 600);
    parent.setResizable(false);
    
    parent.setVisible(true);
     
   }//GEN-LAST:event_jButton1ActionPerformed

   
   private void component_Changed(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_component_Changed
    
  jTextPane1.setContentType("text/html");
  jTextPane1.setText("");
  
  
     Component  x =   (Component) jList1.getSelectedValue();
     
     if(P_model!=null)
     P_model.removeAllElements();
  
     
     ArrayList<Package> Packages= data.retrievePackages(x.getComponent_ID());
     DefaultListModel<Package> model = new DefaultListModel<Package>();
     
     if(Packages!=null)
     {
     for(Package p:Packages)
            model.addElement(p);
     
     jList2.setModel(model);
     jList2.setCellRenderer(new PackageListCellRenderer());
     
     }
     
     
     
      
      
      
   }//GEN-LAST:event_component_Changed

   private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     New_document nd = new New_document();
     JFrame parent = new JFrame("New Document");
     parent.setResizable(false);
    parent.add(nd);
    parent.setSize(560, 550);
    parent.setVisible(true);
   }//GEN-LAST:event_jButton2ActionPerformed

   private void methodChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_methodChanged
     

      jTextPane1.setContentType("text/html");
      jTextPane1.setText("");
      
      
      Method method = (Method)jList3.getSelectedValue();
      
   
     if(method!=null)
     {
      String link = "<p><a href= \""+LINK+method.getMethod_ID()+"\">GOTO HTML</a><p>"; 
      Document doc = Jsoup.parse(method.getMethod() + method.getParameters() + method.getDescription() + method.getPurpose() + method.getReturns()+method.getExample()+method.getNotes()+link);
      String html = doc.outerHtml();
   
      jTextPane1.setText(html);

     }
      
      


   }//GEN-LAST:event_methodChanged

   private void package_changed(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_package_changed
      
      Package package_ = (Package)jList2.getSelectedValue();
     // JOptionPane.showMessageDialog(jTextPane1, package_.getPackage_ID());
      if(package_!=null)
      {
     ArrayList<Method> methods =  data.retrieveMethods(package_.getPackage_ID());
         //  JOptionPane.showMessageDialog(jTextPane1, methods.size());

    if(methods!=null)
    { 
      P_model = new DefaultListModel<Method>();
     
     for(Method m: methods)
        P_model.addElement(m);
     
     jList3.setModel(P_model);
     jList3.setCellRenderer(new MethodListCellRenderer());
    }
      }  
      
   }//GEN-LAST:event_package_changed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JList jList1;
   private javax.swing.JList jList2;
   private javax.swing.JList jList3;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JScrollPane jScrollPane3;
   private javax.swing.JScrollPane jScrollPane5;
   private javax.swing.JTextPane jTextPane1;
   // End of variables declaration//GEN-END:variables
}
