/*
 * Class: CMSC203  
 * Instructor: Khandan Monshi
 * Description: Patient Driver creates a patient and 3 procedures. It then displays all of the information about each object
 * and prints out the total charge and then student information.
 * Due: 10/08/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Nathaniel Schuknecht
*/

public class PatientDriverApp {
	
	public static void main(String[] args) {
		
		//Create patient & procedures
		Patient patient = new Patient("Jenny", "Elaine", "Santori", "123 Main Stree", "MyTown", "CA", "01234", "301-123-4567", "Bill Santori", "777-555-1212");
		
		Procedure p1 = new Procedure();
		Procedure p2 = new Procedure("X-Ray", "7/20/2019");
		Procedure p3 = new Procedure("blood Test", "7/2-/2019", "Dr. Smith", 1400.75);
		
		//Display patient, procedures, charges, & student info
		displayPatient(patient);
		
		displayProcedure(p1);
		displayProcedure(p2);
		displayProcedure(p3);
		
		System.out.printf("Total Charges: $%,.2f", calculateTotalCharges(p1, p2, p3));
		System.out.println("\n\nStudent Name: Nathaniel Schuknecht\nMC#: M21203190\nDue Date: 10/8/2024");
	}
	
	//Display patient's information
	public static void displayPatient(Patient patient) {
		System.out.println("Patient info:\n" + patient.toString());
	}
	
	//Display procedure's information
	public static void displayProcedure(Procedure procedure) {
		System.out.println(procedure.toString());
	}
	
	//Return the total charges of all procedures
	public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
		return p1.getCharges() + p2.getCharges() + p3.getCharges();
	}
}
