/*
 * Class: CMSC203  
 * Instructor: Khandan Monshi
 * Description: Procedure class contains all the information for a procedure. Client can create a procedure with 3 
 * different constructors, get and set each value, and get a string of all information with the toString method.
 * Due: 10/08/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Nathaniel Schuknecht
*/

public class Procedure {

	private String name;
	private String date;
	private String practitioner;
	private double charges;
	
	public Procedure() {
	
		name = "Physical Exam";
		date = "7/20/2024";
		practitioner = "Dr. Irvine";
		charges = 3250.0;
	}
	
	public Procedure(String n, String d) {
		
		name = n;
		date = d;
		practitioner = "Dr. Jamison";
		charges = 5500.43;
	}
	
	public Procedure(String n, String d, String p, double c) {
		
		name = n;
		date = d;
		practitioner = p;
		charges = c;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDate() {
		return date;
	}
	
	public String getPractitioner() {
		return practitioner;
	}
	
	public double getCharges() {
		return charges;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setDate(String d) {
		date = d;
	}
	
	public void setPractitioner(String p) {
		practitioner = p;
	}
	
	public void setCharges(Double c) {
		charges = c;
	}
	
	public String toString() {
		return "\t\tProcedure: " + name + "\n\t\tProcedureDate: " + date + "\n\t\tPractitioner: " + practitioner + "\n\t\tCharge: " + charges + "\n"; 
	}
}

