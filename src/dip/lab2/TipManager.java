/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dip.lab2;

/**
 *
 * @author mbrester1
 */
public class TipManager {
    
    private TipCalculator tip;
    public enum ServiceQuality {
        GOOD, FAIR, POOR
    }

    public TipManager(TipCalculator tip) {
        this.tip = tip;
    }
    
    public double getTip(){
        return tip.getTip();
    }
    
     
    public void setGoodRate(double good) {
        tip.setGoodRate(good);
    }

    
    public void setFairRate(double fair) {
        tip.setFairRate(fair);
    }

    
    public void setPoorRate(double poor) {
        tip.setPoorRate(poor);
    }
    
}
