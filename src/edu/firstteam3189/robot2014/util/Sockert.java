/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.firstteam3189.robot2014.util;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import edu.wpi.first.wpilibj.networktables2.stream.SocketConnectionStream;

/**
 * 
 * @author DevBo
 */
public class Sockert {
	int codeError = 0;

	DataInputStream codeIn;
	InputStream codeInput;

	DataOutputStream codeOut;
	OutputStream codeOutput;

	int codeReceived = 0;
	SocketConnectionStream codeSocketConnection;
	String imageReceived;

	String ip;
	int port;

	public Sockert() {
		codeReceived = 0;
	}

	public Sockert(String ip, int port) {
		this();
		this.ip = ip;
		this.port = port;
	}

	/**
	 * try's to read input from server.
	 */
	public boolean checkInputSteam() throws IOException {
		if (isConnected()) {
			if (codeIn.available() > 0) {
				codeReceived = codeIn.readInt();
				return true;
			} else {
				codeError = 1;
			}

		} else {
			codeError = 2;
			throw new IOException("not connected to socket");
		}
		return false;
	}

	public void closeSocket() {
		codeOut = null;
		codeIn = null;
		codeOutput = null;
		codeInput = null;
		codeSocketConnection.close();
		codeSocketConnection = null;
	}

	public void connectSocket() throws IOException {
		codeSocketConnection = new SocketConnectionStream(ip, port);
		codeInput = codeSocketConnection.getInputStream();
		codeOutput = codeSocketConnection.getOutputStream();
		codeIn = new DataInputStream(codeInput);
		codeOut = new DataOutputStream(codeOutput);
	}

	public void connectSocket(String ip, int port) throws IOException {
		codeSocketConnection = new SocketConnectionStream(ip, port);
		codeInput = codeSocketConnection.getInputStream();
		codeOutput = codeSocketConnection.getOutputStream();
		codeIn = new DataInputStream(codeInput);
		codeOut = new DataOutputStream(codeOutput);
	}

	/**
	 * 0 = no error. 42 = camera didnt init. 14 = processing failed.
	 * 
	 * @return code
	 */
	public int getError() {
		return codeError;
	}

	/**
	 * gets data the client last received from server.
	 * 
	 * @return
	 */
	public int getReceived() {
		return codeReceived;
	}

	/**
	 * gets input from server
	 * 
	 * @return received data.
	 */
	public int getStream() throws IOException {
		checkInputSteam();
		return codeReceived;
	}

	/**
	 * checks if the socket is connected
	 * 
	 * @return
	 */
	public boolean isConnected() {
		return codeSocketConnection != null;
	}

	public void nullReceived() {
		codeReceived = 0;
	}

	/**
	 * outputs provided byte[] to server
	 * 
	 * @param item
	 *            sent to server
	 * @throws client
	 *             process to be added to last action list
	 */
	public void outputToStream(byte[] item) throws IOException {
		if (isConnected()) {
			codeOut.write(item);
		} else {
			throw new IOException("not connected to socket");
		}
	}

	public void outputToStream(byte[] item, int sendSize) throws IOException {
		if (isConnected()) {
			codeOut.write(item, 0, sendSize);
		} else {
			throw new IOException("not connected to socket");
		}
	}

	/**
	 * outputs provided int to server.
	 * 
	 * @param code
	 *            sent to server.
	 * @throws client
	 *             process to be added to last action list
	 */
	public void outputToStream(int code) throws IOException {
		if (isConnected()) {
			codeOut.writeInt(code);
		} else {
			throw new IOException("not connected to socket");
		}
	}

	/**
	 * outputs provided String to server
	 * 
	 * @param item
	 *            sent to server
	 * @throws client
	 *             process to be added to last action list
	 */
	public void outputToStream(String item) throws IOException {
		if (isConnected()) {
			codeOut.writeUTF(item);
		} else {
			throw new IOException("not connected to socket");
		}
	}
}
