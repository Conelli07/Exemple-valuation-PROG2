import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student s) { students.add(s); }
    public List<Student> getStudents() { return new ArrayList<>(students); }
    public String getName() { return name; }
    public int getStudentCount() { return students.size(); }
}

