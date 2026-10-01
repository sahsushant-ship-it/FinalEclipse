package Dogt;

public class Patient{

	    String hospitalName = "Apollo";

	    void patient_app_book(String appointmentDate) {
	        System.out.println("Hospital Name : " + hospitalName);
	        System.out.println("Appointment Date : " + appointmentDate);
	    }

	    void patient_app_book(String doctorName, String slotAssigned, String specialization) {
	        System.out.println("Doctor Name : " + doctorName);
	        System.out.println("Slot Assigned : " + slotAssigned);
	        System.out.println("Specialization : " + specialization);
	    }

	    void patient_app_book(String observation, String medication, double bill) {
	        System.out.println("Observation : " + observation);
	        System.out.println("Medication : " + medication);
	        System.out.println("Bill Amount : Rs." + bill);
	    }

	    public static void main(String[] args) {

	        Patient p = new Patient();

	        System.out.println("----- PATIENT MANAGEMENT SYSTEM -----");

	        p.patient_app_book("10-06-2026");

	        System.out.println();

	        p.patient_app_book("Dr. Ramesh", "10:30 AM", "Cardiologist");

	        System.out.println();

	        p.patient_app_book("Heart Checkup Completed", "Aspirin", 2500.0);
	    }

	}

