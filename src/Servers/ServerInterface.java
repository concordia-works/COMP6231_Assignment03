package Servers;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.ServerNotActiveException;

/**
 * Created by quocminhvu on 2017-05-26.
 */
@WebService
public interface ServerInterface extends Remote {
    @WebMethod
    String createTRecord(String managerID, String firstName, String lastName, String address, String phone, String specialization, String location) throws RemoteException, ServerNotActiveException;
    @WebMethod
    String createSRecord(String managerID, String firstName, String lastName, String coursesRegistered, String status) throws RemoteException, ServerNotActiveException;
    @WebMethod
    String getRecordCounts(String managerID) throws RemoteException;
    @WebMethod
    boolean editRecord(String managerID, String recordID, String fieldName, String newValue) throws RemoteException;
    @WebMethod
    boolean transferRecord(String managerID, String recordID, String remoteCenterServerName) throws RemoteException;
    @WebMethod
    String printRecords(String managerID, String recordID) throws RemoteException;
    @WebMethod
    String printAllRecords() throws RemoteException;
    @WebMethod
    String getRecordType(String recordID) throws RemoteException;
}
