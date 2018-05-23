/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;

/**
 *
 * @author Adilbek Nurmakov
 */
public class Course {

    private String titleOfCourse = "Perfomance and Data Structures";
    Student[] students = new Student[5];
    private int num = 0;
    private double avGPA;

    /**
     * method for calculating average GPA of students method divides sum of GPA
     * of all students by their number
     *
     * @throws Exception if there is no student to calculate GPA
     *
     */
    public double calcAverageGPA() throws Exception {
        for (int i = 0; i < num; i++) {
            avGPA += students[i].getGPA();

        }
        if (num == 0) {
            throw new Exception("There are no student in a course list");
        } else {
            avGPA = avGPA / num;
            return avGPA;
        }
    }

    /**
     * method for adding students to the course method checks if there is free
     * spot in a list
     *
     * @throws Exception if there is no free space in course
     *
     */
    public void addStudent(Student s) throws Exception {

        if (students.length > num) {
            students[num] = s;
            num++;

        } else {
            throw new Exception("The cours is already full");

        }

    }

    /**
     * method for removing students from the course method checks whether ir not
     * the list is already empty or does student exist in course
     *
     * @throws Exception if the list is empty or student is not found
     *
     */
    public void removeStudent(int id) throws Exception {
        for (int i = 0; i < num; i++) {
            if (students[i].getID() == id) {
                for (int j = i; j < num; j++) {
                    students[j] = students[j + 1];
                }
                num--;
            } else {

                System.out.println("The student is not found");
                break;
            }
            if (num == 0) {
                throw new Exception("The list is empty!");
            }

        }

    }

    /**
     * public void enterNumberOfStudents(int n){ if(num<=5){ num=num+n; } else{
     * System.out.println("dfsdfs"); }
        }*
     */

    /**
     * method for getting the current number of students
     *
     * @return the student number
     */
    public int getNumberOFStudents() {
        return num;
    }

    /**
     * method for printing the contents of student list
     *
     *
     */
    public void printListOFStudents() {
        for (int i = 0; i < num; i++) {
            System.out.println(students[i]);
        }
    }
}
