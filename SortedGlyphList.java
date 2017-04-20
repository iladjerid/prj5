
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

    /**
    * method used to add a song to the sorted list
    *
    * @param songList sorted list you wish to add to
    * @param command name of song being added
    */
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

    /**
    * method used to retrieve the glyph list
    *
    * @return LList<Glyph> list of glyphs used to retrieve glyphs
    */
    public LList<Glyph> getGlyphList() {
        return glyphList;
    }
}
