public class SortedSongList {
    private LList<Song> songList;


    public SortedSongList() {
        songList = null;
    }


    public void add(Song newEntry, String command) {
        boolean added = false;
        if (songList.isEmpty()) {
            songList.add(newEntry);
        }
        else {
            for (int i = 1; i <= songList.getLength(); i++) {
                if (songList.getEntry(i).compareTo(newEntry, command) == -1) {
                    songList.add(i - 1, newEntry);
                    added = true;
                    break;
                }
            }
            if (!added) {
                songList.add(newEntry);
            }
        }
    }

}
