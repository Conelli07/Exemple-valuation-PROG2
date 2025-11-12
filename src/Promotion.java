import java.util.ArrayList;
import java.util.List;

public class Promotion {
    private List<String> groups = new ArrayList<>();

    public void addGroup(String group) {
        groups.add(group);
    }
    public List<String> getGroups() {
        return groups;
    }
}
