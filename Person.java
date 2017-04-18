package prj5;

public class Person {

    private int id;
    private int date;
    private String major;
    private String region;
    private String hobby;


    /**
     * Sets up Person object
     */
    public Person() {
        id = 0;
        date = 0;
        major = "";
        region = "";
        hobby = "";
    }


    /**
     * Gives id of student.
     * 
     * @return id of student
     */
    public int getId() {
        return id;
    }


    /**
     * Gives date of survey.
     * 
     * @return date of survey
     */
    public int getDate() {
        return date;
    }


    /**
     * Gives major of student
     * 
     * @return Major of student
     */
    public String getMajor() {
        return major;
    }


    /**
     * Gives region of student.
     * 
     * @return Region where student is from.
     */
    public String getRegion() {
        return region;
    }


    /**
     * Gives hobby of student
     * 
     * @return Hobby of student
     */
    public String getHobby() {
        return hobby;
    }


    /**
     * Sets up correct major for student.
     * 
     * @param newMajor
     *            New major of student.
     */
    public void setMajor(String newMajor) {
        major = newMajor;
    }


    /**
     * Sets up correct region where student is from.
     * 
     * @param newRegion
     *            New region of student.
     */
    public void setRegion(String newRegion) {
        region = newRegion;
    }


    /**
     * Sets up correct hobby for student.
     * 
     * @param newHobby
     *            New hobby of student.
     */
    public void setHobby(String newHobby) {
        hobby = newHobby;
    }


    /**
     * Sets the id of student.
     * 
     * @param newId
     *            New id of student.
     */
    public void setId(int newId) {
        id = newId;
    }


    /**
     * Sets date of survey.
     * 
     * @param newDate
     *            Correct date student did survey.
     */
    public void setDate(int newDate) {
        date = newDate;
    }
}
