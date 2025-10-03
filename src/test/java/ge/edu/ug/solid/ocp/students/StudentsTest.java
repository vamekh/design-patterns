package ge.edu.ug.solid.ocp.students;

import org.junit.jupiter.api.Test;

import java.util.List;

class StudentsTest {
    @Test
    void testBadExample() {
        Student nikola = new ScienceStudent("Nikola", "Tesla", 90.0, "Comp.Sc.");
        Student einstein = new ScienceStudent("Albert", "Einstein", 70.0, "Physics");
        Student darwin = new ArtsStudent("Charles", "Darwin", 60.0, "History");
        Student john = new ArtsStudent("John", "Doe", 80.0, "English");
        List<Student> scienceStudents = List.of(nikola, einstein);
        List<Student> artsStudents = List.of(darwin, john);
        ScienceDistinctionDecider scienceDecider = new ScienceDistinctionDecider();
        ArtsDistinctionDecider artsDecider = new ArtsDistinctionDecider();

        scienceStudents.forEach(System.out::println);
        artsStudents.forEach(System.out::println);

        scienceStudents.forEach(scienceDecider::evaluateDistinction);
        artsStudents.forEach(artsDecider::evaluateDistinction);
    }
}
