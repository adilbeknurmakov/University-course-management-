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
public class Student {

    private String name;
    private int id;
    private double GPA;

    public Student(String name, int id, double GPA) {
        this.name = name;
        this.GPA = GPA;
        this.id = id;
    }

    /**
     * method for getting the name of student
     *
     * @return the student name
     */
    public String getName() {
        return name;
    }

    /**
     * method for getting the ID of student
     *
     * @return the student ID
     */

    public int getID() {
        return id;
    }

    /**
     * method for getting the GPA of student
     *
     * @return the student GPA
     */

    public double getGPA() {
        return GPA;
    }

    /**
     * method for setting the name of student
     *
     * @param name represents the name of student in list sets the student name
     * to variable name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * method for setting the ID of student
     *
     * @param id represents the ID of student in list sets the student name to
     * variable id
     */

    public void setID(int id) {
        this.id = id;
    }

    /**
     * method for setting the GPA of student
     *
     * @param GPA represents the GPA of student in list sets the student name to
     * variable GPA
     */

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Name:" + name + "Student's ID:" + id + "Personal GPA" + GPA;
    }
}
