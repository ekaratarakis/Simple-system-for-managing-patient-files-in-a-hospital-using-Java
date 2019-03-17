package hospital_sys;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

////////////////////////////////////
////////////CLASS MAIN//////////////
////////////////////////////////////

public class Main_Class 
{
	public static void main(String[] args) throws ParseException
	{
		Scanner scan = new Scanner(System.in); // Scanner variable for reading
		Hospital Hospitals[] = new Hospital[2]; // array for store the names of 2 Hospitals.
		Exam ExamList[] = new Exam[100]; // array for the medical exams, maximum number of medical exams = 100
		Patient PatientList[] = new Patient[100]; // array for the patients, maximum number of patients = 100
		Doctor DoctorsList[] = new Doctor[100]; // array for the doctors, maximum number of doctors = 100
		FileOfPatient FileOfPatientList[] = new FileOfPatient[100]; // array for the files of patients, maximum number of files of patiens = 100
		int choice, hospNum=0, examNum=0, patientNum=0, doctorNum=0, fopn=0;
		String name = null,dept,date,sentence;
		Date dti,dto;
		DateFormat formatter = null;
		Date convertedDate = null;
		
		do
		{
			printMenu();
			do
			{
				choice = scan.nextInt();
				sentence = scan.nextLine();
				if(choice<1 || choice>9)
				{
					System.out.println("Wrong input. Please try again.");
				}
			}while(choice<1 || choice>9);
			
			if(choice==1) // INSERT HOSPITAL
			{
				if(hospNum==2) // checking for empty slot in the list of Hospitals
				{
					System.out.println("Hospitals list is full.");
				}
				else
				{
					System.out.println("Give hospital name: "); 
					name = scan.nextLine(); // reading the name of the hospital
					System.out.print("Give hospital departments:");
					dept = scan.nextLine(); // reading the names of the departments
					Hospitals[hospNum] = new Hospital(name,dept);
					hospNum++;
				}
			}
			else if(choice==2) // INSERT MEDICAL EXAM
			{
				if(examNum == 100) // checking for empty slot in the list of medical exams
				{
					System.out.println("The list of Exams is full. We can't store any more exams.\nThank you!!!");
				}
				else
				{
					System.out.println("Please enter the name of Exam: ");
					name = scan.nextLine(); // reading the name of the medical exam
					ExamList[examNum] = new Exam(name);
					examNum++; 
				}
			}
			else if(choice==3) // INSERT DOCTOR
			{
				if(doctorNum == 100) // checking for empty slot in the list of doctors
				{
					System.out.println("The list of Doctors is full. We can't store any more doctors.\nThank you.!!!");
				}
				else if(hospNum==0)
				{
					System.out.println("Please insert hospitals first.");					
				}
				else
				{
					String DocName, Exper, hospName;
					System.out.println("Please, enter the name of the Doctor");
					DocName = scan.nextLine(); // reading the name of the doctor
					System.out.println("Please enter the expertise of the doctor");
					Exper = scan.nextLine(); // reading the doctor's expertise
					System.out.println("Which hospital do you want the doctor to work for?");
					for(int i=0;i<hospNum;i++) // check for which of the 2 hospital the user wants
					{
						System.out.print((i+1)+". ");
						System.out.println(Hospitals[i].getNameOfHospital());
					}
					choice=scan.nextInt(); // reading the user's choice
					sentence = scan.nextLine();
					if(choice==1) // choosing hospital 1
					{
						hospName = Hospitals[0].getNameOfHospital();
					}
					else // choosing hospital 2
					{
						hospName = Hospitals[1].getNameOfHospital();
					}
					DoctorsList[doctorNum] = new Doctor(DocName, Exper, hospName);
					doctorNum++;
				}
			}
			else if(choice==4) // INSERT PATIENT
			{
				if(patientNum == 100) // checking for empty slot in the list of patients
				{
					System.out.println("The list of Patients is full. We can't store any more patients\n Thank you.!!!");
				}				
				else
				{
					String PatName, NumSSN;
					System.out.println("Please, enter the name of the patient\n");
					PatName = scan.nextLine(); // reading the name of the patient
					System.out.println("Please, enter the personal SSN number of the patient\n");
					NumSSN = scan.nextLine(); // reading the SSN number
					PatientList[patientNum] = new Patient(PatName, NumSSN);		
					patientNum++;
				}
			}
			else if(choice==5) // INSERT THE FILE OF THE PATIENT
			{
				if(doctorNum==0 || examNum==0 || patientNum==0 || hospNum==0)
				{
					System.out.println("Please complete the first 4 insertions first and then procceed with this one.");
				}
				else
				{
					Hospital hosp;
					Patient pat;
					Doctor doc;
					Exam[] ex = new Exam[5]; // Any patient can have maximum 5 medical exams.
					int temp,count=0;
					System.out.println("Which hospital do you want the patient to go at?");
					for(int i=0;i<hospNum;i++) // check for which of the 2 hospital the user wants
					{
						System.out.print((i+1)+". ");
						System.out.println(Hospitals[i].getNameOfHospital());
					}
					temp = scan.nextInt();
					sentence = scan.nextLine();
					hosp = Hospitals[temp-1];
					do
					{
						System.out.println("Which examination do you want to do?");
						for(int i=0;i<examNum;i++) // choosing medical exam
						{
							System.out.print((i+1)+". ");
							System.out.println(ExamList[i].getExamName());
						}
						choice = scan.nextInt(); // reading the choice of the medical exam
						sentence = scan.nextLine(); 
						ex[count] = ExamList[choice-1];
						count++;
						if(count==5) // checking for more than 5 medical exams
						{
							System.out.println("You can't insert more than 5 medical exams.");
						}
						else
						{
							System.out.println("Do you want to do another exam? Type 'yes' if yes or anything else if not");
							name=scan.nextLine();
						}
					}while(name.equals("yes") && count<5);
					
					System.out.println("Give the code of the doctor you want.");
					for(int i=0;i<doctorNum;i++) // insert patient's primary doctor
					{
						if(DoctorsList[i].getHospName().equals(Hospitals[temp-1].getNameOfHospital()))
						{
							//System.out.print((i+1)+". ");
							System.out.println(DoctorsList[i].getDoctorCode()+"  "+DoctorsList[i].getDoctorsName());
						}
					}
					choice = scan.nextInt();
					sentence = scan.nextLine();
					doc = DoctorsList[choice-1];
					
					System.out.println("Choose the patient to undergo the examination.");
					for(int i=0;i<patientNum;i++) // choosing patient
					{
						System.out.print((i+1)+". ");
						System.out.println(PatientList[i].getPatientName());
					}
					choice = scan.nextInt();
					sentence = scan.nextLine();
					pat = PatientList[choice-1];
					
					System.out.println("Give check in date (day/month/year).");
					date=scan.nextLine(); // insert check in date
					formatter = new SimpleDateFormat("dd/MM/yyyy"); // using a specific date format
					convertedDate = (Date) formatter.parse(date);
					dti=convertedDate;
					
					do
					{
						System.out.println("Give check out date (day/month/year).");
						date=scan.nextLine(); // reading the check out date
						formatter = new SimpleDateFormat("dd/MM/yyyy"); // using specific date format again
						convertedDate = (Date) formatter.parse(date);
						dto=convertedDate;
						if(dti.after(dto))
						{
							System.out.println("Check out date can't be before entry date.");
						}
					}while(dti.after(dto));
					FileOfPatientList[fopn] = new FileOfPatient(pat, doc, ex, hosp,dti,dto); // insert a new file of patient with all new characteristics
					fopn++;
				}
			}
			else if(choice==6) // DELETE PATIENT USING SSN
			{
				if(patientNum!=0)
				{
					String ssn;
					int temp=0;
					System.out.println("Give SSN number of the patient you want to delete.");
					ssn = scan.nextLine(); // reading the patient to be deleted
					for(int i=0;i<patientNum;i++)
					{
						if(PatientList[i].getSSN().equals(ssn)) // check if SSN is correct
						{
							choice=i;
						}
					}
					for(int i=0;i<fopn;i++)
					{
						if(PatientList[choice]==FileOfPatientList[i].getPat()) 
						{
							temp=i;
						}
					}
					PatientList[choice]=null; // delete patient from the list of patients
					for(int j=choice;j<patientNum-1;j++)
					{
						PatientList[j]=PatientList[j+1];
					}
					PatientList[patientNum-1]=null;
					patientNum--;
					
					FileOfPatientList[temp]=null; // delete the file of the patient
					for(int j=temp;j<fopn-1;j++)
					{
						FileOfPatientList[j]=FileOfPatientList[j+1];
					}
					FileOfPatientList[fopn-1]=null;
					fopn--;
					System.out.println("Patient deleted.");
				}
				else
				{
					System.out.println("No patients found.");
				}
				
			}
			else if(choice==7) // FIND MEDICAL EXAM FILE
			{
				if(hospNum==0 || patientNum==0 || fopn==0)
				{
					System.out.println("Please insert hospitals, patients or patient's file first.");
				}
				else
				{
					System.out.println("Choose the way you want to find a patient's file.");
					System.out.println("1. Patient SSN number.");
					System.out.println("2. Hospital and treatment duration.");
					do
					{
						choice = scan.nextInt(); // reading the user's choice
						sentence = scan.nextLine();
						if(choice<1 || choice >2) // check if the choice is correct
						{
							System.out.println("Wrong input. Please try again.");
						}
					}while(choice<1 || choice >2);
					
					if(choice==1) // find exam file according to SSN
					{
						int found = 0, i=0;
						System.out.println("Give patients SSN number.");
						String ssn = scan.nextLine();
						i=0;
						do
						{
							if(FileOfPatientList[i].getPat().getSSN().equals(ssn))
							{
								found=1; // the file of the patient has been found
								System.out.println("Patient found!!");
								FileOfPatientList[i].Print_File_Of_Patient();
								System.out.println("SSN: "+ssn);
								System.out.println();
							}
							i++;
						}while(found==0 && i!=FileOfPatientList.length);
					}
					else // find exam file according to hospital
					{
						int found=0,i;
						System.out.println("Give hopital's name.");
						String ho = scan.nextLine(); // reading hospital's name
						int j;
						
						System.out.println("Give check in date (day/month/year).");
						date=scan.nextLine(); // reading the check in date
						formatter = new SimpleDateFormat("dd/MM/yyyy"); // using a specific date format again
						convertedDate = (Date) formatter.parse(date);
						dti=convertedDate;
						do
						{
							System.out.println("Give check out date (day/month/year).");
							date=scan.nextLine(); // reading check out date
							formatter = new SimpleDateFormat("dd/MM/yyyy");
							convertedDate = (Date) formatter.parse(date);
							dto=convertedDate;
							if(dti.after(dto)) // 
							{
								System.out.println("Check out date can't be before check in date.");
							}
							
						}while(dti.after(dto));
						
						i=0;
						j=0;
						do 
						{
							if(FileOfPatientList[i].getHospName().getNameOfHospital().equals(ho))
							{
								System.out.println((j+1)+".");
								FileOfPatientList[i].Print_File_Of_Patient();
								found=1; // hospital found
								j++;
							}
						}while(found==0 && i!=fopn);
						if(found==0)
						{
							System.out.println("Hospital not found.");
						}
					}
				}
			}
			else if(choice==8) // PRINT DATA
			{
				//choices for print
				System.out.println("Please, choose what you want to print.");
				System.out.println("1. Exam");
				System.out.println("2. Patient");
				System.out.println("3. Doctor");
				System.out.println("4. File");
				do
				{
					choice = scan.nextInt(); // reading user's choice
					sentence = scan.nextLine();
					if(choice<1 || choice >4) // check for correct choice
					{
						System.out.println("Wrong input. Please try again.");
					}
				}while(choice<1 || choice >4);
				
				if(choice==1) // print medical exam
				{
					if(examNum==0) // check for medical exams in the list of medical exams
					{
						System.out.println("No exams found.");
					}
					else
					{
						for(int i=0;i<examNum;i++)
						{
							System.out.print((i+1)+". ");
							System.out.println("Exam name: "+ExamList[i].getExamName()+"  "+"Exam code: "+ExamList[i].getExamCode());
						}
					}
				}
				else if(choice==2) // print patient
				{
					if(patientNum==0)
					{
						System.out.println("No patients found.");
					}
					else
					{
						for(int i=0;i<patientNum;i++)
						{
							System.out.print((i+1)+". ");
							System.out.println("Patient Name: "+PatientList[i].getPatientName()+"  "+"Patient SSN: "+PatientList[i].getSSN());
						}
					}
				}
				else if(choice==3) // print doctor
				{
					if(doctorNum==0)
					{
						System.out.println("No doctors found.");
					}
					else
					{
						for(int i=0;i<doctorNum;i++)
						{
							System.out.print((i+1)+". ");
							System.out.println("Doctor Name: "+DoctorsList[i].getDoctorsName()+"  "+"Doctor code: "+DoctorsList[i].getDoctorCode()+"  "+"Doctor expertise: "+DoctorsList[i].getexpertise()+"  "+"Doctor working hospital: "+DoctorsList[i].getHospName());
						}
					}
				}
				else // print patient file
				{
					if(patientNum==0)
					{
						System.out.println("No patients found.");
					}
					else
					{
						for(int i=0;i<fopn;i++)
						{
							System.out.print((i+1)+". ");
							FileOfPatientList[i].Print_File_Of_Patient();
						}
					}
				}				
			}
			else
			{
				System.out.println("Exiting Application.");
				System.exit(0);
			}
		}while(choice!=9); // while the application is not terminated
		scan.close(); // closing the Scanner
	}
	
	//METHOD FOR PRINTING THE MENU FOR THE USER/USERS
	public static void printMenu()
	{
		// Prints all the choices and asks for the user to choose one.
		System.out.println("MENU");
		System.out.println("Please give your choice.");
		System.out.println("1. Insert Hospital");
		System.out.println("2. Insert Medical Exam");
		System.out.println("3. Insert Doctor");
		System.out.println("4. Insert Patient");
		System.out.println("5. Insert Patient Exam File");
		System.out.println("6. Delete Patient using SSN number");
		System.out.println("7. Find Exam File");
		System.out.println("8. Print data");
		System.out.println("9. Exit");
	}
}