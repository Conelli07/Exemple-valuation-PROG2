import java.time.LocalDate;

public class Teacher {
    private int id;
    private String lastname;
    private String firstname;
    private LocalDate birthDate;
    private String email;
    private String phoneNumber;
    private String specialty;

    public Teacher(int id, String lastname, String firstname, LocalDate birthDate, String email, String phoneNumber, String specialty) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.specialty = specialty;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSpecialty() {
        return specialty;
    }
}
