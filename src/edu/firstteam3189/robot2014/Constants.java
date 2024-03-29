package edu.firstteam3189.robot2014;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 * @author Michael
 *
 * This class is for constants only! Variables that can potentially change because of SmartDashboard
 * should be in Configuration.java
 */
public class Constants {

    public static int cameraWidth = 640;
    public static int cameraHeight = 480;
    public static int CLIENT_DISCONNECT = 14;
    public static int CLIENT_SHUTDOWN = 666;
    public static int CLIENT_SEND_CHECK = 69;
    public static int CLIENT_IS_HZ = 2;
    public static double FORWARD_TIME = 2;
    public static double FORWARD_PWR = -0.9;
    public static double FORWARD_START_PWR = -0.4;
    public static double FORWARD_TRANSITION = 3;
    public static double AUTO_WAIT_SHOOT_TIME = 6.5;
    public static double WINCH_DOWN_SPEED = 0.5;
    public static double WINCH_UP_SPEED = -0.25;
    public static double WINCH_UP_TIME = 0.25;
    public static double DISTANCE_FROM_WALL = 60;
    public static double DISTANCE_FROM_WALL_TOLERANCE = 5;
    public static double COLLECTOR_POWER_LIMIT_DOWN = 0.5;
    public static double COLLECTOR_POWER_LIMIT_UP = 0.85;

    public static void initStatus() {
        SmartDashboard.putNumber("Auto Forward Time", FORWARD_TIME);
        SmartDashboard.putNumber("Auto Forward Transtion", FORWARD_TRANSITION);
        SmartDashboard.putNumber("Auto Forward Power", FORWARD_PWR);
        SmartDashboard.putNumber("Auto Forward Start Power", FORWARD_START_PWR);
        SmartDashboard.putNumber("Auto Shot Wait Time", AUTO_WAIT_SHOOT_TIME);
        SmartDashboard.putNumber("Winch Down Speed", WINCH_DOWN_SPEED);
        SmartDashboard.putNumber("Winch up Speed", WINCH_UP_SPEED);
        SmartDashboard.putNumber("Winch Up Time", WINCH_UP_TIME);
        SmartDashboard.putNumber("Indicator Distance", DISTANCE_FROM_WALL);
        SmartDashboard.putNumber("Indicator Distance Tolerance", DISTANCE_FROM_WALL_TOLERANCE);
        SmartDashboard.putNumber("Collector Pwr Limit", COLLECTOR_POWER_LIMIT_DOWN);
    }

    public static void updateStatus() {
        FORWARD_TIME = SmartDashboard.getNumber("Auto Forward Time", FORWARD_TIME);
        FORWARD_TRANSITION = SmartDashboard.getNumber("Auto Forward Transtion", FORWARD_TRANSITION);
        FORWARD_PWR = SmartDashboard.getNumber("Auto Forward Power", FORWARD_PWR);
        FORWARD_START_PWR = SmartDashboard.getNumber("Auto Forward Start Power", FORWARD_START_PWR);
        AUTO_WAIT_SHOOT_TIME = SmartDashboard.getNumber("Auto Shot Wait Time", AUTO_WAIT_SHOOT_TIME);
        WINCH_DOWN_SPEED = SmartDashboard.getNumber("Winch Down Speed", WINCH_DOWN_SPEED);
        WINCH_UP_SPEED = SmartDashboard.getNumber("Winch up Speed", WINCH_UP_SPEED);
        WINCH_UP_TIME = SmartDashboard.getNumber("Winch Up Time", WINCH_UP_TIME);
        DISTANCE_FROM_WALL = SmartDashboard.getNumber("Indicator Distance", DISTANCE_FROM_WALL);
        DISTANCE_FROM_WALL_TOLERANCE = SmartDashboard.getNumber("Indicator Distance Tolerance", DISTANCE_FROM_WALL_TOLERANCE);
        COLLECTOR_POWER_LIMIT_DOWN = SmartDashboard.getNumber("Collector Pwr Limit", COLLECTOR_POWER_LIMIT_DOWN);
    }
}