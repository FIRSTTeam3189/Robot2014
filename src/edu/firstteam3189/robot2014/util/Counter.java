/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.util;

/**
 *
 * @author DevBo
 */
public class Counter {
    
    public static final int ONE_SECOND_IN_MILLISECONDS = 1000;
    
    private long endTime;

    public Counter() {
        
    }
    
    /**
     * sets the counters end time to given number in seconds in the future.
     * @param waitTimeInSeconds 
     */
    public void setCounter(double waitTimeInSeconds){
        endTime = System.currentTimeMillis() + (long) (waitTimeInSeconds * ONE_SECOND_IN_MILLISECONDS);
    }
    
    /**
     * is timed out
     * @return 
     */
    public boolean isTimedOut(){
        return endTime <= System.currentTimeMillis();
    }
    
}
