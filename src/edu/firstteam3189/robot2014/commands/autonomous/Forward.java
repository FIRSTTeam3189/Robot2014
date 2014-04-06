package edu.firstteam3189.robot2014.commands.autonomous;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.commands.CommandBase;
import edu.firstteam3189.robot2014.util.Counter;
import edu.wpi.first.wpilibj.image.CurveOptions;

/**
 *
 * @author Michael, Ky
 */
public class Forward extends CommandBase {
    
    private Counter counter = new Counter();
    private double time;
    
    public Forward(double time) {
        requires(drivetrain);
        this.time = time;
    }

    protected void initialize() {
        setTimeout(time);
        counter.setCounter(Constants.FORWARD_TRANSITION);
        drivetrain.powerTankDriveNormal(Constants.FORWARD_START_PWR, Constants.FORWARD_START_PWR);
    }

    protected void execute() {
        if(counter.isTimedOut()){
            drivetrain.powerTankDriveNormal(Constants.FORWARD_PWR, Constants.FORWARD_PWR);
            counter.setCounter(10);
        }
        
    }

    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        drivetrain.murder();
    }

    protected void interrupted() {
        drivetrain.murder();
    }
}