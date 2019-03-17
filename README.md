# Simple-system-for-managing-patient-files-in-a-hospital-using-Java

The aim of this project is to develop a simple but efficient system for managing patient files in a hospital using Java as a programming language. This is a theoretical case study but all the features that the project includes can be match with a real - life scenario.

To begin with, we have a **hospital** that is characterized by its
  1. Name
  2. Departments (e.g. Cardiology, Elderly services, Gastroenterology, General Surgery, Gynecology, etc)

Now, of course every hospital employs **doctors**. Every doctor has the characteristics described below.
  1. Name & Nickname
  2. Residency
  3. A unique doctor - code. Each user can ask for this code and the system should provide the code automatically
  
The hospital treats patients. The characteristics of each **patient** are
  1. Name & Nickname
  2. Social Security Number (SSN)
  
Every hospital has a record made up of all the **patient files**. Now, every patient file is characterized by its
  1. Name of patient
  2. Primary Doctor
  3. Check in date
  4. Check out date
  5. The medical exams which the patient did during its treatment. We consider that the medical exams can't be more than 5
  6. The date of each of the medical exams. In fact, every medical exam must me matched with a date.
  
Last but not least, every **medical exam** is characterized by its
  1. Name
  2. A unique medical exam - code. Each user can ask for this code and the system should provide the code automatically
  
## Functionalities of the System 
The system supports the following functionalities.

- Insert data of the hospital. (For simplicity, we suppose that there only two registered hospitals.) Whenever a user chooses this option he must enter the hospital's data.
- Insert medical exam. Whenever a user chooses this option he must enter the medical exam's data.
- Insert doctor. Whenever a user chooses this option he must enter the doctor's data.
- Insert patient. Whenever a user chooses this option he must enter the patient's data.
- Insert patient's medical file. Whenever a user chooses this option he must enter all the data included in the patient's medical file. Thus,
  1. Patient's hospital
  2. One or more medical exams that the patient has done and the date(s) when the exam took place.
  3. Patient's primary doctor. If the doctor is not registered the system must print a message
  4. From the patients' list, all the data of the patient that are includen in the patient's file. If the patient is not registered the system must print a message
  5. The rest of the data that included in the file (e.g. check in date, check out date etc)
- Delete patient according to SSN. Whenever a user chooses this option, he must enter the name of the patient to be deleted and the system must delete automatically all the patients files
- Find and print patient file. Whenever a user chooses this option he can search for a patient's file according to the SSN or the hospitan and the length of time between the check in date and the check out date
- Print all the data of all medical exams/ doctors/ patients/ medical files

## Assuptions

- We can assume that the maximum number of patients, doctors, patient's files and medical exams cannot be more than 100 in order to create the suitable matrices wherever is needed.
- We can assume for simplicity that all the data are registered in the main memory.
- In Java programming it is prefered that all the methods are implemented in their classes and never in the main class. In the system the implementation of all the methods lies in the main class. This was done in purpose and it is a nice opportunity for anyone to exersise by rearranging them in their classes.

When the program starts it must print the right menu for the user in order to choose one of the options above. The menu must also provide the exit option which will terminate the excecution.
