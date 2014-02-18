package edu.firstteam3189.robot2014;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Michael
 * 
 * This class is for constants only!
 * Variables that can potentially change because of SmartDashboard should be in Configuration.java
 */
public class Constants {
    public static int cameraWidth = 640;
    public static int cameraHeight = 480;
    
    public static int CLIENT_DISCONNECT = 14;
    public static int CLIENT_SHUTDOWN = 666;
    public static int CLIENT_SEND_CHECK = 69;
    public static int CLIENT_IS_HZ = 2;
    
    public static double FORWARD_TIME = 4;
    public static double FORWARD_PWR = -0.9;
    public static double FORWARD_START_PWR = 0.4;
    public static double FORWARD_TRANSITION = 1.5;
    
    public static double AUTO_WAIT_SHOOT_TIME = 7.5;
    
    public static double WINTCH_DOWN_SPEED = 0.35;
    public static double WINTCH_UP_SPEED = -0.25;
    public static double WINTCH_UP_TIME = 0.75;
    
    public static double DISTANCE_FROM_WALL = 60;
    public static double DISTANCE_FROM_WALL_TOLERANCE = 5;
    
    public static double COLLECTOR_POWER_LIMIT = 0.5;
    
    public static void initStatus(){
        SmartDashboard.putNumber("Auto Forward Time", FORWARD_TIME);
        SmartDashboard.putNumber("Auto Forward Transtion", FORWARD_TRANSITION);
        SmartDashboard.putNumber("Auto Forward Power", FORWARD_PWR);
        SmartDashboard.putNumber("Auto Forward start Power", FORWARD_START_PWR);
        SmartDashboard.putNumber("Auto Shot Wait Time", AUTO_WAIT_SHOOT_TIME);
        SmartDashboard.putNumber("Wintch Down Speed", WINTCH_DOWN_SPEED);
        SmartDashboard.putNumber("Wintch up Speed", WINTCH_UP_SPEED);
        SmartDashboard.putNumber("Wintch Up Time", WINTCH_UP_TIME);
        SmartDashboard.putNumber("Indecator Distance", DISTANCE_FROM_WALL);
        SmartDashboard.putNumber("Indecator Distance Tolerance", DISTANCE_FROM_WALL_TOLERANCE);
        SmartDashboard.putNumber("Collector Pwr Limit", COLLECTOR_POWER_LIMIT);
    }
    
    public static void updateStatus(){
        FORWARD_TIME = SmartDashboard.getNumber("Auto Forward Time", FORWARD_TIME);
        FORWARD_TRANSITION = SmartDashboard.getNumber("Auto Forward Transtion", FORWARD_TRANSITION);
        FORWARD_PWR = SmartDashboard.getNumber("Auto Forward Power", FORWARD_PWR);
        FORWARD_START_PWR = SmartDashboard.getNumber("Auto Forward start Power", FORWARD_START_PWR);
        AUTO_WAIT_SHOOT_TIME = SmartDashboard.getNumber("Auto Shot Wait Time", AUTO_WAIT_SHOOT_TIME);
        WINTCH_DOWN_SPEED = SmartDashboard.getNumber("Wintch Down Speed", WINTCH_DOWN_SPEED);
        WINTCH_UP_SPEED = SmartDashboard.getNumber("Wintch up Speed", WINTCH_UP_SPEED);
        WINTCH_UP_TIME = SmartDashboard.getNumber("Wintch Up Time", WINTCH_UP_TIME);
        DISTANCE_FROM_WALL = SmartDashboard.getNumber("Indecator Distance", DISTANCE_FROM_WALL);
        DISTANCE_FROM_WALL_TOLERANCE = SmartDashboard.getNumber("Indecator Distance Tolerance", DISTANCE_FROM_WALL_TOLERANCE);
        COLLECTOR_POWER_LIMIT = SmartDashboard.getNumber("Collector Pwr Limit", COLLECTOR_POWER_LIMIT);
    }
}