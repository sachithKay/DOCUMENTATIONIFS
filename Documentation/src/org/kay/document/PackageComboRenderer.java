/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kay.document;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author sacklk
 */
public class PackageComboRenderer extends JLabel implements javax.swing.ListCellRenderer<Package>{

  
    private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 128);
   @Override
   public Component getListCellRendererComponent(JList<? extends Package> list, Package value, int index, boolean isSelected, boolean cellHasFocus) {

      Package package_ = value;
      
      setText(package_.getPackage());
      
             if (isSelected) 
      {
                

      setBackground(HIGHLIGHT_COLOR);
      setForeground(Color.white);
      } 
      else
      {
      setBackground(Color.white);
      setForeground(Color.black);
      }
      
      setOpaque(true);
      
      
      return this;
   }
   
}
