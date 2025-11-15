import org.junit.Test;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class GradeCalculatorTest {

    @Test
    public void testGetExamenGradeWithCurrentCode() {
        Teacher teacher = new Teacher(1, "Jean", "Dupont", LocalDate.of(1975,1,1), "Jean@gmail.com","0322585285","Back-end");
        Course course = new Course(101, "WEB 2", 3, teacher);
        Student student = new Student(1, "Hanabi","Suzune",LocalDate.of(2000,1,1),"hanabi@gmail.com","0385465465","G1",teacher);

        Exam exam = new Exam(1, course, 2);
        List<GradeHistory> history = new ArrayList<>();
        history.add(new GradeHistory(12,"Initial value", Instant.now()));

        Grade grade = new Grade(student, exam, 12, history);
        GradeCalculator calc = new GradeCalculator(List.of(grade));

        assertEquals(12, calc.getExamGrade(exam, student, Instant.now()), 0.001);
    }

    @Test
    public void testGetCourseGradeWithCurrentCode() {
        Teacher teacher = new Teacher(1, "Jean", "Dupont", LocalDate.of(1975,1,1), "Jean@gmail.com","0123456789","Back-end");
        Course course = new Course(101, "WEB 2", 3, teacher);
        Student student = new Student(1, "HanabiSuzune","Hanabi Suzune",LocalDate.of(2000,1,1),"hanabi@gmail.com","0385465465","G1",teacher);

        Exam exam1 = new Exam(1, course, 2);
        Exam exam2 = new Exam(2, course, 3);

        List<GradeHistory> history1 = new ArrayList<>();
        history1.add(new GradeHistory(10,"Initial value", Instant.now()));
        Grade g1 = new Grade(student, exam1, 10, history1);

        List<GradeHistory> history2 = new ArrayList<>();
        history2.add(new GradeHistory(15,"Initial value", Instant.now()));
        Grade g2 = new Grade(student, exam2, 15, history2);

        GradeCalculator calc = new GradeCalculator(List.of(g1, g2));

        assertEquals(13.0, calc.getCourseGrade(course, student, Instant.now()), 0.001);
    }
}
