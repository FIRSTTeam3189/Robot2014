package edu.firstteam3189.robot2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.firstteam3189.robot2014.OI;
import edu.firstteam3189.robot2014.subsystems.CollectorGrabber;
import edu.firstteam3189.robot2014.subsystems.Client;
import edu.firstteam3189.robot2014.subsystems.Collector;
import edu.firstteam3189.robot2014.subsystems.CompressorSubsystem;
import edu.firstteam3189.robot2014.subsystems.Drivetrain;
import edu.firstteam3189.robot2014.subsystems.Gearbox;
import edu.firstteam3189.robot2014.subsystems.Shooter;
import edu.firstteam3189.robot2014.subsystems.IndicatorLight;
import edu.firstteam3189.robot2014.subsystems.Latch;

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
    public static IndicatorLight light = new IndicatorLight();
    public static CollectorGrabber claw = new CollectorGrabber();
    public static Collector collector = new Collector();
    public static Latch latch = new Latch();
    

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
        SmartDashboard.putData(shooter);
        collector.updateStatus();
        light.updateStatus();
        oi.updateStatus();
        latch.updateStatus();
    }
}
