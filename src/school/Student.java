package school;

import java.util.Objects;

public class Student
{
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId,
                   int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public static int getNextStudentId() {
        return nextStudentId;
    }

    public void setGpa(double aGpa) {
        this.gpa = aGpa;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    private void setStudentId(int aStudentId) {
        this.studentId = aStudentId;
    }

   private static void setNextStudentId(int aNextStudentId) {
         Student.nextStudentId = aNextStudentId;
    }

    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
        double totalQualityScore = (this.getGpa() * this.getNumberOfCredits());
        double classQualityScore = courseCredits * grade;
        double newGpa;
        int totalCredits = this.getNumberOfCredits() +courseCredits;

        totalQualityScore += classQualityScore;
        newGpa = totalQualityScore / totalCredits;

        this.setNumberOfCredits(totalCredits);
        this.setGpa(newGpa);
    }

    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits

        int numCredits = this.getNumberOfCredits();
        String classYear;

        if (numCredits >= 90)
        {
            classYear = "Senior";
        }
        else if (numCredits >= 60)
        {
            classYear = "Junior";
        }
        else if (numCredits >= 30)
        {
            classYear = "Sophomore";
        }
        else
        {
            classYear = "Freshman";
        }

        return classYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return (getStudentId() == student.getStudentId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numberOfCredits=" + numberOfCredits +
                ", gpa=" + gpa +
                '}';
    }
}
