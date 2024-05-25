import medicine.Patient;
import medicine.Doctor;
import medicine.Nurse;
import medicine.Hospital;

public class Main {
    public static void main(String[] args) {
        
        Hospital hospital = new Hospital();

        
        Patient patient1 = new Patient("John", "Smith", 30, "Flu", 101);
        Patient patient2 = new Patient("Jane", "Smith", 40, "Pneumonia", 102);
        Patient patient3 = new Patient("Mike", "Johnson", 25, "Broken Leg", 103);
        Patient patient4 = new Patient("Emily", "Davis", 35, "Appendicitis", 104);

        
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);

        
        Doctor doctor = new Doctor("Alice", "Brown", 45, "Cardiology");
        Nurse nurse = new Nurse("Emily", "Clark", 30, "General");

        
        hospital.addStaff(doctor);
        hospital.addStaff(nurse);

        
        System.out.println("Hospital staff:");
        hospital.displayStaff();
        System.out.println("Hospital patients:");
        hospital.displayPatients();

        
        patient1.setIllness("Pneumonia");
        patient1.setRoomNumber(105);

        
        doctor.setSpecialization("Neurology");

        
        System.out.println("Updated information:");
        System.out.println("Doctor:");
        doctor.displayInfo();
        System.out.println("Nurse:");
        nurse.displayInfo();
        System.out.println("Updated Patient:");
        patient1.displayInfo();

        
        doctor.performDuty();
        nurse.performDuty();

        
        hospital.removeStaff(nurse);
        hospital.removePatient(patient4);

        
        System.out.println("Hospital staff after removal:");
        hospital.displayStaff();
        System.out.println("Hospital patients after removal:");
        hospital.displayPatients();
    }
}
