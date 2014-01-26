
package edu.firstteam3189.robot2014;

import edu.firstteam3189.robot2014.commands.CloseCollector;
import edu.firstteam3189.robot2014.commands.HighGear;
import edu.firstteam3189.robot2014.commands.LowGear;
import edu.firstteam3189.robot2014.commands.OpenCollector;
import edu.firstteam3189.robot2014.commands.ShiftGear;
import edu.firstteam3189.robot2014.commands.ShooterCommand;
import edu.firstteam3189.robot2014.commands.ToggleCollector;
import edu.firstteam3189.robot2014.commands.net.CheckHotzone;
import edu.firstteam3189.robot2014.commands.net.SendHotzoneCheck;
import edu.firstteam3189.robot2014.commands.net.StartClient;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
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
    
    private Button rightButton1 = new JoystickButton(rightJoystick, ControlMap.rightButton1);
    private Button rightButton2 = new JoystickButton(rightJoystick, ControlMap.rightButton2);
    private Button rightButton3 = new JoystickButton(rightJoystick, ControlMap.rightButton3);
    
    private Button controllerButton1 = new JoystickButton(controller, ControlMap.button0);
    private Button controllerButton2 = new JoystickButton(controller, ControlMap.button1);
    private Button controllerButton3 = new JoystickButton(controller, ControlMap.button2);
    private Button controllerButton4 = new JoystickButton(controller, 4);
    private Button controllerButton5 = new JoystickButton(controller, ControlMap.button5);
    private Button controllerButton6 = new JoystickButton(controller, ControlMap.button6);
    private Button controllerButton7 = new JoystickButton(controller, ControlMap.button7);
    private Button controllerButton8 = new JoystickButton(controller, ControlMap.button8);
    
    public OI () {
        rightButton1.whenPressed(new ShiftGear());
        rightButton2.whenPressed(new HighGear());
        rightButton3.whenPressed(new LowGear());
        
        controllerButton2.whenPressed(new ToggleCollector());
        controllerButton7.whenPressed(new OpenCollector());
        controllerButton8.whenPressed(new CloseCollector());
        
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
