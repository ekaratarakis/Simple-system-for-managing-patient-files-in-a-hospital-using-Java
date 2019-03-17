package hospital_sys;

public class Hospital 
{
	private String NameOfHospital, Department ;
	
	///////////////////////////
	////////CONSTRUCTOR////////
	///////////////////////////
	
	public Hospital(String NOfHospital, String Depart)
	{
		this.NameOfHospital = NOfHospital;
		this.Department = Depart;
	}
	
	////////////////////////////
	///////SET-GET METHODS//////
	////////////////////////////
	
	public String getNameOfHospital() // gets the name of the Hospital
	{
		return NameOfHospital;
	}
	public void setNameOfHospital(String NameOfHospital)
	{
		this.NameOfHospital = NameOfHospital; // assigns to the NameOfHospital the name of the Hospital
	}
	
	public String getDepartment() // gets the Department of the Hospital
	{
		return Department;
	}
	public void setDepartment(String Department)
	{
		this.Department = Department; // assigns to the Department the name of the department
	}

}
