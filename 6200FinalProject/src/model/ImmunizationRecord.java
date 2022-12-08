/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miaoc
 */
public class ImmunizationRecord {
    private Student StudentName;
    private String ChickenpoxStatus;
    private String PneumococcalStatus;
    private String MMRStatus;
    private String PolioStatus;
    private String RotavirusStatus; 

    public ImmunizationRecord(Student StudentName, String ChickenpoxStatus, String PneumococcalStatus, String MMRStatus, String PolioStatus, String RotavirusStatus) {
        this.StudentName = StudentName;
        this.ChickenpoxStatus = ChickenpoxStatus;
        this.PneumococcalStatus = PneumococcalStatus;
        this.MMRStatus = MMRStatus;
        this.PolioStatus = PolioStatus;
        this.RotavirusStatus = RotavirusStatus;
    }
    
    public Student getStudentName() {
        return StudentName;
    }

    public void setStudentName(Student StudentName) {
        this.StudentName = StudentName;
    }

    public String getChickenpoxStatus() {
        return ChickenpoxStatus;
    }

    public void setChickenpoxStatus(String ChickenpoxStatus) {
        this.ChickenpoxStatus = ChickenpoxStatus;
    }

    public String getPneumococcalStatus() {
        return PneumococcalStatus;
    }

    public void setPneumococcalStatus(String PneumococcalStatus) {
        this.PneumococcalStatus = PneumococcalStatus;
    }

    public String getMMRStatus() {
        return MMRStatus;
    }

    public void setMMRStatus(String MMRStatus) {
        this.MMRStatus = MMRStatus;
    }

    public String getPolioStatus() {
        return PolioStatus;
    }

    public void setPolioStatus(String PolioStatus) {
        this.PolioStatus = PolioStatus;
    }

    public String getRotavirusStatus() {
        return RotavirusStatus;
    }

    public void setRotavirusStatus(String RotavirusStatus) {
        this.RotavirusStatus = RotavirusStatus;
    }
    
    
    
}
