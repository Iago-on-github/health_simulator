package domain;

public class Doctor {
    private String name;
    private String crm;
    private Speciality speciality;

    public Doctor(String name, String crm, Speciality speciality) {
        this.name = name;
        this.crm = crm;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public String getCrm() {
        if (crm.length() < 6) throw new IllegalArgumentException("invalid crm: " + crm);
        return crm;
    }

    public Speciality getSpeciality() {
        return speciality;
    }
}
