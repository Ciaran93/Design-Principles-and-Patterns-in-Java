//
//package composite;
//
//
//public class SongGenerator {
//    
//    public static void main(String[] args) {
//        
//        //Create new song groups of different types of genres
//        SongComponent rockMusic = new SongGroup("Rock","This is Rock music");        
//        SongComponent indieRockMusic = new SongGroup("This is Indie Rock","Indie Rock music");
//        SongComponent houseMusic = new SongGroup("This is House","House music");        
//        SongComponent deepHouseMusic = new SongGroup("This is Deep House","Deep House music");
//        
//        //Create a song group for every song
//        SongComponent everySong = new SongGroup("Every Song", "This is every song available");
//        
//        //Add the rock music to the Every song group
//        everySong.add(rockMusic);
//        
//        //add songs to the rock music group under Every Song
//        rockMusic.add(new Song("Go With The Flow", "QOTSA", 2001));        
//        rockMusic.add(new Song("Many of Horror", "Biffy", 2009));
//        
//        // Add indie rock as a subgroup of rock music
//        rockMusic.add(indieRockMusic);
//        indieRockMusic.add(new Song("the Strokes", "Last Night", 2001));
//
//        everySong.add(houseMusic);
//        houseMusic.add(new Song("Dunno","House every Weekend",2016));
//        
//        DJ ch = new DJ(everySong);
//        
//        ch.getSongList();
//
//    }
//    
//}
