package de.iav.studend.model;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.concurrent.ThreadLocalRandom;

public class StudentDB {

    private final Student[] students;

    public StudentDB(Student[] students) {
        this.students = students.clone();
    }

    public Student[] getAllStudents() {
        return students;
    }

    public Student randomStudent(){
        if(students.length == 0){
            throw new NoSuchElementException("Die StudentDB is leer...!");
        }

        int randomNumberBetween0AndStudentsArrayLenght = ThreadLocalRandom.current().nextInt(0, students.length);
        return students[randomNumberBetween0AndStudentsArrayLenght];
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}



