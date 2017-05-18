/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author 40111067
 */
public class Demo {
    
    public static void main(String[] args) {
        
        //Cannot create new instance of logger
        // due to private constructor
        //Logger logger = new Logger();
        
        // Gets instance of logger
        Logger logger = Logger.getInstance();
        logger.log();
        
        // logger1 is not a new object
        // logger1 is the same as logger
        Logger logger1 = Logger.getInstance();
        logger1.log();
        
    }
    
}
