/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author gecheng
 */
public class Teacher extends Person{
    private int credits;
    private String gender;
    private ClassRoom classroom;
    private final List<Student> students;
    
    public Teacher(int credits,String gender, int age, String name) {
        super(age, name);
        this.credits = credits;
        this.gender = gender;
        this.students = new ArrayList<>();
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ClassRoom getClassroom() {
        return classroom;
    }

    public void setClassroom(ClassRoom classroom) {
        this.classroom = classroom;
    }
    
    

    
 
}
