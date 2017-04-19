/**
 * 
 */
package prj5;

/**
 * @author iladj
 *
 */
public class ListScanner {

    public ListScanner(String fileNameSurvey, String fileNameSong) {

        GUIDisplay disp = new GUIDisplay();
    }


    public SortedPersonList readListFileSurvey(String fileName) {
        SortedPersonList list = new SortedPersonList();
        File f = new File(fileName);
        try {
            Scanner file = new Scanner(f);
            while(file.hasNextLine()) {
                String data[] = file.nextLine().split("*,*");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }


    public SortedSongList readListFileSong(String fileName) {
        SortedSongList list = new SortedSongList();
        File f = new File(fileName);
        try {
            Scanner file = new Scanner(f);
            while (file.hasNextLine()) {
                String data[] = file.nextLine().split("*,*");
                int year = Integer.parseInt(data[2]);
                Song song = new Song(data[0], data[1], data[3], year);
                list.addName(song);
                list.addArtist(song);
                list.addGenre(song);
                list.addYear(song);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
}
