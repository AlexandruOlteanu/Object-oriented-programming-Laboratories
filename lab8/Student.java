package lab8;

import java.util.ArrayList;
import java.util.List;

interface Comparable<Student>{
    int compareTo(Student student);
}

public class Student implements Comparable<Student>{
    private String name;
    private String surname;
    private Long id;
    private Double averageGrade;
    private List<String> classes = new ArrayList<>();

    public Student(final String name, final String surname, final long id, final double averageGrade){
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.averageGrade = averageGrade;
    }

    @Override
    public int compareTo(Student student) {
        if(Double.compare(this.averageGrade, student.averageGrade) == 0){
            if(this.name.compareTo(student.name) == 0){
                return this.surname.compareTo(student.surname);
            }
            else{
                return this.name.compareTo(student.name);
            }
        }
        else{
            return Double.compare(this.averageGrade, student.averageGrade);
        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public long getId() {
        return id;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public List<String> getClasses() {
        return classes;
    }

    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    @Override
    public String toString(){
        return "Name : " + this.name + ", Surname : " + this.surname + ", Id : " + this.id + ", Average Grade : "
                + this.averageGrade;
    }

}
