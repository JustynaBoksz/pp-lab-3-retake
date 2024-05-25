import medicine.Patient;
import medicine.Doctor;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("John", "Smith", 30, "Flu", 101);
        Patient patient2 = new Patient("Jane", "Smith", 40, "Pneumonia", 102);
        Patient patient3 = new Patient("Mike", "Johnson", 25, "Broken Leg", 103);
        Patient patient4 = new Patient("Emily", "Davis", 35, "Appendicitis", 104);

        System.out.println("Informations about patients:");
        patient1.displayInfo();
        patient2.displayInfo();
        patient3.displayInfo();
        patient4.displayInfo();

        System.out.println();

        System.out.println("First Name: " + patient1.getFirstName());
        System.out.println("Last Name: " + patient1.getLastName());
        System.out.println("Illness: " + patient1.getIllness());
        System.out.println("Room Number: " + patient1.getRoomNumber());

        System.out.println();

        patient1.setIllness("Pneumonia");
        patient1.setRoomNumber(105);

        patient1.displayInfo();

        System.out.println();

        
        Doctor doctor = new Doctor("Alice", "Brown", 45, "Cardiology");
        doctor.displayInfo();
        doctor.performDuty();

        
        System.out.println("Specialization: " + doctor.getSpecialization());
        doctor.setSpecialization("Neurology");
        System.out.println("Updated Specialization: " + doctor.getSpecialization());
    }
}
