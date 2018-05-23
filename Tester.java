/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

//import java.util.Scanner;
/**
 *
 * @author Adilbek Nurmakov
 */
public class Tester {

    public static void main(String[] args) {
        Course cor = new Course();

        //Scanner ins = new Scanner(System.in);
        Student s1 = new Student("Dusha", 1245, 3.13);
        Student s2 = new Student("Turbo", 12456, 3.49);
        Student s3 = new Student("Gena", 7444, 2.22);
        Student s4 = new Student("Stas", 74444, 2.22);
        Student s5 = new Student("Nikita", 74844, 2.22);
    //Student s6=new Student("Garik",748474,2.22); // the 6-th student 
        //System.out.println(s1.toString()); //toString representation
        try {
            //System.out.println(cor.calcAverageGPA());//calculates GPA for 0 students
            cor.addStudent(s1);
            cor.addStudent(s2);
            cor.addStudent(s3);
            cor.addStudent(s4);
            cor.addStudent(s5);
    //cor.removeStudent(12); // non existent student 
            //cor.addStudent(s6); //Potential error
            //cor.printListOFStudents(); //OK
            // cor.calcAverageGPA();//OK
            System.out.println(cor.calcAverageGPA());

    // System.out.println("Please enter the number of students: ");
            //int n = ins.nextInt();
            //cor.enterNumberOfStudents(n);
            cor.removeStudent(1245);
            cor.removeStudent(1245);//test for empty list of students

        } catch (Exception ex) {
            //System.out.println(s1);
            System.out.println(ex.getMessage());
            cor.printListOFStudents();
            System.out.println(cor.getNumberOFStudents());
        }
    }
}
