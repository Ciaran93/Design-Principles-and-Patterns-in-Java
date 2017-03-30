
package composite;


public abstract class SongComponent {

    public void add(SongComponent newSongCom){
        throw new UnsupportedOperationException();
    }
    public void remove(SongComponent newSongCom){
        throw new UnsupportedOperationException();
    }
    
    
    public SongComponent getComponent(int songComIndex){
        throw new UnsupportedOperationException();
    }
    
    public String getSongName(){
        throw new UnsupportedOperationException();
    }
    
    public String getBandName(){
        throw new UnsupportedOperationException();
    }
    
    public int getReleaseYear(){
        throw new UnsupportedOperationException();
    }
    
    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
