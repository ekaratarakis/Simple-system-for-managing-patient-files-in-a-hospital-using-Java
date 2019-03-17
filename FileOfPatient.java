package hospital_sys;

import java.util.Date; // IMPORT THE LIBRARY FOR USING DATES

public class FileOfPatient // CLASS FOR PATIENTS' FILES
{
	private Patient pat; // variable of type Patient
	private Doctor doc; // variable of type Doctor
	private Date dateIn; // check in date
	private Date dateOut; // check out date
	private Hospital hospName; // variable of type Hospital
	private Exam listOfExams[] = new Exam[5]; // lists of medical exams of the patient
	
	/////////////////////////
	///////CONSTRUCTOR///////
	/////////////////////////
	
	public FileOfPatient(Patient pat, Doctor doc, Exam listOfExams[], Hospital hospName, Date dateIn, Date dateOut)
	{
		this.pat = pat;
		this.doc = doc;
		this.dateIn = dateIn;
		this.dateOut = dateOut;
		this.hospName = hospName;
		this.listOfExams = listOfExams;
	}
	
	//////////////////////////////////
	/////////SET-GET METHODS//////////
	//////////////////////////////////
	
	public Doctor getDoc()
	{
		return doc;
	}
	public void setDoc(Doctor doc)
	{
		this.doc = doc;
	}
	
	public Patient getPat()
	{
		return pat;
	}
	public void setPat(Patient pat)
	{
		this.pat = pat;
	}
	
	public Exam[] getlistOfExams() // method for inserting elements to the array of medical exams and return them
	{
		return listOfExams;
	}
	public void setlistOfExams(Exam[] listOfExams) // inserts medical exams to the array of the medical exams
	{
		this.listOfExams = listOfExams;
	}
	
	public Date getdateIn() // gets and returns the check in date
	{
		return dateIn;
	}
	public void setdateIn(Date dateIn) // assigns to the dateIn a value
	{
		this.dateIn = dateIn;
	}
	
	public Date getdateOut() // gets and returns the check out date
	{
		return dateOut;
	}
	public void setdateOut(Date dateOut) // assigns to the dateOut a value
	{
		this.dateOut = dateOut;
	}
	
	public Hospital getHospName() // gets the name of the Hospital
	{
		return hospName; // returns the name of the Hospital
	}
	public void setHospName(Hospital hospName)
	{
		this.hospName = hospName;  // assigns to the value hospName the name of the Hospital
	}
	
	// METHOD FOR PRINTING THE PATIENT'S FILE
	// This method is called whenever we want to print the patient's file.
	
	public void Print_File_Of_Patient()
	{
		System.out.println("Date In:" + dateIn);
		System.out.println("Date Out:" + dateOut);
		System.out.println("Patient:" + pat.getPatientName());
		System.out.println("Doctor:" + doc.getDoctorsName());
		int i = 0;
		while(listOfExams[i] != null) // check if the list of Exams is empty
		{
			System.out.println("Exam name:"+listOfExams[i].getExamName() + "  " +"Exam code: "+ listOfExams[i].getExamCode());
			i++;
		}
	}
}
