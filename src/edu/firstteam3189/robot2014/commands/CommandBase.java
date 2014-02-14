package edu.firstteam3189.robot2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.firstteam3189.robot2014.OI;
import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.subsystems.CollectorGrabber;
import edu.firstteam3189.robot2014.subsystems.Client;
import edu.firstteam3189.robot2014.subsystems.Collector;
import edu.firstteam3189.robot2014.subsystems.CompressorSubsystem;
import edu.firstteam3189.robot2014.subsystems.Drivetrain;
import edu.firstteam3189.robot2014.subsystems.Gearbox;
import edu.firstteam3189.robot2014.subsystems.Shooter;
import edu.firstteam3189.robot2014.subsystems.IndicatorLight;
import edu.firstteam3189.robot2014.subsystems.Latch;
import edu.wpi.first.wpilibj.Compressor;

/**
 * 
 * @author Michael, Andrew, Ky
 */

public abstract class CommandBase extends Command {

    public static OI oi;
    public static Client client;
    public static Drivetrain drivetrain;
    public static CompressorSubsystem compressor;
    public static Gearbox gearbox;
    public static Shooter shooter;
    public static IndicatorLight light;
    public static CollectorGrabber claw;
    public static Collector collector;
    public static Latch latch;
    

    public static void init() {
        oi = new OI();
        client = new Client();
        drivetrain = new Drivetrain();
        compressor = new CompressorSubsystem();
        gearbox = new Gearbox();
        shooter = new Shooter();
        light = new IndicatorLight();
        claw = new CollectorGrabber();
        collector = new Collector();
        latch = new Latch();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
    
    public static void updateStatus () {
        SmartDashboard.putData(client);
        SmartDashboard.putData(drivetrain);
        SmartDashboard.putData(shooter);
        client.updateStatus();
        collector.updateStatus();
        light.updateStatus();
        oi.updateStatus();
        latch.updateStatus();
    }
}
