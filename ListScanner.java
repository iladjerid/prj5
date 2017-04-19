/**
 * 
 */
package prj5;

/**
 * class used to go through the list created to keep track of points
 * for each category and genre as well as the survey responses.
 * @author ilyes adjerid
 * 
 */
public class ListScanner {
    public int[] heardSport;
    public int[] heardMusic;
    public int[] heardRead;
    public int[] heardArt;
    public int[] likeSport;
    public int[] likeMusic;
    public int[] likeRead;
    public int[] likeArt;
    public SortedPeopleList people;
    public SortedSongList songs;

    /**
    * Constructor used to recievce the survey entry and their song choice scores
    * for a specific song name
    * @param fileNameSurvey to indicate the survey selected
    * @param fileNameSong to indicate which song is to be scanned
    */
    public ListScanner(String fileNameSurvey, String fileNameSong) {
        people = readListFileSurvey(fileNameSurvey);
        songs = readListFileSong(fileNameSong);
        heardSport = new int[people.getSportHobby().getLength()];
        likeSport = new int[people.getSportHobby().getLength()];
        heardMusic = new int[people.getMusicHobby().getLength()];
        likeMusic = new int[people.getMusicHobby().getLength()];
        heardRead = new int[people.getReadHobby().getLength()];
        likeRead = new int[people.getReadHobby().getLength()];
        heardArt = new int[people.getArtHobby().getLength()];
        likeArt = new int[people.getArtHobby().getLength()];
        songListData(fileNameSurvey, people);
        GUIDisplay disp = new GUIDisplay();
    }

    /**
    * Method that goes through the list containing each persons name and their 
    * stored data as well
    * @param fileName used to input the name to search for 
    * @return SortedPeopleList a sorted list of people from the filename
    */
    public SortedPeopleList readListFileSurvey(String fileName) {
        SortedPersonList persons = new SortedPersonList();
        File f = new File(fileName);
        try {
            Scanner file = new Scanner(f);
            while (file.hasNextLine()) {
                String data[] = file.nextLine().split("*,*");
                Person person = new Person();
                int id = Integer.parseInt(data[0]);
                int year = Integer.parseInt(data[1]);
                person.setId(id);
                person.setDate(year);
                person.setMajor(data[2]);
                person.setRegion(data[3]);
                person.setHobby(data[4]);
                persons.add(person, "hobby");
                persons.add(person, "region");
                persons.add(person, "major");
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SortedPeopleList list = new SortedPeopleList(persons);
        return list;
    }

    /**
    * method used to retrieve the specific data for the person and
    * analyze their choices according to the specific song
    * @param fileName to search for a song input
    * @param people to find a sorted person from survey
    */
    public void songListData(String fileName, SortedPeopleList people) {
        File f = new File(fileName);
        try {
            Scanner file = new Scanner(f);
            while (file.hasNextLine()) {
                String[] string = file.nextLine().split("*,*");
                String[] ans = new String[string.length - 5];
                for (int i = 0; i < ans.length; i++) {
                    ans[i] = string[i + 5];
                }
                int hCount = 0;
                int lCount = 0;
                for (int i = 0; i < ans.length; i++) {
                    if (i % 2 != 1) {
                        if (ans[i].equals("Yes") && string[4].equals(
                            "Sports")) {
                            heardSport[hCount]++;
                        }
                        else {
                            if (ans[i].equals("Yes") && string[4].equals(
                                "Music")) {
                                heardMusic[hCount]++;
                            }
                            else {
                                if (ans[i].equals("Yes") && string[4].equals(
                                    "Reading")) {
                                    heardRead[hCount]++;
                                }
                                else {
                                    if (ans[i].equals("Yes") && string[4]
                                        .equals("Art")) {
                                        heardArt[hCount]++;
                                    }
                                }
                            }
                        }
                        hCount++;
                    }
                    else {
                        if (ans[i].equals("Yes") && string[4].equals("Music")) {
                            likeMusic[lCount]++;
                        }
                        else {
                            if (ans[i].equals("Yes") && string[4].equals(
                                "Sports")) {
                                likeSport[lCount]++;
                            }
                            else {
                                if (ans[i].equals("Yes") && string[4].equals(
                                    "Reading")) {
                                    likeRead[lCount]++;
                                }
                                else {
                                    if (ans[i].equals("Yes") && string[4]
                                        .equals("Art")) {
                                        likeArt[lCount]++;
                                    }
                                }
                            }
                        }
                        lCount++;
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
    * method that retrieves the song object and its data 
    * the input song name
    * @param fileName name of the file to be read
    * @return SortedSongList returns the sorted song list from the file indicated
    */
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
