package lab1.task2;

import java.util.ArrayList;

public class Course {
    private String title;
    private String description;
    private Student[] students = new Student[20];


    public void setTitle(String title_given) {
        this.title = title_given;
    }

    public String getTitle() {
        return this.title;
    }

    public void setDescription(String description_given) {
        this.description = description_given;
    }

    public String getDescription() {
        return this.description;
    }

    public void setStudents(Student[] students_given) {
        this.students = students_given;
    }

    public ArrayList<Student> filterYear(Integer year_needed) {
        ArrayList<Student> listStudents = new ArrayList();

        for (int i = 0; i < this.students.length; ++i) {
            if (this.students[i].getYear().equals(year_needed)) {
                listStudents.add(this.students[i]);
            }
        }
        ArrayList<String> st = new ArrayList();
        return listStudents;
    }



}