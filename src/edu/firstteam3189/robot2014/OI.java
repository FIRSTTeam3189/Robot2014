package edu.firstteam3189.robot2014;

import edu.firstteam3189.robot2014.commands.CollectorClawClose;
import edu.firstteam3189.robot2014.commands.CollectorControl;
import edu.firstteam3189.robot2014.commands.GearBoxHighGear;
import edu.firstteam3189.robot2014.commands.GearBoxLowGear;
import edu.firstteam3189.robot2014.commands.CollectorClawOpen;
import edu.firstteam3189.robot2014.commands.GearBoxShiftGear;
import edu.firstteam3189.robot2014.commands.LatchLatch;
import edu.firstteam3189.robot2014.commands.ReleaseShootingSystems;
import edu.firstteam3189.robot2014.commands.WintchControl;
import edu.firstteam3189.robot2014.commands.WintchDown;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * @author Michael but more Ky
 */
public class OI {
    
    private Joystick leftJoystick = new Joystick(ControlMap.leftJoystick);
    private Joystick rightJoystick = new Joystick(ControlMap.rightJoystick);
    private Joystick controller = new Joystick(ControlMap.controller);
    
    private Button rightButton1 = new JoystickButton(rightJoystick, 1);
    private Button rightButton2 = new JoystickButton(rightJoystick, 2);
    private Button rightButton3 = new JoystickButton(rightJoystick, 3);
    
    private Button controllerButton1 = new JoystickButton(controller, 1);
    private Button controllerButton2 = new JoystickButton(controller, 2);
    private Button controllerButton3 = new JoystickButton(controller, 3);
    private Button controllerButton4 = new JoystickButton(controller, 4);
    private Button controllerButton5 = new JoystickButton(controller, 5);
    private Button controllerButton6 = new JoystickButton(controller, 6);
    private Button controllerButton7 = new JoystickButton(controller, 7);
    
    
    public OI () {
        rightButton1.whenPressed(new GearBoxShiftGear());
        rightButton2.whenPressed(new GearBoxHighGear());
        rightButton3.whenPressed(new GearBoxLowGear());
        
        controllerButton1.whenPressed(new ReleaseShootingSystems());
        controllerButton2.whenPressed(new CollectorClawOpen());
        controllerButton3.whenPressed(new CollectorClawClose());
        controllerButton4.whenPressed(new WintchDown());
        controllerButton5.whenPressed(new WintchDown());
        controllerButton6.whenPressed(new WintchControl());
        controllerButton7.whenPressed(new CollectorControl());
    }
    
    public double getLeftY () {
        return leftJoystick.getY();
    }
    
    public double getRightY () {
        return rightJoystick.getY();
    }
    
    public double getShooterY(){
        return controller.getY();
    }
    
    public double getShooterThrottle(){
        return (controller.getThrottle() + 1.0)/2.0;
    }
    
    public boolean getToggleButton () {
        return leftJoystick.getRawButton(1);
    }

    public void updateStatus(){
        SmartDashboard.putNumber("OI Shooter Y", getShooterY());
        SmartDashboard.putNumber("OI Left Y", getLeftY());
        SmartDashboard.putNumber("OI Right Y", getRightY());
        SmartDashboard.putNumber("OI Shooter Throttle", getShooterY());
        SmartDashboard.putBoolean("OI Toggle Drive", getToggleButton());
    }
}
