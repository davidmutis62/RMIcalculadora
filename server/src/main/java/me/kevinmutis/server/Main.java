package me.kevinmutis.server;

import java.io.IOException;
import java.rmi.AlreadyBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {

    public static void main(final String[] args) throws IOException, AlreadyBoundException {
        final Registry registry = LocateRegistry.createRegistry(7777);
        registry.bind("api", new APIImpl());

        System.out.println("Server is running in port 7777");
    }

}
