/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014;

/**
 *
 * @author Michael
 */
public class Constants {
    public static int cameraWidth = 640;
    public static int cameraHeight = 480;
    
    public static int CLIENT_WAIT = 0;
    public static int CLIENT_SEND = 1;
    public static int CLIENT_DISCONNECT = 2;
    public static int CLIENT_START_PROCESSING = 14;
    public static int CLIENT_SENDINGIMAGE = 42;
    public static int CLIENT_SHUTDOWN = 666;
    public static int CLIENT_SEND_CHECK = 69;
    public static int CLIENT_IS_HZ = 1;
    
    public static final double FORWARD_TIME = 2;
    public static final double FORWARD_PWR = .6;
    
    public static final double SHOOT_TIME = 5;
    public static final double EXTEND_TIME = .5;
    
    
    /**
     * Init SmartDashboard variables for constants
     */
    public static void initStatus(){
        
    }    
    /**
     * updates SmartDashboard values for constants
     */
    public static void updateStatus(){
        
    }
}