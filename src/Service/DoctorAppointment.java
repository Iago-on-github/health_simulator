package Service;

import domain.Doctor;
import domain.Medicines;
import domain.Patient;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class DoctorAppointment {
    private UUID appointmentId;
    private Patient patient;
    private Doctor doctor;
    private List<Medicines> medicines = new ArrayList<>();

    public DoctorAppointment(Patient patient, Doctor doctor) {
        this.appointmentId = UUID.randomUUID();
        this.patient = patient;
        this.doctor = doctor;
    }

    public String appointmentResume() {
        StringBuilder sb = new StringBuilder();

        sb.append("---RESUMO DE CONSULTA---").append("\n");
        sb.append("Id da consulta: ").append(appointmentId).append("\n");
        sb.append("Médico responsável: ").append(doctor.getName()).append(", crm: ").append(doctor.getCrm()).append(", especialidade: ").append(doctor.getSpeciality()).append("\n");

        sb.append("Dados do paciente: ").append("\n");
        sb.append("Nome: ").append(patient.getName()).append("\n");
        sb.append("Idade ").append(patient.getAge()).append("\n");
        sb.append("Descrição").append(patient.getPatientDescription()).append("\n");

        sb.append("Medicamentos: ").append("\n");

        if (medicines.isEmpty()) {
            sb.append("Sem medicamentos prescritos para este pasciente");
        } else {
            for (Medicines m : medicines) {
                sb.append("- ").append(m).append("\n");
            }
        }
        return sb.toString();
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public UUID getAppointmentId() {
        return appointmentId;
    }

    public List<Medicines> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicines> medicines) {
        this.medicines = medicines;
    }
}
