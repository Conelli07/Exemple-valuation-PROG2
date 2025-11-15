import java.time.Instant;
import java.util.List;

public class Grade {
    private Student student;
    private Exam exam;
    private double initialValue;
    private List<GradeHistory> history;

    public Grade(Student student, Exam exam, double initialValue, List<GradeHistory> history) {
        this.student = student;
        this.exam = exam;
        this.initialValue = initialValue;
        this.history = history;
    }

    public double getInitialValue(Instant t) {
        return initialValue;
    }

    public Student getStudent() {
        return student;
    }

    public Exam getExam() {
        return exam;
    }
}
