import java.time.LocalDateTime;

public class Exam {
    private int id;
    private String title;
    private Course course;
    private LocalDateTime dateTime;
    private int coefficient;

    public Exam(int id, Course course, int coefficient) {
        this.id = id;
        this.course = course;
        this.coefficient = coefficient;
        this.title = "Unknown";
        this.dateTime = LocalDateTime.now();
    }

    public int getId() { return id; }
    public String getTitle() { return title; }
    public Course getCourse() { return course; }
    public LocalDateTime getDateTime() { return dateTime; }
    public int getCoefficient() { return coefficient; }
}
