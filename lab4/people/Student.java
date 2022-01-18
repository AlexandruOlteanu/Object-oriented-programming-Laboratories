package lab4.people;

import lab4.database.Database;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private String firstName;
    private String lastName;
    private Map<String, Integer> subjects;

    public Student(String firstName, String lastName, Map<String, Integer> subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjects = subjects;
    }

    // TODO: copy constructor
    public Student(Student otherStudent){
        this.firstName = new String(otherStudent.firstName);
        this.lastName = new String(otherStudent.lastName);
        this.subjects = new HashMap<String, Integer>();
        for(Map.Entry<String, Integer> entry : otherStudent.subjects.entrySet()){
            Integer aux = new Integer(entry.getValue());
            this.subjects.put(entry.getKey(), aux);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Map<String, Integer> getSubjects() {
        return subjects;
    }

    public void setSubjects(HashMap<String, Integer> subjects) {
        this.subjects = subjects;
    }

    public double averageGrade() {
        double total_sum = 0;
        for(Map.Entry<String, Integer> entry : subjects.entrySet()){
            total_sum += entry.getValue();
        }
        total_sum /= subjects.size();
        return total_sum;
    }

    public List<Teacher> getAllTeachers() {
        return Database.getDatabase().findAllTeachers();
    }

    public int getGradeForSubject(String subject) {
        return this.subjects.get(subject);
    }

    @Override
    public String toString() {
        return "Student: " + firstName + " " + lastName + "\n"
                + "Subjects: " + subjects + "\n";
    }

    public List<Teacher> getTeachersBySubject(String subject) {
        return Database.getDatabase().findTeachersBySubject(subject);
    }

    public List<Student> getAllStudents() {
        return Database.getDatabase().findAllStudents();
    }

    public List<Student> getStudentsBySubject(String subject) {
        return Database.getDatabase().getStudentsBySubject(subject);
    }

    public List<Student> getStudentsByAverageGrade() {
        return Database.getDatabase().getStudentsByAverageGrade();
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        return Database.getDatabase().getStudentsByGradeForSubject(subject);
    }
}
