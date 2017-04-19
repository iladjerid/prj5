public class SortedSongList {
    private LList<Song> songListName;
    private LList<Song> songListArtist;
    private LList<Song> songListGenre;
    private LList<Song> songListYear;


    public SortedSongList() {
        songListName = new LList<Song>();
        songListArtist = new LList<Song>();
        songListGenre = new LList<Song>();
        songListYear = new LList<Song>();
    }


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


    public LList<Song> getSongListName() {
        return songListName;
    }


    public int getNameSize() {
        return songListName.getLength();
    }


    public LList<Song> getSongListArtist() {
        return songListArtist;
    }


    public int getArtistSize() {
        return songListArtist.getLength();
    }


    public LList<Song> getSongListGenre() {
        return songListGenre;
    }


    public int getGenreSize() {
        return songListGenre.getLength();
    }


    public LList<Song> getSongListYear() {
        return songListYear;
    }


    public int getYearSize() {
        return songListYear.getLength();
    }

}
