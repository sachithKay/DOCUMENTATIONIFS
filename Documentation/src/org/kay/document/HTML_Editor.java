/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kay.document;



/**
 *
 * @author sacklk
 */
public class HTML_Editor 
{
   
public String insertBold(String input)
{

   String output=null;
   
if(!input.contains("<b>"))
{
output = "<b>"+input+"</b>";
}

else
{
output = input; 
}


return  output;
}


public String insertUnderline(String input)
{
String output = null;

if(!input.contains("<u>"))
{
output = "<u>"+input+"</u>";
}
else
{
output = input;
}



return output;
}

public String insertColor(String input,String color)
{
   
String output=null;

output = "<span style=\"color:"+color+"\">"+input+"</span>";

return output;
}



public String insertBreak()
{

return "<br>";

}

public String insertParagraph()
{

return "<p> </p>";

}

public String insertCode(String input)
{

if(!input.isEmpty())
   return "<code>"+input+"</code>";

else
      return "<code>inpt code here </code>";

}

}
