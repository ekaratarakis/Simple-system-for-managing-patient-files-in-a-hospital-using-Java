package hospital_sys;

public class Patient // CLASS FOR PATIENT
{
	private String PatientName; // name of the patient
	private String SSN; // Social Security Number
	
	/////////////////////////
	///////CONSTRUCTOR///////
	/////////////////////////
	
	public Patient(String PatientName, String SSN)
	{
		this.PatientName = PatientName;
		this.SSN = SSN;
	}
	
	////////////////////////////////////
	//////////SET-GET METHODS///////////
	////////////////////////////////////
	
	public String getPatientName()
	{
		return PatientName; // returns the name of the patient
	}
	public void setPatientName(String PatientName)
	{
		this.PatientName = PatientName; // assigns the name of the patient to the variable PatientName
	}
	
	public String getSSN()
	{
		return SSN; // returns the SSN
	}
	public void setSSN(String SSN)
	{
		this.SSN = SSN; // assigns the SSN of the patient
	}

}
