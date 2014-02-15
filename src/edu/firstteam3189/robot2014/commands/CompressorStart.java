package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Ian
 */
public class CompressorStart extends CommandBase {
    
    public CompressorStart() {
        requires(compressor);
    }

    protected void initialize() {
        compressor.start();
    }

    protected void execute() {
        
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
        compressor.stop();
    }

    protected void interrupted() {
        compressor.stop();
    }
}