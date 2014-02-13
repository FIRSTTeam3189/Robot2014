/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.util;

import edu.wpi.first.wpilibj.Solenoid;

/**
 *
 * @author Michael, Ian
 */
public class Piston {
    
    private Solenoid extended;
    private Solenoid retracted;
    
    public Piston (int extendedChannel, int retractedChannel) {
        extended = new Solenoid(extendedChannel);
        retracted = new Solenoid(retractedChannel);
        init();
    }
    
    public Piston (int extendedChannel, int retractedChannel, boolean isRetracted) {
        extended = new Solenoid(extendedChannel);
        retracted = new Solenoid(retractedChannel);
        init(isRetracted);
    }
    
    private void init(){
        retract();
    }
    
    private void init(boolean retracted){
        retract(retracted);
    }
    
    public void extend () {
        extended.set(true);
        retracted.set(false);
    }
    
    public void extend (boolean isExtended) {
        extended.set(isExtended);
        retracted.set(!isExtended);
    }
    
    public void retract () {
        retracted.set(true);
        extended.set(false);
    }
    
    public void retract (boolean isRetracted) {
        retracted.set(isRetracted);
        extended.set(!isRetracted);
    }
    
    public boolean isExtended () {
        return extended.get();
    }
    
    public boolean isRetracted () {
        return retracted.get();
    }
    
    /**
     * Checks if both are equal and defaults to extended
     * Else extend is set to retract state
     * Retract is set to negated extend state
     */
    public void toggle () {
        extended.set(!extended.get());
        retracted.set(!extended.get());
    }
    
}
