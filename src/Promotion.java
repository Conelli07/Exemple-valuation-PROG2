import java.util.ArrayList;
import java.util.List;

public class Promotion {
    private String name;
    private List<Group> groups = new ArrayList<>();

    public Promotion(String name) {
        this.name = name;
    }

    public void addGroup(Group g) { groups.add(g); }
    public List<Group> getGroups() { return new ArrayList<>(groups); }
    public String getName() { return name; }
    public int getTotalStudentCount() {
        int total = 0;
        for (Group g : groups) total += g.getStudentCount();
        return total;
    }
}
