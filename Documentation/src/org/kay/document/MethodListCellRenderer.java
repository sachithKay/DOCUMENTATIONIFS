
package org.kay.document;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class MethodListCellRenderer extends JLabel implements javax.swing.ListCellRenderer<Method>
{
    private static final Color HIGHLIGHT_COLOR = new Color(0, 0, 128);

   @Override
   public Component getListCellRendererComponent(JList<? extends Method> list, Method value, int index, boolean isSelected, boolean cellHasFocus)
   {
      Method method = value;
      
      Document doc = Jsoup.parse(method.getMethod());
      Element name = doc.getElementById("method");
      Elements paragraph = name.getElementsByTag("p");
      Element p = paragraph.get(0);
      String LABEL = p.html();
      
      
      setText(LABEL);
      
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
