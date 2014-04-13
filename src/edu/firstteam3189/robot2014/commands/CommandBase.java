package edu.firstteam3189.robot2014.commands;

import edu.firstteam3189.robot2014.Constants;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.firstteam3189.robot2014.OI;
import edu.firstteam3189.robot2014.subsystems.CollectorGrabber;
import edu.firstteam3189.robot2014.subsystems.Client;
import edu.firstteam3189.robot2014.subsystems.Collector;
import edu.firstteam3189.robot2014.subsystems.CompressorSubsystem;
import edu.firstteam3189.robot2014.subsystems.Drivetrain;
import edu.firstteam3189.robot2014.subsystems.Gearbox;
import edu.firstteam3189.robot2014.subsystems.Wintch;
import edu.firstteam3189.robot2014.subsystems.IndicatorLight;
import edu.firstteam3189.robot2014.subsystems.Latch;

/**
 *
 * @author Michael, Andrew, Ky
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static Client client = new Client();
    public static Collector collector = new Collector();
    public static CollectorGrabber collerctorGrabber = new CollectorGrabber();
    public static CompressorSubsystem compressor = new CompressorSubsystem();
    public static Drivetrain drivetrain = new Drivetrain();
    public static Gearbox gearbox = new Gearbox();
    public static IndicatorLight light = new IndicatorLight();
    public static Latch latch = new Latch();
    public static Wintch wintch = new Wintch();

    public static void init() {
        oi = new OI();

        Constants.initStatus();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }

    public static void updateStatus() {
        Constants.updateStatus();
        oi.updateStatus();

        client.updateStatus();
        collector.updateStatus();
        collerctorGrabber.updateStatus();
        collector.updateStatus();
        drivetrain.updateStatus();
        gearbox.updateStatus();
        light.updateStatus();
        latch.updateStatus();
        wintch.updateStatus();
    }
}
