package prj5;

import CS2114.Button;
import CS2114.Window;
import CS2114.WindowSide;
import CS2114.Shape;

public class GUIDisplay {

    private Window window;
    private Button quitButton;
    private Button sortTitle;
    private Button sortYear;
    private Button sortGenre;
    private Button sortArtist;
    private Button hobbyButton;
    private Button regionButton;
    private Button majorButton;
    private Button nextButton;
    private Button previousButton;
    private Shape legendBox;
    private SortedGlyphList list;

    /**
     * Sets up window for Project 5
     */
    public GUIDisplay() {
        window = new Window();
        window.setTitle("Project 5 iladjerid kayley25 msjon94");
        setTopButtons();
        setBottomButtons();
        list = new SortedGlyphList();
    }


    /**
     * Sets up the buttons needed at the top of the window.
     */
    private void setTopButtons() {
        previousButton = new Button("\u2190 Previous");
        previousButton.onClick(this, "clickedPrevious");
        window.addButton(previousButton, WindowSide.NORTH);
        sortArtist = new Button("Sort by Artist Name");
        sortArtist.onClick(this, "clickedArtist");
        window.addButton(sortArtist, WindowSide.NORTH);
        sortTitle = new Button("Sort by Song Title");
        sortTitle.onClick(this, "clickedTitle");
        window.addButton(sortTitle, WindowSide.NORTH);
        sortYear = new Button("Sort by Release Year");
        sortYear.onClick(this, "clickedYear");
        window.addButton(sortYear, WindowSide.NORTH);
        sortGenre = new Button("Sort by Genre");
        sortGenre.onClick(this, "clickedGenre");
        window.addButton(sortGenre, WindowSide.NORTH);
        nextButton = new Button("Next \u2192");
        nextButton.onClick(this, "clickedNext");
        window.addButton(nextButton, WindowSide.NORTH);
    }


    /**
     * Sets up the buttons needed at the bottom of the window.
     */
    private void setBottomButtons() {
        hobbyButton = new Button("Represent Hobby");
        hobbyButton.onClick(this, "clickedHobby");
        window.addButton(hobbyButton, WindowSide.SOUTH);
        majorButton = new Button("Represent Major");
        majorButton.onClick(this, "clickedMajor");
        window.addButton(majorButton, WindowSide.SOUTH);
        regionButton = new Button("Represent Region");
        regionButton.onClick(this, "clickedRegion");
        window.addButton(regionButton, WindowSide.SOUTH);
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.SOUTH);
    }


    /**
     * Quit button will exit the window.
     * 
     * @param button
     */
    public void clickedQuit(Button button) {
        System.exit(0);
    }


    /**
     * Previous button will set up previous nine glyphs in right order.
     * 
     * @param button
     */
    public void clickedPrevious(Button button) {

    }


    /**
     * Will arrange the glyphs by the name of the song artist.
     * 
     * @param button
     */
    public void clickedArtist(Button button) {

    }


    /**
     * Will arrange the glyphs by song title.
     * 
     * @param button
     */
    public void clickedTitle(Button button) {

    }


    /**
     * Will arrange the glyphs in order by year of release.
     * 
     * @param button
     */
    public void clickedYear(Button button) {

    }


    /**
     * Will arrange the glyphs by song genre.
     * 
     * @param button
     */
    public void clickedGenre(Button button) {

    }


    /**
     * Will set up next nine glyphs in right order.
     * 
     * @param button
     */
    public void clickedNext(Button button) {

    }


    /**
     * Will represent the student survey response by hobby.
     * 
     * @param button
     */
    public void clickedHobby(Button button) {

    }


    /**
     * Will represent the student survey responses by major
     * 
     * @param button
     */
    public void clickedMajor(Button button) {

    }


    /**
     * Will represent the student survey responses by region
     * 
     * @param button
     */
    public void clickedRegion(Button button) {

    }
}
