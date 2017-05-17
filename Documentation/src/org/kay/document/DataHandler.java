package org.kay.document;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import org.openide.util.Exceptions;

/**
 *
 * @author sacklk
 */
public class DataHandler {

   Connection con;
   Statement statement;

   public DataHandler() {
      try 
      {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con = DriverManager.getConnection("jdbc:oracle:thin:@//cmbrndsb3297:1521/SB", "ifsapp", "ifsapp");

      } catch (ClassNotFoundException ex)
      {
         Exceptions.printStackTrace(ex);
      } catch (SQLException ex) 
      {
         Exceptions.printStackTrace(ex);
      }
   }

   public boolean insertMethod(Method method)
   {
      try {
         String insertQuery = "INSERT INTO METHODS_ (METHOD_NAME,PARAMETERS,RETURNS,PURPOSE,DESCRIPTION,PACKAGE_ID,EXAMPLE,NOTES) VALUES ('" + method.getMethod() + "','" + method.getParameters() + "','" + method.getReturns() + "','" + method.getPurpose() + "','" + method.getDescription() + "','" + method.getPackage_() + "','" + method.getExample() + "','" + method.getNotes() + "')";

         statement = con.createStatement();
         statement.executeUpdate(insertQuery);
         return true;
      } catch (Exception ex) {
         Exceptions.printStackTrace(ex);
         return false;
      }

   }

   public Method retrieveMethod(int id) {
      Method method = new Method();
      try {
         statement = con.createStatement();
         ResultSet result = statement.executeQuery("select * from METHODS_ WHERE METHOD_ID=" + id);
         result.next();

         method.setDescription(result.getString("DESCRIPTION"));
         method.setMethod(result.getString("METHOD_NAME"));
         method.setPackage_(result.getInt("PACKAGE_ID"));
         method.setParameters(result.getString("PARAMETERS"));
         method.setPurpose(result.getString("PURPOSE"));
         method.setReturns(result.getString("RETURNS"));
         method.setMethod_ID(result.getInt("METHOD_ID"));
         method.setExample(result.getString("EXAMPLE"));
         method.setNotes(result.getString("NOTES"));


      } catch (SQLException ex) {
         Exceptions.printStackTrace(ex);
      }

      return method;
   }

   public ArrayList<Component> retrieveComponents() {

      ArrayList<Component> components = new ArrayList<Component>();

      try {
         statement = con.createStatement();
         ResultSet result = statement.executeQuery("select * from COMPONENT_");

         while (result.next()) {
            Component comp = new Component();
            comp.setComponent_ID(result.getInt("COMPONENT_ID"));
            comp.setComponent_Name(result.getString("COMPONENT"));
            components.add(comp);

         }
      } catch (SQLException ex) {

         Exceptions.printStackTrace(ex);

      } finally {

         return components;

      }

   }

   public ArrayList<Package> retrievePackages(int COMPONENT_ID) 
   {
      ArrayList<Package> Packages = new ArrayList<Package>();

      try {
         statement = con.createStatement();
         ResultSet result = statement.executeQuery("SELECT * FROM PACKAGE_ WHERE COMPONENT_ID=" + COMPONENT_ID);

         while (result.next()) {
            Package package_ = new Package();
            package_.setPackage_ID(result.getInt("PACKAGE_ID"));
            package_.setPackage(result.getString("PACKAGE_NAME"));
            package_.setComponent_ID(result.getInt("COMPONENT_ID"));

            Packages.add(package_);
         }

      } catch (SQLException ex)
      {
         Exceptions.printStackTrace(ex);
      }

      return Packages;

   }

   public ArrayList<Method> retrieveMethods(int PACKAGE_ID) {

      ArrayList<Method> methods = new ArrayList<Method>();

      try {
         statement = con.createStatement();
         ResultSet result = statement.executeQuery("SELECT * FROM METHODS_ , PACKAGE_ WHERE METHODS_.PACKAGE_ID=PACKAGE_.PACKAGE_ID AND METHODS_.PACKAGE_ID=" + PACKAGE_ID);

         while (result.next()) {
            Method method = new Method();

            method.setDescription(result.getString("DESCRIPTION"));
            method.setMethod(result.getString("METHOD_NAME"));
            method.setPackage_(result.getInt("PACKAGE_ID"));
            method.setParameters(result.getString("PARAMETERS"));
            method.setReturns(result.getString("RETURNS"));
            method.setPurpose(result.getString("PURPOSE"));
            method.setMethod_ID(result.getInt("METHOD_ID"));
            method.setExample(result.getString("EXAMPLE"));
            method.setNotes(result.getString("NOTES"));

            methods.add(method);

         }

      } catch (SQLException ex) {

         Exceptions.printStackTrace(ex);
      }

      return methods;
   }

