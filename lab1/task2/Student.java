package lab1.task2;

public class Student {
    private String name;
    private Integer year = Integer.valueOf("0");


    public void setName(String name_given) {
        this.name = name_given;
    }

    public String getName() {
        return this.name;
    }

    public void setYear(Integer year_given) {
        this.year = year_given;
    }

    public Integer getYear() {
        return this.year;
    }

    public String toString() {
        return "Student{name='" + this.name + "', year=" + this.year + "}";
    }
}