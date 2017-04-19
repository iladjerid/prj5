public class SortedPersonList {
    private LList<Person> hobbyList;
    private LList<Person> regionList;
    private LList<Person> majorList;


    public SortedPersonList() {
        hobbyList = new LList<Person>();
        regionList = new LList<Person>();
        majorList = new LList<Person>();
    }


    public void add(Person newEntry, String command) {
        if (command == "hobby") {
            hobbyList.add(newEntry);
        }
        else {
            if (command == "major") {
                majorList.add(newEntry);
            }
            else {
                regionList.add(newEntry);
            }
        }
    }
    
    public LList<Person> getHobbyList() {
        return hobbyList;
    }


    public LList<Person> getMajorList() {
        return majorList;
    }


    public LList<Person> getRegionList() {
        return regionList;
    }
}
