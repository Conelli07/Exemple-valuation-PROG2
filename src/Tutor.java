import java.time.LocalDate;

public class Tutor {
    private int id;
    private String lastName;
    private String firstName;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
    private String relationshipDescription;

    public Tutor(int id, String lastName, String firstName, LocalDate birthDate, String email, String phoneNumber, String relationshipDescription) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.relationshipDescription = relationshipDescription;
    }

}
