package hospital_sys;

public class Exam // Class for Medical Exams
{
	private String ExamName; // name of the medical exam
	private int ExamCode; // code number of the medical exam
	private static int numExamCode = 1; // initialize the code number of the medical exam to 1
	
	/////////////////////////////
	/////////CONSTRUCTOR/////////
	/////////////////////////////
	
	public Exam(String ExamName)
	{
		this.ExamName = ExamName;
		ExamCode = numExamCode;
		numExamCode++; // increament of the code number of the medical exam
	}
	
	/////////////////////////////
	////////SETTER-GETTER////////
	///////////METHODS///////////
	/////////////////////////////
	
	public String getExamName()
	{
		return ExamName; // returns the name of the medical exam
	}
	public void setExamName(String ExamName) 
	{
		this.ExamName = ExamName; // assigns a value to the ExamName
	}
	
	public int getExamCode()
	{
		return ExamCode; // returns the code number of the medical exam
	}
	public void setExamCode(int ExamCode)
	{
		this.ExamCode = ExamCode; // assigns a value to the ExamCode
	}
	
	public static void setEx_Code(int numExamCode)
	{
		Exam.numExamCode = numExamCode; // assigns a value to the numExamCode
	}
}
