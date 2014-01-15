package edu.firstteam3189.robot2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.firstteam3189.robot2014.OI;
import edu.firstteam3189.robot2014.subsystems.Client;
import edu.firstteam3189.robot2014.subsystems.CompressorSubsystem;
import edu.firstteam3189.robot2014.subsystems.Drivetrain;
import edu.firstteam3189.robot2014.subsystems.Gearbox;
import edu.firstteam3189.robot2014.subsystems.Shooter;
import edu.firstteam3189.robot2014.subsystems.ShooterPiston;
import edu.firstteam3189.robot2014.subsystems.Sonar;

/**
 * 
 * @author Michael, Andrew, Ky
 */

public abstract class CommandBase extends Command {

    public static OI oi;
    public static Client client = new Client();
    public static Drivetrain drivetrain = new Drivetrain();
    public static CompressorSubsystem compressor = new CompressorSubsystem();
    public static Gearbox gearbox = new Gearbox();
    public static Shooter shooter = new Shooter();
    public static ShooterPiston shooterPiston = new ShooterPiston();
    public static Sonar sonar = new Sonar();
    

    public static void init() {
        oi = new OI();

        SmartDashboard.putData(client);
        SmartDashboard.putData(drivetrain);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
    
    public static void updateStatus () {
        client.updateStatus();
        SmartDashboard.putData(client);
        SmartDashboard.putData(drivetrain);
        shooter.updateStatus();
        sonar.updateStatus();
    }
}
