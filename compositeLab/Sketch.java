package compositeLab;

import java.util.List;

public class Sketch extends SketchedItem{
    public Sketch(String description, int cost) {
        super(description, cost);
    }
 
    // Need Empty implementations for adding and removing..

    @Override
    public SketchedItem[] getItems() {
    	return new SketchedItem[0];}

    @Override
    public void addItem(SketchedItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeItem(SketchedItem item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
}
