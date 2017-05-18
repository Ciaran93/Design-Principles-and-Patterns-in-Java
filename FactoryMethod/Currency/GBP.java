/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod1;

/**
 *
 * @author 40111067
 */
public class GBP implements Currency{

    @Override
    public String getCurrencySymbol() {
        return "£";
    }
    
}
