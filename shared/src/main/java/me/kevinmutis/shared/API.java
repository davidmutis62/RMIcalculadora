package me.kevinmutis.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface API extends Remote {

    int sum(int a, int b) throws RemoteException;

}
