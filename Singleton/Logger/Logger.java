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
public class Logger {
    
    // private static logger
    private static Logger logger;
    
    //private constructor, prevents multiple instances
    private Logger(){}
    
    // how to get the logger
    public static Logger getInstance(){
        
        // if logger has alread been instanciated
        // then return it
        if(logger != null){
            return logger;
        } 
        // else create new instance
        else {
            logger = new Logger();
            return logger;
        }
    }
    
    // log message
    public void log(){
        System.out.println("Logging...");
    }
}
