package lab4.database;

import lab4.people.Student;
import lab4.people.Teacher;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Database {
    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();
    private static int instanceCount = 0;

    // TODO: make it Singleton
    private static Database instance = null;

    public Database(){
        ++instanceCount;
    }

    public static Database getDatabase(){
       if(instance == null){
           instance = new Database();
       }
       return instance;
    }

    public static int getNumberOfInstances() {
        return instanceCount;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> new_list = new ArrayList<>();
        for(Teacher teacher : teachers){
            if(teacher.getSubjects().contains(subject)){
                new_list.add(new Teacher(teacher));
            }
        }
        return new_list;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> new_list = new ArrayList<>();
        for(Student student : students){
            if(student.getSubjects().containsKey(subject)){
                new_list.add(new Student(student));
            }
        }
        return new_list;
    }

    public List<Student> getStudentsByAverageGrade() {
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.averageGrade() < o1.averageGrade()){
                    return 1;
                }
                return 0;
            }
        });
        return students;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> new_list = this.getStudentsBySubject(subject);
        new_list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o2.getGradeForSubject(subject) < o1.getGradeForSubject(subject)){
                    return 1;
                }
                return 0;
            }
        });
        return new_list;
    }
}
