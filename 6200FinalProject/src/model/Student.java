/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private double gpa;
    private String parentName;
    private String address;
    private long phone;
    private LocalDate registrationDate;
    private Teacher assignedTeacher;
    private List<ImmunizationRecord> immunizations;

    public Student(String name, int age, String parentName, String address, long phone) {
        super(name, age);
        this.parentName = parentName;
        this.address = address;
        this.phone = phone;
        this.immunizations = new ArrayList<>();
    }
    
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Teacher getAssignedTeacher() {
        return assignedTeacher;
    }

    public void setAssignedTeacher(Teacher assignedTeacher) {
        this.assignedTeacher = assignedTeacher;
    }

    public List<ImmunizationRecord> getImmunizations() {
        return immunizations;
    }

    public void setImmunizations(List<ImmunizationRecord> immunizations) {
        this.immunizations = immunizations;
    }

    
    
}
