package edu.firstteam3189.robot2014;


import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.firstteam3189.robot2014.commands.CommandBase;
import edu.firstteam3189.robot2014.commands.autonomous.Autonomous;

/**
 * 
 * @author Michael
 */

public class Robot extends IterativeRobot {

    Command autonomousCommand;

    public void robotInit() {
        autonomousCommand = new Autonomous();

        CommandBase.init();
    }

    public void autonomousInit() {
        autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
        CommandBase.updateStatus();
    }

    public void teleopInit() {
        autonomousCommand.cancel();
    }

    public void teleopPeriodic() {
        CommandBase.updateStatus();
        Scheduler.getInstance().run();
    }

    public void testPeriodic() {
        LiveWindow.run();
    }

    public void disabledPeriodic() {
        CommandBase.updateStatus();
        super.disabledPeriodic(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
