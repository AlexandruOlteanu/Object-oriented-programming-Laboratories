package lab8;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

public class StudentTest {

    Student student;

    @BeforeEach
    public void setUp(){
        this.student = new Student("Olteanu", "Alexandru", 2001, 9.7);
    }

    @AfterEach
    public void clean(){
        this.student = null;
    }

    @Test
    @DisplayName("Test Equals")
    public void testEquals(){
        Assertions.assertEquals(2001, student.getId());
        Assertions.assertNotEquals(2000, student.getId());
    }

    @Test
    @DisplayName("Test CompareTo")
    public void testCompareTo(){

        Student student1 = new Student("Olteanu", "Alexandru", 2001, 9.7);
        Assertions.assertEquals(0, student.compareTo(student1));

        Student student2 = new Student("Olteanu", "Alexandru", 2001, 9.6);
        Assertions.assertEquals(1, student.compareTo(student2));

        Student student3 = new Student("Olteanu", "AAAAAA", 2001, 9.7);
        Assertions.assertEquals(1, student.compareTo(student2));

        Assertions.assertEquals(-1, student.compareTo(student3));
    }

    @Test
    @DisplayName("Test ToString")
    public void testToString(){
        Assertions.assertEquals("Name : Olteanu, Surname : Alexandru, Id : 2001, Average Grade : 9.7", student.toString());
    }

}
