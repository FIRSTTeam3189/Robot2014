/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Michael
 * 
 * This class is for constants only!
 * Variables that can potentially change because of SmartDashboard should be in Configuration.java
 * 
 */
public class Constants {
    public static int cameraWidth = 640;
    public static int cameraHeight = 480;
    
    public static int CLIENT_DISCONNECT = 14;
    public static int CLIENT_SHUTDOWN = 666;
    public static int CLIENT_SEND_CHECK = 69;
    public static int CLIENT_IS_HZ = 2;
    
    public static final double FORWARD_TIME = 2;
    public static final double FORWARD_PWR = .6;
    
    public static final double SHOOT_TIME = 5;
    public static final double EXTEND_TIME = .5;
    
    public static final double wintchDownSpeed = 0.1;
    public static final double wintchUpSpeed = 0.2;
    public static final double wintchUpTime = 0.5;
            
    
    public static double DISTANCE_FROM_WALL = 60;
    public static double DISTANCE_FROM_WALL_TOLERANCE = 2.5;
    
    public static double COLLECTOR_POWER_LIMIT = 0.5;
}