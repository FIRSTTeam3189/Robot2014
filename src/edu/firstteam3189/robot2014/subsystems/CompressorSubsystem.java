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
 * @author Michael, Ian
 */
public class CompressorSubsystem extends Subsystem {
    
    private Compressor compressor;

    /**
     * controls on board compressor
     */
    public CompressorSubsystem() {
        compressor = new Compressor(RobotMap.compressorPressureSwitch, RobotMap.compressorRelay);
    }

    /**
     * starts compressing
     */
    public void start () {
        compressor.start();
    }
    
    /**
     * stops compressing
     */
    public void stop () {
        compressor.stop();
    }
    
    public void initDefaultCommand() {
        setDefaultCommand(new Compress());
    }
}