   public int retrievePackageID(String PACKAGE_NAME)
   {
      int ID = 0;
      try {
         statement = con.createStatement();
         ResultSet result = statement.executeQuery("SELECT PACKAGE_ID FROM PACKAGE_ WHERE PACKAGE_NAME='" + PACKAGE_NAME + "'");
         result.next();
         ID = result.getInt("PACKAGE_ID");
      } catch (SQLException ex) {

         Exceptions.printStackTrace(ex);
      }
      return ID;
   }

   public boolean updateMethod(int METHOD_ID, Method method) {
      try {
         String updateQuery = "UPDATE METHODS_ SET METHOD_NAME='" + method.getMethod() + "',PARAMETERS ='" + method.getParameters() + "',RETURNS='" + method.getReturns() + "',PURPOSE='" + method.getPurpose() + "',DESCRIPTION='" + method.getDescription() + "',EXAMPLE='" + method.getExample() + "' ,NOTES='" + method.getNotes() + "'  WHERE METHOD_ID=" + METHOD_ID;

         statement = con.createStatement();
         statement.executeUpdate(updateQuery);
         return true;
      } catch (Exception ex) {
         Exceptions.printStackTrace(ex);
         return false;
      }

   }

   public ArrayList<Package> retrieveAllPackages() {
      ArrayList<Package> PACKAGES = new ArrayList<Package>();

      try {
         statement = con.createStatement();
         ResultSet result = statement.executeQuery("SELECT * FROM PACKAGE_");

         while (result.next()) {
            Package package_ = new Package();
            package_.setComponent_ID(result.getInt("COMPONENT_ID"));
            package_.setPackage(result.getString("PACKAGE_NAME"));
            package_.setPackage_ID(result.getInt("PACKAGE_ID"));

            PACKAGES.add(package_);

         }

      } catch (SQLException ex) {

         Exceptions.printStackTrace(ex);
      }
      return PACKAGES;

   }
   
   public boolean insertPackage(Package package_)
   {
         try {
         String insertQuery = "INSERT INTO PACKAGE_ (PACKAGE_NAME,COMPONENT_ID,DESCRIPTION) VALUES ('"+package_.getPackage()+"',"+package_.getComponent_ID()+",'"+package_.getDescription()+"')" ;

         statement = con.createStatement();
         statement.executeUpdate(insertQuery);
         return  true;
       
      } catch (Exception ex)
      {
         Exceptions.printStackTrace(ex);
          return  false;
      }
   
   
   
   }
   
   public ArrayList<Component> retrieveAllComponents()
   {
         ArrayList<Component> Components = new ArrayList<Component>();

      try {
         statement = con.createStatement();
         ResultSet result = statement.executeQuery("SELECT * FROM COMPONENT_");

         while (result.next()) 
         {
       
Component component = new Component();

component.setComponent_ID(result.getInt("COMPONENT_ID"));
component.setComponent_Name(result.getString("COMPONENT"));

          Components.add(component);
         }

      } catch (SQLException ex) {

         Exceptions.printStackTrace(ex);
      }
      return Components;
   
   }
   
   public boolean insertComponent(Component component)
   {
           try {
         String insertQuery = "INSERT INTO COMPONENT_ (COMPONENT) VALUES ('"+component.getComponent_Name()+"')";

         statement = con.createStatement();
         statement.executeUpdate(insertQuery);
         return  true;
       
      } catch (Exception ex)
      {
         Exceptions.printStackTrace(ex);
          return  false;
      }
   
   
   }
   
   
   public ArrayList<String> getPackageInfo(int package_id)
   {
        ArrayList<String> info = new ArrayList<String>();
        
         try 
         {
         statement = con.createStatement();
         
         ResultSet result = statement.executeQuery("SELECT * FROM COMPONENT_, PACKAGE_ WHERE COMPONENT_.COMPONENT_ID=PACKAGE_.COMPONENT_ID AND PACKAGE_.PACKAGE_ID=" + package_id);

         while (result.next()) 
            
         {
            
           info.add(result.getString("COMPONENT"));
           info.add(result.getString("PACKAGE_NAME"));
           info.add(result.getString("DESCRIPTION"));

         }
           
      } 
         catch (SQLException ex)
      {
          Exceptions.printStackTrace(ex);
      }
   
         return info; 
         
   }
   

   

}
