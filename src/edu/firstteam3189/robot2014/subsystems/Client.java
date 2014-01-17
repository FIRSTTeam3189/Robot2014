package edu.firstteam3189.robot2014.subsystems;

import edu.firstteam3189.robot2014.Constants;
import edu.firstteam3189.robot2014.util.Logger;
import edu.firstteam3189.robot2014.util.Sockert;
import java.io.DataInputStream;
import java.io.IOException;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables2.util.List;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * 
 * @author Michael
 */

public class Client extends Subsystem {
    private static final Logger logger = new Logger(Client.class);

    private List clientProcesses = new List();
    private Sockert code;
    private String processedRects = "0#";

    public Client() {
        clientProcesses.add("welcome to DevBo client");
        code = new Sockert("10.31.89.5", 1180);
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

    public boolean checkInputCodeStream() {
        try {
            if (code.checkInputSteam()) {
                return true;
            }
            addProcess("read from code stream: " + code.getReceived());
        } catch (IOException ex) {
            addProcess("failed to read code stream: " + ex);
        }
        return false;
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
        try {
            if(isConnected()){
                code.outputToStream(Constants.CLIENT_DISCONNECT);
                addProcess("sent disconnect code");
            }
        } catch (IOException ex) {
            addProcess("failed to send disconnect code");
        }

        if (code.isConnected()) {
            code.closeSocket();
            addProcess("disconnected from code socket");
        } else {
            addProcess("failed to disconnect: not connected to socket");
        }
    }

    public int getCodeError() {
        return code.getError();
    }

    public int getCodeReceived() {
        return code.getReceived();
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
        code.nullReceived();
    }

    public void outputToCodeStream(int code, String clientProcess) {
        try {
            this.code.outputToStream(code);
            addProcess(clientProcess);
        } catch (IOException ex) {
            addProcess("error" + ex);
            addProcess("failed to :" + clientProcess);
        }
    }

    public void outputToCodeStream(String item, String clientProcess) {
        try {
            code.outputToStream(item);
            addProcess(clientProcess);
        } catch (IOException ex) {
            addProcess("error" + ex);
            addProcess("failed to :" + clientProcess);
        }
    }


    /**
     * try's to connect to servers socket.
     */
    public boolean setUp() {
        if(code.isConnected()){
            try {
                code.connectSocket();
                addProcess("socket setup finished successfully");
                return true;
            } catch (Exception e) {
                addProcess("socket setup failed: " + e);
            }
        }else {
            addProcess("socket is already connected");
        }
        return false;
    }

    /**
     * holds all smart dashboard updates
     */
    public void updateStatus() {
            SmartDashboard.putNumber("Client Received", code.getReceived());
            SmartDashboard.putString("Client Rects", processedRects);
            SmartDashboard.putString("Client Last Action: ", getLastProcess());
    }

    public boolean isInHotzone () {
        return code.getReceived() >= Constants.CLIENT_IS_HZ;
    }

    protected void initDefaultCommand() {
    }
}