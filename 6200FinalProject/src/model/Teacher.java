/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Teacher extends Person{
    
    private String gender;
    private int credits;
    private ClassRoom classroom;
    private final List<Student> students;
    private LocalDate reviewDate;
    
    
    public Teacher(String name,String gender, int age, int credits) {
        super(name, age);
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

    public LocalDate getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDate reviewDate) {
        this.reviewDate = reviewDate;
    }
    
    

    
 
}
