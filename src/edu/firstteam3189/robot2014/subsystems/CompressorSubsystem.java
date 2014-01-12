/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.RobotMap;
import edu.firstteam3189.robot2014.commands.Compress;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author DevBo
 */
public class CompressorSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    private Compressor compressor;

    public CompressorSubsystem() {
        compressor = new Compressor(RobotMap.compressorPressureSwitch, RobotMap.compressorRelay);
    }

    public void start () {
        compressor.start();
    }
    
    public void stop () {
        compressor.stop();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new Compress());
    }
}