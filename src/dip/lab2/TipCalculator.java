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
public interface TipCalculator {
    public abstract double getTip();
    public abstract void setGoodRate(double good);
    public abstract void setFairRate(double fair);
    public abstract void setPoorRate(double poor);
    
    
   
    public static enum ServiceQuality {
        GOOD, FAIR, POOR
    }
}
