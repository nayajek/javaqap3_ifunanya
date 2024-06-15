public class Teacher extends Person {
    private String subject; // subject the teacher teaches
    private double salary; // salary

    public Teacher(String name, int age, String gender, String subject, double salary) {
        // use the super class' constructor
        super(name, age, gender);
        // initialize what's new to Teacher
        this.subject = subject;
        this.salary = salary;
    }

    // Get and Set methods for subject, salary
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //toString method
    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: " + salary;
    }
}