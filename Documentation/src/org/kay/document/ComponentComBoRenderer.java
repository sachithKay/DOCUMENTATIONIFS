/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kay.document;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author sacklk
 */
public class ComponentComBoRenderer extends JLabel implements javax.swing.ListCellRenderer<Component>{

  
       private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 128);

   @Override
   public java.awt.Component getListCellRendererComponent(JList<? extends Component> list, Component value, int index, boolean isSelected, boolean cellHasFocus)
   {
   Component component = value;
      setText(component.getComponent_Name());
      
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
