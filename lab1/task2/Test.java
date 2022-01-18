package lab1.task2;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        //Integer year = Integer.parseInt(args[0]);
        int year = 1;
        Course curs_poo = new Course();
        Student[] lista_studenti = new Student[20];

        for(int i = 0; i < lista_studenti.length; ++i) {
            lista_studenti[i] = new Student();
            lista_studenti[i].setName("A" + Character.toString(65 + i));
            lista_studenti[i].setYear(i % 4 + 1);
        }

        curs_poo.setTitle("Programare Orientata pe Obiecte");
        curs_poo.setDescription("Asta e cel mai tare curs ever si laborantii sunt super de treaba <3");
        curs_poo.setStudents(lista_studenti);
        ArrayList<Student> final_list = curs_poo.filterYear(Integer.valueOf(year));

        for(int i = 0; i < final_list.size(); ++i) {
            System.out.println(((Student)final_list.get(i)).toString());
        }

        // Task 3
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Alex");
        student1.setYear(2);
        student2.setName("Alex");
        student2.setYear(2);
        System.out.println(student1.equals(student2));

        // Functia Equals returneaza false deoarece cele doua obiecte au adresa memoriei diferita!
    }
}
