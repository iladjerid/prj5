/**
 * 
 */
package prj5;


    public class Input {

    public static void main(String[] args) {
        ListScanner scanner = new ListScanner(args[0], args[1]);
        SortedPeopleList people = scanner.people;
        int[] heardSports = scanner.heardSport;
        int[] likeSports = scanner.likeSport;
        int[] heardMusic = scanner.heardMusic;
        int[] likeMusic = scanner.likeMusic;
        int[] heardRead = scanner.heardRead;
        int[] likeRead = scanner.likeRead;
        int[] heardArt = scanner.heardArt;
        int[] likeArt = scanner.likeArt;
        LList<Song> genre = scanner.songs.getSongListGenre();

        for (int i = 1; i <= genre.getLength(); i++) {
            Song s = genre.getEntry(i);
            System.out.println("Song Title: " + s.getName());
            System.out.println("Song Artist: " + s.getArtist());
            System.out.println("Song Genre: " + s.getGenre());
            System.out.println("Song Year: " + s.getYear());
            System.out.println("Heard");
            System.out.println("reading:" + heardRead + " art:" + heardArt
                + " sports:" + heardSports + " music:" + heardMusic);
            System.out.println("Likes");
            System.out.println("reading:" + likeRead + " art:" + likeArt
                + " sports:" + likeSports + " music:" + likeMusic);
        }
    }

}

