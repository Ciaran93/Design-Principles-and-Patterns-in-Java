
package composite;

import java.util.ArrayList;
import java.util.Iterator;


public class SongGroup extends SongComponent{
    
    ArrayList songComponents = new ArrayList();
    
    String groupName;
    String groupDescription;
    
    public SongGroup(String groupName, String groupDescription){
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }
       
    public String getGroupName(){ return this.groupName; }    
    public String getGroupDescription(){ return this.groupDescription; }
    
    
    public void add(SongComponent songCom){
        
        songComponents.add(songCom);
    }
    public void remove(SongComponent songCom){
        
        songComponents.remove(songCom);
    }
    
    public SongComponent getComponent(int songComIndex){
        return (SongComponent)songComponents.get(songComIndex);
    }
    
    public void displaySongInfo(){
        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
        
        Iterator songIterator = songComponents.iterator();
        
        while(songIterator.hasNext()){
            SongComponent songInfo = (SongComponent)songIterator.next();
            songInfo.displaySongInfo();
        }
    }
}
