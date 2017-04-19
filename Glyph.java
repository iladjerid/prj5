package prj5;

import java.awt.Color;
import CS2114.Shape;
import CS2114.TextShape;

/**
 * @author Jonathan
 *
 */
public class Glyph 
{   
    private Shape midBar;
    private TextShape title;
    private Shape readBarHeard;
    private Shape readBarLike;
    private Shape artBarHeard;
    private Shape artBarLike;
    private Shape sportsBarHeard;
    private Shape sportsBarLike;
    private Shape musicBarHeard;
    private Shape musicBarLike;
    private Song song;
    
    
    /**
     * Sets up glyph object
     */
    public Glyph()
    {
        song = new Song();
        title = new TextShape(0, 0, "");
        midBar = new Shape(2, 1, 1, 4, Color.BLACK);
        readBarHeard = new Shape(1, 1, 1, 1, Color.PINK);
        readBarLike = new Shape(3, 1, 1, 1, Color.PINK);
        artBarHeard = new Shape(1, 2, 1, 1, Color.BLUE);
        artBarLike = new Shape(3, 2, 1, 1, Color.BLUE);
        sportsBarHeard = new Shape(1, 3, 1, 1, Color.GREEN);
        sportsBarLike = new Shape(3, 3, 1, 1, Color.GREEN);
        musicBarHeard = new Shape(1, 4, 1, 1, Color.YELLOW);
        musicBarLike = new Shape(3, 4, 1, 1, Color.YELLOW);
    }
    
     public void setSong(Song song) {
        this.song.setName(song.getName());
        this.song.setArtist(song.getArtist());
        this.song.setGenre(song.getGenre());
        this.song.setYear(song.getYear());
    }
}
