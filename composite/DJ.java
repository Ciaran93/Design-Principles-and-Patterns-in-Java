/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author 40111067
 */
public class DJ {
    
    SongComponent songList;
    
    public DJ(SongComponent newSongList){
        songList = newSongList;
    }
    
    public void getSongList(){
        songList.displaySongInfo();
    }
    
}
