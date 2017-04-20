
/**
* @author
* class used to keep order and data of the sortedSongList
*/
public class SortedSongList {
    private LList<Song> songListName;
    private LList<Song> songListArtist;
    private LList<Song> songListGenre;
    private LList<Song> songListYear;

    /**
    * constructor for the sorted song linst class
    */
    public SortedSongList() {
        songListName = new LList<Song>();
        songListArtist = new LList<Song>();
        songListGenre = new LList<Song>();
        songListYear = new LList<Song>();
    }

    /**
    * method to add a song name to the list
    * @param Song original song object
    */
    public void addName(Song newEntry) {
        boolean added = false;
        if (songListName.isEmpty()) {
            songListName.add(newEntry);
        }
        else {
            for (int i = 1; i <= songListName.getLength(); i++) {
                if (songListName.getEntry(i).compareTo(newEntry,
                    "name") == -1) {
                    songListName.add(i - 1, newEntry);
                    added = true;
                    break;
                }
            }
            if (!added) {
                songListName.add(newEntry);
            }
        }
    }

    /**
    * method to add a song artist to the list
    * @param Song original song object
    */
    public void addArtist(Song newEntry) {
        boolean added = false;
        if (songListArtist.isEmpty()) {
            songListArtist.add(newEntry);
        }
        else {
            for (int i = 1; i <= songListArtist.getLength(); i++) {
                if (songListArtist.getEntry(i).compareTo(newEntry,
                    "artist") == -1) {
                    songListArtist.add(i - 1, newEntry);
                    added = true;
                    break;
                }
            }
            if (!added) {
                songListArtist.add(newEntry);
            }
        }
    }

    /**
    * method to add a song genre to the list
    * @param Song original song object
    */
    public void addGenre(Song newEntry) {
        boolean added = false;
        if (songListGenre.isEmpty()) {
            songListGenre.add(newEntry);
        }
        else {
            for (int i = 1; i <= songListGenre.getLength(); i++) {
                if (songListGenre.getEntry(i).compareTo(newEntry,
                    "genre") == -1) {
                    songListGenre.add(i - 1, newEntry);
                    added = true;
                    break;
                }
            }
            if (!added) {
                songListGenre.add(newEntry);
            }
        }

    }

    /**
    * method to add a song year to the list
    * @param Song original song object
    */
    public void addYear(Song newEntry) {
        boolean added = false;
        if (songListYear.isEmpty()) {
            songListYear.add(newEntry);
        }
        else {
            for (int i = 1; i <= songListYear.getLength(); i++) {
                if (songListYear.getEntry(i).compareTo(newEntry,
                    "year") == -1) {
                    songListYear.add(i - 1, newEntry);
                    added = true;
                    break;
                }
            }
            if (!added) {
                songListYear.add(newEntry);
            }
        }
    }

    /**
    * method to get the name list
    * @return LList<Song> list for the song spec
    */
    public LList<Song> getSongListName() {
        return songListName;
    }

    /**
    * method to get the name list size
    * @return itn size of list
    */
    public int getNameSize() {
        return songListName.getLength();
    }

    /**
    * method to get the artist list
    * @return LList<Song> list for the song spec
    */
    public LList<Song> getSongListArtist() {
        return songListArtist;
    }

    /**
    * method to get the artist list size
    * @return itn size of list
    */
    public int getArtistSize() {
        return songListArtist.getLength();
    }

    /**
    * method to get the genre list
    * @return LList<Song> list for the song spec
    */
    public LList<Song> getSongListGenre() {
        return songListGenre;
    }

    /**
    * method to get the genre list size
    * @return itn size of list
    */
    public int getGenreSize() {
        return songListGenre.getLength();
    }


    /**
    * method to get the year list
    * @return LList<Song> list for the song spec
    */
    public LList<Song> getSongListYear() {
        return songListYear;
    }

    /**
    * method to get the year list size
    * @return itn size of list
    */
    public int getYearSize() {
        return songListYear.getLength();
    }

}
