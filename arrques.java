import java.util.Scanner;

class Studentdetail {

    public void student(int arrsize) {

        Scanner scn = new Scanner(System.in);

        int studId[] = new int[arrsize];
        String stuName[] = new String[arrsize];
        int mathMarks[] = new int[arrsize];
        int physMarks[] = new int[arrsize];
        int chemMarks[] = new int[arrsize];
        int bioMarks[] = new int[arrsize];
        char stuGrades[] = new char[arrsize];
        String studRemarks[] = new String[arrsize];

        int counter = 1;
        int sumofsubmarks;
        int avg;

        System.out.println();
        System.out.println("************::Student ID::**************");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("Enter Student Id" + counter + "::");
            studId[i] = scn.nextInt();
            counter++;
        }
        counter = 1;
        System.out.println();
        scn.nextLine();
        System.out.println("***********::Student Name::**************");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("Enter Student Name" + counter + "::");

            stuName[i] = scn.nextLine();
            counter++;
        }
        counter = 1;
        System.out.println();
        System.out.println("***********::Math Marks::**************");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("Enter Math Marks" + counter + "::");
            mathMarks[i] = scn.nextInt();
            counter++;
        }
        counter = 1;
        System.out.println();
        System.out.println("***********::Physic Marks::**************");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("Enter Physic Marks" + counter + "::");
            physMarks[i] = scn.nextInt();
            counter++;
        }
        counter = 1;
        System.out.println();
        System.out.println("***********::Chemistry marks::**************");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("Enter Chemistry Marks" + counter + "::");
            chemMarks[i] = scn.nextInt();
            counter++;
        }
        counter = 1;
        System.out.println();
        System.out.println("***********::Biology marks::**************");
        for (int i = 0; i < arrsize; i++) {
            System.out.print("Enter Biology Marks" + counter + "::");
            bioMarks[i] = scn.nextInt();
            counter++;
        }

        // logic for grade
        for (int i = 0; i < arrsize; i++) {
            sumofsubmarks = mathMarks[i] + physMarks[i] + chemMarks[i] + bioMarks[i];
            avg = sumofsubmarks / 4;

            if (avg >= 90) {
                stuGrades[i] = 'A';
                studRemarks[i] = "Excellent";
            } else if (avg >= 70 && avg < 90) {
                stuGrades[i] = 'B';
                studRemarks[i] = "Very Good";
            } else if (avg >= 50 && avg < 70) {
                stuGrades[i] = 'C';
                studRemarks[i] = "Good";
            } else {
                stuGrades[i] = 'F';
                studRemarks[i] = "Fail";
            }

        }

        System.out.println();
        System.out.println();
        System.out.println(
                "\t Student ID \t Student Name \t Math Marks \t Phy Marks \t Che Marks \t Bio Marks \t Student Grade \t Remarks");
        System.out.println(
                "\t -----------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < arrsize; i++) {
            System.out.println("\t\t" + studId[i] + "\t\t" + stuName[i] + "\t\t" + mathMarks[i] + "\t\t" + physMarks[i]
                    + "\t\t" + chemMarks[i] + "\t\t" + bioMarks[i] + "\t\t" + stuGrades[i] + "\t" + studRemarks[i]);
        }

        System.out.println(
                "\t -----------------------------------------------------------------------------------------------------------------------");

        System.out.println(
                "---------------------------------------------------------------------------------------------------------------------------");

    }

}

public class arrques {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.print("\t Enter How Many Student Mark You Want To Enter : ");
        int studentArraySize = scn.nextInt();
        if (studentArraySize > 0) {
            Studentdetail student1 = new Studentdetail();
            student1.student(studentArraySize);

        } else {
            System.out.println();
            System.out.println("\t \t ***** Array Size Must Be Greater Than Zero ..!! ");
        }
    }

}
