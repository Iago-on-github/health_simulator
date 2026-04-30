import domain.DoctorAppointment;
import domain.Doctor;
import domain.Medicines;
import domain.Patient;
import domain.Speciality;

import java.util.List;
import java.util.UUID;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Patient firstPatient = new Patient("João", 12, "Dores de cabeça e febre de 37.9°");

        Doctor firstDoctor = new Doctor("Fernanda", "8392392", Speciality.CLINICO_GERAL);

        DoctorAppointment appointment = new DoctorAppointment(firstPatient, firstDoctor);

        appointment.setMedicines(List.of(
                new Medicines(UUID.randomUUID(), "medicamento_1", "recomendado para dores de cabeça"),
                new Medicines(UUID.randomUUID(), "medicamento_2", "recomendado para febres constantes"))
        );

        System.out.println(appointment.appointmentResume());

        System.out.println();

    }
}