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
public interface Vehicle extends Cloneable {
    

    String getMake();
    int getEngineSize();
    String getDrive();
    public Object clone();

}
