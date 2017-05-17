/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kay.document;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Bugtracking",
        id = "org.kay.document.Launch_Doc"
)
@ActionRegistration(
        iconBase = "org/kay/document/doc_icon.png",
        displayName = "#CTL_Launch_Doc"
)
@ActionReferences({
   @ActionReference(path = "Menu/Tools", position = 0),
   @ActionReference(path = "Toolbars/Tools", position = 0)
})
@Messages("CTL_Launch_Doc=Documentation")
public final class Launch_Doc implements ActionListener {

   @Override
   public void actionPerformed(ActionEvent e) {
     
      Doc_Selector doc = new Doc_Selector();
      
      JFrame parent = new JFrame("Documentation");
      parent.add(new Doc_Selector(),BorderLayout.SOUTH);
      
           JMenuBar exportMenu = new JMenuBar();
      JMenu menu = new JMenu("Add");
      JMenuItem item1 = new JMenuItem(new AbstractAction("Add Package") {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
           JFrame parent = new JFrame("New Package");
           parent.setSize(435, 300);
           parent.setResizable(false);
           parent.add(new New_Package());
           parent.setVisible(true);
            
         }
      });
      JMenuItem item2 = new JMenuItem(new AbstractAction("Add Component") {
         
         @Override
         public void actionPerformed(ActionEvent e)
         {
           
           JFrame parent = new JFrame("New Component");
           parent.setSize(530, 120);
           parent.setResizable(false);
           parent.add(new New_Component());
           parent.setVisible(true);
         }
      });

      JPanel menuPanel = new JPanel();
      
      menu.add(item1);
      menu.add(item2);
      exportMenu.add(menu);
      menuPanel.add(exportMenu);
      parent.add(menuPanel,BorderLayout.NORTH);
      
      parent.setSize(700, 500);
      parent.setResizable(false);
      parent.setVisible(true);
      
      
      
   }
}
