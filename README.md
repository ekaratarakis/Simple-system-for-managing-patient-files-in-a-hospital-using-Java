# Simple-system-for-managing-patient-files-in-a-hospital-using-Java

The aim of this project is to develop a simple but efficient system for managing patient files in a hospital using Java as a programming language. This is a theoretical case study but all the features that the project includes can be match with a real - life scenario.

To begin with, we have a **hospital** that is characterized by its
  1. Name
  2. Departments (e.g. Cardiology, Elderly services, Gastroenterology, General Surgery, Gynecology, etc)

Now, of course every hospital employs doctors. Every doctor has the characteristics described below.
  1. Name & Nickname
  2. Residency
  3. A unique doctor - code. Each user can ask for this code and the system should provide the code automatically
  
The hospital treats patients. The characteristics of each patient are
  1. Name & Nickname
  2. Social Security Number (SSN)
  
Every hospital has a record made up of all the patient files. Now, every patient file is characterized by its
  1. Name of patient
  2. Primary Doctor
  3. Check in date
  4. Check out date
  5. The medical exams which the patient did during its treatment. We consider that the medical exams cannot be more than 5
  6. The date of each of the medical exams. In fact, every medical exam must me matched with a date.
  
Last but not least, every medical exam is characterized by its
  1. Name
  2. A unique medical exam - code. Each user can ask for this code and the system should provide the code automatically
  
