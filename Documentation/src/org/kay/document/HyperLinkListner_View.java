/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kay.document;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import org.openide.util.Exceptions;

/**
 *
 * @author sacklk
 */
public class HyperLinkListner_View implements ActionListener, HyperlinkListener 
{

   @Override
   public void actionPerformed(ActionEvent e) {
      try 
      {
         URL url = new URL(e.getActionCommand());
         Desktop.getDesktop().browse(url.toURI());
      } catch (MalformedURLException ex) {
         Exceptions.printStackTrace(ex);
      } catch (URISyntaxException ex) {
         Exceptions.printStackTrace(ex);
      } catch (IOException ex) {
         Exceptions.printStackTrace(ex);
      }
   }

   @Override
   public void hyperlinkUpdate(HyperlinkEvent e)
   {
    
   }

   
   
   
}
