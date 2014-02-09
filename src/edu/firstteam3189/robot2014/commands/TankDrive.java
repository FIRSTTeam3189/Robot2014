
package edu.firstteam3189.robot2014.commands;

/**
 * 
 * @author Michael
 */

public class TankDrive extends CommandBase {
    
    private boolean toggle;
    private boolean buttonPressed;
    
    public TankDrive() {
        requires(drivetrain);
    }

    protected void initialize() {
    }

    protected void execute() {
        if (oi.getToggleButton() && !buttonPressed) {
            buttonPressed = true;
            toggle = !toggle;
        }
        else if (buttonPressed && !oi.getToggleButton()) {
            buttonPressed = false;
        }
        if (!toggle) {
            drivetrain.powerTankDriveNormal(-oi.getLeftY(), -oi.getRightY());
        } else {
            drivetrain.powerTankDriveReverse(-oi.getLeftY(), -oi.getRightY());
        }
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        drivetrain.murder();
    }

    protected void interrupted() {
        drivetrain.murder();
    }
    
    public boolean isForward () {
        return true;
    }
    
}
