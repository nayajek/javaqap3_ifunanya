public class CollegeStudent extends Student {
    private int year; // year of study
    private String major; // student's major 

    public CollegeStudent(String name, int age, String gendeString, String idNum, double gpa, int year, String major) {
        // use the super class' constructor
        super(name, age, gendeString, idNum, gpa);
        // initialize what's new to CollegeStudent
        this.year = year;
        this.major = major;
    }

    // Get and Set methods for year, major
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + ", year: " + year + ", major: " + major;
    }
}