import java.time.LocalDate;

public class Student {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String group;
    private Teacher tutor;

    public Student(int id, String firstName, String lastName, LocalDate birthDate,
                   String email, String phone, String group, Teacher tutor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.group = group;
        this.tutor = tutor;
    }

}
