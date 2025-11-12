import java.time.Instant;
import java.util.List;

public class GradeCalculator {
    private final List<Grade> grades;
    
    public GradeCalculator(List<Grade> grades) {
        this.grades = grades;
    }
    public double getExamenGrade(Exam exam, Student student, Instant instant) {
        return grades.stream()
                .filter(grade -> grade.getExam().equals(exam) && grade.getStudent().equals(student))
                .mapToDouble(grade -> grade.getValueInstant(instant))
                .findFirst()
                .orElse(0.0);
    }
    public double getCourseGrade(Course course, Student student, Instant instant) {
        List<Grade> studentGrades = grades.stream()
                .filter(grade -> grade.getExam().getCourse().equals(course) && grade.getStudent().equals(student))
                .toList();
        
        double total = 0;
        int totalcoeff = 0;
        
        for (Grade grade : studentGrades) {
            double value = grade.getValueInstant(instant);
            int coeff = grade.getExam().getCoefficient();
            total += value * coeff;
            totalcoeff += coeff;
        }
        return total/totalcoeff == 0 ? 0 : total/totalcoeff;
    }
}
