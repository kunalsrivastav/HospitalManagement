/*   Created by IntelliJ IDEA.
 *   Author: Kunal Srivastav (kunalsrivastav)
 *   Date: 30-07-2020
 *   Time: 13:39
 *   File: HospitalManagement.java
 */

import java.util.Scanner;
import java.util.Calendar;

class Doctor {
    String doctorID, doctorName, doctorSpecialist, doctorAppointment, doctorQualification;
    int doctorRoomNumber;
    void newDoctor() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Doctor ID : ");
        doctorID = userInput.nextLine();
        System.out.print("Enter Doctor Name : ");
        doctorName = userInput.nextLine();
        System.out.print("Enter Doctor Specialist : ");
        doctorSpecialist = userInput.nextLine();
        System.out.print("Enter Doctor Appointment : ");
        doctorAppointment = userInput.nextLine();
        System.out.print("Enter Doctor Qualification : ");
        doctorQualification = userInput.nextLine();
        System.out.print("Enter Doctor Room Number : ");
        doctorRoomNumber = userInput.nextInt();
    }
    void doctorInformation() {
        System.out.printf("%-12s \t %-12s \t %-18s \t %-20s \t %-18d\n", doctorID, doctorName, doctorAppointment, doctorQualification, doctorRoomNumber);
    }
}

class Patient {
    String patientID, patientName, patientDisease, patientGender, patientAdmitStatus;
    int patientAge;
    void newPatient() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Patient ID : ");
        patientID = userInput.nextLine();
        System.out.print("Enter Patient Name : ");
        patientName = userInput.nextLine();
        System.out.print("Enter Patient Disease : ");
        patientDisease = userInput.nextLine();
        System.out.print("Enter Patient Gender : ");
        patientGender = userInput.nextLine();
        System.out.print("Enter Patient Admit Status : ");
        patientAdmitStatus = userInput.nextLine();
        System.out.print("Enter Patient Age : ");
        patientAge = userInput.nextInt();
    }
    void patientInformation() {
        System.out.printf("%-12s \t %-18s \t %-18s \t %-14s \t %-20s \t %-11d\n", patientID, patientName, patientDisease, patientGender, patientAdmitStatus, patientAge);
    }
}

class Facility {
    String facilityName;
    void addFacility() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Facility Name : ");
        facilityName = userInput.nextLine();
    }
    void showFacility() {
        System.out.printf("%-20s \n", facilityName);
    }
}

class Laboratory {
    String labTest;
    int testCost;
    void newLabTest() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Lab Test Name : ");
        labTest = userInput.nextLine();
        System.out.print("Enter Test Cost : ");
        testCost = userInput.nextInt();
    }
    void labTestList() {
        System.out.printf("%-20s \t %-20s\n", labTest, testCost);
    }
}

class Staff {
    String staffID, staffName, staffDesignation, staffGender;
    int staffSalary;
    void newStaff() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Staff ID : ");
        staffID = userInput.nextLine();
        System.out.print("Enter Staff Name : ");
        staffName = userInput.nextLine();
        System.out.print("Enter Staff Designation : ");
        staffDesignation = userInput.nextLine();
        System.out.print("Enter Staff Gender : ");
        staffGender = userInput.nextLine();
        System.out.print("Enter Staff Salary : ");
        staffSalary = userInput.nextInt();
    }
    void staffInformation() {
        System.out.printf("%-10s \t %-15s \t %-18s \t %-12s \t %-12d\n", staffID, staffName, staffDesignation, staffGender, staffSalary);
    }
}

class Medical {
    String medicineName, medicineComposition, expiryDate;
    int medicineCost, numberOfMedicine;
    void newMedicine() {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Medicine Name : ");
        medicineName = userInput.nextLine();
        System.out.print("Enter Medicine Composition : ");
        medicineComposition = userInput.nextLine();
        System.out.print("Enter Expiry Date : ");
        expiryDate = userInput.nextLine();
        System.out.print("Enter Medicine Cost : ");
        medicineCost = userInput.nextInt();
        System.out.print("Enter Number of Medicine : ");
        numberOfMedicine = userInput.nextInt();
    }
    void medicineInformation() {
        System.out.printf("%-15s \t %-20s \t %-12s \t %-13d \t %-18d\n", medicineName, medicineComposition, expiryDate, medicineCost, numberOfMedicine);
    }
}

public class HospitalManagement {
    public static final int MAX_DOCTOR = 50;
    public static final int MAX_PATIENT = 1000;
    public static final int MAX_FACILITY = 20;
    public static final int MAX_LABORATORY = 25;
    public static final int MAX_STAFF = 80;
    public static final int MAX_MEDICAL = 2000;

