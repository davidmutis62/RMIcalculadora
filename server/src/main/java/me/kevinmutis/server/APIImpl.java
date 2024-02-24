package me.kevinmutis.server;

import me.kevinmutis.shared.API;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class APIImpl extends UnicastRemoteObject implements API {
    protected APIImpl() throws RemoteException {
        super();
    }

    @Override
    public int sum(final int a, final int b) {
        return a + b;
    }
}
