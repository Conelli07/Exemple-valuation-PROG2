import java.time.Instant;

public class GradeHistory {
    private double value;
    private String reason;
    private Instant date;

    public GradeHistory(double value, String reason, Instant date) {
        this.value = value;
        this.reason = reason;
        this.date = date;
    }
}
