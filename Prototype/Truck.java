/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prototype;

/**
 *
 * @author 40111067
 */
public class Truck implements Vehicle {

    @Override
    public String getMake() {
        return "Dodge";
    }

    @Override
    public int getEngineSize() {
        return 3000;
    }

    @Override
    public String getDrive() {
        return "AWD";
    }


    @Override
    public Object clone() {
       Object obj = null;
       try {
           obj = super.clone();
       } catch (CloneNotSupportedException x) {
           // Should not happen...
       }
       return obj;
   }

    
}
