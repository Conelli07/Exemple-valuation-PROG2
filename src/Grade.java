import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private final Student student;
    private final Exam exam;
    private final double initialValue;
    public double getValueInstant;
    private List<GradeHistory> history = new ArrayList<>();

    public Grade(Student student, Exam exam, double initialValue, List<GradeHistory> history) {
        this.student = student;
        this.exam = exam;
        this.initialValue = initialValue;
        this.history = history;
    }
    public void addHistory(GradeHistory history) {
        String reason = "";
        double newValue = 0;
        history.add(new GradeHistory(newValue, reason, Instant.now()));
    }
    public double getInitialValue(Instant instant) {
        for (GradeHistory history : history) {
            if (!history.getDate().isAfter(instant)) {
                double currentValue = history.getValue();
            }
        }
        return initialValue;
    }
    public Student getStudent() {
        return student;
    }
    public Exam getExam() {
        return exam;
    }

    public double getValueInstant(Instant instant) {
        return 0;
    }
}
