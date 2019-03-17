package hospital_sys;

public class Doctor 
{
	private String DoctorsName, expertise; // Name of the doctor and expertise
	private int DoctorCode; // Unique code of the doctor
	private String hospName; // String refers to the name of the hospital
	private static int numDoc_Code = 1; // initialization of the doctor's unique code number to 1
	
	//////////////////////////////////
	////////////CONSTRUCTOR///////////
	//////////////////////////////////
	
	public Doctor(String DoctorName, String expertise, String hospName)
	{
		this.DoctorsName = DoctorName; // using "this" command for a specific reference of the constructor's variable
		this.expertise = expertise;
		this.hospName = hospName;
		DoctorCode = numDoc_Code;
		numDoc_Code++; 		
	}
	
	//////////////////////////////////
	//////////SET-GET METHODS/////////
	//////////////////////////////////
	
	public String getDoctorsName() // gets the name of the Doctor
	{
		return DoctorsName; // returns the name of the Doctor
	}
	public void setDoctorsName(String DoctorsName) // gets the name of the Doctor as a String
	{
		this.DoctorsName = DoctorsName; // assigns to the variable DoctorsName, the name of the Doctor
	}
	
	public String getHospName() // gets the name of the Hospital
	{
		return hospName; // returns the name of the Hospital
	}
	public void setHospName(String hospName) // gets the name of the Hospital as a String
	{
		this.hospName = hospName; // assigns to the variable hospName, the name of the Hospital
	}
	
	public String getexpertise() // gets the name of the Expertise
	{
		return expertise; // returns the doctor's Expertise
	}
	public void setexpertise(String expertise) // gets the doctor's expertise as a String
	{
		this.expertise = expertise; // assigns to the variable expertise, the doctor's expertise
	}
	
	public int getDoctorCode() // gets the unique doctor's code 
	{
		return DoctorCode; // returns the unique doctor's code
	}
	public void setDoctorCode(int DoctorCode) // gets the unique doctor's code as a String
	{
		this.DoctorCode = DoctorCode; // assigns to the variable DoctorCode, the unique doctor's code 
	}
	
	public static void setnumDoc_Code(int numDoc_Code) // assigns a value to the unique doctor's code
	{
		Doctor.numDoc_Code = numDoc_Code; // assignment of the numDoc_Code to the variable numDoc_Code of the class Doctor
	}

}
