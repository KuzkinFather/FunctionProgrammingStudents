package homework;

import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private String surname;
    private int course;
    private List<Integer> assessments;

    public Student() {

    }
    public Student(String name, String surname, int course, List<Integer> assessments) {
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.assessments = assessments;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                ", assessments=" + assessments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(assessments, student.assessments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course, assessments);
    }

    public String getTotalName() {
        return getName() + " " + getSurname();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public List<Integer> getAssessments() {
        return assessments;
    }

    public void setAssessments(List<Integer> assessments) {
        this.assessments = assessments;
    }

}
