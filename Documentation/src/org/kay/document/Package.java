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
public class Package {
   
   private int Package_ID;
   private String Package;
   private int Component_ID;
   private String description;

   /**
    * @return the Package_ID
    */
   public int getPackage_ID() {
      return Package_ID;
   }

   /**
    * @param Package_ID the Package_ID to set
    */
   public void setPackage_ID(int Package_ID) {
      this.Package_ID = Package_ID;
   }

   /**
    * @return the Package
    */
   public String getPackage() {
      return Package;
   }

   /**
    * @param Package the Package to set
    */
   public void setPackage(String Package) {
      this.Package = Package;
   }

   /**
    * @return the Component_ID
    */
   public int getComponent_ID() {
      return Component_ID;
   }

   /**
    * @param Component_ID the Component_ID to set
    */
   public void setComponent_ID(int Component_ID) {
      this.Component_ID = Component_ID;
   }

   /**
    * @return the description
    */
   public String getDescription() {
      return description;
   }

   /**
    * @param description the description to set
    */
   public void setDescription(String description) {
      this.description = description;
   }
   
   
   
}
