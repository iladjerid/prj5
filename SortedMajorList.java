public class SortedMajorList {
    private LList<Person> majorCS;
    private LList<Person> majorCMDA;
    private LList<Person> majorEng;
    private LList<Person> majorOth;


    public SortedMajorList(SortedPersonList persons) {
        LList<Person> majors = persons.getMajorList();
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
}
