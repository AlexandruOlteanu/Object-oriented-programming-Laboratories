package lab8;

import java.util.*;

public class Test {

    public static void main(String[] args){

        // Exercitiul 2
        List<Student> list = new ArrayList<Student>();
        Student student1 = new Student("Olteanu", "Alexandru", 2001, 9.7);
        Student student2 = new Student("Marinus", "George", 16, 9.9);
        Student student3 = new Student("Faran", "Marius", 987, 9.7);
        Student student4 = new Student("Faran", "Arnold", 87, 9.7);
        Student student5 = new Student("Neguta", "Dorin", 93, 8.5);

        list.add(student1);list.add(student2);
        list.add(student3);list.add(student4);
        list.add(student5);

        System.out.println("Exercitiul 2\n");

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.compareTo(o2);
            }
        });

        for(Student student : list){
            System.out.println(student.toString());
        }

        // Exercitiul 3

        System.out.println("\nExercitiul 3\n");

        Collections.sort(list, (o1, o2) -> -Double.compare(o1.getAverageGrade(), o2.getAverageGrade()));

        for(Student student : list){
            System.out.println(student.toString());
        }

        PriorityQueue<Student> priorityQueue = new PriorityQueue<>(10, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Long.compare(o1.getId(), o2.getId());
            }
        });
        priorityQueue.addAll(list);

        // Exercitiul 4

        System.out.println("\nExercitiul 4\n");

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.remove().toString());
        }

        // Exercitiul 6

        System.out.println("\nExercitiul 6\n");

        HashMap<Student, List<String>> hashMap = new HashMap<>();

        student1.getClasses().add("Matematica");student1.getClasses().add("Romana");
        student2.getClasses().add("POO");student2.getClasses().add("Programare");
        student3.getClasses().add("Fizica");student3.getClasses().add("Informatica");
        student4.getClasses().add("Biologie");student4.getClasses().add("Economie");
        student5.getClasses().add("Franceza");student5.getClasses().add("Engleza");
        hashMap.put(student1, student1.getClasses());
        hashMap.put(student2, student2.getClasses());
        hashMap.put(student3, student3.getClasses());
        hashMap.put(student4, student4.getClasses());
        hashMap.put(student5, student5.getClasses());

        for(Map.Entry<Student, List<String>> entry : hashMap.entrySet()){
            System.out.printf("%s , Materii : %s\n", entry.getKey().toString(), entry.getValue().toString());
        }

        // Exercitiul 7

        System.out.println("\nExercitiul 7\n");

        LinkedHashSetModified<Integer> linkedHashSetModified = new LinkedHashSetModified<>();

        for(int i = 0; i < 100; ++i){
           linkedHashSetModified.add(i);
        }

        for(Integer integer : linkedHashSetModified){
            System.out.printf("%d ", integer);
        }

        // Sincer, nu am observat nicio diferenta, am incercat si cu debugger-ul sa analizez procesul de
        // inserare, chiar sunt curios care e diferenta si cum as putea sa o vad :)

    }

}
