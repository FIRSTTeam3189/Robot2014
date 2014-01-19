
package edu.firstteam3189.robot2014;

import edu.firstteam3189.robot2014.commands.ControllerTankDrive;
import edu.firstteam3189.robot2014.commands.HighGear;
import edu.firstteam3189.robot2014.commands.LowGear;
import edu.firstteam3189.robot2014.commands.ShiftGear;
import edu.firstteam3189.robot2014.commands.ShooterCommand;
import edu.firstteam3189.robot2014.commands.net.CheckHotzone;
import edu.firstteam3189.robot2014.commands.net.SendHotzoneCheck;
import edu.firstteam3189.robot2014.commands.net.StartClient;
import edu.firstteam3189.robot2014.commands.ExtendKicker;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.DigitalIOButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 * @author Michael
 */
public class OI {
    
    private Joystick leftJoystick = new Joystick(ControlMap.leftJoystick);
    private Joystick rightJoystick = new Joystick(ControlMap.rightJoystick);
    private Joystick controller = new Joystick(ControlMap.controller);
    
    private Button shiftGears = new JoystickButton(rightJoystick, ControlMap.shiftGears);
    private Button lowGear = new JoystickButton(rightJoystick, ControlMap.lowGear);
    private Button highGear = new JoystickButton(rightJoystick, ControlMap.highGear);
    
    private Button startClient = new JoystickButton(controller, ControlMap.button0);
    private Button sendCode = new JoystickButton(controller, ControlMap.button1);
    private Button recieveCode = new JoystickButton(controller, ControlMap.button2);
    private Button button4 = new JoystickButton(controller, 4);
    
    private Button button5 = new JoystickButton(controller, ControlMap.button5);
    private Button button6 = new JoystickButton(controller, ControlMap.button6);
    
    public OI () {
        shiftGears.whenPressed(new ShiftGear());
        lowGear.whenPressed(new LowGear());
        highGear.whenPressed(new HighGear());
        startClient.whenPressed(new StartClient());
        sendCode.whenPressed(new SendHotzoneCheck());
        recieveCode.whenPressed(new CheckHotzone());
        button5.whileHeld(new ExtendKicker());
        button4.whenPressed(new ShooterCommand());
        
    }
    
    public double getLeftY () {
        return leftJoystick.getY();
    }
    
    public double  getRightY () {
        return rightJoystick.getY();
    }
    
    public double getControllerLeftY () {
        return controller.getRawAxis(2);
    }
    
    public double getControllerRightY () {
        return controller.getRawAxis(6);
    }
    
    public void updateStatus(){
        SmartDashboard.putNumber("axis", getControllerRightY());
    }
    
}

