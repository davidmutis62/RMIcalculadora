package me.kevinmutis.ui.client;


import me.kevinmutis.shared.API;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SumClient {

    private final API api;

    public SumClient() throws RemoteException, NotBoundException {
        final Registry registry = LocateRegistry.getRegistry(7777);
        this.api = (API) registry.lookup("api");
        System.out.println("Client is connected to the server in port 7777");
    }

    public int sum(final int a, final int b) throws RemoteException {
        return this.api.sum(a, b);
    }
}
