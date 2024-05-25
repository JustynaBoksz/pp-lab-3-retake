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

        
        Patient patient5 = new Patient("Sarah", "Wilson", 28, "Fever", 105);
        Patient patient6 = new Patient("Tom", "Brown", 50, "Diabetes", 106);

        
        hospital.addPatient(patient5);
        hospital.addPatient(patient6);

        
        Doctor doctor2 = new Doctor("Gregory", "House", 50, "Orthopedics");

        
        Nurse nurse2 = new Nurse("Anna", "Hall", 32, "Pediatrics");
        Nurse nurse3 = new Nurse("David", "Lee", 40, "Surgery");
        Nurse nurse4 = new Nurse("Lisa", "Green", 29, "ER");

       
        hospital.addStaff(doctor2);
        hospital.addStaff(nurse2);
        hospital.addStaff(nurse3);
        hospital.addStaff(nurse4);

        
        hospital.removePatient(patient3); 
        hospital.removeStaff(nurse3); 

        
        System.out.println("Hospital staff after updates:");
        hospital.displayStaff();
        System.out.println("Hospital patients after updates:");
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
    }
}
