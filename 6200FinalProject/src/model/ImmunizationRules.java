/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author miaoc
 */
public class ImmunizationRules {
    private String AgeMax;
    private String AgeMin;
    
    private String ChickenpoxRequire;
    private String PneumococcalRequire;
    private String MMRRequire;
    private String PolioRequire;
    private String RotavirusRequire; 

    public ImmunizationRules(String AgeMax, String AgeMin, String ChickenpoxRequire, String PneumococcalRequire, String MMRRequire, String PolioRequire, String RotavirusRequire) {
        this.AgeMax = AgeMax;
        this.AgeMin = AgeMin;
        this.ChickenpoxRequire = ChickenpoxRequire;
        this.PneumococcalRequire = PneumococcalRequire;
        this.MMRRequire = MMRRequire;
        this.PolioRequire = PolioRequire;
        this.RotavirusRequire = RotavirusRequire;
    }

    public String getAgeMax() {
        return AgeMax;
    }

    public void setAgeMax(String AgeMax) {
        this.AgeMax = AgeMax;
    }

    public String getAgeMin() {
        return AgeMin;
    }

    public void setAgeMin(String AgeMin) {
        this.AgeMin = AgeMin;
    }

    public String getChickenpoxRequire() {
        return ChickenpoxRequire;
    }

    public void setChickenpoxRequire(String ChickenpoxRequire) {
        this.ChickenpoxRequire = ChickenpoxRequire;
    }

    public String getPneumococcalRequire() {
        return PneumococcalRequire;
    }

    public void setPneumococcalRequire(String PneumococcalRequire) {
        this.PneumococcalRequire = PneumococcalRequire;
    }

    public String getMMRRequire() {
        return MMRRequire;
    }

    public void setMMRRequire(String MMRRequire) {
        this.MMRRequire = MMRRequire;
    }

    public String getPolioRequire() {
        return PolioRequire;
    }

    public void setPolioRequire(String PolioRequire) {
        this.PolioRequire = PolioRequire;
    }

    public String getRotavirusRequire() {
        return RotavirusRequire;
    }

    public void setRotavirusRequire(String RotavirusRequire) {
        this.RotavirusRequire = RotavirusRequire;
    }
    
    
}
