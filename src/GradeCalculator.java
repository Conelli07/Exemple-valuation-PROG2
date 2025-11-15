import java.time.Instant;
import java.util.List;

public class GradeCalculator {
    private List<Grade> grades;

    public GradeCalculator(List<Grade> grades) {
        this.grades = grades;
    }

    public double getExamGrade(Exam exam, Student student, Instant t) {
        return grades.stream()
                .filter(g -> g.getExam().equals(exam) && g.getStudent().equals(student))
                .findFirst()
                .map(g -> g.getInitialValue(t))
                .orElse(0.0);
    }

    public double getCourseGrade(Course course, Student student, Instant t) {
        double total = 0;
        int totalCoeff = 0;

        for (Grade g : grades) {
            if (g.getStudent().equals(student) && g.getExam().getCourse().equals(course)) {
                total += g.getInitialValue(t) * g.getExam().getCoefficient();
                totalCoeff += g.getExam().getCoefficient();
            }
        }
        return totalCoeff == 0 ? 0 : total / totalCoeff;
    }
}
