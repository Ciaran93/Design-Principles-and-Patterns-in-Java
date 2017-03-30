/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Flyweight;

import java.awt.Color;
import java.util.HashMap;

/**
 *
 * @author 40111067
 */
public class LineFactory {
    
    public static final HashMap<Color, Line> lineByColour = new HashMap<Color, Line>();
    
    public static Line getLine(Color colour){
        
        Line line = (Line)lineByColour.get(colour);
        
        if(line == null){
            line = new Line(colour);
        }
        
        return line;
    }
    
}
