
package composite;

public class Song extends SongComponent {
    String BandName;
    String SongName;
    int ReleaseYear;
    
    public Song(String bandName, String songName, int releaseYear){
        BandName = bandName;
        SongName = songName;
        ReleaseYear = releaseYear;
    }
    
    
    public String getSongName(){
        return SongName;
    }
    
    public String getBandName(){
        return BandName;
    }
    
    public int getReleaseYear(){
        return ReleaseYear;
    }
    
    public void displaySongInfo(){
        System.out.println(getSongName() + " was recorded by " + getBandName()
        + " in " + getReleaseYear());
    }
}
