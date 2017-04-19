
/**
* class used to store and order the glyphs created for each song so
* so that they can be retrieved and called upon
*/
public class SortedGlyphList {
    private LList<Glyph> glyphList;

    /**
    * Constructor method used to initilaize the fields created
    */
    public SortedGlyphList() {
        glyphList = new LList<Glyph>();
    }

    
    public void add(SortedSongList songList, String command) {
        LList<Song> list = new LList<Song>();
        if (command == "name") {
            list = songList.getSongListName();
        }
        else {
            if (command == "artist") {
                list = songList.getSongListArtist();
            }
            else {
                if (command == "genre") {
                    list = songList.getSongListGenre();
                }
                else {
                    list = songList.getSongListYear();
                }
            }
        }
        for (int i = 1; i <= list.getLength(); i++) {
            glyphList.getEntry(i).setSong(list.getEntry(i));
        }
    }


    public LList<Glyph> getGlyphList() {
        return glyphList;
    }
}