    public static void main(String[] args) {
        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Calendar calender = Calendar.getInstance();

        System.out.println("___________________________________________________________________________________________________");
        System.out.println("___________________________****Welcome to Hospital Management System****___________________________");
        System.out.println("___________________________________________________________________________________________________");
        System.out.print("Date: " + months[calender.get(Calendar.MONTH)] + " " + calender.get(Calendar.DATE) + ", " + calender.get(Calendar.YEAR));
        System.out.println("\t\t\t\t\t\t\t\t     " + "Time: " + calender.get(Calendar.HOUR_OF_DAY) + ":" + calender.get(Calendar.MINUTE) + ":" + calender.get(Calendar.SECOND));

        Doctor[] doctor = new Doctor[MAX_DOCTOR];
        Patient[] patient = new Patient[MAX_PATIENT];
        Facility[] facility = new Facility[MAX_FACILITY];
        Laboratory[] laboratory = new Laboratory[MAX_LABORATORY];
        Staff[] staff = new Staff[MAX_STAFF];
        Medical[] medical = new Medical[MAX_MEDICAL];

        for (int i = 0; i < MAX_DOCTOR; i++) {
            doctor[i] = new Doctor();
        }
        for (int i = 0; i < MAX_PATIENT; i++) {
            patient[i] = new Patient();
        }
        for (int i = 0; i < MAX_FACILITY; i++) {
            facility[i] = new Facility();
        }
        for (int i = 0; i < MAX_LABORATORY; i++) {
            laboratory[i] = new Laboratory();
        }
        for (int i = 0; i < MAX_STAFF; i++) {
            staff[i] = new Staff();
        }
        for (int i = 0; i < MAX_MEDICAL; i++) {
            medical[i] = new Medical();
        }

        int doctorIndex = 0, patientIndex = 0, facilityIndex = 0, laboratoryIndex = 0, staffIndex = 0, medicalIndex = 0;

        Scanner userInput = new Scanner(System.in);

        int activeStatus = 1, choice, internalChoice, doctorInformation = 1, patientInformation = 1, facilityInformation = 1, laboratoryInformation = 1, staffInformation = 1, medicalInformation = 1;

        while(activeStatus == 1) {
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("_________________________________________****MAIN MENU****_________________________________________");
            System.out.println("___________________________________________________________________________________________________");
            System.out.println("                   1.Doctors 2.Patient 3.Facility 4.Laboratory 5.Staff 6.Medical                   ");
            System.out.println("___________________________________________________________________________________________________");

            System.out.print("Enter Choice Number : ");
            choice = userInput.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("___________________________________________Doctor Section__________________________________________");
                    System.out.println("___________________________________________________________________________________________________");
                    doctorInformation = 1;
                    while (doctorInformation == 1) {
                        System.out.println("1.Add New Entry");
                        System.out.println("2.Existing Doctors List");
                        internalChoice = userInput.nextInt();
                        switch (internalChoice) {
                            case 1: {
                                doctor[doctorIndex].newDoctor();
                                doctorIndex++;
                                break;
                            }
                            case 2: {
                                if (doctorIndex == 0) {
                                    System.out.println("Sorry! no data found.");
                                } else {
                                    System.out.println("___________________________________________________________________________________________________");
                                    System.out.printf("%-12s \t %-12s \t %-18s \t %-20s \t %-18s\n", "Doctor ID", "Doctor Name", "Doctor Appointment", "Doctor Qualification", "Doctor Room Number");
                                    System.out.println("___________________________________________________________________________________________________");
                                    for (int j = 0; j < doctorIndex; j++) {
                                        doctor[j].doctorInformation();
                                    }
                                    System.out.println("___________________________________________________________________________________________________");
                                }
                                break;
                            }
                        }
                        System.out.println("Press 1 to return back or Press 0 for Main Menu");
                        doctorInformation = userInput.nextInt();
                    }
                    break;
                }

                case 2: {
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("__________________________________________Patient Section__________________________________________");
                    System.out.println("___________________________________________________________________________________________________");
                    patientInformation = 1;
                    while (patientInformation == 1) {
                        System.out.println("1.Add New Entry");
                        System.out.println("2.Existing Patient List");
                        internalChoice = userInput.nextInt();
                        switch (internalChoice) {
                            case 1: {
                                patient[patientIndex].newPatient();
                                patientIndex++;
                                break;
                            }
                            case 2: {
                                if (patientIndex == 0) {
                                    System.out.println("Sorry! no data found.");
                                } else {
                                    System.out.println("________________________________________________________________________________________________________________________");
                                    System.out.printf("%-12s \t %-18s \t %-18s \t %-14s \t %-20s \t %-11s\n", "Patient ID", "Patient Name", "Patient Disease", "Patient Gender", "Patient Admit Status", "Patient Age");
                                    System.out.println("________________________________________________________________________________________________________________________");
                                    for (int j = 0; j < patientIndex; j++) {
                                        patient[j].patientInformation();
                                    }
                                    System.out.println("________________________________________________________________________________________________________________________");
                                }
                                break;
                            }
                        }
                        System.out.println("Press 1 to return back or Press 0 for Main Menu");
                        patientInformation = userInput.nextInt();
                    }
                    break;
                }

                case 3: {
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("__________________________________________Facility Section_________________________________________");
                    System.out.println("___________________________________________________________________________________________________");
                    facilityInformation = 1;
                    while (facilityInformation == 1) {
                        System.out.println("1.Add New Entry");
                        System.out.println("2.Existing Facility List");
                        internalChoice = userInput.nextInt();
                        switch (internalChoice) {
                            case 1: {
                                facility[facilityIndex].addFacility();
                                facilityIndex++;
                                break;
                            }
                            case 2: {
                                if (facilityIndex == 0) {
                                    System.out.println("Sorry! no data found.");
                                } else {
                                    System.out.println("_____________________");
                                    System.out.printf("%-20s \n", "Facility Name");
                                    System.out.println("_____________________");
                                    for (int j = 0; j < facilityIndex; j++) {
                                        facility[j].showFacility();
                                    }
                                    System.out.println("_____________________");
                                }
                                break;
                            }
                        }
                        System.out.println("Press 1 to return back or Press 0 for Main Menu");
                        facilityInformation = userInput.nextInt();
                    }
                    break;
                }

                case 4: {
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("_________________________________________Laboratory Section________________________________________");
                    System.out.println("___________________________________________________________________________________________________");
                    laboratoryInformation = 1;
                    while (laboratoryInformation == 1) {
                        System.out.println("1.Add New Entry");
                        System.out.println("2.Existing Laboratory Test");
                        internalChoice = userInput.nextInt();
                        switch (internalChoice) {
                            case 1: {
                                laboratory[laboratoryIndex].newLabTest();
                                laboratoryIndex++;
                                break;
                            }
                            case 2: {
                                if (laboratoryIndex == 0) {
                                    System.out.println("Sorry! no data found.");
                                } else {
                                    System.out.println("_____________________________________________");
                                    System.out.printf("%-20s \t %-20s\n", "Lab Test Name", "Test Cost");
                                    System.out.println("_____________________________________________");
                                    for (int j = 0; j < laboratoryIndex; j++) {
                                        laboratory[j].labTestList();
                                    }
                                    System.out.println("_____________________________________________");
                                }
                                break;
                            }
                        }
                        System.out.println("Press 1 to return back or Press 0 for Main Menu");
                        laboratoryInformation = userInput.nextInt();
                    }
                    break;
                }

                case 5: {
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("___________________________________________Staff Section___________________________________________");
                    System.out.println("___________________________________________________________________________________________________");
                    staffInformation = 1;
                    while (staffInformation == 1) {
                        System.out.println("1.Add New Entry");
                        System.out.println("2.Existing Staff Information");
                        internalChoice = userInput.nextInt();
                        switch (internalChoice) {
                            case 1: {
                                staff[staffIndex].newStaff();
                                staffIndex++;
                                break;
                            }
                            case 2: {
                                if (staffIndex == 0) {
                                    System.out.println("Sorry! no data found.");
                                } else {
                                    System.out.println("______________________________________________________________________________________");
                                    System.out.printf("%-10s \t %-15s \t %-18s \t %-12s \t %-12s\n", "Staff ID", "Staff Name", "Staff Designation", "Staff Gender", "Staff Salary");
                                    System.out.println("______________________________________________________________________________________");
                                    for (int j = 0; j < staffIndex; j++) {
                                        staff[j].staffInformation();
                                    }
                                    System.out.println("______________________________________________________________________________________");
                                }
                                break;
                            }
                        }
                        System.out.println("Press 1 to return back or Press 0 for Main Menu");
                        staffInformation = userInput.nextInt();
                    }
                    break;
                }

                case 6: {
                    System.out.println("___________________________________________________________________________________________________");
                    System.out.println("__________________________________________Medical Section__________________________________________");
                    System.out.println("___________________________________________________________________________________________________");
                    medicalInformation = 1;
                    while (medicalInformation == 1) {
                        System.out.println("1.Add New Entry");
                        System.out.println("2.Existing Medical Information");
                        internalChoice = userInput.nextInt();
                        switch (internalChoice) {
                            case 1: {
                                medical[medicalIndex].newMedicine();
                                medicalIndex++;
                                break;
                            }
                            case 2: {
                                if (medicalIndex == 0) {
                                    System.out.println("Sorry! no data found.");
                                } else {
                                    System.out.println("________________________________________________________________________________________________");
                                    System.out.printf("%-15s \t %-20s \t %-12s \t %-13s \t %-18s\n", "Medicine Name", "Medicine Composition", "Expiry Date", "Medicine Cost", "Number Of Medicine");
                                    System.out.println("________________________________________________________________________________________________");
                                    for (int j = 0; j < medicalIndex; j++) {
                                        medical[j].medicineInformation();
                                    }
                                    System.out.println("________________________________________________________________________________________________");
                                }
                                break;
                            }
                        }
                        System.out.println("Press 1 to return back or Press 0 for Main Menu");
                        medicalInformation = userInput.nextInt();
                    }
                    break;
                }

                default: {
                    System.out.println("You have entered Wrong Choice!");
                    break;
                }
            }
            System.out.println("Press 1 to get Main-Menu or 0 to get Exit!");
            activeStatus = userInput.nextInt();
        }
        userInput.close();
    }
}