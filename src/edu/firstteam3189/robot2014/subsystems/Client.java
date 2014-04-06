package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.util.Logger;
import edu.firstteam3189.robot2014.util.Sockert;
import java.io.IOException;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.networktables2.client.NetworkTableClient;
import edu.wpi.first.wpilibj.networktables2.util.List;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * 
 * @author Michael
 */

public class Client extends Subsystem {
    private static final Logger logger = new Logger(Client.class);

    private List clientProcesses = new List();
    private NetworkTable code;
    private int codeRecieved;
    private String processedRects = "0#";

    public Client() {
        clientProcesses.add("welcome to DevBo client");
        
    }

    /**
     * writes a message to the process list for humans to read.
     * 
     * @param process
     */
    public void addProcess(String process) {
        logger.info(process);
        clientProcesses.add(process);
    }

    public boolean getInputCodeStream() {
        codeRecieved = (int) code.getNumber("client", -1);
        return codeRecieved != -1;
    }

    /**
     * clears process list.
     */
    public void clearProcesses() {
        clientProcesses.clear();
    }

    /**
     * sends disconnect code and closes local socket connections
     */
    public void close() {
        code = null;
    }

    public int getCodeError() {
        return 0;
    }

    public int getCodeReceived() {
        return codeRecieved;
    }

    /**
     * gets the last process added to processes
     * 
     * @return string of last process in process list
     */
    public String getLastProcess() {
        if (clientProcesses.size() > 0) {
            return (String) clientProcesses.get(clientProcesses.size() - 1);
        }
        return "no processes";
    }

    public boolean isConnected() {
        return code.isConnected();
    }

    public void nullCodeReceived() {
        code = null;
    }

    public void outputToCodeStream(int item, String clientProcess) {
        code.putNumber("robot", item);
    }

    public void outputToCodeStream(String item, String clientProcess) {
        code.putString("robot", item);
    }


    /**
     * try's to connect to servers socket.
     */
    public boolean setUp() {
        code = NetworkTable.getTable("data");
        return false;
    }

    /**
     * holds all smart dashboard updates
     */
    public void updateStatus() {
        SmartDashboard.putData(this);
        SmartDashboard.putNumber("Client Received", codeRecieved);
        SmartDashboard.putString("Client Rects", processedRects);
        SmartDashboard.putString("Client Last Action: ", getLastProcess());
    }

    public boolean isInHotzone () {
        return codeRecieved >= Constants.CLIENT_IS_HZ;
    }

    protected void initDefaultCommand() {
    }
}