package domain;

public class Patient {
    private String name;
    private int age;
    private String patientDescription;

    public Patient(String name, int age, String patientDescription) {
        this.name = name;
        this.age = age;
        this.patientDescription = patientDescription;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        if (age < 0) throw new IllegalArgumentException("Invalid age: " + age);
        return age;
    }

    public String getPatientDescription() {
        return patientDescription;
    }
}
