package de.iav.studend;

import de.iav.studend.model.ComputerScienceStudent;
import de.iav.studend.model.Student;
import de.iav.studend.model.StudentDB;

import java.util.Arrays;

public class Main1 {

    public static void main(String[] args) {

       /* Student joerg = new Student("Jörg", 123456);
        Student jessie = new Student("Jessie", 654321);
        Student steve = new Student("Steve", 5964);*/
        ComputerScienceStudent frank = new ComputerScienceStudent("Frank", 38388, true);

        System.out.println(frank);
        System.out.println(frank.getCourse());

       /* Student[] students = {joerg, jessie, steve, frank};
        StudentDB studentDB = new StudentDB(students);*/

    }
}
