package practiceProblems;

import java.util.Scanner;

public class RegistrationSoftware {
    String studentName, fatherName, motherName, permanentAddress;
    long studentContactNumber, fatherContactNumber, motherContactNumber;
    double percent12, percent10;
    boolean hostelChoice;
    static int univRollNumber = 191500400, classRollNumber = 0, flag = 0;
    char[] sections = {'A', 'B', 'C', 'D', 'E'};
    Scanner object = new Scanner(System.in);

    void scanValues() {
        univRollNumber++;
        classRollNumber++;
        int count = classRollNumber;
        if (count > 60) {                        /*There will be 60 students per section.*/
            flag++;
            classRollNumber = 1;
        }
        System.out.print("Please enter your name: ");
        studentName = object.nextLine();
        System.out.print("Please enter your father's name: ");
        fatherName = object.nextLine();
        System.out.print("Please enter your mother's name: ");
        motherName = object.nextLine();
        System.out.print("Please enter your permanent address: ");
        permanentAddress = object.nextLine();
        System.out.print("Please enter your contact number: ");
        studentContactNumber = object.nextLong();
        System.out.print("Please enter your father's contact number: ");
        fatherContactNumber = object.nextLong();
        System.out.print("Please enter your mother's contact number: ");
        motherContactNumber = object.nextLong();
        System.out.print("Percentage in 12: ");
        percent12 = object.nextDouble();
        System.out.print("Percenntage in 10: ");
        percent10 = object.nextDouble();
        System.out.print("Hostel Choice: ");
        hostelChoice = object.nextBoolean();
        object.close();
        System.out.println();
    }

    void printValues() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Father's Name: " + fatherName);
        System.out.println("Mother's Name: " + motherName);
        System.out.println("Permanent Address: " + permanentAddress);
        System.out.println("Student's contact number: " + studentContactNumber);
        System.out.println("Father's contact number: " + fatherContactNumber);
        System.out.println("Mother's contact number: " + motherContactNumber);
        System.out.println("Percentage in 12: " + percent12);
        System.out.println("Percentage in 10: " + percent10);
        System.out.println("Hostel Choice(Enter as true/false): " + hostelChoice);
        System.out.println("Year: 1");
        System.out.println("Student Name: " + studentName);
        System.out.println("Section: " + sections[flag]);
        System.out.println("Class Roll Number: " + classRollNumber);
        System.out.println("University Roll Number: " + univRollNumber);
        System.out.println("Course: B.tech CSE");
    }
}

class Registration {
    public static void main(String[] args) {
        RegistrationSoftware student = new RegistrationSoftware();
        student.scanValues();
        student.printValues();
    }
}
