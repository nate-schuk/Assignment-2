/*
 * Class: CMSC203  
 * Instructor: Khandan Monshi
 * Description: Patient class contains all the information of a patient. Client can create with 3 different constructors,
 * get and set each data value, and get a string of all information with the toString method.
 * Due: 10/08/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or any source. I have not given my code to any student.
 * Print your Name here: Nathaniel Schuknecht
*/

public class Patient {
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String address;
	private String city;
	private String state;
	private String zipCode;
	
	private String phoneNum;
	private String emergencyName;
	private String emergencyPhoneNum;
	
	public Patient() {
		
		firstName = "No Name";
		middleName = "No Name";
		lastName = "No Name";
	}
	
	public Patient(String f, String m, String l) {
		
		firstName = f;
		middleName = m;
		lastName = l;
	}
	
	public Patient(String f, String m, String l, String a, String c, String s, String z, String p, String eName, String eNum) {
		
		firstName = f;
		middleName = m;
		lastName = l;
		
		address = a;
		city = c;
		state = s;
		zipCode = z;
		
		phoneNum = p;
		emergencyName = eName;
		emergencyPhoneNum = eNum;
	}
	
	public void setFirstName(String f) {
		firstName = f;
	}
	
	public void setMiddleName(String m) {
		middleName = m;
	}
	
	public void setLastName(String l) {
		lastName = l;
	}
	
	public void setAddress(String a) {
		address = a;
	}
	
	public void setCity(String c) {
		city = c;
	}
	
	public void setState(String s) {
		state = s;
	}
	
	public void setCode(String z) {
		zipCode = z;
	}
	
	public void setPhoneNum(String p) {
		phoneNum = p;
	}
	
	public void setEName(String n) {
		emergencyName = n;
	}
	public void setENum(String n) {
		emergencyPhoneNum = n;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getEmergencyName() {
		return emergencyName;
	}
	
	public String getEmergencyNum() {
		return emergencyPhoneNum;
	}
	
	public String buildFullName() {
		return firstName + " " + middleName + " " + lastName;
	}
	
	public String buildAddress() {
		return address + " " + city + " " + state + " " + zipCode;
	}
	
	public String buildEmergencyContact() {
		return emergencyName + " " + emergencyPhoneNum;
	}
	
	public String toString() {
		return "\tName: " + buildFullName() + "\n\tAddress: " + buildAddress() + "\n\tEmergencyContact: " + buildEmergencyContact() + "\n";
	}
	

}
