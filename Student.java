public  class Student extends Person {
    protected String myIdNum; // Student id Number
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) {
        // use the super class' constructor
        super (name, age, gender);
        // initialize what's new to Student
        myIdNum = idNum;
        myGPA = gpa;
    }
    // Get and Set methods for myIdNum, myGPA
    public String getIdNum() {
        return myIdNum;
    }
    public void setIdNum(String idNum) {
        myIdNum = idNum;
    }
    public double getGPA() {
        return myGPA;
    }
    public void setGPA(double gpa) {
        myGPA = gpa;
    }
    //toString method
    @Override
    public String toString() {
        return super.toString() + ", student id: " + myIdNum + ", gpa: " + myGPA;
    }

}