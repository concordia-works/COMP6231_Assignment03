/**
 * CenterServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Stubs;

public interface CenterServer extends java.rmi.Remote {
    public void setRecordID(int arg0) throws java.rmi.RemoteException;
    public void setServerID(ServerID arg0) throws java.rmi.RemoteException;
    public void setRmiPort(int arg0) throws java.rmi.RemoteException;
    public void setUdpPort(int arg0) throws java.rmi.RemoteException;
    public int getRecordID() throws java.rmi.RemoteException;
    public ServerID getServerID() throws java.rmi.RemoteException;
    public int getRmiPort() throws java.rmi.RemoteException;
    public int getUdpPort() throws java.rmi.RemoteException;
    public java.lang.String createTRecord(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4, java.lang.String arg5, java.lang.String arg6) throws java.rmi.RemoteException;
    public java.lang.String createSRecord(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3, java.lang.String arg4) throws java.rmi.RemoteException;
    public java.lang.String getRecordCounts(java.lang.String arg0) throws java.rmi.RemoteException;
    public boolean editRecord(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.String arg3) throws java.rmi.RemoteException;
    public boolean transferRecord(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
    public java.lang.String getRecordType(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String printAllRecords() throws java.rmi.RemoteException;
    public java.lang.String printRecords(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
}
