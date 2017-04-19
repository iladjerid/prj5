
package prj5;

/**
     * @author Kayley Bogemann (kayley25)
     * @version 2017.04.17
     */
    public class Song {
        private String name;
        private String artist;
        private String genre;
        private int year;


        /**
         * default constructor
         */
        public Song() {
            name = "";
            artist = "";
            genre = "";
            year = 0;
        }


        /**
         * Constructor
         * 
         * @param name
         *            Name of song
         * @param artist
         *            Name of artist
         * @param genre
         *            Genre of song
         * @param year
         *            Year song was made
         */
        public Song(String name, String artist, String genre, int year) {
            this.name = name;
            this.artist = artist;
            this.genre = genre;
            this.year = year;
        }


     /**
     * compares two song objects for equality based on a certain attribute
     * 
     * @param aSong
     *            song to be compared to this
     * @param command
     *            attribute to be used for comparison
     * @return 0 if equal, 1 if anEntry > this, -1 if anEntry < this
     */
    public int compareTo(Song aSong, String command) {
        if (command.equals("name")) {
            return this.getName().compareTo(aSong.getName());
        }
        else {
            if (command.equals("artist")) {
                return this.getArtist().compareTo(aSong.getArtist());
            }
            else {
                if (command.equals("genre")) {
                    return this.getGenre().compareTo(aSong.getGenre());
                }
                else {
                    if (this.getYear() < aSong.getYear()) {
                        return 1;
                    }
                    else {
                        if (this.getYear() > aSong.getYear()) {
                            return -1;
                        }
                        else {
                            return 0;
                        }
                    }
                }
            }
      
        /**
         * gets genre of song
         * 
         * @return genre of song
         */
        public String getGenre() {
            return genre;
        }


        /**
         * gets year song was made
         * 
         * @return year song was made
         */
        public int getYear() {
            return year;
        }


        /**
         * gets artist of song
         * 
         * @return artist of song
         */
        public String getArtist() {
            return artist;
        }


        /**
         * gets song name
         * 
         * @return name of song
         */
        public String getName() {
            return name;
        }


        /**
         * creates a string of song with the following format:
         * Song Title:
         * Song Artist:
         * Song Genre:
         * Song Year:
         * 
         * @return string representation of song
         */
        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("Song Title: ");
            s.append(name);
            s.append("\nSong Artist: ");
            s.append(artist);
            s.append("\nSong Genre: ");
            s.append(genre);
            s.append("\nSong Year: ");
            s.append(year);
            return s.toString();
        }


        /**
         * checks if two objects are equal
         * song objects are equal if they have the same name, artist, year, and
         * genre
         * 
         * @return true if equal, otherwise returns false
         */
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (object == null) {
                return false;
            }
            if (this.getClass() == object.getClass()) {
                Song obj = (Song)object;
                if ((this.getArtist().equals(obj.getArtist())) && (this.getName()
                    .equals(obj.getName())) && (this.getYear() == obj.getYear())
                    && (this.getGenre().equals(obj.getGenre()))) {
                    return true;
                }
            }
            return false;
        }
    }
