package edu.firstteam3189.robot2014.commands;

/**
 *
 * @author Michael
 */
public class WinchDoNothing extends DoNothingBase {

    public WinchDoNothing() {
        super(winch);
    }

    protected void initialize() {
        winch.murder();
    }
}