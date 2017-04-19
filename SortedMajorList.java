public class SortedPeopleList {
    private LList<Person> majorCS;
    private LList<Person> majorCMDA;
    private LList<Person> majorEng;
    private LList<Person> majorOth;
    private LList<Person> regionSE;
    private LList<Person> regionNE;
    private LList<Person> regionUS;
    private LList<Person> regionNot;
    private LList<Person> hobbySports;
    private LList<Person> hobbyMusic;
    private LList<Person> hobbyRead;
    private LList<Person> hobbyArt;


    public SortedPeopleList(SortedPersonList persons) {
        LList<Person> majors = persons.getMajorList();
        LList<Person> regions = persons.getRegionList();
        LList<Person> hobbies = persons.getHobbyList();
        for (int i = 1; i <= majors.getLength(); i++) {
            if (majors.getEntry(i).getMajor().equals("Computer Science")) {
                majorCS.add(majors.getEntry(i));
            }
            else {
                if (majors.getEntry(i).getMajor().equals("Math or CMDA")) {
                    majorCMDA.add(majors.getEntry(i));
                }
                else {
                    if (majors.getEntry(i).getMajor().equals(
                        "Other Engineering")) {
                        majorEng.add(majors.getEntry(i));
                    }
                    else {
                        majorOth.add(majors.getEntry(i));
                    }
                }
            }
        }
        for (int i = 1; i <= regions.getLength(); i++) {
            if (regions.getEntry(i).getRegion().equals("Southeast")) {
                regionSE.add(regions.getEntry(i));
            }
            else {
                if (regions.getEntry(i).getRegion().equals("Northeast")) {
                    regionNE.add(regions.getEntry(i));
                }
                else {
                    if (regions.getEntry(i).getRegion().equals(
                        "United States (other than Southeast or Northwest)")) {
                        regionUS.add(regions.getEntry(i));
                    }
                    else {
                        regionNot.add(regions.getEntry(i));
                    }
                }
            }
        }
        for (int i = 1; i <= hobbies.getLength(); i++) {
            if (hobbies.getEntry(i).getHobby().equals("sports")) {
                hobbySports.add(hobbies.getEntry(i));
            }
            else {
                if (hobbies.getEntry(i).getHobby().equals("music")) {
                    hobbyMusic.add(hobbies.getEntry(i));
                }
                else {
                    if (hobbies.getEntry(i).getHobby().equals("reading")) {
                        hobbyRead.add(hobbies.getEntry(i));
                    }
                    else {
                        hobbyArt.add(hobbies.getEntry(i));
                    }
                }
            }
        }
    }


    public LList<Person> getCSMajor() {
        return majorCS;
    }


    public LList<Person> getCMDAMajor() {
        return majorCMDA;
    }


    public LList<Person> getEngMajor() {
        return majorEng;
    }


    public LList<Person> getOtherMajor() {
        return majorOth;
    }


    public LList<Person> getSERegion() {
        return regionSE;
    }


    public LList<Person> getNERegion() {
        return regionNE;
    }


    public LList<Person> getUSRegion() {
        return regionUS;
    }


    public LList<Person> getOtherRegion() {
        return regionNot;
    }


    public LList<Person> getSportHobby() {
        return hobbySports;
    }


    public LList<Person> getMusicHobby() {
        return hobbyMusic;
    }


    public LList<Person> getReadHobby() {
        return hobbyRead;
    }


    public LList<Person> getArtHobby() {
        return hobbyArt;
    }

}
