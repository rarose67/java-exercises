package school;

import java.util.HashMap;

public class Course
{
    private static int nextCourseId = 1;
    private int courseId;
    private String courseName;
    private String major;
    private String teacherName;
    private HashMap<Integer, Student> students;

    public Course(int courseId, String courseName, String major, String teacherName, HashMap<Integer, Student> students) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.major = major;
        this.teacherName = teacherName;

        if (students != null) {
            this.students = students;
        } else {
            this.students = new HashMap<>();
        }
    }

    public Course(String courseName, String major, String teacherName, HashMap<Integer, Student> students)
    {
        this(nextCourseId, courseName, major, teacherName, students);
        nextCourseId++;
    }

    public int getCourseId() {
        return courseId;
    }

    public static int getNextCourseId() {
        return nextCourseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getMajor() {
        return major;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public HashMap<Integer, Student> getStudents() {
        return students;
    }

    private void setCourseId(int aCourseId) {
        this.courseId = aCourseId;
    }

    private static void setNextCourseId(int aNextCourseId) {
        Course.nextCourseId = aNextCourseId;
    }

    public void setCourseName(String aCourseName) {
        this.courseName = aCourseName;
    }

    public void setMajor(String aMajor) {
        this.major = aMajor;
    }

    public void setTeacherName(String aTeacherName) {
        this.teacherName = aTeacherName;
    }

    public void setStudents(HashMap<Integer, Student> aStudents) {
        this.students = aStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course)) return false;
        Course course = (Course) o;
        return getCourseId() == course.getCourseId();
    }

    @Override
    public String toString() {
        return "Course{" +
                "\n\tcourseId=" + courseId +
                "\n\t courseName='" + courseName + '\'' +
                "\n\t major='" + major + '\'' +
                "\n\t teacherName='" + teacherName + '\'' +
                "\n\t students=" + students +
                "\n}";
    }
}
